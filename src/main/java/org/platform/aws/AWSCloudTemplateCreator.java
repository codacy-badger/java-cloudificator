package org.platform.aws;

import java.io.IOException;
import java.util.List;

import org.platform.CloudTemplateCreator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AWSCloudTemplateCreator extends CloudTemplateCreator {
	
	@SuppressWarnings("unused")
	private String AWSTemplateFormatVersion;
	@SuppressWarnings("unused")
	private String Description;
	private transient String jsonOutput;
	private transient String yamlOutput;
	
	// No constructors. Use factory
	private AWSCloudTemplateCreator() {
		
	}
	
	public static AWSCloudTemplateCreator FactoryDefault() {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
		templateCreator.Description = "";
		cleanMaps();
	    return templateCreator;
	}
	
	public static AWSCloudTemplateCreator FactoryCreator(String templateDate, String templateDescription) {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = templateDate;
		templateCreator.Description = templateDescription;
		cleanMaps();
	    return templateCreator;
	}
	
	public static AWSCloudTemplateCreator FactoryCreatorWithDesc(String templateDescription) {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
		templateCreator.Description = templateDescription;
		cleanMaps();
	    return templateCreator;
	}
	

	private static void cleanMaps() {
		
	}

	@Override
	public void createTemplate() {
		
	}

	public void setParameters(List<AWSParameters> templateParams) {
		
	}

	public void setResources(List<AWSResources> templateResources) {
		
	}

	public void setOutputs(List<AWSOutputs> templateOutputs) {
		
	}

	@Override
	public String generateTemplateJSON() {
		// Taking the map item and rendering as a YAML representation
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		this.jsonOutput = gson.toJson(this);
		
		return jsonOutput;
	}

	@Override
	public String generateTemplateYAML() {
		if(this.jsonOutput == null) {
			generateTemplateJSON();
		}
		try {
			this.yamlOutput = asYaml(this.jsonOutput);
			return this.yamlOutput;
		} catch (JsonProcessingException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	public String asYaml(String jsonString) throws JsonProcessingException, IOException {
        // parse JSON
        JsonNode jsonNodeTree = new ObjectMapper().readTree(jsonString);
        // save it as YAML
        String jsonAsYaml = new YAMLMapper().writeValueAsString(jsonNodeTree);
        return jsonAsYaml;
    }

}
