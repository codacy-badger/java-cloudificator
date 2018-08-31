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
package org.platform.aws.resources;

/**
 * Generated class
 */
public class AwsResourceSsmParameter {

    /**
     * The type of parameter. Valid values include the following: String or StringList. 
     */
    private String Type;

    /**
     * Information about the parameter that you want to add to the system. 
     */
    private String Description;

    /**
     * A regular expression used to validate the parameter value. For example, for String types with values restricted to numbers, you can specify the following: AllowedPattern=^\d+$ 
     */
    private String AllowedPattern;

    /**
     * The parameter value. Value must not nest another parameter. Do not use {{}} in the value. 
     */
    private String Value;

    /**
     * The name of the parameter. 
     */
    private String Name;

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the AllowedPattern
     */
    public String getAllowedPattern() {
        return AllowedPattern;
    }

    /**
     * @param AllowedPattern the AllowedPattern to set
     */
    public void setAllowedPattern(String AllowedPattern) {
	this.AllowedPattern = AllowedPattern;
    }

    /**
     * @return the Value
     */
    public String getValue() {
        return Value;
    }

    /**
     * @param Value the Value to set
     */
    public void setValue(String Value) {
	this.Value = Value;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}