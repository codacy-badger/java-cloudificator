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
public class AwsResourceBatchJobqueue {

    /**
     * The compute environments that are attached to the job queue and the order in which job placement is preferred. Compute environments are selected for job placement in ascending order. 
     */
    private String ComputeEnvironmentOrder;

    /**
     * The status of the job queue (for example, CREATING or VALID). 
     */
    private String State;

    /**
     * The priority of the job queue. 
     */
    private String Priority;

    /**
     * The name of the job queue. 
     */
    private String JobQueueName;

    /**
     * @return the ComputeEnvironmentOrder
     */
    public String getComputeEnvironmentOrder() {
        return ComputeEnvironmentOrder;
    }

    /**
     * @param ComputeEnvironmentOrder the ComputeEnvironmentOrder to set
     */
    public void setComputeEnvironmentOrder(String ComputeEnvironmentOrder) {
	this.ComputeEnvironmentOrder = ComputeEnvironmentOrder;
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

    /**
     * @return the Priority
     */
    public String getPriority() {
        return Priority;
    }

    /**
     * @param Priority the Priority to set
     */
    public void setPriority(String Priority) {
	this.Priority = Priority;
    }

    /**
     * @return the JobQueueName
     */
    public String getJobQueueName() {
        return JobQueueName;
    }

    /**
     * @param JobQueueName the JobQueueName to set
     */
    public void setJobQueueName(String JobQueueName) {
	this.JobQueueName = JobQueueName;
    }


}