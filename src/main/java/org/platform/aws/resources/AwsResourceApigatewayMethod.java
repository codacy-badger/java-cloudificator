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
public class AwsResourceApigatewayMethod {

    /**
     * The responses that can be sent to the client who calls the method. 
     */
    private String MethodResponses;

    /**
     * The backend system that the method calls when it receives a request. 
     */
    private String Integration;

    /**
     * The identifier of the authorizer to use on this method. If you specify this property, specify CUSTOM for the AuthorizationType property. 
     */
    private String AuthorizerId;

    /**
     * A friendly operation name for the method. For example, you can assign the OperationName of ListPets for the GET /pets method. 
     */
    private String OperationName;

    /**
     * The resources that are used for the response's content type. Specify response models as key-value pairs (string-to-string mapping), with a content type as the key and a Model resource name as the value. 
     */
    private String RequestModels;

    /**
     * The ID of an API Gateway resource. For root resource methods, specify the RestApi root resource ID, such as { "Fn::GetAtt": ["MyRestApi", "RootResourceId"] }. 
     */
    private String ResourceId;

    /**
     * The ID of the RestApi resource in which API Gateway creates the method. 
     */
    private String RestApiId;

    /**
     * Indicates whether the method requires clients to submit a valid API key. 
     */
    private String ApiKeyRequired;

    /**
     * The method's authorization type. 
     */
    private String AuthorizationType;

    /**
     * The ID of the associated request validator. 
     */
    private String RequestValidatorId;

    /**
     * The HTTP method that clients use to call this method. 
     */
    private String HttpMethod;

    /**
     * The request parameters that API Gateway accepts. Specify request parameters as key-value pairs (string-to-Boolean mapping), with a source as the key and a Boolean as the value. The Boolean specifies whether a parameter is required. A source must match the format method.request.location.name, where the location is querystring, path, or header, and name is a valid, unique parameter name. 
     */
    private String RequestParameters;

    /**
     * @return the MethodResponses
     */
    public String getMethodResponses() {
        return MethodResponses;
    }

    /**
     * @param MethodResponses the MethodResponses to set
     */
    public void setMethodResponses(String MethodResponses) {
	this.MethodResponses = MethodResponses;
    }

    /**
     * @return the Integration
     */
    public String getIntegration() {
        return Integration;
    }

    /**
     * @param Integration the Integration to set
     */
    public void setIntegration(String Integration) {
	this.Integration = Integration;
    }

    /**
     * @return the AuthorizerId
     */
    public String getAuthorizerId() {
        return AuthorizerId;
    }

    /**
     * @param AuthorizerId the AuthorizerId to set
     */
    public void setAuthorizerId(String AuthorizerId) {
	this.AuthorizerId = AuthorizerId;
    }

    /**
     * @return the OperationName
     */
    public String getOperationName() {
        return OperationName;
    }

    /**
     * @param OperationName the OperationName to set
     */
    public void setOperationName(String OperationName) {
	this.OperationName = OperationName;
    }

    /**
     * @return the RequestModels
     */
    public String getRequestModels() {
        return RequestModels;
    }

    /**
     * @param RequestModels the RequestModels to set
     */
    public void setRequestModels(String RequestModels) {
	this.RequestModels = RequestModels;
    }

    /**
     * @return the ResourceId
     */
    public String getResourceId() {
        return ResourceId;
    }

    /**
     * @param ResourceId the ResourceId to set
     */
    public void setResourceId(String ResourceId) {
	this.ResourceId = ResourceId;
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
     * @return the ApiKeyRequired
     */
    public String getApiKeyRequired() {
        return ApiKeyRequired;
    }

    /**
     * @param ApiKeyRequired the ApiKeyRequired to set
     */
    public void setApiKeyRequired(String ApiKeyRequired) {
	this.ApiKeyRequired = ApiKeyRequired;
    }

    /**
     * @return the AuthorizationType
     */
    public String getAuthorizationType() {
        return AuthorizationType;
    }

    /**
     * @param AuthorizationType the AuthorizationType to set
     */
    public void setAuthorizationType(String AuthorizationType) {
	this.AuthorizationType = AuthorizationType;
    }

    /**
     * @return the RequestValidatorId
     */
    public String getRequestValidatorId() {
        return RequestValidatorId;
    }

    /**
     * @param RequestValidatorId the RequestValidatorId to set
     */
    public void setRequestValidatorId(String RequestValidatorId) {
	this.RequestValidatorId = RequestValidatorId;
    }

    /**
     * @return the HttpMethod
     */
    public String getHttpMethod() {
        return HttpMethod;
    }

    /**
     * @param HttpMethod the HttpMethod to set
     */
    public void setHttpMethod(String HttpMethod) {
	this.HttpMethod = HttpMethod;
    }

    /**
     * @return the RequestParameters
     */
    public String getRequestParameters() {
        return RequestParameters;
    }

    /**
     * @param RequestParameters the RequestParameters to set
     */
    public void setRequestParameters(String RequestParameters) {
	this.RequestParameters = RequestParameters;
    }


}