package org.platform.aws.sections;

import java.util.HashMap;

import org.platform.aws.sections.sub.AWSResource;

public class SectionResources {
	
	public HashMap<String, AWSResource> values = new HashMap<>();

	public SectionResources() {
		values = new HashMap<>();
	}
	
	public void addResource(String resourceName, AWSResource resourceItem) {
		values.put(resourceName, resourceItem);
	}

	public HashMap<String, AWSResource> getProperties() {
		return values;
	}

}
