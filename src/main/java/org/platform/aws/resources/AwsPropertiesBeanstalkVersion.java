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
public class AwsPropertiesBeanstalkVersion {

    /**
     * Name of the Elastic Beanstalk application that is associated with this application version. 
     */
    private String ApplicationName;

    /**
     * A description of this application version. 
     */
    private String Description;

    /**
     * The location of the source bundle for this version. 
     */
    private String SourceBundle;

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
     * @return the SourceBundle
     */
    public String getSourceBundle() {
        return SourceBundle;
    }

    /**
     * @param SourceBundle the SourceBundle to set
     */
    public void setSourceBundle(String SourceBundle) {
	this.SourceBundle = SourceBundle;
    }


}