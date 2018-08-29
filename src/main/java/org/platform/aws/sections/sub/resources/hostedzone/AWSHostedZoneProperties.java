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
package org.platform.aws.sections.sub.resources.hostedzone;

import org.platform.aws.MandatoryPropertyType;

/**
 * The Class AWSHostedZoneProperties.
 *
 * @see https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53-hostedzone.html
 *
 * @author Inaki Rodriguez
 */
public class AWSHostedZoneProperties {

    /** The Name. */
    @MandatoryPropertyType
    public String Name;

    /** The VP cs. */
    private String VPCs;

    /** The Hosted zone config. */
    private AWSHostedZoneConfig HostedZoneConfig;

    /** The Hosted zone tags. */
    private AWSHostedZoneTags HostedZoneTags;

    /** The Query logging config. */
    private AWSQueryLoggingConfig QueryLoggingConfig;

    /**
     * Instantiates a new AWS hosted zone properties.
     *
     * @param name               the name
     * @param vpcList            the vpc list
     * @param HostedZoneConfig   the hosted zone config
     * @param HostedZoneTags     the hosted zone tags
     * @param QueryLoggingConfig the query logging config
     */
    public AWSHostedZoneProperties(String name, String vpcList, AWSHostedZoneConfig HostedZoneConfig,
	    AWSHostedZoneTags HostedZoneTags, AWSQueryLoggingConfig QueryLoggingConfig) {
	this.Name = null;
	this.VPCs = vpcList;
	this.HostedZoneConfig = HostedZoneConfig;
	this.HostedZoneTags = HostedZoneTags;
	this.QueryLoggingConfig = QueryLoggingConfig;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
	return Name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
	Name = name;
    }

    /**
     * Gets the VP cs.
     *
     * @return the VP cs
     */
    public String getVPCs() {
	return VPCs;
    }

    /**
     * Sets the VP cs.
     *
     * @param vPCs the new VP cs
     */
    public void setVPCs(String vPCs) {
	VPCs = vPCs;
    }

    /**
     * Gets the hosted zone config.
     *
     * @return the hosted zone config
     */
    public AWSHostedZoneConfig getHostedZoneConfig() {
	return HostedZoneConfig;
    }

    /**
     * Sets the hosted zone config.
     *
     * @param hostedZoneConfig the new hosted zone config
     */
    public void setHostedZoneConfig(AWSHostedZoneConfig hostedZoneConfig) {
	HostedZoneConfig = hostedZoneConfig;
    }

    /**
     * Gets the hosted zone tags.
     *
     * @return the hosted zone tags
     */
    public AWSHostedZoneTags getHostedZoneTags() {
	return HostedZoneTags;
    }

    /**
     * Sets the hosted zone tags.
     *
     * @param hostedZoneTags the new hosted zone tags
     */
    public void setHostedZoneTags(AWSHostedZoneTags hostedZoneTags) {
	HostedZoneTags = hostedZoneTags;
    }

    /**
     * Gets the query logging config.
     *
     * @return the query logging config
     */
    public AWSQueryLoggingConfig getQueryLoggingConfig() {
	return QueryLoggingConfig;
    }

    /**
     * Sets the query logging config.
     *
     * @param queryLoggingConfig the new query logging config
     */
    public void setQueryLoggingConfig(AWSQueryLoggingConfig queryLoggingConfig) {
	QueryLoggingConfig = queryLoggingConfig;
    }

}
