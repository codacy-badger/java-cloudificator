package org.platform.aws.sections;

import java.util.HashMap;

import org.platform.aws.sections.sub.AWSOutput;

public class SectionOutputs {
	
	public HashMap<String, AWSOutput> values = new HashMap<>();

	public SectionOutputs() {
		values = new HashMap<>();
	}
	
	public void addOutput(String outputName, AWSOutput outputItem) {
		values.put(outputName, outputItem);
	}

	public HashMap<String, AWSOutput> getProperties() {
		return values;
	}

}
