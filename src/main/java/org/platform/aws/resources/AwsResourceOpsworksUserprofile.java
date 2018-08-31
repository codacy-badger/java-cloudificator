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
public class AwsResourceOpsworksUserprofile {

    /**
     * Indicates whether users can use the AWS OpsWorks My Settings page to specify their own SSH public key. For more information, see Setting an IAM User's Public SSH Key in the AWS OpsWorks User Guide. 
     */
    private String AllowSelfManagement;

    /**
     * The public SSH key that is associated with the IAM user. To access instances, the IAM user must have or be given the corresponding private key. 
     */
    private String SshPublicKey;

    /**
     * The user's SSH user name. 
     */
    private String SshUsername;

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) user to associate with this configuration. 
     */
    private String IamUserArn;

    /**
     * @return the AllowSelfManagement
     */
    public String getAllowSelfManagement() {
        return AllowSelfManagement;
    }

    /**
     * @param AllowSelfManagement the AllowSelfManagement to set
     */
    public void setAllowSelfManagement(String AllowSelfManagement) {
	this.AllowSelfManagement = AllowSelfManagement;
    }

    /**
     * @return the SshPublicKey
     */
    public String getSshPublicKey() {
        return SshPublicKey;
    }

    /**
     * @param SshPublicKey the SshPublicKey to set
     */
    public void setSshPublicKey(String SshPublicKey) {
	this.SshPublicKey = SshPublicKey;
    }

    /**
     * @return the SshUsername
     */
    public String getSshUsername() {
        return SshUsername;
    }

    /**
     * @param SshUsername the SshUsername to set
     */
    public void setSshUsername(String SshUsername) {
	this.SshUsername = SshUsername;
    }

    /**
     * @return the IamUserArn
     */
    public String getIamUserArn() {
        return IamUserArn;
    }

    /**
     * @param IamUserArn the IamUserArn to set
     */
    public void setIamUserArn(String IamUserArn) {
	this.IamUserArn = IamUserArn;
    }


}