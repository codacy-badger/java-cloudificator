package org.platform.aws.sections.sub.resources;

import org.platform.aws.sections.sub.AWSResource;

public class AWSHostedZone extends AWSResource {
	
	public AWSHostedZone() {
		Type = "AWS::Route53::HostedZone";
		Properties = new AWSHostedZoneProperties();
	}

}
