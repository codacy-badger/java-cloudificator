package org.platform;

/**
 * Do not allow this class as an instance, instead create an specific template type class
 * @author inakirodriguez
 *
 */
public abstract class CloudTemplateCreator {
	
	// Make it transient to be ignored when serialization, like JSON representation
	public transient String templateType;
	
	public static final String AWS = "AWS_platform";
	public static final String AWS_TEMPLATE_VERSION_20100909 = "2010-09-09";
	
	abstract public void createTemplate();
	
	abstract public String generateTemplateJSON();
	
	abstract public String generateTemplateYAML();
	

}
