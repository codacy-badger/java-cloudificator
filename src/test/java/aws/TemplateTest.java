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
package aws;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;
import org.platform.aws.CloudTemplateCreatorAWS;
import org.platform.aws.sections.SectionConditions;
import org.platform.aws.sections.SectionMapping;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.platform.aws.sections.sub.AWSMappingKey;
import org.platform.aws.sections.sub.AWSOutput;
import org.platform.aws.sections.sub.AWSParam;
import org.platform.aws.sections.sub.resources.hostedzone.AWSHostedZone;

/**
 * The Class TemplateTest.
 *
 * @author Inaki Rodriguez
 */
public class TemplateTest {

    /** The path filename json. */
    private String pathFilenameJson = "./src/test/resources/TemplateExample.json";

    /** The path filename yaml. */
    private String pathFilenameYaml = "./src/test/resources/TemplateExample.yaml";

    /**
     * Test JSON template.
     */
    @Test
    public void testJSONTemplate() {
	// Testing a simple client
	CloudTemplateCreatorAWS templateCreator = CloudTemplateCreatorAWS.FactoryCreatorWithDesc("Private DNS zone");
	setTemplateData(templateCreator);
	String jsonContentActual = templateCreator.generateTemplateJSON();
	String jsonContentExpected;
	try {
	    jsonContentExpected = new String(Files.readAllBytes(Paths.get(pathFilenameJson)));
	    boolean areEquals = jsonContentExpected.equals(jsonContentActual);
	    assertTrue("Testing the generated Json content", areEquals);
	} catch (IOException e) {
	    fail("There was an error checking the Test template file " + e.getMessage());
	}
    }

    /**
     * Test YAML template.
     */
    @Test
    public void testYAMLTemplate() {
	// Testing a simple client
	CloudTemplateCreatorAWS templateCreator = CloudTemplateCreatorAWS.FactoryCreatorWithDesc("Private DNS zone");
	setTemplateData(templateCreator);
	String yamlContentActual = templateCreator.generateTemplateYAML();
	String yamlContentExpected;
	try {
	    yamlContentExpected = new String(Files.readAllBytes(Paths.get(pathFilenameYaml)));
	    boolean areEquals = yamlContentExpected.equals(yamlContentActual);
	    assertTrue("Testing the generated Yaml content", areEquals);
	} catch (IOException e) {
	    fail("There was an error checking the Test template file " + e.getMessage());
	}
    }

    /**
     * Sets the template data.
     *
     * @param templateCreator the new template data
     */
    private void setTemplateData(CloudTemplateCreatorAWS templateCreator) {
	// Setting PARAMETERS section
	SectionParameters sectionParams = new SectionParameters();
	AWSParam dnsParamItem = new AWSParam();
	dnsParamItem.setDefault("eu-central-1.dev.aws.test");
	dnsParamItem.setDescription("Private DNS zone name");
	sectionParams.addParam("dnszone", dnsParamItem);
	AWSParam vpcParamItem = new AWSParam();
	vpcParamItem.setDescription("List of associated VPC Id's");
	vpcParamItem.setType("List<AWS::EC2::VPC::Id>");
	sectionParams.addParam("vpcList", vpcParamItem);
	templateCreator.setParameters(sectionParams);

	// Setting MAPPINGS section
	SectionMapping sectionMapping = new SectionMapping();
	sectionMapping.addMapping("RegionMap", "us-east-1", new AWSMappingKey("id1", "val1"));
	sectionMapping.addMapping("RegionMap", "us-east-1", new AWSMappingKey("id2", "val2"));
	sectionMapping.addMapping("RegionMap", "london", new AWSMappingKey("id", "val"));
	templateCreator.setMappings(sectionMapping);

	// Setting RESOURCES section
	SectionResources sectionResources = new SectionResources();
	AWSHostedZone hostedZone = new AWSHostedZone("!Ref dnszone", "!Ref vpcList", null, null, null);
	sectionResources.addResource("DNSZone", hostedZone);
	templateCreator.setResources(sectionResources);

	// Setting CONDITIONS section
	SectionConditions sectionConditions = new SectionConditions();
	sectionConditions.addCondition("condition_B", "!Equals [ !Ref EnvType, prod ]");
	sectionConditions.addCondition("condition_A", "!Equals [ !Ref EnvType, prod ]");
	templateCreator.setConditions(sectionConditions);

	// Setting OUTPUTS section
	SectionOutputs sectionOutputs = new SectionOutputs();
	AWSOutput outputItem = new AWSOutput();
	outputItem.setDescription("Hosted Zone ID Output");
	outputItem.setValue("!Ref DNSZone");
	sectionOutputs.addOutput("HostedZoneIdOutput", outputItem);
	templateCreator.setOutputs(sectionOutputs);
    }

}
