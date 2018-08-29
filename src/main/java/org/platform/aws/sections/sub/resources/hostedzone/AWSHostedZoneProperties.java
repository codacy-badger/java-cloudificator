package org.platform.aws.sections.sub.resources.hostedzone;

import org.platform.aws.sections.sub.AWSResourceProperties;

public class AWSHostedZoneProperties extends AWSResourceProperties {
	
	private String Name;
	private String VPCs;
	private AWSHostedZoneConfig HostedZoneConfig;
	private AWSHostedZoneTags HostedZoneTags;
	private AWSQueryLoggingConfig QueryLoggingConfig;
	
	// Mandatory fields constructor & Full constructor
	public AWSHostedZoneProperties(String name, String vpcList) {
		this.Name = name;
		this.VPCs = vpcList;
		this.HostedZoneConfig = new AWSHostedZoneConfig();
		this.HostedZoneTags = new AWSHostedZoneTags();
		this.QueryLoggingConfig = new AWSQueryLoggingConfig();
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

	public AWSHostedZoneConfig getHostedZoneConfig() {
		return HostedZoneConfig;
	}

	public void setHostedZoneConfig(AWSHostedZoneConfig hostedZoneConfig) {
		HostedZoneConfig = hostedZoneConfig;
	}

	public AWSHostedZoneTags getHostedZoneTags() {
		return HostedZoneTags;
	}

	public void setHostedZoneTags(AWSHostedZoneTags hostedZoneTags) {
		HostedZoneTags = hostedZoneTags;
	}

	public AWSQueryLoggingConfig getQueryLoggingConfig() {
		return QueryLoggingConfig;
	}

	public void setQueryLoggingConfig(AWSQueryLoggingConfig queryLoggingConfig) {
		QueryLoggingConfig = queryLoggingConfig;
	}
	

}
