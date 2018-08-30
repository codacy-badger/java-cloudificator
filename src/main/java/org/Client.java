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
package org;

import java.util.Date;

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
 * The Class Client.
 *
 * @author Inaki Rodriguez
 */
public class Client {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
	long dateStartInMillis = new Date().getTime();

	// Testing a simple client
	CloudTemplateCreatorAWS templateCreator = CloudTemplateCreatorAWS.FactoryCreatorWithDesc("Private DNS zone");

	// *****************************************************************

	// Template Anatomy
	// @see
	// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html

	// TODO
	// Setting METADATA section.

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

	// TODO
	// Setting TRANSFORM section. Let's check how this work exactly

	// *****************************************************************
	// Generate templates
	String template;
	template = templateCreator.generateTemplateJSON();
	System.out.println("JSON Template generated -> \n" + template);

	template = templateCreator.generateTemplateYAML();
	System.out.println("\nYAML Template generated -> \n" + template);

	// Show execution time formatted in seconds
	long totalTime = new Date().getTime() - dateStartInMillis;
	String timeInString = String.valueOf(totalTime);
	if (timeInString.length() > 3) {
	    timeInString = timeInString.substring(0, timeInString.length() - 3) + "."
		    + timeInString.substring(timeInString.length() - 3);
	} else {
	    timeInString = "0." + timeInString;
	}
	System.out.println("Done in " + timeInString + " seconds.");

    }

}
