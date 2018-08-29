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

import java.util.HashMap;

import org.platform.aws.sections.sub.AWSResource;

/**
 * The Class SectionResources.
 *
 * @author Inaki Rodriguez
 */
public class SectionResources {
	
	/** The values. */
	public HashMap<String, AWSResource> values = new HashMap<>();

	/**
	 * Instantiates a new section resources.
	 */
	public SectionResources() {
		values = new HashMap<>();
	}
	
	/**
	 * Adds the resource.
	 *
	 * @param resourceName the resource name
	 * @param resourceItem the resource item
	 */
	public void addResource(String resourceName, AWSResource resourceItem) {
		values.put(resourceName, resourceItem);
	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public HashMap<String, AWSResource> getProperties() {
		return values;
	}

}
