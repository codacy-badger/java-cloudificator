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
package org.platform.aws.sections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.platform.aws.sections.sub.AWSMappingKey;

/**
 * The Class SectionMapping.
 *
 * @author inakirodriguez
 */
public class SectionMapping {

    /** The values. */
    public HashMap<String, HashMap<String, List<AWSMappingKey>>> values;

    /**
     * Instantiates a new section mappings.
     */
    public SectionMapping() {
	values = new HashMap<>();
    }

    /**
     * Adds the mapping.
     *
     * @param mappingName    the mapping name
     * @param subMappingName the sub mapping name
     * @param mappingItem    the mapping item
     */
    public void addMapping(String mappingName, String subMapping, AWSMappingKey mappingItem) {
	HashMap<String, List<AWSMappingKey>> mappingList;
	if (values.containsKey(mappingName)) {
	    mappingList = values.get(mappingName);
	} else {
	    mappingList = new HashMap<>();
	}

	List<AWSMappingKey> keypairList;
	if (mappingList.containsKey(subMapping)) {
	    keypairList = mappingList.get(subMapping);
	    keypairList.add(mappingItem);
	} else {
	    keypairList = new ArrayList<>();
	    keypairList.add(mappingItem);
	}
	mappingList.put(subMapping, keypairList);
	values.put(mappingName, mappingList);
    }

    /**
     * Gets the properties.
     *
     * @return the properties
     */
    public HashMap<String, HashMap<String, List<AWSMappingKey>>> getProperties() {
	return values;
    }

}
