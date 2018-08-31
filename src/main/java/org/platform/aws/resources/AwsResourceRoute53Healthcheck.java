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
public class AwsResourceRoute53Healthcheck {

    /**
     * An Amazon Route 53 health check. 
     */
    private String HealthCheckConfig;

    /**
     * An arbitrary set of tags (key–value pairs) for this health check. 
     */
    private String HealthCheckTags;

    /**
     * @return the HealthCheckConfig
     */
    public String getHealthCheckConfig() {
        return HealthCheckConfig;
    }

    /**
     * @param HealthCheckConfig the HealthCheckConfig to set
     */
    public void setHealthCheckConfig(String HealthCheckConfig) {
	this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * @return the HealthCheckTags
     */
    public String getHealthCheckTags() {
        return HealthCheckTags;
    }

    /**
     * @param HealthCheckTags the HealthCheckTags to set
     */
    public void setHealthCheckTags(String HealthCheckTags) {
	this.HealthCheckTags = HealthCheckTags;
    }


}