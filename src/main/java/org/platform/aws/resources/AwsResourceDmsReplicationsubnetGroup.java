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
public class AwsResourceDmsReplicationsubnetGroup {

    /**
     * The description for the replication subnet group. 
     */
    private String ReplicationSubnetGroupDescription;

    /**
     * The identifier for the replication subnet group. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the identifier. 
     */
    private String ReplicationSubnetGroupIdentifier;

    /**
     * The EC2 subnet IDs for the replication subnet group. 
     */
    private String SubnetIds;

    /**
     * The tags that you want to attach to the AWS DMS replication subnet group. 
     */
    private String Tags;

    /**
     * @return the ReplicationSubnetGroupDescription
     */
    public String getReplicationSubnetGroupDescription() {
        return ReplicationSubnetGroupDescription;
    }

    /**
     * @param ReplicationSubnetGroupDescription the ReplicationSubnetGroupDescription to set
     */
    public void setReplicationSubnetGroupDescription(String ReplicationSubnetGroupDescription) {
	this.ReplicationSubnetGroupDescription = ReplicationSubnetGroupDescription;
    }

    /**
     * @return the ReplicationSubnetGroupIdentifier
     */
    public String getReplicationSubnetGroupIdentifier() {
        return ReplicationSubnetGroupIdentifier;
    }

    /**
     * @param ReplicationSubnetGroupIdentifier the ReplicationSubnetGroupIdentifier to set
     */
    public void setReplicationSubnetGroupIdentifier(String ReplicationSubnetGroupIdentifier) {
	this.ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier;
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