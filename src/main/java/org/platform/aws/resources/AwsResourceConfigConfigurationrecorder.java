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
public class AwsResourceConfigConfigurationrecorder {

    /**
     * Indicates whether to record configurations for all supported resources or for a list of resource types. The resource types that you list must be supported by AWS Config. 
     */
    private String RecordingGroup;

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that is used to make read or write requests to the delivery channel that you specify and to get configuration details for supported AWS resources. For more information, see Permissions for the IAM Role Assigned to AWS Config in the AWS Config Developer Guide. 
     */
    private String RoleARN;

    /**
     * A name for the configuration recorder. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the configuration recorder name. For more information, see Name Type. 
     */
    private String Name;

    /**
     * @return the RecordingGroup
     */
    public String getRecordingGroup() {
        return RecordingGroup;
    }

    /**
     * @param RecordingGroup the RecordingGroup to set
     */
    public void setRecordingGroup(String RecordingGroup) {
	this.RecordingGroup = RecordingGroup;
    }

    /**
     * @return the RoleARN
     */
    public String getRoleARN() {
        return RoleARN;
    }

    /**
     * @param RoleARN the RoleARN to set
     */
    public void setRoleARN(String RoleARN) {
	this.RoleARN = RoleARN;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}