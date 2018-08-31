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
public class AwsResourceCognitoUserpool {

    /**
     * The cost allocation tags for the user pool. For more information, see Adding Cost Allocation Tags to Your User Pool in the Amazon Cognito Developer Guide. 
     */
    private String UserPoolTags;

    /**
     * The policies associated with the Amazon Cognito user pool. 
     */
    private String Policies;

    /**
     * Specifies multi-factor authentication (MFA) configuration details. Can be one of the following values: 
     */
    private String MfaConfiguration;

    /**
     * A list of schema attributes for the new user pool. These attributes can be standard or custom attributes. 
     */
    private String Schema;

    /**
     * The type of configuration for creating a new user profile. 
     */
    private String AdminCreateUserConfig;

    /**
     * A string representing the SMS authentication message. Must contain {####} in the message. 
     */
    private String SmsAuthenticationMessage;

    /**
     * A string used to name the user pool. 
     */
    private String UserPoolName;

    /**
     * A string representing the SMS verification message. Must contain {####} in the message. 
     */
    private String SmsVerificationMessage;

    /**
     * The email configuration. 
     */
    private String EmailConfiguration;

    /**
     * The Short Message Service (SMS) configuration. 
     */
    private String SmsConfiguration;

    /**
     * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username. 
     */
    private String AliasAttributes;

    /**
     * A string representing the email verification subject. 
     */
    private String EmailVerificationSubject;

    /**
     * The AWS Lambda trigger configuration information for the Amazon Cognito user pool. 
     */
    private String LambdaConfig;

    /**
     * The attributes to be auto-verified. Possible values: email or phone_number. 
     */
    private String AutoVerifiedAttributes;

    /**
     * The type of configuration for the user pool's device tracking. 
     */
    private String DeviceConfiguration;

    /**
     * A string representing the email verification message. Must contain {####} in the description. 
     */
    private String EmailVerificationMessage;

    /**
     * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up. Possible values: phone_number or email. 
     */
    private String UsernameAttributes;

    /**
     * @return the UserPoolTags
     */
    public String getUserPoolTags() {
        return UserPoolTags;
    }

    /**
     * @param UserPoolTags the UserPoolTags to set
     */
    public void setUserPoolTags(String UserPoolTags) {
	this.UserPoolTags = UserPoolTags;
    }

    /**
     * @return the Policies
     */
    public String getPolicies() {
        return Policies;
    }

    /**
     * @param Policies the Policies to set
     */
    public void setPolicies(String Policies) {
	this.Policies = Policies;
    }

    /**
     * @return the MfaConfiguration
     */
    public String getMfaConfiguration() {
        return MfaConfiguration;
    }

    /**
     * @param MfaConfiguration the MfaConfiguration to set
     */
    public void setMfaConfiguration(String MfaConfiguration) {
	this.MfaConfiguration = MfaConfiguration;
    }

    /**
     * @return the Schema
     */
    public String getSchema() {
        return Schema;
    }

    /**
     * @param Schema the Schema to set
     */
    public void setSchema(String Schema) {
	this.Schema = Schema;
    }

    /**
     * @return the AdminCreateUserConfig
     */
    public String getAdminCreateUserConfig() {
        return AdminCreateUserConfig;
    }

    /**
     * @param AdminCreateUserConfig the AdminCreateUserConfig to set
     */
    public void setAdminCreateUserConfig(String AdminCreateUserConfig) {
	this.AdminCreateUserConfig = AdminCreateUserConfig;
    }

    /**
     * @return the SmsAuthenticationMessage
     */
    public String getSmsAuthenticationMessage() {
        return SmsAuthenticationMessage;
    }

    /**
     * @param SmsAuthenticationMessage the SmsAuthenticationMessage to set
     */
    public void setSmsAuthenticationMessage(String SmsAuthenticationMessage) {
	this.SmsAuthenticationMessage = SmsAuthenticationMessage;
    }

    /**
     * @return the UserPoolName
     */
    public String getUserPoolName() {
        return UserPoolName;
    }

    /**
     * @param UserPoolName the UserPoolName to set
     */
    public void setUserPoolName(String UserPoolName) {
	this.UserPoolName = UserPoolName;
    }

    /**
     * @return the SmsVerificationMessage
     */
    public String getSmsVerificationMessage() {
        return SmsVerificationMessage;
    }

    /**
     * @param SmsVerificationMessage the SmsVerificationMessage to set
     */
    public void setSmsVerificationMessage(String SmsVerificationMessage) {
	this.SmsVerificationMessage = SmsVerificationMessage;
    }

    /**
     * @return the EmailConfiguration
     */
    public String getEmailConfiguration() {
        return EmailConfiguration;
    }

    /**
     * @param EmailConfiguration the EmailConfiguration to set
     */
    public void setEmailConfiguration(String EmailConfiguration) {
	this.EmailConfiguration = EmailConfiguration;
    }

    /**
     * @return the SmsConfiguration
     */
    public String getSmsConfiguration() {
        return SmsConfiguration;
    }

    /**
     * @param SmsConfiguration the SmsConfiguration to set
     */
    public void setSmsConfiguration(String SmsConfiguration) {
	this.SmsConfiguration = SmsConfiguration;
    }

    /**
     * @return the AliasAttributes
     */
    public String getAliasAttributes() {
        return AliasAttributes;
    }

    /**
     * @param AliasAttributes the AliasAttributes to set
     */
    public void setAliasAttributes(String AliasAttributes) {
	this.AliasAttributes = AliasAttributes;
    }

    /**
     * @return the EmailVerificationSubject
     */
    public String getEmailVerificationSubject() {
        return EmailVerificationSubject;
    }

    /**
     * @param EmailVerificationSubject the EmailVerificationSubject to set
     */
    public void setEmailVerificationSubject(String EmailVerificationSubject) {
	this.EmailVerificationSubject = EmailVerificationSubject;
    }

    /**
     * @return the LambdaConfig
     */
    public String getLambdaConfig() {
        return LambdaConfig;
    }

    /**
     * @param LambdaConfig the LambdaConfig to set
     */
    public void setLambdaConfig(String LambdaConfig) {
	this.LambdaConfig = LambdaConfig;
    }

    /**
     * @return the AutoVerifiedAttributes
     */
    public String getAutoVerifiedAttributes() {
        return AutoVerifiedAttributes;
    }

    /**
     * @param AutoVerifiedAttributes the AutoVerifiedAttributes to set
     */
    public void setAutoVerifiedAttributes(String AutoVerifiedAttributes) {
	this.AutoVerifiedAttributes = AutoVerifiedAttributes;
    }

    /**
     * @return the DeviceConfiguration
     */
    public String getDeviceConfiguration() {
        return DeviceConfiguration;
    }

    /**
     * @param DeviceConfiguration the DeviceConfiguration to set
     */
    public void setDeviceConfiguration(String DeviceConfiguration) {
	this.DeviceConfiguration = DeviceConfiguration;
    }

    /**
     * @return the EmailVerificationMessage
     */
    public String getEmailVerificationMessage() {
        return EmailVerificationMessage;
    }

    /**
     * @param EmailVerificationMessage the EmailVerificationMessage to set
     */
    public void setEmailVerificationMessage(String EmailVerificationMessage) {
	this.EmailVerificationMessage = EmailVerificationMessage;
    }

    /**
     * @return the UsernameAttributes
     */
    public String getUsernameAttributes() {
        return UsernameAttributes;
    }

    /**
     * @param UsernameAttributes the UsernameAttributes to set
     */
    public void setUsernameAttributes(String UsernameAttributes) {
	this.UsernameAttributes = UsernameAttributes;
    }


}