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
public class AwsPropertiesEc2SecurityGroupIngress {

    /**
     * An IPv4 CIDR range. 
     */
    private String CidrIp;

    /**
     * An IPv6 CIDR range. 
     */
    private String CidrIpv6;

    /**
     * Name of the Amazon EC2 security group (non-VPC security group) to modify. This value can be a reference to an AWS::EC2::SecurityGroup resource or the name of an existing Amazon EC2 security group. 
     */
    private String GroupName;

    /**
     * Description of the ingress rule. 
     */
    private String Description;

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type number. If you specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any ICMP type number). 
     */
    private String FromPort;

    /**
     * Specifies the name of the Amazon EC2 security group (non-VPC security group) to allow access or use the Ref intrinsic function to refer to the logical ID of a security group defined in the same template. For instances in a VPC, specify the SourceSecurityGroupId property. 
     */
    private String SourceSecurityGroupName;

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. If you specify icmp for the IpProtocol property, you can specify -1 as a wildcard (i.e., any ICMP code). 
     */
    private String ToPort;

    /**
     * Specifies the AWS Account ID of the owner of the Amazon EC2 security group specified in the SourceSecurityGroupName property. 
     */
    private String SourceSecurityGroupOwnerId;

    /**
     * IP protocol name or number. For valid values, see the IpProtocol parameter in AuthorizeSecurityGroupIngress 
     */
    private String IpProtocol;

    /**
     * Specifies the ID of the source security group or uses the Ref intrinsic function to refer to the logical ID of a security group defined in the same template. 
     */
    private String SourceSecurityGroupId;

    /**
     * ID of the Amazon EC2 or VPC security group to modify. The group must belong to your account. 
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
     * @return the GroupName
     */
    public String getGroupName() {
        return GroupName;
    }

    /**
     * @param GroupName the GroupName to set
     */
    public void setGroupName(String GroupName) {
	this.GroupName = GroupName;
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
     * @return the SourceSecurityGroupName
     */
    public String getSourceSecurityGroupName() {
        return SourceSecurityGroupName;
    }

    /**
     * @param SourceSecurityGroupName the SourceSecurityGroupName to set
     */
    public void setSourceSecurityGroupName(String SourceSecurityGroupName) {
	this.SourceSecurityGroupName = SourceSecurityGroupName;
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
     * @return the SourceSecurityGroupOwnerId
     */
    public String getSourceSecurityGroupOwnerId() {
        return SourceSecurityGroupOwnerId;
    }

    /**
     * @param SourceSecurityGroupOwnerId the SourceSecurityGroupOwnerId to set
     */
    public void setSourceSecurityGroupOwnerId(String SourceSecurityGroupOwnerId) {
	this.SourceSecurityGroupOwnerId = SourceSecurityGroupOwnerId;
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
     * @return the SourceSecurityGroupId
     */
    public String getSourceSecurityGroupId() {
        return SourceSecurityGroupId;
    }

    /**
     * @param SourceSecurityGroupId the SourceSecurityGroupId to set
     */
    public void setSourceSecurityGroupId(String SourceSecurityGroupId) {
	this.SourceSecurityGroupId = SourceSecurityGroupId;
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