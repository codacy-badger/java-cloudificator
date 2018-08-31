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
public class AwsResourceSesConfigurationseteventdestination {

    /**
     * The name of the configuration set that the event destination should be associated with. 
     */
    private String ConfigurationSetName;

    /**
     * The AWS service that email sending event information will be published to. 
     */
    private String EventDestination;

    /**
     * @return the ConfigurationSetName
     */
    public String getConfigurationSetName() {
        return ConfigurationSetName;
    }

    /**
     * @param ConfigurationSetName the ConfigurationSetName to set
     */
    public void setConfigurationSetName(String ConfigurationSetName) {
	this.ConfigurationSetName = ConfigurationSetName;
    }

    /**
     * @return the EventDestination
     */
    public String getEventDestination() {
        return EventDestination;
    }

    /**
     * @param EventDestination the EventDestination to set
     */
    public void setEventDestination(String EventDestination) {
	this.EventDestination = EventDestination;
    }


}