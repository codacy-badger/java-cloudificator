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
public class AwsResourceCloud9Environmentec2 {

    /**
     * Any AWS CodeCommit source code repositories to be cloned into the development environment. 
     */
    private String Repositories;

    /**
     * The Amazon Resource Name (ARN) of the environment owner. If this value is not specified, the ARN defaults to this environment's creator. 
     */
    private String OwnerArn;

    /**
     * The description of the environment to create. 
     */
    private String Description;

    /**
     * The number of minutes until the running instance is shut down after the environment has last been used. 
     */
    private String AutomaticStopTimeMinutes;

    /**
     * The ID of the subnet in Amazon Virtual Private Cloud (Amazon VPC) to use. 
     */
    private String SubnetId;

    /**
     * The type of instance to host the environment on (for example, t2.micro). 
     */
    private String InstanceType;

    /**
     * The name of the environment to create. 
     */
    private String Name;

    /**
     * @return the Repositories
     */
    public String getRepositories() {
        return Repositories;
    }

    /**
     * @param Repositories the Repositories to set
     */
    public void setRepositories(String Repositories) {
	this.Repositories = Repositories;
    }

    /**
     * @return the OwnerArn
     */
    public String getOwnerArn() {
        return OwnerArn;
    }

    /**
     * @param OwnerArn the OwnerArn to set
     */
    public void setOwnerArn(String OwnerArn) {
	this.OwnerArn = OwnerArn;
    }

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
     * @return the AutomaticStopTimeMinutes
     */
    public String getAutomaticStopTimeMinutes() {
        return AutomaticStopTimeMinutes;
    }

    /**
     * @param AutomaticStopTimeMinutes the AutomaticStopTimeMinutes to set
     */
    public void setAutomaticStopTimeMinutes(String AutomaticStopTimeMinutes) {
	this.AutomaticStopTimeMinutes = AutomaticStopTimeMinutes;
    }

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
    }

    /**
     * @return the InstanceType
     */
    public String getInstanceType() {
        return InstanceType;
    }

    /**
     * @param InstanceType the InstanceType to set
     */
    public void setInstanceType(String InstanceType) {
	this.InstanceType = InstanceType;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}