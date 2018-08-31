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
public class AwsResourceGlueTrigger {

    /**
     * The type of job trigger. Valid values are SCHEDULED, CONDITIONAL, or ON_DEMAND. 
     */
    private String Type;

    /**
     * The description of the job trigger. 
     */
    private String Description;

    /**
     * The actions that the job trigger initiates when it fires. 
     */
    private String Actions;

    /**
     * The cron schedule expression for the job trigger. 
     */
    private String Schedule;

    /**
     * The name of the job trigger. 
     */
    private String Name;

    /**
     * The predicate of the job trigger, which determines when the trigger fires. 
     */
    private String Predicate;

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
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
     * @return the Actions
     */
    public String getActions() {
        return Actions;
    }

    /**
     * @param Actions the Actions to set
     */
    public void setActions(String Actions) {
	this.Actions = Actions;
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

    /**
     * @return the Predicate
     */
    public String getPredicate() {
        return Predicate;
    }

    /**
     * @param Predicate the Predicate to set
     */
    public void setPredicate(String Predicate) {
	this.Predicate = Predicate;
    }


}