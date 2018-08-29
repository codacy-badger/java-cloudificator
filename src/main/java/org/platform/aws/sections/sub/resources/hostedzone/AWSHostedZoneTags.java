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
package org.platform.aws.sections.sub.resources.hostedzone;

/**
 * The Class AWSHostedZoneTags.
 *
 * @author Inaki Rodriguez
 */
public class AWSHostedZoneTags {
	
	/** The Key. */
	private String Key;
	
	/** The Value. */
	private String Value;
	
	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return Key;
	}
	
	/**
	 * Sets the key.
	 *
	 * @param key the new key
	 */
	public void setKey(String key) {
		Key = key;
	}
	
	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}
	
	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		Value = value;
	}

}
