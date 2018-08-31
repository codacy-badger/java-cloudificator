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
public class AwsResourceEc2Route {

    /**
     * The IPv6 CIDR address block used for the destination match. For example, ::/0. Routing decisions are based on the most specific match. 
     */
    private String DestinationIpv6CidrBlock;

    /**
     * The ID of the route table where the route will be added. 
     */
    private String RouteTableId;

    /**
     * The ID of a NAT instance in your VPC. For example, i-1a2b3c4d. 
     */
    private String InstanceId;

    /**
     * The ID of an egress-only internet gateway that is attached to your VPC (over IPv6 only). 
     */
    private String EgressOnlyInternetGatewayId;

    /**
     * The IPv4 CIDR address block used for the destination match. For example, 0.0.0.0/0. Routing decisions are based on the most specific match. 
     */
    private String DestinationCidrBlock;

    /**
     * The ID of an internet gateway or virtual private gateway that is attached to your VPC. For example: igw-eaad4883. 
     */
    private String GatewayId;

    /**
     * Allows the routing of network interface IDs. 
     */
    private String NetworkInterfaceId;

    /**
     * The ID of a NAT gateway. For example, nat-0a12bc456789de0fg. 
     */
    private String NatGatewayId;

    /**
     * @return the DestinationIpv6CidrBlock
     */
    public String getDestinationIpv6CidrBlock() {
        return DestinationIpv6CidrBlock;
    }

    /**
     * @param DestinationIpv6CidrBlock the DestinationIpv6CidrBlock to set
     */
    public void setDestinationIpv6CidrBlock(String DestinationIpv6CidrBlock) {
	this.DestinationIpv6CidrBlock = DestinationIpv6CidrBlock;
    }

    /**
     * @return the RouteTableId
     */
    public String getRouteTableId() {
        return RouteTableId;
    }

    /**
     * @param RouteTableId the RouteTableId to set
     */
    public void setRouteTableId(String RouteTableId) {
	this.RouteTableId = RouteTableId;
    }

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
     * @return the EgressOnlyInternetGatewayId
     */
    public String getEgressOnlyInternetGatewayId() {
        return EgressOnlyInternetGatewayId;
    }

    /**
     * @param EgressOnlyInternetGatewayId the EgressOnlyInternetGatewayId to set
     */
    public void setEgressOnlyInternetGatewayId(String EgressOnlyInternetGatewayId) {
	this.EgressOnlyInternetGatewayId = EgressOnlyInternetGatewayId;
    }

    /**
     * @return the DestinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return DestinationCidrBlock;
    }

    /**
     * @param DestinationCidrBlock the DestinationCidrBlock to set
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
	this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * @return the GatewayId
     */
    public String getGatewayId() {
        return GatewayId;
    }

    /**
     * @param GatewayId the GatewayId to set
     */
    public void setGatewayId(String GatewayId) {
	this.GatewayId = GatewayId;
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

    /**
     * @return the NatGatewayId
     */
    public String getNatGatewayId() {
        return NatGatewayId;
    }

    /**
     * @param NatGatewayId the NatGatewayId to set
     */
    public void setNatGatewayId(String NatGatewayId) {
	this.NatGatewayId = NatGatewayId;
    }


}