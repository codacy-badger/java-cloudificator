/*******************************************************************************
 * Copyright 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.platform.aws;

import java.io.IOException;

import org.platform.CloudTemplateCreator;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.utils.MainUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator.Feature;

/**
 * The Class AWSTemplateCreator.
 *
 * @author Inaki Rodriguez
 */
@JsonSerialize(using = AWSSerializer.class)
public class CloudTemplateCreatorAWS extends CloudTemplateCreator {

    /** The AWS template format version. */
    // Global values
    public String AWSTemplateFormatVersion;

    /** The Description. */
    public String Description;

    // SECTIONS
    /** The Parameters. */
    private SectionParameters Parameters;

    /** The Resources. */
    private SectionResources Resources;

    /** The Outputs. */
    private SectionOutputs Outputs;

    /** The json output. */
    // Output streams
    private transient String jsonOutput;

    /** The yaml output. */
    private transient String yamlOutput;

    /**
     * Instantiates a new AWS template creator.
     */
    // No constructors. Use factory method
    private CloudTemplateCreatorAWS() {

    }

    /**
     * Factory default.
     *
     * @return the AWS template creator
     */
    public static CloudTemplateCreatorAWS FactoryDefault() {
	CloudTemplateCreatorAWS templateCreator = new CloudTemplateCreatorAWS();
	templateCreator.templateType = CloudTemplateCreator.AWS;
	templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
	templateCreator.Description = "";
	return templateCreator;
    }

    /**
     * Factory creator.
     *
     * @param templateDate        the template date
     * @param templateDescription the template description
     * @return the AWS template creator
     */
    public static CloudTemplateCreatorAWS FactoryCreator(String templateDate, String templateDescription) {
	CloudTemplateCreatorAWS templateCreator = new CloudTemplateCreatorAWS();
	templateCreator.templateType = CloudTemplateCreator.AWS;
	templateCreator.AWSTemplateFormatVersion = templateDate;
	templateCreator.Description = templateDescription;
	return templateCreator;
    }

    /**
     * Factory creator with desc.
     *
     * @param templateDescription the template description
     * @return the AWS template creator
     */
    public static CloudTemplateCreatorAWS FactoryCreatorWithDesc(String templateDescription) {
	CloudTemplateCreatorAWS templateCreator = new CloudTemplateCreatorAWS();
	templateCreator.templateType = CloudTemplateCreator.AWS;
	templateCreator.AWSTemplateFormatVersion = CloudTemplateCreator.AWS_TEMPLATE_VERSION_20100909;
	templateCreator.Description = templateDescription;
	return templateCreator;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.platform.CloudTemplateCreator#createTemplate()
     */
    @Override
    public void createTemplate() {

    }

    /*
     * (non-Javadoc)
     *
     * @see org.platform.CloudTemplateCreator#generateTemplateJSON()
     */
    @Override
    public String generateTemplateJSON() {
	try {
	    ObjectMapper objectMapper = new ObjectMapper();
	    objectMapper.setPropertyNamingStrategy(new FirstInitialUpperNamingStrategy());
	    objectMapper.setSerializationInclusion(Include.NON_NULL);
	    this.jsonOutput = objectMapper.writeValueAsString(this);
	    return jsonOutput;
	} catch (JsonProcessingException e) {
	}
	return null;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.platform.CloudTemplateCreator#generateTemplateYAML()
     */
    @Override
    public String generateTemplateYAML() {
	if (this.jsonOutput == null) {
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

    /**
     * As yaml.
     *
     * @param jsonString the json string
     * @return the string
     * @throws JsonProcessingException the json processing exception
     * @throws IOException             Signals that an I/O exception has occurred.
     */
    private String asYaml(String jsonString) throws JsonProcessingException, IOException {
	JsonNode jsonNodeTree = new ObjectMapper().readTree(jsonString);
	ObjectMapper noQuotesMapper = new ObjectMapper(new YAMLFactory().enable(Feature.MINIMIZE_QUOTES));
	String notRevisedString = noQuotesMapper.writeValueAsString(jsonNodeTree);
	// FIXME This is a hack, because I have no idea how to change that behavior in
	// objectmapper to avoid quoting when adding exclamation mark char
	return MainUtils.getRemovedQuoteForIntrinsecFunctions(notRevisedString);
    }

    /**
     * Sets the parameters.
     *
     * @param templateParams the new parameters
     */
    public void setParameters(SectionParameters templateParams) {
	this.Parameters = templateParams;
    }

    /**
     * Sets the resources.
     *
     * @param templateResources the new resources
     */
    public void setResources(SectionResources templateResources) {
	this.Resources = templateResources;
    }

    /**
     * Sets the outputs.
     *
     * @param templateOutputs the new outputs
     */
    public void setOutputs(SectionOutputs templateOutputs) {
	this.Outputs = templateOutputs;
    }

    /**
     * Gets the parameters.
     *
     * @return the parameters
     */
    public SectionParameters getParameters() {
	return Parameters;
    }

    /**
     * Gets the resources.
     *
     * @return the resources
     */
    public SectionResources getResources() {
	return Resources;
    }

    /**
     * Gets the outputs.
     *
     * @return the outputs
     */
    public SectionOutputs getOutputs() {
	return Outputs;
    }

    /**
     * Naming strategy needed to keep initial char on upper case mode.
     *
     * @author inakirodriguez
     */
    @SuppressWarnings("serial")
    public class FirstInitialUpperNamingStrategy extends PropertyNamingStrategy {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.fasterxml.jackson.databind.PropertyNamingStrategy#nameForField(com.
	 * fasterxml.jackson.databind.cfg.MapperConfig,
	 * com.fasterxml.jackson.databind.introspect.AnnotatedField, java.lang.String)
	 */
	@Override
	public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
	    return convert(field.getName());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.fasterxml.jackson.databind.PropertyNamingStrategy#nameForGetterMethod(com
	 * .fasterxml.jackson.databind.cfg.MapperConfig,
	 * com.fasterxml.jackson.databind.introspect.AnnotatedMethod, java.lang.String)
	 */
	@Override
	public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
	    return convert(method.getName().toString());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.fasterxml.jackson.databind.PropertyNamingStrategy#nameForSetterMethod(com
	 * .fasterxml.jackson.databind.cfg.MapperConfig,
	 * com.fasterxml.jackson.databind.introspect.AnnotatedMethod, java.lang.String)
	 */
	@Override
	public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
	    return convert(method.getName().toString());
	}

	/**
	 * Convert.
	 *
	 * @param input the input
	 * @return the string
	 */
	private String convert(String input) {
	    return input.substring(3);
	}

    }

}
