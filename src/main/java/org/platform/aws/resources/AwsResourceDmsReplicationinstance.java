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
public class AwsResourceDmsReplicationinstance {

    /**
     * Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
     */
    private String ;

    /**
     * The engine version number of the replication instance. 
     */
    private String EngineVersion;

    /**
     * A name for the replication instance. If you specify a name, AWS CloudFormation converts it to lower case. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the replication instance identifier. For more information, see Name Type. 
     */
    private String ReplicationInstanceIdentifier;

    /**
     * The KMS key identifier that will be used to encrypt the content on the replication instance. If you do not specify a value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region. 
     */
    private String KmsKeyId;

    /**
     * The EC2 Availability Zone that the replication instance will be created in. The default value is a random, system-chosen Availability Zone in the endpoint's region. 
     */
    private String AvailabilityZone;

    /**
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). 
     */
    private String PreferredMaintenanceWindow;

    /**
     * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * A subnet group to associate with the replication instance. 
     */
    private String ReplicationSubnetGroupIdentifier;

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the replication instance. 
     */
    private String AllocatedStorage;

    /**
     * Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true . 
     */
    private String PubliclyAccessible;

    /**
     * The compute and memory capacity of the replication instance as specified by the replication instance class. 
     */
    private String ReplicationInstanceClass;

    /**
     * Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the MultiAZ parameter is set to true . 
     */
    private String MultiAZ;

    /**
     * The tags that you want to attach to the DMS endpoint. 
     */
    private String Tags;

    /**
     * @return the 
     */
    public String get() {
        return ;
    }

    /**
     * @param  the  to set
     */
    public void set(String ) {
	this. = ;
    }

    /**
     * @return the EngineVersion
     */
    public String getEngineVersion() {
        return EngineVersion;
    }

    /**
     * @param EngineVersion the EngineVersion to set
     */
    public void setEngineVersion(String EngineVersion) {
	this.EngineVersion = EngineVersion;
    }

    /**
     * @return the ReplicationInstanceIdentifier
     */
    public String getReplicationInstanceIdentifier() {
        return ReplicationInstanceIdentifier;
    }

    /**
     * @param ReplicationInstanceIdentifier the ReplicationInstanceIdentifier to set
     */
    public void setReplicationInstanceIdentifier(String ReplicationInstanceIdentifier) {
	this.ReplicationInstanceIdentifier = ReplicationInstanceIdentifier;
    }

    /**
     * @return the KmsKeyId
     */
    public String getKmsKeyId() {
        return KmsKeyId;
    }

    /**
     * @param KmsKeyId the KmsKeyId to set
     */
    public void setKmsKeyId(String KmsKeyId) {
	this.KmsKeyId = KmsKeyId;
    }

    /**
     * @return the AvailabilityZone
     */
    public String getAvailabilityZone() {
        return AvailabilityZone;
    }

    /**
     * @param AvailabilityZone the AvailabilityZone to set
     */
    public void setAvailabilityZone(String AvailabilityZone) {
	this.AvailabilityZone = AvailabilityZone;
    }

    /**
     * @return the PreferredMaintenanceWindow
     */
    public String getPreferredMaintenanceWindow() {
        return PreferredMaintenanceWindow;
    }

    /**
     * @param PreferredMaintenanceWindow the PreferredMaintenanceWindow to set
     */
    public void setPreferredMaintenanceWindow(String PreferredMaintenanceWindow) {
	this.PreferredMaintenanceWindow = PreferredMaintenanceWindow;
    }

    /**
     * @return the AutoMinorVersionUpgrade
     */
    public String getAutoMinorVersionUpgrade() {
        return AutoMinorVersionUpgrade;
    }

    /**
     * @param AutoMinorVersionUpgrade the AutoMinorVersionUpgrade to set
     */
    public void setAutoMinorVersionUpgrade(String AutoMinorVersionUpgrade) {
	this.AutoMinorVersionUpgrade = AutoMinorVersionUpgrade;
    }

    /**
     * @return the ReplicationSubnetGroupIdentifier
     */
    public String getReplicationSubnetGroupIdentifier() {
        return ReplicationSubnetGroupIdentifier;
    }

    /**
     * @param ReplicationSubnetGroupIdentifier the ReplicationSubnetGroupIdentifier to set
     */
    public void setReplicationSubnetGroupIdentifier(String ReplicationSubnetGroupIdentifier) {
	this.ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier;
    }

    /**
     * @return the AllocatedStorage
     */
    public String getAllocatedStorage() {
        return AllocatedStorage;
    }

    /**
     * @param AllocatedStorage the AllocatedStorage to set
     */
    public void setAllocatedStorage(String AllocatedStorage) {
	this.AllocatedStorage = AllocatedStorage;
    }

    /**
     * @return the PubliclyAccessible
     */
    public String getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    /**
     * @param PubliclyAccessible the PubliclyAccessible to set
     */
    public void setPubliclyAccessible(String PubliclyAccessible) {
	this.PubliclyAccessible = PubliclyAccessible;
    }

    /**
     * @return the ReplicationInstanceClass
     */
    public String getReplicationInstanceClass() {
        return ReplicationInstanceClass;
    }

    /**
     * @param ReplicationInstanceClass the ReplicationInstanceClass to set
     */
    public void setReplicationInstanceClass(String ReplicationInstanceClass) {
	this.ReplicationInstanceClass = ReplicationInstanceClass;
    }

    /**
     * @return the MultiAZ
     */
    public String getMultiAZ() {
        return MultiAZ;
    }

    /**
     * @param MultiAZ the MultiAZ to set
     */
    public void setMultiAZ(String MultiAZ) {
	this.MultiAZ = MultiAZ;
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


}