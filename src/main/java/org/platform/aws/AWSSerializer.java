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
import java.util.Map.Entry;

import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.platform.aws.sections.sub.AWSOutput;
import org.platform.aws.sections.sub.AWSParam;
import org.platform.aws.sections.sub.AWSResource;
import org.utils.AWSUtils;
import org.utils.MainUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * The Class AWSSerializer.
 *
 * @author inakirodriguez
 *
 */
@SuppressWarnings("serial")
public class AWSSerializer extends StdSerializer<AWSTemplateCreator> {

    /**
     * Instantiates a new AWS serializer.
     */
    public AWSSerializer() {
	this(null);
    }

    /**
     * Instantiates a new AWS serializer.
     *
     * @param t the t
     */
    public AWSSerializer(Class<AWSTemplateCreator> t) {
	super(t);
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.fasterxml.jackson.databind.ser.std.StdSerializer#serialize(java.lang.
     * Object, com.fasterxml.jackson.core.JsonGenerator,
     * com.fasterxml.jackson.databind.SerializerProvider)
     */
    @Override
    public void serialize(AWSTemplateCreator item, JsonGenerator jgen, SerializerProvider provider) throws IOException {
	jgen.useDefaultPrettyPrinter();

	// Starting JSON structure
	jgen.writeStartObject();

	// Serializing global attributes
	jgen.writeStringField(AWSUtils.FIELD_TEMPLATE_VERSION, item.AWSTemplateFormatVersion);
	jgen.writeStringField(AWSUtils.FIELD_TEMPLATE_DESCRIPTION, item.Description);

	doParameterSerialization(item, jgen);
	try {
	    doResourcesSerialization(item, jgen);
	} catch (NoSuchFieldException e) {
	    throw new RuntimeException(e.getMessage());
	} catch (ClassNotFoundException e) {
	    throw new RuntimeException(e.getMessage());
	}
	doOutputSerialization(item, jgen);

	// Ending JSON structure
	jgen.writeEndObject();
    }

    /**
     * Do resources serialization.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException            Signals that an I/O exception has occurred.
     * @throws NoSuchFieldException
     * @throws ClassNotFoundException
     */
    private void doResourcesSerialization(AWSTemplateCreator item, JsonGenerator jgen)
	    throws IOException, NoSuchFieldException, ClassNotFoundException {
	SectionResources resourcesSection = item.getResources();
	if (resourcesSection != null && !resourcesSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_RESOURCES);
	    for (Entry<String, AWSResource> paramEntry : resourcesSection.getProperties().entrySet()) {
		String objectId = paramEntry.getKey();
		AWSResource awsParam = paramEntry.getValue();
		boolean hasMissingValues = false;
		try {
		    hasMissingValues = MainUtils.hasRequiredFieldsMissingValue(awsParam);
		} catch (IllegalAccessException e) {
		    hasMissingValues = true;
		}
		if (hasMissingValues) {
		    throw new RuntimeException("Missing values");
		}

		jgen.writeObjectField(objectId, awsParam);
	    }
	    jgen.writeEndObject();
	}
    }

    /**
     * Do output serialization.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void doOutputSerialization(AWSTemplateCreator item, JsonGenerator jgen) throws IOException {
	// Serializing output section if any
	SectionOutputs outputSection = item.getOutputs();
	if (outputSection != null && !outputSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_OUTPUTS);
	    for (Entry<String, AWSOutput> paramEntry : outputSection.getProperties().entrySet()) {
		String objectId = paramEntry.getKey();
		AWSOutput awsParam = paramEntry.getValue();
		jgen.writeObjectField(objectId, awsParam);
	    }
	    jgen.writeEndObject();
	}
    }

    /**
     * Do parameter serialization.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void doParameterSerialization(AWSTemplateCreator item, JsonGenerator jgen) throws IOException {
	SectionParameters paramSection = item.getParameters();
	if (paramSection != null && !paramSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_PARAMETERS);
	    for (Entry<String, AWSParam> paramEntry : paramSection.getProperties().entrySet()) {
		String objectId = paramEntry.getKey();
		AWSParam awsParam = paramEntry.getValue();
		jgen.writeObjectField(objectId, awsParam);
	    }
	    jgen.writeEndObject();
	}
    }

}
