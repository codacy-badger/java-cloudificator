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
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.platform.aws.sections.SectionConditions;
import org.platform.aws.sections.SectionMapping;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.platform.aws.sections.sub.AWSMappingKey;
import org.platform.aws.sections.sub.AWSOutput;
import org.platform.aws.sections.sub.AWSParam;
import org.platform.aws.sections.sub.AWSResource;
import org.utils.AWSUtils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * The Class AWSSerializer.
 *
 * @author Inaki Rodriguez
 *
 */
@SuppressWarnings("serial")
public class AWSSerializer extends StdSerializer<CloudTemplateCreatorAWS> {

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
    public AWSSerializer(Class<CloudTemplateCreatorAWS> t) {
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
    public void serialize(CloudTemplateCreatorAWS item, JsonGenerator jgen, SerializerProvider provider)
	    throws IOException {
	jgen.useDefaultPrettyPrinter();

	// Starting JSON structure
	jgen.writeStartObject();

	// Serializing global attributes
	jgen.writeStringField(AWSUtils.FIELD_TEMPLATE_VERSION, item.AWSTemplateFormatVersion);
	jgen.writeStringField(AWSUtils.FIELD_TEMPLATE_DESCRIPTION, item.Description);

	doParameterSerialization(item, jgen);
	doMappingSerializer(item, jgen);
	doResourcesSerialization(item, jgen);
	doConditionsSerialization(item, jgen);
	doOutputSerialization(item, jgen);

	// Ending JSON structure
	jgen.writeEndObject();
    }

    /**
     * Do resources serialization.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void doResourcesSerialization(CloudTemplateCreatorAWS item, JsonGenerator jgen) throws IOException {
	SectionResources resourcesSection = item.getResources();
	if (resourcesSection != null && !resourcesSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_RESOURCES);
	    for (Entry<String, AWSResource> paramEntry : resourcesSection.getProperties().entrySet()) {
		String objectId = paramEntry.getKey();
		AWSResource awsParam = paramEntry.getValue();
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
    private void doOutputSerialization(CloudTemplateCreatorAWS item, JsonGenerator jgen) throws IOException {
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
    private void doParameterSerialization(CloudTemplateCreatorAWS item, JsonGenerator jgen) throws IOException {
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

    /**
     * Do mapping serializer.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void doMappingSerializer(CloudTemplateCreatorAWS item, JsonGenerator jgen) throws IOException {
	SectionMapping mappingSection = item.getMappings();
	if (mappingSection != null && !mappingSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_MAPPINGS);
	    for (Entry<String, HashMap<String, List<AWSMappingKey>>> mappingEntry : mappingSection.getProperties()
		    .entrySet()) {
		String mappingId = mappingEntry.getKey();
		jgen.writeObjectFieldStart(mappingId);
		HashMap<String, List<AWSMappingKey>> keyPair = mappingEntry.getValue();
		for (Entry<String, List<AWSMappingKey>> entry : keyPair.entrySet()) {
		    jgen.writeObjectFieldStart(entry.getKey()); // SubMappingId
		    for (AWSMappingKey keyPairList : entry.getValue()) {
			jgen.writeStringField(keyPairList.getKeyPairId(), keyPairList.getKeyPairValue());
		    }
		    jgen.writeEndObject();
		}
		jgen.writeEndObject();
	    }
	    jgen.writeEndObject();
	}
    }

    /**
     * Do conditions serialization.
     *
     * @param item the item
     * @param jgen the jgen
     * @throws IOException Signals that an I/O exception has occurred.
     */
    private void doConditionsSerialization(CloudTemplateCreatorAWS item, JsonGenerator jgen) throws IOException {
	SectionConditions conditionsSection = item.getConditions();
	if (conditionsSection != null && !conditionsSection.getProperties().isEmpty()) {
	    jgen.writeObjectFieldStart(AWSUtils.FIELD_TEMPLATE_SECTION_CONDITIONS);
	    for (Entry<String, String> paramEntry : conditionsSection.getProperties().entrySet()) {
		String objectId = paramEntry.getKey();
		String intrinsicFunction = paramEntry.getValue();
		jgen.writeStringField(objectId, intrinsicFunction);
	    }
	    jgen.writeEndObject();
	}
    }

}
