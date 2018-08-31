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
public class AwsPropertiesCwDashboard {

    /**
     * A name for the dashboard. The name must be between 1 and 255 characters. If you do not specify a name, one will be generated automatically. 
     */
    private String DashboardName;

    /**
     * A JSON string that defines the widgets contained in the dashboard and their location. For information about how to format this string, see Dashboard Body Structure and Syntax. 
     */
    private String DashboardBody;

    /**
     * @return the DashboardName
     */
    public String getDashboardName() {
        return DashboardName;
    }

    /**
     * @param DashboardName the DashboardName to set
     */
    public void setDashboardName(String DashboardName) {
	this.DashboardName = DashboardName;
    }

    /**
     * @return the DashboardBody
     */
    public String getDashboardBody() {
        return DashboardBody;
    }

    /**
     * @param DashboardBody the DashboardBody to set
     */
    public void setDashboardBody(String DashboardBody) {
	this.DashboardBody = DashboardBody;
    }


}