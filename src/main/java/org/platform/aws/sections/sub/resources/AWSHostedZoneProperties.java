package org.platform.aws.sections.sub.resources;

import org.platform.aws.sections.sub.AWSResourceProperties;

public class AWSHostedZoneProperties extends AWSResourceProperties {
	
	private String Name;
	private String VPCs;
	
	public AWSHostedZoneProperties(String name, String vpcList) {
		this.Name = name;
		this.VPCs = vpcList;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getVPCs() {
		return VPCs;
	}
	public void setVPCs(String vPCs) {
		VPCs = vPCs;
	}

}
