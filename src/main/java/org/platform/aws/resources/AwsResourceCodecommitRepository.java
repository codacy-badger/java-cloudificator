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
public class AwsResourceCodecommitRepository {

    /**
     * A name for the AWS CodeCommit repository. 
     */
    private String RepositoryName;

    /**
     * Defines the actions to take in response to events that occur in the repository. For example, you can send email notifications when someone pushes to the repository. 
     */
    private String Triggers;

    /**
     * A description about the AWS CodeCommit repository. For constraints, see the CreateRepository action in the AWS CodeCommit API Reference. 
     */
    private String RepositoryDescription;

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

    /**
     * @return the Triggers
     */
    public String getTriggers() {
        return Triggers;
    }

    /**
     * @param Triggers the Triggers to set
     */
    public void setTriggers(String Triggers) {
	this.Triggers = Triggers;
    }

    /**
     * @return the RepositoryDescription
     */
    public String getRepositoryDescription() {
        return RepositoryDescription;
    }

    /**
     * @param RepositoryDescription the RepositoryDescription to set
     */
    public void setRepositoryDescription(String RepositoryDescription) {
	this.RepositoryDescription = RepositoryDescription;
    }


}