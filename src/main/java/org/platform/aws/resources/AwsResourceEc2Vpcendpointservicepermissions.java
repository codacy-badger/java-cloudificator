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
public class AwsResourceEc2Vpcendpointservicepermissions {

    /**
     * The Amazon Resource Names (ARN) of one or more principals (IAM users, IAM roles, and AWS accounts). Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is empty, then all permissions are revoked. 
     */
    private String AllowedPrincipals;

    /**
     * The ID of the VPC endpoint service. 
     */
    private String ServiceId;

    /**
     * @return the AllowedPrincipals
     */
    public String getAllowedPrincipals() {
        return AllowedPrincipals;
    }

    /**
     * @param AllowedPrincipals the AllowedPrincipals to set
     */
    public void setAllowedPrincipals(String AllowedPrincipals) {
	this.AllowedPrincipals = AllowedPrincipals;
    }

    /**
     * @return the ServiceId
     */
    public String getServiceId() {
        return ServiceId;
    }

    /**
     * @param ServiceId the ServiceId to set
     */
    public void setServiceId(String ServiceId) {
	this.ServiceId = ServiceId;
    }


}