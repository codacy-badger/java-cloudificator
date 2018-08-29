package org.platform.aws;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import org.platform.CloudTemplateCreator;
import org.platform.aws.sections.SectionMappings;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.utils.MainUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

@JsonSerialize(using = AWSSerializer.class)
public class AWSCloudTemplateCreator extends CloudTemplateCreator {
	
	// Global values
	public String AWSTemplateFormatVersion;
	public String Description;
	
	// Sections
	private SectionParameters Parameters;
	private SectionMappings Mappings;
	private SectionResources Resources;
	private SectionOutputs Outputs;
	
	// Output streams
	private transient String jsonOutput;
	private transient String yamlOutput;
	
	// No constructors. Use factory method
	private AWSCloudTemplateCreator() {
		
	}
	
	public static AWSCloudTemplateCreator FactoryDefault() {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
		templateCreator.Description = "";
	    return templateCreator;
	}
	
	public static AWSCloudTemplateCreator FactoryCreator(String templateDate, String templateDescription) {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = templateDate;
		templateCreator.Description = templateDescription;
	    return templateCreator;
	}
	
	public static AWSCloudTemplateCreator FactoryCreatorWithDesc(String templateDescription) {
		AWSCloudTemplateCreator templateCreator = new AWSCloudTemplateCreator();
		templateCreator.templateType = CloudTemplateCreator.AWS;
		
		templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
		templateCreator.Description = templateDescription;
	    return templateCreator;
	}

	@Override
	public void createTemplate() {
		
	}

	public void setParameters(SectionParameters templateParams) {
		this.Parameters = templateParams;
	}

	public void setResources(SectionResources templateResources) {
		this.Resources = templateResources;
	}

	public void setOutputs(SectionOutputs templateOutputs) {
		this.Outputs = templateOutputs;
	}
	
	public void setMappings(SectionMappings templateMapping) {
		this.Mappings = templateMapping;
	}
	
	@Override
	public String generateTemplateJSON() {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			this.jsonOutput = objectMapper.writeValueAsString(this);
			return jsonOutput;
		} catch (JsonProcessingException e) {
		}
		return null;
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

	private String asYaml(String jsonString) throws JsonProcessingException, IOException {
        JsonNode jsonNodeTree = new ObjectMapper().readTree(jsonString);
		ObjectMapper noQuotesMapper = new ObjectMapper(new YAMLFactory().enable(Feature.MINIMIZE_QUOTES));
		String notRevisedString = noQuotesMapper.writeValueAsString(jsonNodeTree);
		return MainUtils.getRemovedQuoteForIntrinsecFunctions(notRevisedString);
    }

	public SectionParameters getParameters() {
		return Parameters;
	}

	public SectionMappings getMappings() {
		return Mappings;
	}

	public SectionResources getResources() {
		return Resources;
	}

	public SectionOutputs getOutputs() {
		return Outputs;
	}

}
