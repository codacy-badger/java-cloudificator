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

import org.platform.aws.sections.sub.AWSResource;
import org.utils.AWSUtils;

/**
 * The Class AWSHostedZone.
 *
 * @author Inaki Rodriguez
 */
public class AWSHostedZone extends AWSResource {

    /**
     * Instantiates a new AWS hosted zone.
     *
     * @param name               the name
     * @param vpcList            the vpc list
     * @param HostedZoneConfig   the hosted zone config
     * @param HostedZoneTags     the hosted zone tags
     * @param QueryLoggingConfig the query logging config
     */
    public AWSHostedZone(String name, String vpcList, AWSHostedZoneConfig HostedZoneConfig,
	    AWSHostedZoneTags HostedZoneTags, AWSQueryLoggingConfig QueryLoggingConfig) {
	Type = AWSUtils.RESOURCE_TYPE_HOSTED_ZONE;
	if (name == null && vpcList == null) {
	    Properties = null;
	} else {
	    Properties = new AWSHostedZoneProperties(name, vpcList, HostedZoneConfig, HostedZoneTags,
		    QueryLoggingConfig);
	}
    }

}
