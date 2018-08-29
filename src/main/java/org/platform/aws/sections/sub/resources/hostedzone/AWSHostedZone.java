package org.platform.aws.sections.sub.resources.hostedzone;

import org.platform.aws.sections.sub.AWSResource;

public class AWSHostedZone extends AWSResource {
	
	public AWSHostedZone(String name, String vpcList) {
		Type = "AWS::Route53::HostedZone";
		if(name == null && vpcList == null) {
			Properties = null;
		}else {
			Properties = new AWSHostedZoneProperties(name, vpcList);
		}
	}

}
