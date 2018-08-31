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
public class AwsResourceServicediscoveryInstance {

    /**
     * A string map that contains attribute keys and values. Supported attribute keys include the following: 
     */
    private String InstanceAttributes;

    /**
     * An identifier that you want to associate with the instance. Note the following: 
     */
    private String InstanceId;

    /**
     * The ID of the service that you want to use for settings for the resource record sets and health check that Route 53 will create. 
     */
    private String ServiceId;

    /**
     * @return the InstanceAttributes
     */
    public String getInstanceAttributes() {
        return InstanceAttributes;
    }

    /**
     * @param InstanceAttributes the InstanceAttributes to set
     */
    public void setInstanceAttributes(String InstanceAttributes) {
	this.InstanceAttributes = InstanceAttributes;
    }

    /**
     * @return the InstanceId
     */
    public String getInstanceId() {
        return InstanceId;
    }

    /**
     * @param InstanceId the InstanceId to set
     */
    public void setInstanceId(String InstanceId) {
	this.InstanceId = InstanceId;
    }

    /**
     * @return the ServiceId
     */
    public String getServiceId() {
        return ServiceId;
    }

    /**
     * @param ServiceId the ServiceId to set
     */
    public void setServiceId(String ServiceId) {
	this.ServiceId = ServiceId;
    }


}