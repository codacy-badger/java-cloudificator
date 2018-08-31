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
public class AwsPropertiesEc2Eip {

    /**
     * The Instance ID of the Amazon EC2 instance that you want to associate with this Elastic IP address. 
     */
    private String InstanceId;

    /**
     * Set to vpc to allocate the address to your Virtual Private Cloud (VPC). No other values are supported. 
     */
    private String Domain;

    /**
     * @return the InstanceId
     */
    public String getInstanceId() {
        return InstanceId;
    }

    /**
     * @param InstanceId the InstanceId to set
     */
    public void setInstanceId(String InstanceId) {
	this.InstanceId = InstanceId;
    }

    /**
     * @return the Domain
     */
    public String getDomain() {
        return Domain;
    }

    /**
     * @param Domain the Domain to set
     */
    public void setDomain(String Domain) {
	this.Domain = Domain;
    }


}