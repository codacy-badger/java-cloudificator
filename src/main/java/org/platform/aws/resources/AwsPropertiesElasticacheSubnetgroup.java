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
public class AwsPropertiesElasticacheSubnetgroup {

    /**
     * The description for the cache subnet group. 
     */
    private String Description;

    /**
     * A name for the cache subnet group. If you don't specify a name, AWS CloudFormation generates a unique physical ID. For more information, see Name Type. 
     */
    private String CacheSubnetGroupName;

    /**
     * The Amazon EC2 subnet IDs for the cache subnet group. 
     */
    private String SubnetIds;

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
     * @return the CacheSubnetGroupName
     */
    public String getCacheSubnetGroupName() {
        return CacheSubnetGroupName;
    }

    /**
     * @param CacheSubnetGroupName the CacheSubnetGroupName to set
     */
    public void setCacheSubnetGroupName(String CacheSubnetGroupName) {
	this.CacheSubnetGroupName = CacheSubnetGroupName;
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