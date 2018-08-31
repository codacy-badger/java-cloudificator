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
public class AwsResourceApigatewayRequestvalidator {

    /**
     * Indicates whether to validate request parameters. 
     */
    private String ValidateRequestParameters;

    /**
     * The identifier of the targeted API entity. 
     */
    private String RestApiId;

    /**
     * Indicates whether to validate the request body according to the configured schema for the targeted API and method. 
     */
    private String ValidateRequestBody;

    /**
     * The name of this request validator. 
     */
    private String Name;

    /**
     * @return the ValidateRequestParameters
     */
    public String getValidateRequestParameters() {
        return ValidateRequestParameters;
    }

    /**
     * @param ValidateRequestParameters the ValidateRequestParameters to set
     */
    public void setValidateRequestParameters(String ValidateRequestParameters) {
	this.ValidateRequestParameters = ValidateRequestParameters;
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

    /**
     * @return the ValidateRequestBody
     */
    public String getValidateRequestBody() {
        return ValidateRequestBody;
    }

    /**
     * @param ValidateRequestBody the ValidateRequestBody to set
     */
    public void setValidateRequestBody(String ValidateRequestBody) {
	this.ValidateRequestBody = ValidateRequestBody;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}