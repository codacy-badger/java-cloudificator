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
public class AwsResourceDaxParametergroup {

    /**
     * A map of DAX parameter names and values. 
     */
    private String ParameterNameValues;

    /**
     * A description of the parameter group. 
     */
    private String Description;

    /**
     * The name of the parameter group. 
     */
    private String ParameterGroupName;

    /**
     * @return the ParameterNameValues
     */
    public String getParameterNameValues() {
        return ParameterNameValues;
    }

    /**
     * @param ParameterNameValues the ParameterNameValues to set
     */
    public void setParameterNameValues(String ParameterNameValues) {
	this.ParameterNameValues = ParameterNameValues;
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
     * @return the ParameterGroupName
     */
    public String getParameterGroupName() {
        return ParameterGroupName;
    }

    /**
     * @param ParameterGroupName the ParameterGroupName to set
     */
    public void setParameterGroupName(String ParameterGroupName) {
	this.ParameterGroupName = ParameterGroupName;
    }


}