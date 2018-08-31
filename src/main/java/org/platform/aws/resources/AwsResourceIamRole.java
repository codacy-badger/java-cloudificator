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
public class AwsResourceIamRole {

    /**
     * The path associated with this role. For information about IAM paths, see Friendly Names and Paths in IAM User Guide. 
     */
    private String Path;

    /**
     * One or more managed policy ARNs to attach to this role. 
     */
    private String ManagedPolicyArns;

    /**
     * The maximum session duration (in seconds) for the specified role. Anyone who uses the AWS CLI or API to assume the role can specify the duration using the optional DurationSeconds API parameter or duration-seconds CLI parameter. Minimum value of 3600. Maximum value of 43200. 
     */
    private String MaxSessionDuration;

    /**
     * A name for the IAM role. For valid values, see the RoleName parameter for the CreateRole action in the IAM API Reference. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name. 
     */
    private String RoleName;

    /**
     * The policies to associate with this role. For sample templates, see Template Examples. 
     */
    private String Policies;

    /**
     * The trust policy that is associated with this role. You can associate only one assume role policy with a role. For an example of an assume role policy, see Template Examples. For more information about the elements that you can use in an IAM policy, see IAM Policy Elements Reference in the IAM User Guide. 
     */
    private String AssumeRolePolicyDocument;

    /**
     * @return the Path
     */
    public String getPath() {
        return Path;
    }

    /**
     * @param Path the Path to set
     */
    public void setPath(String Path) {
	this.Path = Path;
    }

    /**
     * @return the ManagedPolicyArns
     */
    public String getManagedPolicyArns() {
        return ManagedPolicyArns;
    }

    /**
     * @param ManagedPolicyArns the ManagedPolicyArns to set
     */
    public void setManagedPolicyArns(String ManagedPolicyArns) {
	this.ManagedPolicyArns = ManagedPolicyArns;
    }

    /**
     * @return the MaxSessionDuration
     */
    public String getMaxSessionDuration() {
        return MaxSessionDuration;
    }

    /**
     * @param MaxSessionDuration the MaxSessionDuration to set
     */
    public void setMaxSessionDuration(String MaxSessionDuration) {
	this.MaxSessionDuration = MaxSessionDuration;
    }

    /**
     * @return the RoleName
     */
    public String getRoleName() {
        return RoleName;
    }

    /**
     * @param RoleName the RoleName to set
     */
    public void setRoleName(String RoleName) {
	this.RoleName = RoleName;
    }

    /**
     * @return the Policies
     */
    public String getPolicies() {
        return Policies;
    }

    /**
     * @param Policies the Policies to set
     */
    public void setPolicies(String Policies) {
	this.Policies = Policies;
    }

    /**
     * @return the AssumeRolePolicyDocument
     */
    public String getAssumeRolePolicyDocument() {
        return AssumeRolePolicyDocument;
    }

    /**
     * @param AssumeRolePolicyDocument the AssumeRolePolicyDocument to set
     */
    public void setAssumeRolePolicyDocument(String AssumeRolePolicyDocument) {
	this.AssumeRolePolicyDocument = AssumeRolePolicyDocument;
    }


}