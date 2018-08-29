package org.platform.aws.sections;

import java.util.HashMap;

import org.platform.aws.sections.sub.AWSOutput;

public class SectionOutputs {
	
	public HashMap<String, AWSOutput> values = new HashMap<>();

	public SectionOutputs() {
		values = new HashMap<>();
	}
	
	public void addOutput(String paramName, AWSOutput paramItem) {
		values.put(paramName, paramItem);
	}

	public HashMap<String, AWSOutput> getProperties() {
		return values;
	}

}
