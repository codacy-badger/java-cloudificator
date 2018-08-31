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
public class AwsResourceIamManagedpolicy {

    /**
     * The path for the IAM policy. By default, the path is /. For more information, see IAM Identifiers in the IAM User Guide. 
     */
    private String Path;

    /**
     * A custom, friendly name for your IAM managed policy. For valid values, see the PolicyName parameter of the CreatePolicy action in the IAM API Reference. 
     */
    private String ManagedPolicyName;

    /**
     * A description of the IAM policy. For example, describe the permissions that are defined in the policy. 
     */
    private String Description;

    /**
     * The names of IAM groups to attach to this policy. 
     */
    private String Groups;

    /**
     * Policies that define the permissions for this managed policy. For more information about policy syntax, see IAM Policy Elements Reference in IAM User Guide. 
     */
    private String PolicyDocument;

    /**
     * The names of IAM roles to attach to this policy. 
     */
    private String Roles;

    /**
     * The names of users to attach to this policy. 
     */
    private String Users;

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
     * @return the ManagedPolicyName
     */
    public String getManagedPolicyName() {
        return ManagedPolicyName;
    }

    /**
     * @param ManagedPolicyName the ManagedPolicyName to set
     */
    public void setManagedPolicyName(String ManagedPolicyName) {
	this.ManagedPolicyName = ManagedPolicyName;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
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
     * @return the PolicyDocument
     */
    public String getPolicyDocument() {
        return PolicyDocument;
    }

    /**
     * @param PolicyDocument the PolicyDocument to set
     */
    public void setPolicyDocument(String PolicyDocument) {
	this.PolicyDocument = PolicyDocument;
    }

    /**
     * @return the Roles
     */
    public String getRoles() {
        return Roles;
    }

    /**
     * @param Roles the Roles to set
     */
    public void setRoles(String Roles) {
	this.Roles = Roles;
    }

    /**
     * @return the Users
     */
    public String getUsers() {
        return Users;
    }

    /**
     * @param Users the Users to set
     */
    public void setUsers(String Users) {
	this.Users = Users;
    }


}