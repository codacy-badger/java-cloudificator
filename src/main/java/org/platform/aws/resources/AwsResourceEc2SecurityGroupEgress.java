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
public class AwsResourceEc2SecurityGroupEgress {

    /**
     * An IPv4 CIDR range. 
     */
    private String CidrIp;

    /**
     * An IPv6 CIDR range. 
     */
    private String CidrIpv6;

    /**
     * Description of the egress rule. 
     */
    private String Description;

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type number. If you specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any ICMP type number). 
     */
    private String FromPort;

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. If you specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any ICMP code). 
     */
    private String ToPort;

    /**
     * IP protocol name or number. For valid values, see the IpProtocol parameter in AuthorizeSecurityGroupIngress 
     */
    private String IpProtocol;

    /**
     * Specifies the group ID of the destination Amazon VPC security group. 
     */
    private String DestinationSecurityGroupId;

    /**
     * The AWS service prefix of an Amazon VPC endpoint. For more information, see VPC Endpoints in the Amazon VPC User Guide. 
     */
    private String DestinationPrefixListId;

    /**
     * ID of the Amazon VPC security group to modify. This value can be a reference to an AWS::EC2::SecurityGroup resource that has a valid VpcId property or the ID of an existing Amazon VPC security group. 
     */
    private String GroupId;

    /**
     * @return the CidrIp
     */
    public String getCidrIp() {
        return CidrIp;
    }

    /**
     * @param CidrIp the CidrIp to set
     */
    public void setCidrIp(String CidrIp) {
	this.CidrIp = CidrIp;
    }

    /**
     * @return the CidrIpv6
     */
    public String getCidrIpv6() {
        return CidrIpv6;
    }

    /**
     * @param CidrIpv6 the CidrIpv6 to set
     */
    public void setCidrIpv6(String CidrIpv6) {
	this.CidrIpv6 = CidrIpv6;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the FromPort
     */
    public String getFromPort() {
        return FromPort;
    }

    /**
     * @param FromPort the FromPort to set
     */
    public void setFromPort(String FromPort) {
	this.FromPort = FromPort;
    }

    /**
     * @return the ToPort
     */
    public String getToPort() {
        return ToPort;
    }

    /**
     * @param ToPort the ToPort to set
     */
    public void setToPort(String ToPort) {
	this.ToPort = ToPort;
    }

    /**
     * @return the IpProtocol
     */
    public String getIpProtocol() {
        return IpProtocol;
    }

    /**
     * @param IpProtocol the IpProtocol to set
     */
    public void setIpProtocol(String IpProtocol) {
	this.IpProtocol = IpProtocol;
    }

    /**
     * @return the DestinationSecurityGroupId
     */
    public String getDestinationSecurityGroupId() {
        return DestinationSecurityGroupId;
    }

    /**
     * @param DestinationSecurityGroupId the DestinationSecurityGroupId to set
     */
    public void setDestinationSecurityGroupId(String DestinationSecurityGroupId) {
	this.DestinationSecurityGroupId = DestinationSecurityGroupId;
    }

    /**
     * @return the DestinationPrefixListId
     */
    public String getDestinationPrefixListId() {
        return DestinationPrefixListId;
    }

    /**
     * @param DestinationPrefixListId the DestinationPrefixListId to set
     */
    public void setDestinationPrefixListId(String DestinationPrefixListId) {
	this.DestinationPrefixListId = DestinationPrefixListId;
    }

    /**
     * @return the GroupId
     */
    public String getGroupId() {
        return GroupId;
    }

    /**
     * @param GroupId the GroupId to set
     */
    public void setGroupId(String GroupId) {
	this.GroupId = GroupId;
    }


}