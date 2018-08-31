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
public class AwsResourceEc2NetworkAclEntry {

    /**
     * The range of port numbers for the UDP/TCP protocol. 
     */
    private String PortRange;

    /**
     * ID of the ACL where the entry will be created. 
     */
    private String NetworkAclId;

    /**
     * Whether to allow or deny traffic that matches the rule; valid values are "allow" or "deny". 
     */
    private String RuleAction;

    /**
     * The IPv4 CIDR range to allow or deny, in CIDR notation (e.g., 172.16.0.0/24). 
     */
    private String CidrBlock;

    /**
     * Whether this rule applies to egress traffic from the subnet (true) or ingress traffic to the subnet (false). By default, AWS CloudFormation specifies false. 
     */
    private String Egress;

    /**
     * Rule number to assign to the entry, such as 100. ACL entries are processed in ascending order by rule number. Entries can't use the same rule number unless one is an egress rule and the other is an ingress rule. For valid values, see the CreateNetworkAclEntry action in the Amazon EC2 API Reference. 
     */
    private String RuleNumber;

    /**
     * The IPv6 CIDR range to allow or deny, in CIDR notation. 
     */
    private String Ipv6CidrBlock;

    /**
     * The IP protocol that the rule applies to. You must specify -1 or a protocol number (go to Protocol Numbers at iana.org). You can specify -1 for all protocols. 
     */
    private String Protocol;

    /**
     * The Internet Control Message Protocol (ICMP) code and type. 
     */
    private String Icmp;

    /**
     * @return the PortRange
     */
    public String getPortRange() {
        return PortRange;
    }

    /**
     * @param PortRange the PortRange to set
     */
    public void setPortRange(String PortRange) {
	this.PortRange = PortRange;
    }

    /**
     * @return the NetworkAclId
     */
    public String getNetworkAclId() {
        return NetworkAclId;
    }

    /**
     * @param NetworkAclId the NetworkAclId to set
     */
    public void setNetworkAclId(String NetworkAclId) {
	this.NetworkAclId = NetworkAclId;
    }

    /**
     * @return the RuleAction
     */
    public String getRuleAction() {
        return RuleAction;
    }

    /**
     * @param RuleAction the RuleAction to set
     */
    public void setRuleAction(String RuleAction) {
	this.RuleAction = RuleAction;
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
     * @return the Egress
     */
    public String getEgress() {
        return Egress;
    }

    /**
     * @param Egress the Egress to set
     */
    public void setEgress(String Egress) {
	this.Egress = Egress;
    }

    /**
     * @return the RuleNumber
     */
    public String getRuleNumber() {
        return RuleNumber;
    }

    /**
     * @param RuleNumber the RuleNumber to set
     */
    public void setRuleNumber(String RuleNumber) {
	this.RuleNumber = RuleNumber;
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
     * @return the Protocol
     */
    public String getProtocol() {
        return Protocol;
    }

    /**
     * @param Protocol the Protocol to set
     */
    public void setProtocol(String Protocol) {
	this.Protocol = Protocol;
    }

    /**
     * @return the Icmp
     */
    public String getIcmp() {
        return Icmp;
    }

    /**
     * @param Icmp the Icmp to set
     */
    public void setIcmp(String Icmp) {
	this.Icmp = Icmp;
    }


}