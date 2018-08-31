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
public class AwsResourceCognitoUserpooluser {

    /**
     * The user's validation data. This is a list of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. For example, you might choose to allow or disallow user sign-up based on the user's domain. 
     */
    private String ValidationData;

    /**
     * The ID for the user pool where the user will be created. 
     */
    private String UserPoolId;

    /**
     * The user name for the user. Username must be unique within the user pool. It must be a UTF-8 string between 1 and 128 characters. You can't change the username. 
     */
    private String Username;

    /**
     * Specifies the action you'd like to take for the message. Valid values are RESEND and SUPPRESS. 
     */
    private String MessageAction;

    /**
     * Specifies how the welcome message will be sent. For email, specify EMAIL. To use a phone number, specify SMS. You can specify more than one value. The default value is SMS. 
     */
    private String DesiredDeliveryMediums;

    /**
     * Use this parameter only if the phone_number_verified attribute or the email_verified attribute is set to True. Otherwise, it is ignored. The default value is False. 
     */
    private String ForceAliasCreation;

    /**
     * A list of name-value pairs that contain user attributes and attribute values to be set for the user that you are creating. You can create a user without specifying any attributes other than Username. However, any attributes that you specify as required (in CreateUserPool or in the Attributes tab of the console) must be supplied either by you (in your call to AdminCreateUser) or by the user (when signing up in response to your welcome message). 
     */
    private String UserAttributes;

    /**
     * @return the ValidationData
     */
    public String getValidationData() {
        return ValidationData;
    }

    /**
     * @param ValidationData the ValidationData to set
     */
    public void setValidationData(String ValidationData) {
	this.ValidationData = ValidationData;
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
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
	this.Username = Username;
    }

    /**
     * @return the MessageAction
     */
    public String getMessageAction() {
        return MessageAction;
    }

    /**
     * @param MessageAction the MessageAction to set
     */
    public void setMessageAction(String MessageAction) {
	this.MessageAction = MessageAction;
    }

    /**
     * @return the DesiredDeliveryMediums
     */
    public String getDesiredDeliveryMediums() {
        return DesiredDeliveryMediums;
    }

    /**
     * @param DesiredDeliveryMediums the DesiredDeliveryMediums to set
     */
    public void setDesiredDeliveryMediums(String DesiredDeliveryMediums) {
	this.DesiredDeliveryMediums = DesiredDeliveryMediums;
    }

    /**
     * @return the ForceAliasCreation
     */
    public String getForceAliasCreation() {
        return ForceAliasCreation;
    }

    /**
     * @param ForceAliasCreation the ForceAliasCreation to set
     */
    public void setForceAliasCreation(String ForceAliasCreation) {
	this.ForceAliasCreation = ForceAliasCreation;
    }

    /**
     * @return the UserAttributes
     */
    public String getUserAttributes() {
        return UserAttributes;
    }

    /**
     * @param UserAttributes the UserAttributes to set
     */
    public void setUserAttributes(String UserAttributes) {
	this.UserAttributes = UserAttributes;
    }


}