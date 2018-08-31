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
public class AwsResourceNeptuneDbsubnetgroup {

    /**
     * The name for the DB subnet group. This value is stored as a lowercase string. 
     */
    private String DBSubnetGroupName;

    /**
     * The description for the DB subnet group. 
     */
    private String DBSubnetGroupDescription;

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    private String SubnetIds;

    /**
     * The tags that you want to attach to the Amazon RDS database subnet group. 
     */
    private String Tags;

    /**
     * @return the DBSubnetGroupName
     */
    public String getDBSubnetGroupName() {
        return DBSubnetGroupName;
    }

    /**
     * @param DBSubnetGroupName the DBSubnetGroupName to set
     */
    public void setDBSubnetGroupName(String DBSubnetGroupName) {
	this.DBSubnetGroupName = DBSubnetGroupName;
    }

    /**
     * @return the DBSubnetGroupDescription
     */
    public String getDBSubnetGroupDescription() {
        return DBSubnetGroupDescription;
    }

    /**
     * @param DBSubnetGroupDescription the DBSubnetGroupDescription to set
     */
    public void setDBSubnetGroupDescription(String DBSubnetGroupDescription) {
	this.DBSubnetGroupDescription = DBSubnetGroupDescription;
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