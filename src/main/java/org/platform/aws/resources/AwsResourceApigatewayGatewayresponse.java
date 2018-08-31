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
public class AwsResourceApigatewayGatewayresponse {

    /**
     * The response templates for the response. Duplicates not allowed. 
     */
    private String ResponseTemplates;

    /**
     * The response parameters (paths, query strings, and headers) for the response. Duplicates not allowed. 
     */
    private String ResponseParameters;

    /**
     * The identifier of the targeted API entity. 
     */
    private String RestApiId;

    /**
     * The HTTP status code for the response. 
     */
    private String StatusCode;

    /**
     * The response type. For valid values, see GatewayResponse in the API Gateway API Reference. 
     */
    private String ResponseType;

    /**
     * @return the ResponseTemplates
     */
    public String getResponseTemplates() {
        return ResponseTemplates;
    }

    /**
     * @param ResponseTemplates the ResponseTemplates to set
     */
    public void setResponseTemplates(String ResponseTemplates) {
	this.ResponseTemplates = ResponseTemplates;
    }

    /**
     * @return the ResponseParameters
     */
    public String getResponseParameters() {
        return ResponseParameters;
    }

    /**
     * @param ResponseParameters the ResponseParameters to set
     */
    public void setResponseParameters(String ResponseParameters) {
	this.ResponseParameters = ResponseParameters;
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
     * @return the StatusCode
     */
    public String getStatusCode() {
        return StatusCode;
    }

    /**
     * @param StatusCode the StatusCode to set
     */
    public void setStatusCode(String StatusCode) {
	this.StatusCode = StatusCode;
    }

    /**
     * @return the ResponseType
     */
    public String getResponseType() {
        return ResponseType;
    }

    /**
     * @param ResponseType the ResponseType to set
     */
    public void setResponseType(String ResponseType) {
	this.ResponseType = ResponseType;
    }


}