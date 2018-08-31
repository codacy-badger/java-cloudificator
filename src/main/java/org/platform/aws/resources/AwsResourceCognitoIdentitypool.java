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
public class AwsResourceCognitoIdentitypool {

    /**
     * Configuration options to be applied to the identity pool. 
     */
    private String PushSync;

    /**
     * An array of Amazon Cognito user pools and their client IDs. 
     */
    private String CognitoIdentityProviders;

    /**
     * The events to configure. 
     */
    private String CognitoEvents;

    /**
     * The "domain" by which Amazon Cognito will refer to your users. This name acts as a placeholder that allows your backend and the Amazon Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters and periods (.), underscores (_), and dashes (-). 
     */
    private String DeveloperProviderName;

    /**
     * Configuration options for configuring Amazon Cognito streams. 
     */
    private String CognitoStreams;

    /**
     * The name of your Amazon Cognito identity pool. 
     */
    private String IdentityPoolName;

    /**
     * Specifies whether the identity pool supports unauthenticated logins. 
     */
    private String AllowUnauthenticatedIdentities;

    /**
     * Key-value pairs that map provider names to provider app IDs. 
     */
    private String SupportedLoginProviders;

    /**
     * A list of Amazon Resource Names (ARNs) of Security Assertion Markup Language (SAML) providers. 
     */
    private String SamlProviderARNs;

    /**
     * A list of ARNs for the OpendID Connect provider. 
     */
    private String OpenIdConnectProviderARNs;

    /**
     * @return the PushSync
     */
    public String getPushSync() {
        return PushSync;
    }

    /**
     * @param PushSync the PushSync to set
     */
    public void setPushSync(String PushSync) {
	this.PushSync = PushSync;
    }

    /**
     * @return the CognitoIdentityProviders
     */
    public String getCognitoIdentityProviders() {
        return CognitoIdentityProviders;
    }

    /**
     * @param CognitoIdentityProviders the CognitoIdentityProviders to set
     */
    public void setCognitoIdentityProviders(String CognitoIdentityProviders) {
	this.CognitoIdentityProviders = CognitoIdentityProviders;
    }

    /**
     * @return the CognitoEvents
     */
    public String getCognitoEvents() {
        return CognitoEvents;
    }

    /**
     * @param CognitoEvents the CognitoEvents to set
     */
    public void setCognitoEvents(String CognitoEvents) {
	this.CognitoEvents = CognitoEvents;
    }

    /**
     * @return the DeveloperProviderName
     */
    public String getDeveloperProviderName() {
        return DeveloperProviderName;
    }

    /**
     * @param DeveloperProviderName the DeveloperProviderName to set
     */
    public void setDeveloperProviderName(String DeveloperProviderName) {
	this.DeveloperProviderName = DeveloperProviderName;
    }

    /**
     * @return the CognitoStreams
     */
    public String getCognitoStreams() {
        return CognitoStreams;
    }

    /**
     * @param CognitoStreams the CognitoStreams to set
     */
    public void setCognitoStreams(String CognitoStreams) {
	this.CognitoStreams = CognitoStreams;
    }

    /**
     * @return the IdentityPoolName
     */
    public String getIdentityPoolName() {
        return IdentityPoolName;
    }

    /**
     * @param IdentityPoolName the IdentityPoolName to set
     */
    public void setIdentityPoolName(String IdentityPoolName) {
	this.IdentityPoolName = IdentityPoolName;
    }

    /**
     * @return the AllowUnauthenticatedIdentities
     */
    public String getAllowUnauthenticatedIdentities() {
        return AllowUnauthenticatedIdentities;
    }

    /**
     * @param AllowUnauthenticatedIdentities the AllowUnauthenticatedIdentities to set
     */
    public void setAllowUnauthenticatedIdentities(String AllowUnauthenticatedIdentities) {
	this.AllowUnauthenticatedIdentities = AllowUnauthenticatedIdentities;
    }

    /**
     * @return the SupportedLoginProviders
     */
    public String getSupportedLoginProviders() {
        return SupportedLoginProviders;
    }

    /**
     * @param SupportedLoginProviders the SupportedLoginProviders to set
     */
    public void setSupportedLoginProviders(String SupportedLoginProviders) {
	this.SupportedLoginProviders = SupportedLoginProviders;
    }

    /**
     * @return the SamlProviderARNs
     */
    public String getSamlProviderARNs() {
        return SamlProviderARNs;
    }

    /**
     * @param SamlProviderARNs the SamlProviderARNs to set
     */
    public void setSamlProviderARNs(String SamlProviderARNs) {
	this.SamlProviderARNs = SamlProviderARNs;
    }

    /**
     * @return the OpenIdConnectProviderARNs
     */
    public String getOpenIdConnectProviderARNs() {
        return OpenIdConnectProviderARNs;
    }

    /**
     * @param OpenIdConnectProviderARNs the OpenIdConnectProviderARNs to set
     */
    public void setOpenIdConnectProviderARNs(String OpenIdConnectProviderARNs) {
	this.OpenIdConnectProviderARNs = OpenIdConnectProviderARNs;
    }


}