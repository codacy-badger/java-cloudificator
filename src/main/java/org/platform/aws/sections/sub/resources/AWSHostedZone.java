package org.platform.aws.sections.sub.resources;

import org.platform.aws.sections.sub.AWSResource;

public class AWSHostedZone extends AWSResource {
	
	public AWSHostedZone(String name, String vpcList) {
		Type = "AWS::Route53::HostedZone";
		Properties = new AWSHostedZoneProperties(name, vpcList);
	}

}
