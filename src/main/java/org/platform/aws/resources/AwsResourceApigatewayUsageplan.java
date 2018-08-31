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
public class AwsResourceApigatewayUsageplan {

    /**
     * The purpose of this usage plan. 
     */
    private String Description;

    /**
     * Configures the number of requests that users can make within a given interval. 
     */
    private String Quota;

    /**
     * The API stages to associate with this usage plan. 
     */
    private String ApiStages;

    /**
     * Configures the overall request rate (average requests per second) and burst capacity. 
     */
    private String Throttle;

    /**
     * A name for this usage plan. 
     */
    private String UsagePlanName;

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
     * @return the Quota
     */
    public String getQuota() {
        return Quota;
    }

    /**
     * @param Quota the Quota to set
     */
    public void setQuota(String Quota) {
	this.Quota = Quota;
    }

    /**
     * @return the ApiStages
     */
    public String getApiStages() {
        return ApiStages;
    }

    /**
     * @param ApiStages the ApiStages to set
     */
    public void setApiStages(String ApiStages) {
	this.ApiStages = ApiStages;
    }

    /**
     * @return the Throttle
     */
    public String getThrottle() {
        return Throttle;
    }

    /**
     * @param Throttle the Throttle to set
     */
    public void setThrottle(String Throttle) {
	this.Throttle = Throttle;
    }

    /**
     * @return the UsagePlanName
     */
    public String getUsagePlanName() {
        return UsagePlanName;
    }

    /**
     * @param UsagePlanName the UsagePlanName to set
     */
    public void setUsagePlanName(String UsagePlanName) {
	this.UsagePlanName = UsagePlanName;
    }


}