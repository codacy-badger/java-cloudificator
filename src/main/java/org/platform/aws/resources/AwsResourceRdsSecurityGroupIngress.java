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
public class AwsResourceRdsSecurityGroupIngress {

    /**
     * The name (ARN) of the AWS::RDS::DBSecurityGroup to which this ingress will be added. 
     */
    private String DBSecurityGroupName;

    /**
     * The IP range to authorize. 
     */
    private String CIDRIP;

    /**
     * The name of the EC2 security group to authorize. 
     */
    private String EC2SecurityGroupName;

    /**
     * The AWS Account Number of the owner of the EC2 security group specified in the EC2SecurityGroupName parameter. The AWS Access Key ID is not an acceptable value. 
     */
    private String EC2SecurityGroupOwnerId;

    /**
     * The ID of the VPC or EC2 security group to authorize. 
     */
    private String EC2SecurityGroupId;

    /**
     * @return the DBSecurityGroupName
     */
    public String getDBSecurityGroupName() {
        return DBSecurityGroupName;
    }

    /**
     * @param DBSecurityGroupName the DBSecurityGroupName to set
     */
    public void setDBSecurityGroupName(String DBSecurityGroupName) {
	this.DBSecurityGroupName = DBSecurityGroupName;
    }

    /**
     * @return the CIDRIP
     */
    public String getCIDRIP() {
        return CIDRIP;
    }

    /**
     * @param CIDRIP the CIDRIP to set
     */
    public void setCIDRIP(String CIDRIP) {
	this.CIDRIP = CIDRIP;
    }

    /**
     * @return the EC2SecurityGroupName
     */
    public String getEC2SecurityGroupName() {
        return EC2SecurityGroupName;
    }

    /**
     * @param EC2SecurityGroupName the EC2SecurityGroupName to set
     */
    public void setEC2SecurityGroupName(String EC2SecurityGroupName) {
	this.EC2SecurityGroupName = EC2SecurityGroupName;
    }

    /**
     * @return the EC2SecurityGroupOwnerId
     */
    public String getEC2SecurityGroupOwnerId() {
        return EC2SecurityGroupOwnerId;
    }

    /**
     * @param EC2SecurityGroupOwnerId the EC2SecurityGroupOwnerId to set
     */
    public void setEC2SecurityGroupOwnerId(String EC2SecurityGroupOwnerId) {
	this.EC2SecurityGroupOwnerId = EC2SecurityGroupOwnerId;
    }

    /**
     * @return the EC2SecurityGroupId
     */
    public String getEC2SecurityGroupId() {
        return EC2SecurityGroupId;
    }

    /**
     * @param EC2SecurityGroupId the EC2SecurityGroupId to set
     */
    public void setEC2SecurityGroupId(String EC2SecurityGroupId) {
	this.EC2SecurityGroupId = EC2SecurityGroupId;
    }


}