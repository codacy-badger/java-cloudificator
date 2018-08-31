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
public class AwsResourceEmrStep {

    /**
     * The ID of a cluster in which you want to run this job flow step. 
     */
    private String JobFlowId;

    /**
     * The action to take if the job flow step fails. Currently, AWS CloudFormation supports CONTINUE and CANCEL_AND_WAIT. 
     */
    private String ActionOnFailure;

    /**
     * The JAR file that includes the main function that Amazon EMR executes. 
     */
    private String HadoopJarStep;

    /**
     * A name for the job flow step. 
     */
    private String Name;

    /**
     * @return the JobFlowId
     */
    public String getJobFlowId() {
        return JobFlowId;
    }

    /**
     * @param JobFlowId the JobFlowId to set
     */
    public void setJobFlowId(String JobFlowId) {
	this.JobFlowId = JobFlowId;
    }

    /**
     * @return the ActionOnFailure
     */
    public String getActionOnFailure() {
        return ActionOnFailure;
    }

    /**
     * @param ActionOnFailure the ActionOnFailure to set
     */
    public void setActionOnFailure(String ActionOnFailure) {
	this.ActionOnFailure = ActionOnFailure;
    }

    /**
     * @return the HadoopJarStep
     */
    public String getHadoopJarStep() {
        return HadoopJarStep;
    }

    /**
     * @param HadoopJarStep the HadoopJarStep to set
     */
    public void setHadoopJarStep(String HadoopJarStep) {
	this.HadoopJarStep = HadoopJarStep;
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