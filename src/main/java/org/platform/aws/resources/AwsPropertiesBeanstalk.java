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
public class AwsPropertiesBeanstalk {

    /**
     * A name for the Elastic Beanstalk application. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the application name. For more information, see Name Type. 
     */
    private String ApplicationName;

    /**
     * An optional description of this application. 
     */
    private String Description;

    /**
     * Defines lifecycle settings for resources that belong to the application, and the service role that Elastic Beanstalk assumes in order to apply lifecycle settings. 
     */
    private String ResourceLifecycleConfig;

    /**
     * @return the ApplicationName
     */
    public String getApplicationName() {
        return ApplicationName;
    }

    /**
     * @param ApplicationName the ApplicationName to set
     */
    public void setApplicationName(String ApplicationName) {
	this.ApplicationName = ApplicationName;
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
     * @return the ResourceLifecycleConfig
     */
    public String getResourceLifecycleConfig() {
        return ResourceLifecycleConfig;
    }

    /**
     * @param ResourceLifecycleConfig the ResourceLifecycleConfig to set
     */
    public void setResourceLifecycleConfig(String ResourceLifecycleConfig) {
	this.ResourceLifecycleConfig = ResourceLifecycleConfig;
    }


}