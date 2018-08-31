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
public class AwsResourceSagemakerNotebookinstance {

    /**
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that is attached to your notebook instance. 
     */
    private String KmsKeyId;

    /**
     * Sets whether Amazon SageMaker provides internet access to the notebook instance. If you set this to Disabled this notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC. For more information, see Notebook Instances Are Enabled with Internet Access by Default. You can set the value of this parameter to Disabled only if you set a value for the SubnetId parameter. 
     */
    private String DirectInternetAccess;

    /**
     * The ID of the subnet in a VPC to which you would like to have a connectivity from your ML compute instance. 
     */
    private String SubnetId;

    /**
     * The name of the notebook instance. 
     */
    private String NotebookInstanceName;

    /**
     * The type of ML compute instance to launch for the notebook instance. 
     */
    private String InstanceType;

    /**
     * The name of a lifecycle configuration to associate with the notebook instance. For information about lifestyle configurations, see Customize a Notebook Instance in the Amazon SageMaker Developer Guide. 
     */
    private String LifecycleConfigName;

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. The security groups must be for the same VPC as specified in the subnet. 
     */
    private String SecurityGroupIds;

    /**
     * When you send any requests to AWS resources from the notebook instance, Amazon SageMaker assumes this role to perform tasks on your behalf. You must grant this role necessary permissions so Amazon SageMaker can perform these tasks. The policy must allow the Amazon SageMaker service principal (sagemaker.amazonaws.com) permissions to assume this role. For more information, see Amazon SageMaker Roles. 
     */
    private String RoleArn;

    /**
     * A list of tags to associate with the notebook instance. 
     */
    private String Tags;

    /**
     * @return the KmsKeyId
     */
    public String getKmsKeyId() {
        return KmsKeyId;
    }

    /**
     * @param KmsKeyId the KmsKeyId to set
     */
    public void setKmsKeyId(String KmsKeyId) {
	this.KmsKeyId = KmsKeyId;
    }

    /**
     * @return the DirectInternetAccess
     */
    public String getDirectInternetAccess() {
        return DirectInternetAccess;
    }

    /**
     * @param DirectInternetAccess the DirectInternetAccess to set
     */
    public void setDirectInternetAccess(String DirectInternetAccess) {
	this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
    }

    /**
     * @return the NotebookInstanceName
     */
    public String getNotebookInstanceName() {
        return NotebookInstanceName;
    }

    /**
     * @param NotebookInstanceName the NotebookInstanceName to set
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
	this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * @return the InstanceType
     */
    public String getInstanceType() {
        return InstanceType;
    }

    /**
     * @param InstanceType the InstanceType to set
     */
    public void setInstanceType(String InstanceType) {
	this.InstanceType = InstanceType;
    }

    /**
     * @return the LifecycleConfigName
     */
    public String getLifecycleConfigName() {
        return LifecycleConfigName;
    }

    /**
     * @param LifecycleConfigName the LifecycleConfigName to set
     */
    public void setLifecycleConfigName(String LifecycleConfigName) {
	this.LifecycleConfigName = LifecycleConfigName;
    }

    /**
     * @return the SecurityGroupIds
     */
    public String getSecurityGroupIds() {
        return SecurityGroupIds;
    }

    /**
     * @param SecurityGroupIds the SecurityGroupIds to set
     */
    public void setSecurityGroupIds(String SecurityGroupIds) {
	this.SecurityGroupIds = SecurityGroupIds;
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