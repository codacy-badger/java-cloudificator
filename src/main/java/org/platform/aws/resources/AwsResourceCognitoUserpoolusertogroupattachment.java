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
public class AwsResourceCognitoUserpoolusertogroupattachment {

    /**
     * The name of the group. 
     */
    private String GroupName;

    /**
     * The ID of the user pool. 
     */
    private String UserPoolId;

    /**
     * The user's user name. 
     */
    private String Username;

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
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
	this.Username = Username;
    }


}