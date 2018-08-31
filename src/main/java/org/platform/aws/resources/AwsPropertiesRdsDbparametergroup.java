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
public class AwsPropertiesRdsDbparametergroup {

    /**
     * A friendly description of the RDS parameter group. For example, "My Parameter Group". 
     */
    private String Description;

    /**
     * The parameters to set for this RDS parameter group. 
     */
    private String Parameters;

    /**
     * The database family of this RDS parameter group. For example, "MySQL5.1". 
     */
    private String Family;

    /**
     * The tags that you want to attach to the RDS parameter group. 
     */
    private String Tags;

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
     * @return the Parameters
     */
    public String getParameters() {
        return Parameters;
    }

    /**
     * @param Parameters the Parameters to set
     */
    public void setParameters(String Parameters) {
	this.Parameters = Parameters;
    }

    /**
     * @return the Family
     */
    public String getFamily() {
        return Family;
    }

    /**
     * @param Family the Family to set
     */
    public void setFamily(String Family) {
	this.Family = Family;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}