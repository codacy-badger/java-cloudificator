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
public class AwsResourceEc2Vpcendpoint {

    /**
     * [Interface endpoint] Indicates whether to associate a private hosted zone with the specified VPC. 
     */
    private String PrivateDnsEnabled;

    /**
     * The ID of the VPC in which the endpoint will be used. 
     */
    private String VpcId;

    /**
     * One or more route table IDs that are used by the VPC to reach the endpoint. 
     */
    private String RouteTableIds;

    /**
     * The name of the service. To get a list of available services, use DescribeVpcEndpointServices or get the name from the service provider. 
     */
    private String ServiceName;

    /**
     * [Gateway endpoint] A policy to attach to the endpoint that controls access to the service. The policy must be valid JSON. The default policy allows full access to the AWS service. For more information, see Controlling Access to Services in the Amazon VPC User Guide. 
     */
    private String PolicyDocument;

    /**
     * The type of endpoint. Valid values are Interface and Gateway. 
     */
    private String VpcEndpointType;

    /**
     * [Interface endpoint] The ID of one or more security groups to associate with the endpoint network interface. 
     */
    private String SecurityGroupIds;

    /**
     * [Interface endpoint] The ID of one or more subnets in which to create an endpoint network interface. 
     */
    private String SubnetIds;

    /**
     * @return the PrivateDnsEnabled
     */
    public String getPrivateDnsEnabled() {
        return PrivateDnsEnabled;
    }

    /**
     * @param PrivateDnsEnabled the PrivateDnsEnabled to set
     */
    public void setPrivateDnsEnabled(String PrivateDnsEnabled) {
	this.PrivateDnsEnabled = PrivateDnsEnabled;
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
     * @return the RouteTableIds
     */
    public String getRouteTableIds() {
        return RouteTableIds;
    }

    /**
     * @param RouteTableIds the RouteTableIds to set
     */
    public void setRouteTableIds(String RouteTableIds) {
	this.RouteTableIds = RouteTableIds;
    }

    /**
     * @return the ServiceName
     */
    public String getServiceName() {
        return ServiceName;
    }

    /**
     * @param ServiceName the ServiceName to set
     */
    public void setServiceName(String ServiceName) {
	this.ServiceName = ServiceName;
    }

    /**
     * @return the PolicyDocument
     */
    public String getPolicyDocument() {
        return PolicyDocument;
    }

    /**
     * @param PolicyDocument the PolicyDocument to set
     */
    public void setPolicyDocument(String PolicyDocument) {
	this.PolicyDocument = PolicyDocument;
    }

    /**
     * @return the VpcEndpointType
     */
    public String getVpcEndpointType() {
        return VpcEndpointType;
    }

    /**
     * @param VpcEndpointType the VpcEndpointType to set
     */
    public void setVpcEndpointType(String VpcEndpointType) {
	this.VpcEndpointType = VpcEndpointType;
    }

    /**
     * @return the SecurityGroupIds
     */
    public String getSecurityGroupIds() {
        return SecurityGroupIds;
    }

    /**
     * @param SecurityGroupIds the SecurityGroupIds to set
     */
    public void setSecurityGroupIds(String SecurityGroupIds) {
	this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * @return the SubnetIds
     */
    public String getSubnetIds() {
        return SubnetIds;
    }

    /**
     * @param SubnetIds the SubnetIds to set
     */
    public void setSubnetIds(String SubnetIds) {
	this.SubnetIds = SubnetIds;
    }


}