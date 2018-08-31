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
public class AwsPropertiesRoute53Recordsetgroup {

    /**
     * Any comments you want to include about the hosted zone. 
     */
    private String Comment;

    /**
     * The name of the domain for the hosted zone where you want to add the record set. 
     */
    private String HostedZoneName;

    /**
     * The ID of the hosted zone. 
     */
    private String HostedZoneId;

    /**
     * List of resource record sets to add. The maximum number of records is 1,000. 
     */
    private String RecordSets;

    /**
     * @return the Comment
     */
    public String getComment() {
        return Comment;
    }

    /**
     * @param Comment the Comment to set
     */
    public void setComment(String Comment) {
	this.Comment = Comment;
    }

    /**
     * @return the HostedZoneName
     */
    public String getHostedZoneName() {
        return HostedZoneName;
    }

    /**
     * @param HostedZoneName the HostedZoneName to set
     */
    public void setHostedZoneName(String HostedZoneName) {
	this.HostedZoneName = HostedZoneName;
    }

    /**
     * @return the HostedZoneId
     */
    public String getHostedZoneId() {
        return HostedZoneId;
    }

    /**
     * @param HostedZoneId the HostedZoneId to set
     */
    public void setHostedZoneId(String HostedZoneId) {
	this.HostedZoneId = HostedZoneId;
    }

    /**
     * @return the RecordSets
     */
    public String getRecordSets() {
        return RecordSets;
    }

    /**
     * @param RecordSets the RecordSets to set
     */
    public void setRecordSets(String RecordSets) {
	this.RecordSets = RecordSets;
    }


}