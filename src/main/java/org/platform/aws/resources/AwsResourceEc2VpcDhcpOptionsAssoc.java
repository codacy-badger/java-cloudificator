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
public class AwsResourceEc2VpcDhcpOptionsAssoc {

    /**
     * The ID of the VPC to associate with this DHCP options set. 
     */
    private String VpcId;

    /**
     * The ID of the DHCP options you want to associate with the VPC. Specify default if you want the VPC to use no DHCP options. 
     */
    private String DhcpOptionsId;

    /**
     * @return the VpcId
     */
    public String getVpcId() {
        return VpcId;
    }

    /**
     * @param VpcId the VpcId to set
     */
    public void setVpcId(String VpcId) {
	this.VpcId = VpcId;
    }

    /**
     * @return the DhcpOptionsId
     */
    public String getDhcpOptionsId() {
        return DhcpOptionsId;
    }

    /**
     * @param DhcpOptionsId the DhcpOptionsId to set
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
	this.DhcpOptionsId = DhcpOptionsId;
    }


}