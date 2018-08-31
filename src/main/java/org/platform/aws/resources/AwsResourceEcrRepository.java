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
public class AwsResourceEcrRepository {

    /**
     * A policy that controls who has access to the repository and which actions they can perform on it. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide. 
     */
    private String RepositoryPolicyText;

    /**
     * A lifecycle policy for the repository. 
     */
    private String LifecyclePolicy;

    /**
     * A name for the image repository. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the repository name. For more information, see Name Type. 
     */
    private String RepositoryName;

    /**
     * @return the RepositoryPolicyText
     */
    public String getRepositoryPolicyText() {
        return RepositoryPolicyText;
    }

    /**
     * @param RepositoryPolicyText the RepositoryPolicyText to set
     */
    public void setRepositoryPolicyText(String RepositoryPolicyText) {
	this.RepositoryPolicyText = RepositoryPolicyText;
    }

    /**
     * @return the LifecyclePolicy
     */
    public String getLifecyclePolicy() {
        return LifecyclePolicy;
    }

    /**
     * @param LifecyclePolicy the LifecyclePolicy to set
     */
    public void setLifecyclePolicy(String LifecyclePolicy) {
	this.LifecyclePolicy = LifecyclePolicy;
    }

    /**
     * @return the RepositoryName
     */
    public String getRepositoryName() {
        return RepositoryName;
    }

    /**
     * @param RepositoryName the RepositoryName to set
     */
    public void setRepositoryName(String RepositoryName) {
	this.RepositoryName = RepositoryName;
    }


}