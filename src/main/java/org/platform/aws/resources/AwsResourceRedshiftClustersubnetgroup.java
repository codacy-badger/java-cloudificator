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
public class AwsResourceRedshiftClustersubnetgroup {

    /**
     * A description of the subnet group. 
     */
    private String Description;

    /**
     * A list of VPC subnet IDs. You can modify a maximum of 20 subnets. 
     */
    private String SubnetIds;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group. Use tags to manage your resources. 
     */
    private String Tags;

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