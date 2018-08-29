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

import org.platform.aws.sections.sub.AWSOutput;

/**
 * The Class SectionOutputs.
 *
 * @author Inaki Rodriguez
 */
public class SectionOutputs {
	
	/** The values. */
	public HashMap<String, AWSOutput> values = new HashMap<>();

	/**
	 * Instantiates a new section outputs.
	 */
	public SectionOutputs() {
		values = new HashMap<>();
	}
	
	/**
	 * Adds the output.
	 *
	 * @param outputName the output name
	 * @param outputItem the output item
	 */
	public void addOutput(String outputName, AWSOutput outputItem) {
		values.put(outputName, outputItem);
	}

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public HashMap<String, AWSOutput> getProperties() {
		return values;
	}

}
