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
public class AwsResourceCodedeployDeploymentconfig {

    /**
     * A name for the deployment configuration. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the deployment configuration name. For more information, see Name Type. 
     */
    private String DeploymentConfigName;

    /**
     * The minimum number of healthy instances that must be available at any time during an AWS CodeDeploy deployment. For example, for a fleet of nine instances, if you specify a minimum of six healthy instances, AWS CodeDeploy deploys your application up to three instances at a time so that you always have six healthy instances. The deployment succeeds if your application successfully deploys to six or more instances; otherwise, the deployment fails. 
     */
    private String MinimumHealthyHosts;

    /**
     * @return the DeploymentConfigName
     */
    public String getDeploymentConfigName() {
        return DeploymentConfigName;
    }

    /**
     * @param DeploymentConfigName the DeploymentConfigName to set
     */
    public void setDeploymentConfigName(String DeploymentConfigName) {
	this.DeploymentConfigName = DeploymentConfigName;
    }

    /**
     * @return the MinimumHealthyHosts
     */
    public String getMinimumHealthyHosts() {
        return MinimumHealthyHosts;
    }

    /**
     * @param MinimumHealthyHosts the MinimumHealthyHosts to set
     */
    public void setMinimumHealthyHosts(String MinimumHealthyHosts) {
	this.MinimumHealthyHosts = MinimumHealthyHosts;
    }


}