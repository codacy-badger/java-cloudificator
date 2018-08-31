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
public class AwsResourceSsmMaintenancewindowtarget {

    /**
     * A user-provided value to include in any events in CloudWatch Events that are raised while running tasks for these targets in this Maintenance Window. 
     */
    private String OwnerInformation;

    /**
     * A description for the target. 
     */
    private String Description;

    /**
     * The ID of the Maintenance Window to register the target with. 
     */
    private String WindowId;

    /**
     * The type of target that's being registered with the Maintenance Window. 
     */
    private String ResourceType;

    /**
     * The targets, either instances or tags. 
     */
    private String Targets;

    /**
     * An optional name for the target. 
     */
    private String Name;

    /**
     * @return the OwnerInformation
     */
    public String getOwnerInformation() {
        return OwnerInformation;
    }

    /**
     * @param OwnerInformation the OwnerInformation to set
     */
    public void setOwnerInformation(String OwnerInformation) {
	this.OwnerInformation = OwnerInformation;
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
     * @return the WindowId
     */
    public String getWindowId() {
        return WindowId;
    }

    /**
     * @param WindowId the WindowId to set
     */
    public void setWindowId(String WindowId) {
	this.WindowId = WindowId;
    }

    /**
     * @return the ResourceType
     */
    public String getResourceType() {
        return ResourceType;
    }

    /**
     * @param ResourceType the ResourceType to set
     */
    public void setResourceType(String ResourceType) {
	this.ResourceType = ResourceType;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
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