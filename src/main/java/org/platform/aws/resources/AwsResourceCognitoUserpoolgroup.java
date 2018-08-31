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
public class AwsResourceCognitoUserpoolgroup {

    /**
     * The name of the user group. GroupName must be unique. 
     */
    private String GroupName;

    /**
     * A description of the user group. 
     */
    private String Description;

    /**
     * The user pool ID. 
     */
    private String UserPoolId;

    /**
     * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. Zero is the highest Precedence value. Groups with lower Precedence values take precedence over groups with higher or null Precedence values. If a user belongs to two or more groups, the role ARN of the group with the lowest precedence value is used in the cognito:roles and cognito:preferred_role claims in the user's tokens. 
     */
    private String Precedence;

    /**
     * The role ARN for the group. 
     */
    private String RoleArn;

    /**
     * @return the GroupName
     */
    public String getGroupName() {
        return GroupName;
    }

    /**
     * @param GroupName the GroupName to set
     */
    public void setGroupName(String GroupName) {
	this.GroupName = GroupName;
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
     * @return the UserPoolId
     */
    public String getUserPoolId() {
        return UserPoolId;
    }

    /**
     * @param UserPoolId the UserPoolId to set
     */
    public void setUserPoolId(String UserPoolId) {
	this.UserPoolId = UserPoolId;
    }

    /**
     * @return the Precedence
     */
    public String getPrecedence() {
        return Precedence;
    }

    /**
     * @param Precedence the Precedence to set
     */
    public void setPrecedence(String Precedence) {
	this.Precedence = Precedence;
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