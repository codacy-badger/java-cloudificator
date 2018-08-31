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
public class AwsResourceIamPolicy {

    /**
     * The names of groups to which you want to add the policy. 
     */
    private String Groups;

    /**
     * The name of the policy. If you specify multiple policies for an entity, specify unique names. For example, if you specify a list of policies for an IAM role, each policy must have a unique name. 
     */
    private String PolicyName;

    /**
     * A policy document that contains permissions to add to the specified users or groups. 
     */
    private String PolicyDocument;

    /**
     * The names of AWS::IAM::Roles to which this policy will be attached. 
     */
    private String Roles;

    /**
     * The names of users for whom you want to add the policy. 
     */
    private String Users;

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
     * @return the PolicyName
     */
    public String getPolicyName() {
        return PolicyName;
    }

    /**
     * @param PolicyName the PolicyName to set
     */
    public void setPolicyName(String PolicyName) {
	this.PolicyName = PolicyName;
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