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
public class AwsPropertiesIamAddusertogroup {

    /**
     * The name of group to add users to. 
     */
    private String GroupName;

    /**
     * Required: Yes 
     */
    private String Users;

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