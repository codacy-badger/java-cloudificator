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
public class AwsResourceGuarddutyMember {

    /**
     * You can use this property to update the status of the relationship between the member account and its master account. Valid values are CREATED | INVITED | DISABLED | ENABLED | REMOVED | RESIGNED. If the value for this property is not provided or set to CREATED, a member account is only created. If the value of this property is set to INVITED, a member account is created and invited. 
     */
    private String Status;

    /**
     * The account ID of the member GuardDuty account. 
     */
    private String MemberId;

    /**
     * The email address of the GuardDuty member account. 
     */
    private String Email;

    /**
     * The invitation message that you want to send to the account that you invite to GuardDuty as a member. 
     */
    private String Message;

    /**
     * Specifies whether an email notification is sent to the accounts that you want to invite to GuardDuty as members. When set to 'True', email notification is not sent to the invitees. 
     */
    private String DisableEmailNotification;

    /**
     * The unique ID of the detector in a GuardDuty master account. 
     */
    private String DetectorId;

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
	this.Status = Status;
    }

    /**
     * @return the MemberId
     */
    public String getMemberId() {
        return MemberId;
    }

    /**
     * @param MemberId the MemberId to set
     */
    public void setMemberId(String MemberId) {
	this.MemberId = MemberId;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
	this.Email = Email;
    }

    /**
     * @return the Message
     */
    public String getMessage() {
        return Message;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
	this.Message = Message;
    }

    /**
     * @return the DisableEmailNotification
     */
    public String getDisableEmailNotification() {
        return DisableEmailNotification;
    }

    /**
     * @param DisableEmailNotification the DisableEmailNotification to set
     */
    public void setDisableEmailNotification(String DisableEmailNotification) {
	this.DisableEmailNotification = DisableEmailNotification;
    }

    /**
     * @return the DetectorId
     */
    public String getDetectorId() {
        return DetectorId;
    }

    /**
     * @param DetectorId the DetectorId to set
     */
    public void setDetectorId(String DetectorId) {
	this.DetectorId = DetectorId;
    }


}