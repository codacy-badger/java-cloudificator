package org.platform.aws;

import java.io.IOException;
import java.util.Map.Entry;

import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;
import org.platform.aws.sections.sub.AWSOutput;
import org.platform.aws.sections.sub.AWSParam;
import org.platform.aws.sections.sub.AWSResource;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("serial")
public class AWSSerializer extends StdSerializer<AWSTemplateCreator> {
	
	public AWSSerializer() {
        this(null);
    }
   
    public AWSSerializer(Class<AWSTemplateCreator> t) {
        super(t);
    }
 
    @Override
    public void serialize(
    		AWSTemplateCreator item, JsonGenerator jgen, SerializerProvider provider) 
      throws IOException, JsonProcessingException {
    	jgen.useDefaultPrettyPrinter();
    	
    	// Starting JSON structure
    	jgen.writeStartObject();
        
    	// TODO Make constants with all those literals
        // Serializing global attributes
        jgen.writeStringField("AWSTemplateFormatVersion", item.AWSTemplateFormatVersion );
        jgen.writeStringField("Description", item.Description);
        
        doParameterSerialization(item, jgen);
        // TODO Serializing mappings section if any
        //SectionMappings mappingsSection = item.getMappings();
        doResourcesSerialization(item, jgen);
        doOutputSerialization(item, jgen);
        
        // Ending JSON structure
        jgen.writeEndObject();
    }

	private void doResourcesSerialization(AWSTemplateCreator item, JsonGenerator jgen) throws IOException {
		SectionResources resourcesSection = item.getResources();
		if(resourcesSection != null && !resourcesSection.getProperties().isEmpty() ) {
        	jgen.writeObjectFieldStart("Resources");
        	for(Entry<String, AWSResource> paramEntry : resourcesSection.getProperties().entrySet() ) {
        		String objectId = paramEntry.getKey();
        		AWSResource awsParam = paramEntry.getValue();
        		jgen.writeObjectField(objectId, awsParam);
        	}
        	jgen.writeEndObject();
        }
	}

	private void doOutputSerialization(AWSTemplateCreator item, JsonGenerator jgen) throws IOException {
		// Serializing output section if any
        SectionOutputs outputSection = item.getOutputs();
        if(outputSection != null && !outputSection.getProperties().isEmpty() ) {
        	jgen.writeObjectFieldStart("Outputs");
        	for(Entry<String, AWSOutput> paramEntry : outputSection.getProperties().entrySet() ) {
        		String objectId = paramEntry.getKey();
        		AWSOutput awsParam = paramEntry.getValue();
        		jgen.writeObjectField(objectId, awsParam);
        	}
        	jgen.writeEndObject();
        }
	}

	private void doParameterSerialization(AWSTemplateCreator item, JsonGenerator jgen) throws IOException {
		SectionParameters paramSection = item.getParameters();
        if(paramSection != null && !paramSection.getProperties().isEmpty() ) {
        	jgen.writeObjectFieldStart("Parameters");
        	for(Entry<String, AWSParam> paramEntry : paramSection.getProperties().entrySet() ) {
        		String objectId = paramEntry.getKey();
        		AWSParam awsParam = paramEntry.getValue();
        		jgen.writeObjectField(objectId, awsParam);
        	}
        	jgen.writeEndObject();
        }
	}

}
