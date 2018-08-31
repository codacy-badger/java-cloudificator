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
public class AwsResourceIamInstanceprofile {

    /**
     * The path associated with this IAM instance profile. For information about IAM paths, see Friendly Names and Paths in the AWS Identity and Access Management User Guide. 
     */
    private String Path;

    /**
     * The name of the instance profile that you want to create. This parameter allows (per its regex pattern) a string consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: = , . @ -. 
     */
    private String InstanceProfileName;

    /**
     * The name of an existing IAM role to associate with this instance profile. Currently, you can assign a maximum of one role to an instance profile. 
     */
    private String Roles;

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
     * @return the InstanceProfileName
     */
    public String getInstanceProfileName() {
        return InstanceProfileName;
    }

    /**
     * @param InstanceProfileName the InstanceProfileName to set
     */
    public void setInstanceProfileName(String InstanceProfileName) {
	this.InstanceProfileName = InstanceProfileName;
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


}