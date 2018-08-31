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
public class AwsPropertiesIamUser {

    /**
     * The path for the user name. For more information about paths, see IAM Identifiers in the IAM User Guide. 
     */
    private String Path;

    /**
     * One or more managed policy ARNs to attach to this user. 
     */
    private String ManagedPolicyArns;

    /**
     * The policies to associate with this user. For information about policies, see Overview of IAM Policies in the IAM User Guide. 
     */
    private String Policies;

    /**
     * A name for the IAM user. For valid values, see the UserName parameter for the CreateUser action in the IAM API Reference. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the user name. 
     */
    private String UserName;

    /**
     * A name of a group to which you want to add the user. 
     */
    private String Groups;

    /**
     * Creates a login profile so that the user can access the AWS Management Console. 
     */
    private String LoginProfile;

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
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
	this.UserName = UserName;
    }

    /**
     * @return the Groups
     */
    public String getGroups() {
        return Groups;
    }

    /**
     * @param Groups the Groups to set
     */
    public void setGroups(String Groups) {
	this.Groups = Groups;
    }

    /**
     * @return the LoginProfile
     */
    public String getLoginProfile() {
        return LoginProfile;
    }

    /**
     * @param LoginProfile the LoginProfile to set
     */
    public void setLoginProfile(String LoginProfile) {
	this.LoginProfile = LoginProfile;
    }


}