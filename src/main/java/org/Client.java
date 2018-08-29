package org;

import org.platform.aws.AWSCloudTemplateCreator;
import org.platform.aws.sections.AWSOutput;
import org.platform.aws.sections.AWSParam;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;

public class Client {

	/*
	 * 
	 * Generate the following YAML
	 * 
	 *	AWSTemplateFormatVersion: 2010-09-09
		Description: Private DNS zone
		Parameters:
		  dnszone:
		    Description: Private DNS zone name
		    Default: eu-central-1.dev.aws.kone.internal
		    Type: String
		  vpclist:
		    Description: List of associated VPC Id's
		    Type: List<AWS::EC2::VPC::Id>
		Resources:
		  DNSZone:
		    Type: "AWS::Route53::HostedZone"
		    Properties:
		      HostedZoneConfig:
		        Comment: Private DNS zone
		      Name: !Ref dnszone
		      VPCs: !Ref vpclist
		Outputs:
		  HostedZoneIdOutput:
		    Description: Hosted Zone ID Output
		    Value: !Ref DNSZone
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("START\n");
		
		// Testing a simple client
		AWSCloudTemplateCreator templateCreator = AWSCloudTemplateCreator.FactoryCreatorWithDesc("Private DNS zone");
		
		// We set the Parameters
		SectionParameters sectionParams = new SectionParameters();
		AWSParam dnsParamItem = new AWSParam();
		dnsParamItem.setDefault("eu-central-1.dev.aws.kone.internal");
		dnsParamItem.setDescription("Private DNS zone name");
		sectionParams.addParam("dnszone", dnsParamItem);
		
		AWSParam vpcParamItem = new AWSParam();
		vpcParamItem.setDescription("List of associated VPC Id's");
		vpcParamItem.setType("List<AWS::EC2::VPC::Id>");
		sectionParams.addParam("vpclist", vpcParamItem);
		templateCreator.setParameters(sectionParams);
		
		// Setting mappings section
		templateCreator.setMappings(null);
		
		// We set the Resources
		templateCreator.setResources(null);
		
		// We set the outputs
		SectionOutputs sectionOutputs = new SectionOutputs();
		AWSOutput outputItem = new AWSOutput();
		outputItem.setDescription("Hosted Zone ID Output");
		outputItem.setValue("!Ref DNSZone"); // FIXME This value is always quoted!!
		sectionOutputs.addOutput("HostedZoneIdOutput", outputItem);
		templateCreator.setOutputs(sectionOutputs);
		
		// Generate templates
		String template;
		template = templateCreator.generateTemplateJSON();
		System.out.println("JSON Template generated -> \n" + template);
		
		template = templateCreator.generateTemplateYAML();
		System.out.println("\nYAML Template generated -> \n" + template);
		
		System.out.println("END");

	}

}
