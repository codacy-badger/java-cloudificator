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
public class AwsResourceDmsReplicationtask {

    /**
     * Settings for the task, such as target metadata settings. For a complete list of task settings, see Task Settings for AWS Database Migration Service Tasks in the AWS Database Migration Service User Guide. 
     */
    private String ReplicationTaskSettings;

    /**
     * The JSON that contains additional parameter values. 
     */
    private String TableMappings;

    /**
     * The ARN string that uniquely identifies the endpoint. 
     */
    private String ReplicationTaskIdentifier;

    /**
     * The ARN string that uniquely identifies the endpoint. 
     */
    private String SourceEndpointArn;

    /**
     * The migration type. 
     */
    private String MigrationType;

    /**
     * The Amazon Resource Name (ARN) of the replication instance. 
     */
    private String ReplicationInstanceArn;

    /**
     * The ARN string that uniquely identifies the endpoint. 
     */
    private String TargetEndpointArn;

    /**
     * The tags that you want to attach to the migration task. 
     */
    private String Tags;

    /**
     * The start time for the Change Data Capture (CDC) operation. 
     */
    private String CdcStartTime;

    /**
     * @return the ReplicationTaskSettings
     */
    public String getReplicationTaskSettings() {
        return ReplicationTaskSettings;
    }

    /**
     * @param ReplicationTaskSettings the ReplicationTaskSettings to set
     */
    public void setReplicationTaskSettings(String ReplicationTaskSettings) {
	this.ReplicationTaskSettings = ReplicationTaskSettings;
    }

    /**
     * @return the TableMappings
     */
    public String getTableMappings() {
        return TableMappings;
    }

    /**
     * @param TableMappings the TableMappings to set
     */
    public void setTableMappings(String TableMappings) {
	this.TableMappings = TableMappings;
    }

    /**
     * @return the ReplicationTaskIdentifier
     */
    public String getReplicationTaskIdentifier() {
        return ReplicationTaskIdentifier;
    }

    /**
     * @param ReplicationTaskIdentifier the ReplicationTaskIdentifier to set
     */
    public void setReplicationTaskIdentifier(String ReplicationTaskIdentifier) {
	this.ReplicationTaskIdentifier = ReplicationTaskIdentifier;
    }

    /**
     * @return the SourceEndpointArn
     */
    public String getSourceEndpointArn() {
        return SourceEndpointArn;
    }

    /**
     * @param SourceEndpointArn the SourceEndpointArn to set
     */
    public void setSourceEndpointArn(String SourceEndpointArn) {
	this.SourceEndpointArn = SourceEndpointArn;
    }

    /**
     * @return the MigrationType
     */
    public String getMigrationType() {
        return MigrationType;
    }

    /**
     * @param MigrationType the MigrationType to set
     */
    public void setMigrationType(String MigrationType) {
	this.MigrationType = MigrationType;
    }

    /**
     * @return the ReplicationInstanceArn
     */
    public String getReplicationInstanceArn() {
        return ReplicationInstanceArn;
    }

    /**
     * @param ReplicationInstanceArn the ReplicationInstanceArn to set
     */
    public void setReplicationInstanceArn(String ReplicationInstanceArn) {
	this.ReplicationInstanceArn = ReplicationInstanceArn;
    }

    /**
     * @return the TargetEndpointArn
     */
    public String getTargetEndpointArn() {
        return TargetEndpointArn;
    }

    /**
     * @param TargetEndpointArn the TargetEndpointArn to set
     */
    public void setTargetEndpointArn(String TargetEndpointArn) {
	this.TargetEndpointArn = TargetEndpointArn;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }

    /**
     * @return the CdcStartTime
     */
    public String getCdcStartTime() {
        return CdcStartTime;
    }

    /**
     * @param CdcStartTime the CdcStartTime to set
     */
    public void setCdcStartTime(String CdcStartTime) {
	this.CdcStartTime = CdcStartTime;
    }


}