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
public class AwsResourceCognitoUserpoolclient {

    /**
     * Specifies whether you want to generate a secret for the user pool client being created. 
     */
    private String GenerateSecret;

    /**
     * The client name for the user pool client that you want to create. 
     */
    private String ClientName;

    /**
     * The user pool ID for the user pool where you want to create a client. 
     */
    private String UserPoolId;

    /**
     * The explicit authentication flows, which can be one of the following: ADMIN_NO_SRP_AUTH, CUSTOM_AUTH_FLOW_ONLY, or USER_PASSWORD_AUTH. 
     */
    private String ExplicitAuthFlows;

    /**
     * The time limit, in days, after which the refresh token is no longer valid. 
     */
    private String RefreshTokenValidity;

    /**
     * The read attributes. 
     */
    private String ReadAttributes;

    /**
     * The write attributes. 
     */
    private String WriteAttributes;

    /**
     * @return the GenerateSecret
     */
    public String getGenerateSecret() {
        return GenerateSecret;
    }

    /**
     * @param GenerateSecret the GenerateSecret to set
     */
    public void setGenerateSecret(String GenerateSecret) {
	this.GenerateSecret = GenerateSecret;
    }

    /**
     * @return the ClientName
     */
    public String getClientName() {
        return ClientName;
    }

    /**
     * @param ClientName the ClientName to set
     */
    public void setClientName(String ClientName) {
	this.ClientName = ClientName;
    }

    /**
     * @return the UserPoolId
     */
    public String getUserPoolId() {
        return UserPoolId;
    }

    /**
     * @param UserPoolId the UserPoolId to set
     */
    public void setUserPoolId(String UserPoolId) {
	this.UserPoolId = UserPoolId;
    }

    /**
     * @return the ExplicitAuthFlows
     */
    public String getExplicitAuthFlows() {
        return ExplicitAuthFlows;
    }

    /**
     * @param ExplicitAuthFlows the ExplicitAuthFlows to set
     */
    public void setExplicitAuthFlows(String ExplicitAuthFlows) {
	this.ExplicitAuthFlows = ExplicitAuthFlows;
    }

    /**
     * @return the RefreshTokenValidity
     */
    public String getRefreshTokenValidity() {
        return RefreshTokenValidity;
    }

    /**
     * @param RefreshTokenValidity the RefreshTokenValidity to set
     */
    public void setRefreshTokenValidity(String RefreshTokenValidity) {
	this.RefreshTokenValidity = RefreshTokenValidity;
    }

    /**
     * @return the ReadAttributes
     */
    public String getReadAttributes() {
        return ReadAttributes;
    }

    /**
     * @param ReadAttributes the ReadAttributes to set
     */
    public void setReadAttributes(String ReadAttributes) {
	this.ReadAttributes = ReadAttributes;
    }

    /**
     * @return the WriteAttributes
     */
    public String getWriteAttributes() {
        return WriteAttributes;
    }

    /**
     * @param WriteAttributes the WriteAttributes to set
     */
    public void setWriteAttributes(String WriteAttributes) {
	this.WriteAttributes = WriteAttributes;
    }


}