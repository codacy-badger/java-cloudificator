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
package org.platform.aws.sections.sub;

/**
 * The Class AWSOutput.
 *
 * @author Inaki Rodriguez
 */
// @See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html
public class AWSOutput {
	
	/** The Logical ID. */
	// An identifier for the current output. The logical ID must be alphanumeric (a-z, A-Z, 0-9) and unique within the template.
	private String Logical_ID;

	// (optional)
	/** The Description. */
	// A String type that describes the output value. The value for the description declaration must be a literal string that is between 0 and 1024 bytes in length. You cannot use a parameter or function to specify the description. The description can be a maximum of 4 K in length.
	private String Description;

    // (required)
	/** The Value. */
    // The value of the property returned by the aws cloudformation describe-stacks command. The value of an output can include literals, parameter references, pseudo-parameters, a mapping value, or intrinsic functions.
    private String Value;

    /** The Export. */
    // (optional)
    private String Export;

	/**
	 * Gets the logical ID.
	 *
	 * @return the logical ID
	 */
	public String getLogical_ID() {
		return Logical_ID;
	}

	/**
	 * Sets the logical ID.
	 *
	 * @param logical_ID the new logical ID
	 */
	public void setLogical_ID(String logical_ID) {
		Logical_ID = logical_ID;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		Description = description;
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

	/**
	 * Gets the export.
	 *
	 * @return the export
	 */
	public String getExport() {
		return Export;
	}

	/**
	 * Sets the export.
	 *
	 * @param export the new export
	 */
	public void setExport(String export) {
		Export = export;
	}
    
    

}
