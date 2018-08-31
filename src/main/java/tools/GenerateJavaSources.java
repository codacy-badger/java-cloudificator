/*******************************************************************************
 * Copyright 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package tools;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * It processes every HTML document and it creates a JAVA class for it into
 * package "org.platform.aws.resources"
 *
 * @author Inaki Rodriguez
 *
 */
public class GenerateJavaSources {

    /** The Constant URL. */
    private static final String URL = "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/";

    /** The Constant GENERATE_SOURCES_PATH. */
    private static final String GENERATE_SOURCES_PATH = "./src/main/java/org/platform/aws/resources/";

    /** The Constant DESC_POSTION. */
    private static final int DESC_POSTION = 0;

    /** The Constant REQ_POSTION. */
    private static final int REQ_POSTION = 1;

    /** The Constant TYPE_POSTION. */
    private static final int TYPE_POSTION = 2;

    /** The Constant DESC_ITEM. */
    private static final String DESC_ITEM = "Desc";

    /** The Constant REQ_ITEM. */
    private static final String REQ_ITEM = "Req";

    /** The Constant TYPE_ITEM. */
    private static final String TYPE_ITEM = "Type";

    /** The Constant TEMPLATE_FIELD_COMMENT. */
    //@formatter:off
    private static final String TEMPLATE_FIELD_COMMENT = "    /**\n" +
    	"     * DESC \n" +
    	"     */";

    /** The Constant TEMPLATE_GET_SET_METHODS. */
    private static final String TEMPLATE_GET_SET_METHODS = "    /**\n" +
    	"     * @return the FIELD_FOR_METHOD\n" +
    	"     */\n" +
    	"    public String getFIELD_FOR_METHOD() {\n" +
    	"        return FIELD_FOR_METHOD;\n" +
    	"    }\n" +
    	"\n" +
    	"    /**\n" +
    	"     * @param FIELD_FOR_METHOD the FIELD_FOR_METHOD to set\n" +
    	"     */\n" +
    	"    public void setFIELD_FOR_METHOD(String FIELD_FOR_METHOD) {\n" +
    	"	this.FIELD_FOR_METHOD = FIELD_FOR_METHOD;\n" +
    	"    }";

    /** The Constant TEMPLATE_CLASS_CONTENT. */
    private static final String TEMPLATE_CLASS_CONTENT = "/*******************************************************************************\n" +
    	" * Copyright 2018\n" +
    	" *\n" +
    	" * Licensed under the Apache License, Version 2.0 (the \"License\"); you may not\n" +
    	" * use this file except in compliance with the License.  You may obtain a copy\n" +
    	" * of the License at\n" +
    	" *\n" +
    	" *   http://www.apache.org/licenses/LICENSE-2.0\n" +
    	" *\n" +
    	" * Unless required by applicable law or agreed to in writing, software\n" +
    	" * distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT\n" +
    	" * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the\n" +
    	" * License for the specific language governing permissions and limitations under\n" +
    	" * the License.\n" +
    	" ******************************************************************************/\n" +
    	"package org.platform.aws.resources;\n" +
    	"\n" +
    	"/**\n" +
    	" * Generated class\n" +
    	" */\n" +
    	"public class TEST {\n" +
    	"\n" +
    	"}";
    //@formatter:on

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	Stream<Path> paths = null;
	try {
	    paths = Files.walk(Paths.get("tempLinks/"));
	    paths.forEach(p -> {
		File f = p.toFile();
		/**
		 * TODO verify issues with following documents:
		 * @formatter:off
		 * aws-resource-dms-replicationinstance.html
		 * aws-resource-init.html
		 * aws-resource-waf-ipset.html
		 * aws-resource-wafregional-ipset.html
		 * aws-properties-waitconditionhandle.html
		 * @formatter:on
		 */
		if (f.getName().contains(".html") && !f.getName().equals("aws-resource-dms-replicationinstance")) {
		    String docName = f.getName();
		    // System.out.println("file -> " + f.getName());
		    try {
			createJavaClass(f);
			// System.out.println("Class created!");
		    } catch (IOException | NullPointerException | IndexOutOfBoundsException e) {
			System.err.println("Error at createClass " + docName + " - " + e.getMessage());
		    }
		}
	    });
	} catch (IOException e) {
	    System.err.println(e.getMessage());
	} finally {
	    if (paths != null) {
		paths.close();
	    }
	}
    }

    /**
     * Creates the java class.
     *
     * @param input the input
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private static void createJavaClass(File input) throws IOException {
	Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
	if (doc != null) {
	    Element docData = doc.select(".variablelist").select("dl").first();
	    List<String> awsResourceFields = getAWSResourceProperties(docData.select("dt"));
	    Map<String, Map<String, String>> fieldDescriptions = getFieldDescriptions(awsResourceFields,
		    docData.select("dd"));
	    // Create Java file
	    String javaFileName = setCamelCase(input.getName().replace(".html", ".java"));
	    String content = generateSourceContent(javaFileName.replace(".java", ""), fieldDescriptions);
	    Files.write(Paths.get(GENERATE_SOURCES_PATH + javaFileName), content.getBytes());

	}
    }

    /**
     * Gets the field descriptions.
     *
     * @param awsResourceFields  the aws resource fields
     * @param allFieldAttributes the all field attributes
     * @return the field descriptions
     */
    private static Map<String, Map<String, String>> getFieldDescriptions(List<String> awsResourceFields,
	    Elements allFieldAttributes) {
	Map<String, Map<String, String>> fieldsMap = new HashMap<>();

	int index = 0;
	Iterator<Element> it = allFieldAttributes.iterator();
	while (it.hasNext()) {
	    Element elementToCheck = it.next();
	    Map<String, String> fieldMap = new HashMap<>();

	    Elements paragraphs = elementToCheck.select("p");
	    String desc = paragraphs.get(DESC_POSTION).text();
	    String req = paragraphs.get(REQ_POSTION).text().replaceAll("Required: ", "");
	    String type = paragraphs.get(TYPE_POSTION).text().replaceAll("Type: ", "");

	    fieldMap.put(DESC_ITEM, desc);
	    fieldMap.put(REQ_ITEM, req);
	    fieldMap.put(TYPE_ITEM, type);

	    fieldsMap.put(awsResourceFields.get(index), fieldMap);
	    index++;
	}

	return fieldsMap;
    }

    /**
     * Gets the AWS resource properties.
     *
     * @param propertyNames the property names
     * @return the AWS resource properties
     */
    private static List<String> getAWSResourceProperties(Elements propertyNames) {
	List<String> resources = new ArrayList<>();
	for (Element element : propertyNames) {
	    String val = element.select("span").select("code").text();
	    resources.add(val);
	}
	return resources;
    }

    /**
     * Sets the camel case.
     *
     * @param javaFileName the java file name
     * @return the string
     */
    private static String setCamelCase(String javaFileName) {
	String newStringFilename = "";
	StringTokenizer tl = new StringTokenizer(javaFileName, "-");
	while (tl.hasMoreTokens()) {
	    String token = tl.nextToken();
	    newStringFilename = newStringFilename + token.substring(0, 1).toUpperCase() + token.substring(1);
	}
	return newStringFilename;
    }

    /**
     * Generate source content.
     *
     * @param javaFileName      the java file name
     * @param fieldDescriptions the field descriptions
     * @return the string
     */
    private static String generateSourceContent(String javaFileName,
	    Map<String, Map<String, String>> fieldDescriptions) {
	String baseTemplate = TEMPLATE_CLASS_CONTENT.replaceAll("TEST", javaFileName);
	String newFieldsToInput = "";
	String newMethodsToInput = "";
	for (Entry<String, Map<String, String>> entry : fieldDescriptions.entrySet()) {
	    String classField = entry.getKey();
	    Map<String, String> fieldValues = entry.getValue();
	    // Add field
	    newFieldsToInput = newFieldsToInput + TEMPLATE_FIELD_COMMENT.replace("DESC", fieldValues.get(DESC_ITEM))
		    + "\n";
	    newFieldsToInput = newFieldsToInput + "    private String " + classField + ";\n\n";
	    newMethodsToInput = newMethodsToInput + TEMPLATE_GET_SET_METHODS.replaceAll("FIELD_FOR_METHOD", classField)
		    + "\n\n";
	}
	int endPos = baseTemplate.lastIndexOf("}");
	return baseTemplate.substring(0, endPos) + newFieldsToInput + newMethodsToInput + "\n}";
    }
}
