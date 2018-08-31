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
public class AwsPropertiesRdsSecurityGroup {

    /**
     * Description of the security group. 
     */
    private String GroupDescription;

    /**
     * The Id of the VPC. Indicates which VPC this DB Security Group should belong to. 
     */
    private String EC2VpcId;

    /**
     * Network ingress authorization for an Amazon EC2 security group or an IP address range. 
     */
    private String DBSecurityGroupIngress;

    /**
     * The tags that you want to attach to the Amazon RDS DB security group. 
     */
    private String Tags;

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
     * @return the EC2VpcId
     */
    public String getEC2VpcId() {
        return EC2VpcId;
    }

    /**
     * @param EC2VpcId the EC2VpcId to set
     */
    public void setEC2VpcId(String EC2VpcId) {
	this.EC2VpcId = EC2VpcId;
    }

    /**
     * @return the DBSecurityGroupIngress
     */
    public String getDBSecurityGroupIngress() {
        return DBSecurityGroupIngress;
    }

    /**
     * @param DBSecurityGroupIngress the DBSecurityGroupIngress to set
     */
    public void setDBSecurityGroupIngress(String DBSecurityGroupIngress) {
	this.DBSecurityGroupIngress = DBSecurityGroupIngress;
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