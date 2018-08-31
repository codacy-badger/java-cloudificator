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
public class AwsResourceEc2Subnetcidrblock {

    /**
     * The ID of the subnet to associate the IPv6 CIDR block with. 
     */
    private String SubnetId;

    /**
     * The IPv6 CIDR block for the subnet. The CIDR block must have a prefix length of /64. 
     */
    private String Ipv6CidrBlock;

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
    }

    /**
     * @return the Ipv6CidrBlock
     */
    public String getIpv6CidrBlock() {
        return Ipv6CidrBlock;
    }

    /**
     * @param Ipv6CidrBlock the Ipv6CidrBlock to set
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
	this.Ipv6CidrBlock = Ipv6CidrBlock;
    }


}