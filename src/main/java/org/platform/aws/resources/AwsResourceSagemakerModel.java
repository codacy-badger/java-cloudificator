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
public class AwsResourceSagemakerModel {

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute instances. Deploying on ML compute instances is part of model hosting. For more information, see Amazon SageMaker Roles. 
     */
    private String ExecutionRoleArn;

    /**
     * The location of the primary docker image containing inference code, associated artifacts, and custom environment map that the inference code uses when the model is deployed into production. 
     */
    private String PrimaryContainer;

    /**
     * The name of the model. 
     */
    private String ModelName;

    /**
     * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. For more information, see Protect Models by Using an Amazon Virtual Private Cloud. 
     */
    private String VpcConfig;

    /**
     * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
     */
    private String Tags;

    /**
     * @return the ExecutionRoleArn
     */
    public String getExecutionRoleArn() {
        return ExecutionRoleArn;
    }

    /**
     * @param ExecutionRoleArn the ExecutionRoleArn to set
     */
    public void setExecutionRoleArn(String ExecutionRoleArn) {
	this.ExecutionRoleArn = ExecutionRoleArn;
    }

    /**
     * @return the PrimaryContainer
     */
    public String getPrimaryContainer() {
        return PrimaryContainer;
    }

    /**
     * @param PrimaryContainer the PrimaryContainer to set
     */
    public void setPrimaryContainer(String PrimaryContainer) {
	this.PrimaryContainer = PrimaryContainer;
    }

    /**
     * @return the ModelName
     */
    public String getModelName() {
        return ModelName;
    }

    /**
     * @param ModelName the ModelName to set
     */
    public void setModelName(String ModelName) {
	this.ModelName = ModelName;
    }

    /**
     * @return the VpcConfig
     */
    public String getVpcConfig() {
        return VpcConfig;
    }

    /**
     * @param VpcConfig the VpcConfig to set
     */
    public void setVpcConfig(String VpcConfig) {
	this.VpcConfig = VpcConfig;
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