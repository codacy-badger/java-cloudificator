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
public class AwsResourceRoute53Hostedzone {

    /**
     * An arbitrary set of tags (key–value pairs) for this hosted zone. 
     */
    private String HostedZoneTags;

    /**
     * One or more VPCs that you want to associate with this hosted zone. When you specify this property, AWS CloudFormation creates a private hosted zone. 
     */
    private String VPCs;

    /**
     * A complex type that contains an optional comment about your hosted zone. 
     */
    private String HostedZoneConfig;

    /**
     * The configuration for DNS query logging. 
     */
    private String QueryLoggingConfig;

    /**
     * The name of the domain. For resource record types that include a domain name, specify a fully qualified domain name. 
     */
    private String Name;

    /**
     * @return the HostedZoneTags
     */
    public String getHostedZoneTags() {
        return HostedZoneTags;
    }

    /**
     * @param HostedZoneTags the HostedZoneTags to set
     */
    public void setHostedZoneTags(String HostedZoneTags) {
	this.HostedZoneTags = HostedZoneTags;
    }

    /**
     * @return the VPCs
     */
    public String getVPCs() {
        return VPCs;
    }

    /**
     * @param VPCs the VPCs to set
     */
    public void setVPCs(String VPCs) {
	this.VPCs = VPCs;
    }

    /**
     * @return the HostedZoneConfig
     */
    public String getHostedZoneConfig() {
        return HostedZoneConfig;
    }

    /**
     * @param HostedZoneConfig the HostedZoneConfig to set
     */
    public void setHostedZoneConfig(String HostedZoneConfig) {
	this.HostedZoneConfig = HostedZoneConfig;
    }

    /**
     * @return the QueryLoggingConfig
     */
    public String getQueryLoggingConfig() {
        return QueryLoggingConfig;
    }

    /**
     * @param QueryLoggingConfig the QueryLoggingConfig to set
     */
    public void setQueryLoggingConfig(String QueryLoggingConfig) {
	this.QueryLoggingConfig = QueryLoggingConfig;
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