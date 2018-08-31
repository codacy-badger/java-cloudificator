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
public class AwsResourceEc2Subnet {

    /**
     * Indicates whether a network interface created in this subnet receives an IPv6 address. The default value is false. 
     */
    private String AssignIpv6AddressOnCreation;

    /**
     * Indicates whether instances that are launched in this subnet receive a public IP address. By default, the value is false. 
     */
    private String MapPublicIpOnLaunch;

    /**
     * A Ref structure that contains the ID of the VPC on which you want to create the subnet. The VPC ID is provided as the value of the "Ref" property, as: { "Ref": "VPCID" }. 
     */
    private String VpcId;

    /**
     * The availability zone in which you want the subnet. Default: AWS selects a zone for you (recommended). 
     */
    private String AvailabilityZone;

    /**
     * The CIDR block that you want the subnet to cover (for example, "10.0.0.0/24"). 
     */
    private String CidrBlock;

    /**
     * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length. 
     */
    private String Ipv6CidrBlock;

    /**
     * An arbitrary set of tags (key–value pairs) for this subnet. 
     */
    private String Tags;

    /**
     * @return the AssignIpv6AddressOnCreation
     */
    public String getAssignIpv6AddressOnCreation() {
        return AssignIpv6AddressOnCreation;
    }

    /**
     * @param AssignIpv6AddressOnCreation the AssignIpv6AddressOnCreation to set
     */
    public void setAssignIpv6AddressOnCreation(String AssignIpv6AddressOnCreation) {
	this.AssignIpv6AddressOnCreation = AssignIpv6AddressOnCreation;
    }

    /**
     * @return the MapPublicIpOnLaunch
     */
    public String getMapPublicIpOnLaunch() {
        return MapPublicIpOnLaunch;
    }

    /**
     * @param MapPublicIpOnLaunch the MapPublicIpOnLaunch to set
     */
    public void setMapPublicIpOnLaunch(String MapPublicIpOnLaunch) {
	this.MapPublicIpOnLaunch = MapPublicIpOnLaunch;
    }

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
     * @return the AvailabilityZone
     */
    public String getAvailabilityZone() {
        return AvailabilityZone;
    }

    /**
     * @param AvailabilityZone the AvailabilityZone to set
     */
    public void setAvailabilityZone(String AvailabilityZone) {
	this.AvailabilityZone = AvailabilityZone;
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

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}