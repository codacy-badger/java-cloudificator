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
public class AwsResourceGuarddutyMaster {

    /**
     * The detector ID of the AWS account that is accepting an invitation to become a GuardDuty member account. 
     */
    private String DetectorId;

    /**
     * The account ID of the master GuardDuty account whose invitation you're accepting. 
     */
    private String MasterId;

    /**
     * The ID of the invitation that is sent to the AWS account by the GuardDuty master account. There are several ways to retrieve the invitationId: 
     */
    private String InvitationId;

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

    /**
     * @return the MasterId
     */
    public String getMasterId() {
        return MasterId;
    }

    /**
     * @param MasterId the MasterId to set
     */
    public void setMasterId(String MasterId) {
	this.MasterId = MasterId;
    }

    /**
     * @return the InvitationId
     */
    public String getInvitationId() {
        return InvitationId;
    }

    /**
     * @param InvitationId the InvitationId to set
     */
    public void setInvitationId(String InvitationId) {
	this.InvitationId = InvitationId;
    }


}