package org;

import org.platform.aws.AWSCloudTemplate;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("TEST!!!");
		// Testing a simple client
		AWSCloudTemplate myTemplate = new AWSCloudTemplate();
		
		// The template should have at least the value "AWSTemplateFormatVersion"
		// Other constructor to set just the description
		// Other constructor to set just the date
		// Other constructor to set both
		
		// We set the Parameters
		myTemplate.setParameters(null);
		
		// We set the Resources
		myTemplate.setResources(null);
		
		// We set the outputs
		myTemplate.setOutputs(null);

	}

}
