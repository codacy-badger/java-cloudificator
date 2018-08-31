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
public class AwsResourceRedshiftClusterparametergroup {

    /**
     * A description of the parameter group. 
     */
    private String Description;

    /**
     * A list of parameter names and values that are allowed by the Amazon Redshift engine version that you specified in the ParameterGroupFamily property. For more information, see Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide. 
     */
    private String Parameters;

    /**
     * The Amazon Redshift engine version that applies to this cluster parameter group. The cluster engine version determines the set of parameters that you can specify in the Parameters property. 
     */
    private String ParameterGroupFamily;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this parameter group. Use tags to manage your resources. 
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
     * @return the ParameterGroupFamily
     */
    public String getParameterGroupFamily() {
        return ParameterGroupFamily;
    }

    /**
     * @param ParameterGroupFamily the ParameterGroupFamily to set
     */
    public void setParameterGroupFamily(String ParameterGroupFamily) {
	this.ParameterGroupFamily = ParameterGroupFamily;
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