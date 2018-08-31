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
public class AwsResourceRedshiftClustersecuritygroupingress {

    /**
     * The IP address range that has inbound access to the Amazon Redshift security group. 
     */
    private String CIDRIP;

    /**
     * The Amazon EC2 security group that will be added the Amazon Redshift security group. 
     */
    private String EC2SecurityGroupName;

    /**
     * The 12-digit AWS account number of the owner of the Amazon EC2 security group that is specified by the EC2SecurityGroupName parameter. 
     */
    private String EC2SecurityGroupOwnerId;

    /**
     * The name of the Amazon Redshift security group that will be associated with the ingress rule. 
     */
    private String ClusterSecurityGroupName;

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
     * @return the ClusterSecurityGroupName
     */
    public String getClusterSecurityGroupName() {
        return ClusterSecurityGroupName;
    }

    /**
     * @param ClusterSecurityGroupName the ClusterSecurityGroupName to set
     */
    public void setClusterSecurityGroupName(String ClusterSecurityGroupName) {
	this.ClusterSecurityGroupName = ClusterSecurityGroupName;
    }


}