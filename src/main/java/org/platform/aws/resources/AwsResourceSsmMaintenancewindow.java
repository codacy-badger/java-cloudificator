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
public class AwsResourceSsmMaintenancewindow {

    /**
     * A description of the Maintenance Window. 
     */
    private String Description;

    /**
     * Enables a Maintenance Window task to execute on managed instances, even if you haven't registered those instances as targets. If this is enabled, then you must specify the unregistered instances (by instance ID) when you register a task with the Maintenance Window. 
     */
    private String AllowUnassociatedTargets;

    /**
     * The number of hours before the end of the Maintenance Window that Systems Manager stops scheduling new tasks for execution. 
     */
    private String Cutoff;

    /**
     * The schedule of the Maintenance Window in the form of a cron or rate expression. 
     */
    private String Schedule;

    /**
     * The duration of the Maintenance Window in hours. 
     */
    private String Duration;

    /**
     * The name of the Maintenance Window. 
     */
    private String Name;

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
     * @return the AllowUnassociatedTargets
     */
    public String getAllowUnassociatedTargets() {
        return AllowUnassociatedTargets;
    }

    /**
     * @param AllowUnassociatedTargets the AllowUnassociatedTargets to set
     */
    public void setAllowUnassociatedTargets(String AllowUnassociatedTargets) {
	this.AllowUnassociatedTargets = AllowUnassociatedTargets;
    }

    /**
     * @return the Cutoff
     */
    public String getCutoff() {
        return Cutoff;
    }

    /**
     * @param Cutoff the Cutoff to set
     */
    public void setCutoff(String Cutoff) {
	this.Cutoff = Cutoff;
    }

    /**
     * @return the Schedule
     */
    public String getSchedule() {
        return Schedule;
    }

    /**
     * @param Schedule the Schedule to set
     */
    public void setSchedule(String Schedule) {
	this.Schedule = Schedule;
    }

    /**
     * @return the Duration
     */
    public String getDuration() {
        return Duration;
    }

    /**
     * @param Duration the Duration to set
     */
    public void setDuration(String Duration) {
	this.Duration = Duration;
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