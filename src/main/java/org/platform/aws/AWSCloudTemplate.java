package org.platform.aws;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.platform.CloudTemplate;

public class AWSCloudTemplate extends CloudTemplate {
	
	private Set<Object> templateProperties;
	
	private Map<String,Object> templatePropertiesMap;
	
	// Constructors
	
	public AWSCloudTemplate() {
		super();
		this.templateType = CloudTemplate.AWS;
		resetMap();
	}
	
	public AWSCloudTemplate(Date templateDate) {
		super();
		this.templateType = CloudTemplate.AWS;
		resetMap();
	}
	
	public AWSCloudTemplate(String description) {
		super();
		this.templateType = CloudTemplate.AWS;
		resetMap();
	}
	
	public AWSCloudTemplate(Date templateDate, String description) {
		super();
		this.templateType = CloudTemplate.AWS;
		resetMap();
	}

	private void resetMap() {
		templateProperties = new HashSet<>();
		templateProperties.add("AWSTemplateFormatVersion");
		
		//itemsMap = new HashMap<String, Object>();
	}

	@Override
	public void createTemplate() {
		
		
	}

	public void setParameters(List AWSParameters) {
		
	}

	public void setResources(List AWSResources) {
		
	}

	public void setOutputs(List AWSOutputs) {
		
	}
	

}
