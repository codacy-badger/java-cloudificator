package org.platform;

/**
 * Do not allow this class as an instance, instead create an specific template type class
 * @author inakirodriguez
 *
 */
public abstract class CloudTemplate {
	
	public static final String AWS = "AWS_platform";
	public String templateType;
	
	abstract public void createTemplate();
	
	public String getTemplateType() {
		return this.templateType;
		
	}
	
	public String generateTemplate() {
		return generateTemplateYAML();
	}
	
	public String generateTemplateJSON() {
		return "";
	}
	
	public String generateTemplateYAML() {
		return "";
	}
	

}
