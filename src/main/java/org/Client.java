package org;

import org.platform.aws.AWSCloudTemplateCreator;

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
		templateCreator.setParameters(null);
		
		// We set the Resources
		templateCreator.setResources(null);
		
		// We set the outputs
		templateCreator.setOutputs(null);
		
		String template;
		template = templateCreator.generateTemplateJSON();
		System.out.println("JSON Template generated -> \n" + template);
		
		template = templateCreator.generateTemplateYAML();
		System.out.println("\nYAML Template generated -> \n" + template);
		
		System.out.println("\nEND");

	}

}
