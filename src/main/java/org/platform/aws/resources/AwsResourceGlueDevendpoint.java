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
public class AwsResourceGlueDevendpoint {

    /**
     * The path to one or more Java Jars in an Amazon S3 bucket to load in your endpoint. 
     */
    private String ExtraJarsS3Path;

    /**
     * The name of the endpoint. 
     */
    private String EndpointName;

    /**
     * The public key for the endpoint to use for authentication. 
     */
    private String PublicKey;

    /**
     * The number of nodes that the endpoint uses. 
     */
    private String NumberOfNodes;

    /**
     * The path to one or more Python libraries in an Amazon S3 bucket to load in your endpoint. 
     */
    private String ExtraPythonLibsS3Path;

    /**
     * The subnet ID for the endpoint. 
     */
    private String SubnetId;

    /**
     * A list of UTF-8 strings that specify the security group IDs for the endpoint. 
     */
    private String SecurityGroupIds;

    /**
     * The Amazon Resource Name (ARN) of the IAM role for the endpoint. It must match the AWS ARN string pattern: arn:aws:iam::\d{12}:role/.* 
     */
    private String RoleArn;

    /**
     * @return the ExtraJarsS3Path
     */
    public String getExtraJarsS3Path() {
        return ExtraJarsS3Path;
    }

    /**
     * @param ExtraJarsS3Path the ExtraJarsS3Path to set
     */
    public void setExtraJarsS3Path(String ExtraJarsS3Path) {
	this.ExtraJarsS3Path = ExtraJarsS3Path;
    }

    /**
     * @return the EndpointName
     */
    public String getEndpointName() {
        return EndpointName;
    }

    /**
     * @param EndpointName the EndpointName to set
     */
    public void setEndpointName(String EndpointName) {
	this.EndpointName = EndpointName;
    }

    /**
     * @return the PublicKey
     */
    public String getPublicKey() {
        return PublicKey;
    }

    /**
     * @param PublicKey the PublicKey to set
     */
    public void setPublicKey(String PublicKey) {
	this.PublicKey = PublicKey;
    }

    /**
     * @return the NumberOfNodes
     */
    public String getNumberOfNodes() {
        return NumberOfNodes;
    }

    /**
     * @param NumberOfNodes the NumberOfNodes to set
     */
    public void setNumberOfNodes(String NumberOfNodes) {
	this.NumberOfNodes = NumberOfNodes;
    }

    /**
     * @return the ExtraPythonLibsS3Path
     */
    public String getExtraPythonLibsS3Path() {
        return ExtraPythonLibsS3Path;
    }

    /**
     * @param ExtraPythonLibsS3Path the ExtraPythonLibsS3Path to set
     */
    public void setExtraPythonLibsS3Path(String ExtraPythonLibsS3Path) {
	this.ExtraPythonLibsS3Path = ExtraPythonLibsS3Path;
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


}