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
public class AwsResourceGuarddutyFilter {

    /**
     * Specifies the action that is to be applied to the findings that match the filter. Valid values are: NOOP | ARCHIVE 
     */
    private String Action;

    /**
     * The description of the filter. 
     */
    private String Description;

    /**
     * The ID of the detector that specifies the GuardDuty service whose findings you want to filter. 
     */
    private String DetectorId;

    /**
     * Represents the criteria to be used in the filter for querying findings. 
     */
    private String FindingCriteria;

    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings. 
     */
    private String Rank;

    /**
     * The name of the filter. 
     */
    private String Name;

    /**
     * @return the Action
     */
    public String getAction() {
        return Action;
    }

    /**
     * @param Action the Action to set
     */
    public void setAction(String Action) {
	this.Action = Action;
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
     * @return the DetectorId
     */
    public String getDetectorId() {
        return DetectorId;
    }

    /**
     * @param DetectorId the DetectorId to set
     */
    public void setDetectorId(String DetectorId) {
	this.DetectorId = DetectorId;
    }

    /**
     * @return the FindingCriteria
     */
    public String getFindingCriteria() {
        return FindingCriteria;
    }

    /**
     * @param FindingCriteria the FindingCriteria to set
     */
    public void setFindingCriteria(String FindingCriteria) {
	this.FindingCriteria = FindingCriteria;
    }

    /**
     * @return the Rank
     */
    public String getRank() {
        return Rank;
    }

    /**
     * @param Rank the Rank to set
     */
    public void setRank(String Rank) {
	this.Rank = Rank;
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