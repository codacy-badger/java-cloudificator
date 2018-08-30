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
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
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

	// Template Anatomy
	// @see
	// https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html
	// Setting Parameters section
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

	// Setting Resources section
	SectionResources sectionResources = new SectionResources();
	AWSHostedZone hostedZone = new AWSHostedZone("!Ref dnszone", "!Ref vpcList", null, null, null);
	sectionResources.addResource("DNSZone", hostedZone);
	templateCreator.setResources(sectionResources);

	// Setting outputs section
	SectionOutputs sectionOutputs = new SectionOutputs();
	AWSOutput outputItem = new AWSOutput();
	outputItem.setDescription("Hosted Zone ID Output");
	outputItem.setValue("!Ref DNSZone");
	sectionOutputs.addOutput("HostedZoneIdOutput", outputItem);
	templateCreator.setOutputs(sectionOutputs);

	// Generate templates
	String template;
	template = templateCreator.generateTemplateJSON();
	// System.out.println("JSON Template generated -> \n" + template);

	template = templateCreator.generateTemplateYAML();
	System.out.println("\nYAML Template generated -> \n" + template);

	long totalTime = new Date().getTime() - dateStartInMillis;
	System.out.println("Done in " + totalTime + " millisecs.");

    }

}
