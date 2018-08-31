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
public class AwsResourceServicediscoveryService {

    /**
     * A description for the service. 
     */
    private String Description;

    /**
     * Specifies information about an optional custom health check. 
     */
    private String HealthCheckCustomConfig;

    /**
     * A complex type that contains information about the resource record sets that you want Route 53 to create when you register an instance. 
     */
    private String DnsConfig;

    /**
     * A complex type that contains settings for an optional health check. If you specify settings for a health check, Route 53 associates the health check with all the resource record sets that you specify in DnsConfig. 
     */
    private String HealthCheckConfig;

    /**
     * The name that you want to assign to the service. 
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
     * @return the HealthCheckCustomConfig
     */
    public String getHealthCheckCustomConfig() {
        return HealthCheckCustomConfig;
    }

    /**
     * @param HealthCheckCustomConfig the HealthCheckCustomConfig to set
     */
    public void setHealthCheckCustomConfig(String HealthCheckCustomConfig) {
	this.HealthCheckCustomConfig = HealthCheckCustomConfig;
    }

    /**
     * @return the DnsConfig
     */
    public String getDnsConfig() {
        return DnsConfig;
    }

    /**
     * @param DnsConfig the DnsConfig to set
     */
    public void setDnsConfig(String DnsConfig) {
	this.DnsConfig = DnsConfig;
    }

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