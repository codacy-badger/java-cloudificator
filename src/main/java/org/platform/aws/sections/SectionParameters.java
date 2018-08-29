package org.platform.aws.sections;

import java.util.HashMap;

import org.platform.aws.sections.sub.AWSParam;

public class SectionParameters extends Object {
	
	public HashMap<String, AWSParam> values = new HashMap<>();

	public SectionParameters() {
		values = new HashMap<>();
	}
	
	public void addParam(String paramName, AWSParam paramItem) {
		values.put(paramName, paramItem);
	}

	public HashMap<String, AWSParam> getProperties() {
		return values;
	}
	
}
