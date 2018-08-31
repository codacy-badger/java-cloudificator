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
public class AwsResourceApigatewayAuthorizer {

    /**
     * A list of the Amazon Cognito user pool Amazon Resource Names (ARNs) to associate with this authorizer. For more information, see Use Amazon Cognito Your User Pool in the API Gateway Developer Guide. 
     */
    private String ProviderARNs;

    /**
     * The credentials that are required for the authorizer. To specify an AWS Identity and Access Management (IAM) role that API Gateway assumes, specify the role's Amazon Resource Name (ARN). To use resource-based permissions on the AWS Lambda (Lambda) function, specify null. 
     */
    private String AuthorizerCredentials;

    /**
     * A validation expression for the incoming identity. If you specify TOKEN for the authorizer's Type property, specify a regular expression. API Gateway uses the expression to attempt to match the incoming client token, and proceeds if the token matches. If the token doesn't match, API Gateway responds with a 401 (unauthorized request) error code. 
     */
    private String IdentityValidationExpression;

    /**
     * The type of authorizer. Valid values include: 
     */
    private String Type;

    /**
     * The authorizer's Uniform Resource Identifier (URI). If you specify TOKEN for the authorizer's Type property, specify a Lambda function URI that has the form arn:aws:apigateway:region:lambda:path/path. The path usually has the form /2015-03-31/functions/LambdaFunctionARN/invocations. 
     */
    private String AuthorizerUri;

    /**
     * The time-to-live (TTL) period, in seconds, that specifies how long API Gateway caches authorizer results. If you specify a value greater than 0, API Gateway caches the authorizer responses. By default, API Gateway sets this property to 300. The maximum value is 3600, or 1 hour. 
     */
    private String AuthorizerResultTtlInSeconds;

    /**
     * The ID of the RestApi resource that API Gateway creates the authorizer in. 
     */
    private String RestApiId;

    /**
     * The source of the identity in an incoming request. If you specify TOKEN for the authorizer's Type property, specify a mapping expression. The custom header mapping expression has the form method.request.header.name, where name is the name of a custom authorization header that clients submit as part of their requests. 
     */
    private String IdentitySource;

    /**
     * An optional customer-defined field that's used in Swagger imports and exports without functional impact. 
     */
    private String AuthType;

    /**
     * The name of the authorizer. 
     */
    private String Name;

    /**
     * @return the ProviderARNs
     */
    public String getProviderARNs() {
        return ProviderARNs;
    }

    /**
     * @param ProviderARNs the ProviderARNs to set
     */
    public void setProviderARNs(String ProviderARNs) {
	this.ProviderARNs = ProviderARNs;
    }

    /**
     * @return the AuthorizerCredentials
     */
    public String getAuthorizerCredentials() {
        return AuthorizerCredentials;
    }

    /**
     * @param AuthorizerCredentials the AuthorizerCredentials to set
     */
    public void setAuthorizerCredentials(String AuthorizerCredentials) {
	this.AuthorizerCredentials = AuthorizerCredentials;
    }

    /**
     * @return the IdentityValidationExpression
     */
    public String getIdentityValidationExpression() {
        return IdentityValidationExpression;
    }

    /**
     * @param IdentityValidationExpression the IdentityValidationExpression to set
     */
    public void setIdentityValidationExpression(String IdentityValidationExpression) {
	this.IdentityValidationExpression = IdentityValidationExpression;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the AuthorizerUri
     */
    public String getAuthorizerUri() {
        return AuthorizerUri;
    }

    /**
     * @param AuthorizerUri the AuthorizerUri to set
     */
    public void setAuthorizerUri(String AuthorizerUri) {
	this.AuthorizerUri = AuthorizerUri;
    }

    /**
     * @return the AuthorizerResultTtlInSeconds
     */
    public String getAuthorizerResultTtlInSeconds() {
        return AuthorizerResultTtlInSeconds;
    }

    /**
     * @param AuthorizerResultTtlInSeconds the AuthorizerResultTtlInSeconds to set
     */
    public void setAuthorizerResultTtlInSeconds(String AuthorizerResultTtlInSeconds) {
	this.AuthorizerResultTtlInSeconds = AuthorizerResultTtlInSeconds;
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
     * @return the IdentitySource
     */
    public String getIdentitySource() {
        return IdentitySource;
    }

    /**
     * @param IdentitySource the IdentitySource to set
     */
    public void setIdentitySource(String IdentitySource) {
	this.IdentitySource = IdentitySource;
    }

    /**
     * @return the AuthType
     */
    public String getAuthType() {
        return AuthType;
    }

    /**
     * @param AuthType the AuthType to set
     */
    public void setAuthType(String AuthType) {
	this.AuthType = AuthType;
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