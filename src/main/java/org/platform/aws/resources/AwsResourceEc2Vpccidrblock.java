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
public class AwsResourceEc2Vpccidrblock {

    /**
     * The ID of the VPC to associate the Amazon-provided IPv6 CIDR block with. 
     */
    private String VpcId;

    /**
     * An IPv4 CIDR block to associate with the VPC. 
     */
    private String CidrBlock;

    /**
     * Whether to request an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC. You can't specify the range of IPv6 addresses or the size of the CIDR block. 
     */
    private String AmazonProvidedIpv6CidrBlock;

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
     * @return the CidrBlock
     */
    public String getCidrBlock() {
        return CidrBlock;
    }

    /**
     * @param CidrBlock the CidrBlock to set
     */
    public void setCidrBlock(String CidrBlock) {
	this.CidrBlock = CidrBlock;
    }

    /**
     * @return the AmazonProvidedIpv6CidrBlock
     */
    public String getAmazonProvidedIpv6CidrBlock() {
        return AmazonProvidedIpv6CidrBlock;
    }

    /**
     * @param AmazonProvidedIpv6CidrBlock the AmazonProvidedIpv6CidrBlock to set
     */
    public void setAmazonProvidedIpv6CidrBlock(String AmazonProvidedIpv6CidrBlock) {
	this.AmazonProvidedIpv6CidrBlock = AmazonProvidedIpv6CidrBlock;
    }


}