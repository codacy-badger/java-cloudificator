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
public class AwsResourceEc2Launchtemplate {

    /**
     * A name for the launch template. 
     */
    private String LaunchTemplateName;

    /**
     * The information for the launch template. 
     */
    private String LaunchTemplateData;

    /**
     * @return the LaunchTemplateName
     */
    public String getLaunchTemplateName() {
        return LaunchTemplateName;
    }

    /**
     * @param LaunchTemplateName the LaunchTemplateName to set
     */
    public void setLaunchTemplateName(String LaunchTemplateName) {
	this.LaunchTemplateName = LaunchTemplateName;
    }

    /**
     * @return the LaunchTemplateData
     */
    public String getLaunchTemplateData() {
        return LaunchTemplateData;
    }

    /**
     * @param LaunchTemplateData the LaunchTemplateData to set
     */
    public void setLaunchTemplateData(String LaunchTemplateData) {
	this.LaunchTemplateData = LaunchTemplateData;
    }


}