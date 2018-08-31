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
public class AwsResourceCodepipelinePipeline {

    /**
     * The Amazon Simple Storage Service (Amazon S3) location where AWS CodePipeline stores pipeline artifacts. For more information, see Create an Amazon S3 Bucket for Your Application in the AWS CodePipeline User Guide. 
     */
    private String ArtifactStore;

    /**
     * Prevents artifacts in a pipeline from transitioning to the stage that you specified. This enables you to manually control transitions. 
     */
    private String DisableInboundStageTransitions;

    /**
     * Defines the AWS CodePipeline pipeline stages. 
     */
    private String Stages;

    /**
     * Indicates whether to rerun the AWS CodePipeline pipeline after you update it. 
     */
    private String RestartExecutionOnUpdate;

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf. For more information, see AWS CodePipeline Access Permissions Reference in the AWS CodePipeline User Guide. 
     */
    private String RoleArn;

    /**
     * The name of your AWS CodePipeline pipeline. 
     */
    private String Name;

    /**
     * @return the ArtifactStore
     */
    public String getArtifactStore() {
        return ArtifactStore;
    }

    /**
     * @param ArtifactStore the ArtifactStore to set
     */
    public void setArtifactStore(String ArtifactStore) {
	this.ArtifactStore = ArtifactStore;
    }

    /**
     * @return the DisableInboundStageTransitions
     */
    public String getDisableInboundStageTransitions() {
        return DisableInboundStageTransitions;
    }

    /**
     * @param DisableInboundStageTransitions the DisableInboundStageTransitions to set
     */
    public void setDisableInboundStageTransitions(String DisableInboundStageTransitions) {
	this.DisableInboundStageTransitions = DisableInboundStageTransitions;
    }

    /**
     * @return the Stages
     */
    public String getStages() {
        return Stages;
    }

    /**
     * @param Stages the Stages to set
     */
    public void setStages(String Stages) {
	this.Stages = Stages;
    }

    /**
     * @return the RestartExecutionOnUpdate
     */
    public String getRestartExecutionOnUpdate() {
        return RestartExecutionOnUpdate;
    }

    /**
     * @param RestartExecutionOnUpdate the RestartExecutionOnUpdate to set
     */
    public void setRestartExecutionOnUpdate(String RestartExecutionOnUpdate) {
	this.RestartExecutionOnUpdate = RestartExecutionOnUpdate;
    }

    /**
     * @return the RoleArn
     */
    public String getRoleArn() {
        return RoleArn;
    }

    /**
     * @param RoleArn the RoleArn to set
     */
    public void setRoleArn(String RoleArn) {
	this.RoleArn = RoleArn;
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