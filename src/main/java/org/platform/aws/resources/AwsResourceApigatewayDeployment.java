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
public class AwsResourceApigatewayDeployment {

    /**
     * A description of the purpose of the API Gateway deployment. 
     */
    private String Description;

    /**
     * Configures the stage that API Gateway creates with this deployment. 
     */
    private String StageDescription;

    /**
     * A name for the stage that API Gateway creates with this deployment. Use only alphanumeric characters. 
     */
    private String StageName;

    /**
     * The ID of the RestApi resource to deploy. 
     */
    private String RestApiId;

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
     * @return the StageDescription
     */
    public String getStageDescription() {
        return StageDescription;
    }

    /**
     * @param StageDescription the StageDescription to set
     */
    public void setStageDescription(String StageDescription) {
	this.StageDescription = StageDescription;
    }

    /**
     * @return the StageName
     */
    public String getStageName() {
        return StageName;
    }

    /**
     * @param StageName the StageName to set
     */
    public void setStageName(String StageName) {
	this.StageName = StageName;
    }

    /**
     * @return the RestApiId
     */
    public String getRestApiId() {
        return RestApiId;
    }

    /**
     * @param RestApiId the RestApiId to set
     */
    public void setRestApiId(String RestApiId) {
	this.RestApiId = RestApiId;
    }


}