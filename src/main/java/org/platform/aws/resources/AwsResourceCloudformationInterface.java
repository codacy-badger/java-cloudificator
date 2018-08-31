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
public class AwsResourceCloudformationInterface {

    /**
     * A list of parameter group types, where you specify group names, the parameters in each group, and the order in which the parameters are shown. 
     */
    private String ParameterGroups;

    /**
     * A mapping of parameters and their friendly names that the AWS CloudFormation console shows when a stack is created or updated. 
     */
    private String ParameterLabels;

    /**
     * @return the ParameterGroups
     */
    public String getParameterGroups() {
        return ParameterGroups;
    }

    /**
     * @param ParameterGroups the ParameterGroups to set
     */
    public void setParameterGroups(String ParameterGroups) {
	this.ParameterGroups = ParameterGroups;
    }

    /**
     * @return the ParameterLabels
     */
    public String getParameterLabels() {
        return ParameterLabels;
    }

    /**
     * @param ParameterLabels the ParameterLabels to set
     */
    public void setParameterLabels(String ParameterLabels) {
	this.ParameterLabels = ParameterLabels;
    }


}