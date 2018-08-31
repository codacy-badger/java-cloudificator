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
public class AwsResourceAppsyncGraphqlapi {

    /**
     * Optional authorization configuration for using an OpenId Connect compliant service with your GraphQL endpoint. 
     */
    private String OpenIDConnectConfig;

    /**
     * Optional authorization configuration for using Amazon Cognito User Pools with your GraphQL endpoint. 
     */
    private String UserPoolConfig;

    /**
     * Friendly name for your GraphQL API in AWS AppSync. 
     */
    private String Name;

    /**
     * Security configuration for your GraphQL API. For allowed values (such as API_KEY, AWS_IAM, or AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT), see Security in the AWS AppSync Developer Guide. 
     */
    private String AuthenticationType;

    /**
     * Logging configuration when writing GraphQL operations and tracing to Amazon Cloudwatch. 
     */
    private String LogConfig;

    /**
     * @return the OpenIDConnectConfig
     */
    public String getOpenIDConnectConfig() {
        return OpenIDConnectConfig;
    }

    /**
     * @param OpenIDConnectConfig the OpenIDConnectConfig to set
     */
    public void setOpenIDConnectConfig(String OpenIDConnectConfig) {
	this.OpenIDConnectConfig = OpenIDConnectConfig;
    }

    /**
     * @return the UserPoolConfig
     */
    public String getUserPoolConfig() {
        return UserPoolConfig;
    }

    /**
     * @param UserPoolConfig the UserPoolConfig to set
     */
    public void setUserPoolConfig(String UserPoolConfig) {
	this.UserPoolConfig = UserPoolConfig;
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

    /**
     * @return the AuthenticationType
     */
    public String getAuthenticationType() {
        return AuthenticationType;
    }

    /**
     * @param AuthenticationType the AuthenticationType to set
     */
    public void setAuthenticationType(String AuthenticationType) {
	this.AuthenticationType = AuthenticationType;
    }

    /**
     * @return the LogConfig
     */
    public String getLogConfig() {
        return LogConfig;
    }

    /**
     * @param LogConfig the LogConfig to set
     */
    public void setLogConfig(String LogConfig) {
	this.LogConfig = LogConfig;
    }


}