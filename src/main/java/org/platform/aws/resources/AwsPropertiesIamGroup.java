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
public class AwsPropertiesIamGroup {

    /**
     * A name for the IAM group. For valid values, see the GroupName parameter for the CreateGroup action in the IAM API Reference. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the group name. 
     */
    private String GroupName;

    /**
     * The path to the group. For more information about paths, see IAM Identifiers in the IAM User Guide. 
     */
    private String Path;

    /**
     * One or more managed policy ARNs to attach to this group. 
     */
    private String ManagedPolicyArns;

    /**
     * The policies to associate with this group. For information about policies, see Overview of IAM Policies in the IAM User Guide. 
     */
    private String Policies;

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


}