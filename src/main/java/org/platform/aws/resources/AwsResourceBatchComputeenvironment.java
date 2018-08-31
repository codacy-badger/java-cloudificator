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
public class AwsResourceBatchComputeenvironment {

    /**
     * The type of the compute environment. 
     */
    private String Type;

    /**
     * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf. 
     */
    private String ServiceRole;

    /**
     * The name of the compute environment. 
     */
    private String ComputeEnvironmentName;

    /**
     * The compute resources defined for the compute environment. 
     */
    private String ComputeResources;

    /**
     * The state of the compute environment. The valid values are ENABLED or DISABLED. An ENABLED state indicates that you can register instances with the compute environment and that the associated instances can accept jobs. 
     */
    private String State;

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
     * @return the ServiceRole
     */
    public String getServiceRole() {
        return ServiceRole;
    }

    /**
     * @param ServiceRole the ServiceRole to set
     */
    public void setServiceRole(String ServiceRole) {
	this.ServiceRole = ServiceRole;
    }

    /**
     * @return the ComputeEnvironmentName
     */
    public String getComputeEnvironmentName() {
        return ComputeEnvironmentName;
    }

    /**
     * @param ComputeEnvironmentName the ComputeEnvironmentName to set
     */
    public void setComputeEnvironmentName(String ComputeEnvironmentName) {
	this.ComputeEnvironmentName = ComputeEnvironmentName;
    }

    /**
     * @return the ComputeResources
     */
    public String getComputeResources() {
        return ComputeResources;
    }

    /**
     * @param ComputeResources the ComputeResources to set
     */
    public void setComputeResources(String ComputeResources) {
	this.ComputeResources = ComputeResources;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
	this.State = State;
    }


}