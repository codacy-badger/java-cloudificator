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
public class AwsPropertiesEc2SecurityGroup {

    /**
     * The name of the security group. For valid values, see the GroupName parameter of the CreateSecurityGroup action in the Amazon EC2 API Reference. 
     */
    private String GroupName;

    /**
     * A description of the security group. 
     */
    private String GroupDescription;

    /**
     * The physical ID of the VPC. You can obtain the physical ID by using a reference to an AWS::EC2::VPC, such as: { "Ref" : "myVPC" }. 
     */
    private String VpcId;

    /**
     * A list of Amazon EC2 security group ingress rules. 
     */
    private String SecurityGroupIngress;

    /**
     * A list of Amazon EC2 security group egress rules. 
     */
    private String SecurityGroupEgress;

    /**
     * The tags that you want to attach to the resource. 
     */
    private String Tags;

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
     * @return the GroupDescription
     */
    public String getGroupDescription() {
        return GroupDescription;
    }

    /**
     * @param GroupDescription the GroupDescription to set
     */
    public void setGroupDescription(String GroupDescription) {
	this.GroupDescription = GroupDescription;
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
     * @return the SecurityGroupIngress
     */
    public String getSecurityGroupIngress() {
        return SecurityGroupIngress;
    }

    /**
     * @param SecurityGroupIngress the SecurityGroupIngress to set
     */
    public void setSecurityGroupIngress(String SecurityGroupIngress) {
	this.SecurityGroupIngress = SecurityGroupIngress;
    }

    /**
     * @return the SecurityGroupEgress
     */
    public String getSecurityGroupEgress() {
        return SecurityGroupEgress;
    }

    /**
     * @param SecurityGroupEgress the SecurityGroupEgress to set
     */
    public void setSecurityGroupEgress(String SecurityGroupEgress) {
	this.SecurityGroupEgress = SecurityGroupEgress;
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