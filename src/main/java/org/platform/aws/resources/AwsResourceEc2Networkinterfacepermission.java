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
public class AwsResourceEc2Networkinterfacepermission {

    /**
     * The AWS account ID. 
     */
    private String AwsAccountId;

    /**
     * The type of permission to grant: INSTANCE-ATTACH or EIP-ASSOCIATE. 
     */
    private String Permission;

    /**
     * The ID of the network interface. 
     */
    private String NetworkInterfaceId;

    /**
     * @return the AwsAccountId
     */
    public String getAwsAccountId() {
        return AwsAccountId;
    }

    /**
     * @param AwsAccountId the AwsAccountId to set
     */
    public void setAwsAccountId(String AwsAccountId) {
	this.AwsAccountId = AwsAccountId;
    }

    /**
     * @return the Permission
     */
    public String getPermission() {
        return Permission;
    }

    /**
     * @param Permission the Permission to set
     */
    public void setPermission(String Permission) {
	this.Permission = Permission;
    }

    /**
     * @return the NetworkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return NetworkInterfaceId;
    }

    /**
     * @param NetworkInterfaceId the NetworkInterfaceId to set
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
	this.NetworkInterfaceId = NetworkInterfaceId;
    }


}