package org.platform.aws;

import java.io.IOException;
import java.util.Map.Entry;

import org.platform.aws.sections.AWSOutput;
import org.platform.aws.sections.AWSParam;
import org.platform.aws.sections.SectionMappings;
import org.platform.aws.sections.SectionOutputs;
import org.platform.aws.sections.SectionParameters;
import org.platform.aws.sections.SectionResources;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

@SuppressWarnings("serial")
public class AWSSerializer extends StdSerializer<AWSCloudTemplateCreator> {
	
	public AWSSerializer() {
        this(null);
    }
   
    public AWSSerializer(Class<AWSCloudTemplateCreator> t) {
        super(t);
    }
 
    @Override
    public void serialize(
    		AWSCloudTemplateCreator item, JsonGenerator jgen, SerializerProvider provider) 
      throws IOException, JsonProcessingException {
    	jgen.useDefaultPrettyPrinter();
    	
    	// Starting JSON structure
    	jgen.writeStartObject();
        
    	// TODO Make constants with all those literals
        // Serializing global attributes
        jgen.writeStringField("AWSTemplateFormatVersion", item.AWSTemplateFormatVersion );
        jgen.writeStringField("Description", item.Description);
        
        // Serializing parameter section if any
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
        
        // TODO Serializing mappings section if any
        SectionMappings mappingsSection = item.getMappings();
        
        // TODO Serializing resources section if any
        SectionResources resourcesSection = item.getResources();
        
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
        
        // Ending JSON structure
        jgen.writeEndObject();
    }

}
