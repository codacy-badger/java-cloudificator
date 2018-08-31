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
public class AwsPropertiesElasticacheSecurityGroupIngress {

    /**
     * Name of the EC2 Security Group to include in the authorization. 
     */
    private String EC2SecurityGroupName;

    /**
     * Specifies the AWS Account ID of the owner of the EC2 security group specified in the EC2SecurityGroupName property. The AWS access key ID is not an acceptable value. 
     */
    private String EC2SecurityGroupOwnerId;

    /**
     * The name of the Cache Security Group to authorize. 
     */
    private String CacheSecurityGroupName;

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
     * @return the CacheSecurityGroupName
     */
    public String getCacheSecurityGroupName() {
        return CacheSecurityGroupName;
    }

    /**
     * @param CacheSecurityGroupName the CacheSecurityGroupName to set
     */
    public void setCacheSecurityGroupName(String CacheSecurityGroupName) {
	this.CacheSecurityGroupName = CacheSecurityGroupName;
    }


}