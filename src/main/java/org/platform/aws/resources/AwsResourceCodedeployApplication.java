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
public class AwsResourceCodedeployApplication {

    /**
     * A name for the application. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the application name. For more information, see Name Type. 
     */
    private String ApplicationName;

    /**
     * The compute platform that AWS CodeDeploy deploys the application to. For valid values see CreateApplication in the AWS CodeDeploy API Reference. 
     */
    private String ComputePlatform;

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
     * @return the ComputePlatform
     */
    public String getComputePlatform() {
        return ComputePlatform;
    }

    /**
     * @param ComputePlatform the ComputePlatform to set
     */
    public void setComputePlatform(String ComputePlatform) {
	this.ComputePlatform = ComputePlatform;
    }


}