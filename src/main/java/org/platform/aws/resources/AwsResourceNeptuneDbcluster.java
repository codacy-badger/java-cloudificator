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
public class AwsResourceNeptuneDbcluster {

    /**
     * Indicates whether the DB instances in the cluster are encrypted. 
     */
    private String StorageEncrypted;

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) master key that is used to encrypt the database instances in the DB cluster, such as arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef. If you enable the StorageEncrypted property but don't specify this property, the default master key is used. If you specify this property, you must set the StorageEncrypted property to true. 
     */
    private String KmsKeyId;

    /**
     * A list of Availability Zones in which DB instances in the cluster can be created. 
     */
    private String AvailabilityZones;

    /**
     * The identifier for the DB cluster snapshot from which you want to restore. 
     */
    private String SnapshotIdentifier;

    /**
     * The port number on which the DB instances in the cluster can accept connections. 
     */
    private String Port;

    /**
     * The DB cluster identifier. This parameter is stored as a lowercase string. 
     */
    private String DBClusterIdentifier;

    /**
     * The weekly time range (in UTC) during which system maintenance can occur. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * Enable IAM authentication and authorization on this cluster. 
     */
    private String IamAuthEnabled;

    /**
     * A DB subnet group that you want to associate with this DB cluster. 
     */
    private String DBSubnetGroupName;

    /**
     * If automated backups are enabled (see the BackupRetentionPeriod property), the daily time range in UTC during which you want to create automated backups. 
     */
    private String PreferredBackupWindow;

    /**
     * A list of VPC security groups to associate with this DB cluster. 
     */
    private String VpcSecurityGroupIds;

    /**
     * The name of the DB cluster parameter group to associate with this DB cluster. 
     */
    private String DBClusterParameterGroupName;

    /**
     * The number of days for which automatic backups are retained. For more information, see CreateDBCluster in the Amazon Neptune User Guide. 
     */
    private String BackupRetentionPeriod;

    /**
     * The tags that you want to attach to this DB cluster. 
     */
    private String Tags;

    /**
     * @return the StorageEncrypted
     */
    public String getStorageEncrypted() {
        return StorageEncrypted;
    }

    /**
     * @param StorageEncrypted the StorageEncrypted to set
     */
    public void setStorageEncrypted(String StorageEncrypted) {
	this.StorageEncrypted = StorageEncrypted;
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
     * @return the AvailabilityZones
     */
    public String getAvailabilityZones() {
        return AvailabilityZones;
    }

    /**
     * @param AvailabilityZones the AvailabilityZones to set
     */
    public void setAvailabilityZones(String AvailabilityZones) {
	this.AvailabilityZones = AvailabilityZones;
    }

    /**
     * @return the SnapshotIdentifier
     */
    public String getSnapshotIdentifier() {
        return SnapshotIdentifier;
    }

    /**
     * @param SnapshotIdentifier the SnapshotIdentifier to set
     */
    public void setSnapshotIdentifier(String SnapshotIdentifier) {
	this.SnapshotIdentifier = SnapshotIdentifier;
    }

    /**
     * @return the Port
     */
    public String getPort() {
        return Port;
    }

    /**
     * @param Port the Port to set
     */
    public void setPort(String Port) {
	this.Port = Port;
    }

    /**
     * @return the DBClusterIdentifier
     */
    public String getDBClusterIdentifier() {
        return DBClusterIdentifier;
    }

    /**
     * @param DBClusterIdentifier the DBClusterIdentifier to set
     */
    public void setDBClusterIdentifier(String DBClusterIdentifier) {
	this.DBClusterIdentifier = DBClusterIdentifier;
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
     * @return the IamAuthEnabled
     */
    public String getIamAuthEnabled() {
        return IamAuthEnabled;
    }

    /**
     * @param IamAuthEnabled the IamAuthEnabled to set
     */
    public void setIamAuthEnabled(String IamAuthEnabled) {
	this.IamAuthEnabled = IamAuthEnabled;
    }

    /**
     * @return the DBSubnetGroupName
     */
    public String getDBSubnetGroupName() {
        return DBSubnetGroupName;
    }

    /**
     * @param DBSubnetGroupName the DBSubnetGroupName to set
     */
    public void setDBSubnetGroupName(String DBSubnetGroupName) {
	this.DBSubnetGroupName = DBSubnetGroupName;
    }

    /**
     * @return the PreferredBackupWindow
     */
    public String getPreferredBackupWindow() {
        return PreferredBackupWindow;
    }

    /**
     * @param PreferredBackupWindow the PreferredBackupWindow to set
     */
    public void setPreferredBackupWindow(String PreferredBackupWindow) {
	this.PreferredBackupWindow = PreferredBackupWindow;
    }

    /**
     * @return the VpcSecurityGroupIds
     */
    public String getVpcSecurityGroupIds() {
        return VpcSecurityGroupIds;
    }

    /**
     * @param VpcSecurityGroupIds the VpcSecurityGroupIds to set
     */
    public void setVpcSecurityGroupIds(String VpcSecurityGroupIds) {
	this.VpcSecurityGroupIds = VpcSecurityGroupIds;
    }

    /**
     * @return the DBClusterParameterGroupName
     */
    public String getDBClusterParameterGroupName() {
        return DBClusterParameterGroupName;
    }

    /**
     * @param DBClusterParameterGroupName the DBClusterParameterGroupName to set
     */
    public void setDBClusterParameterGroupName(String DBClusterParameterGroupName) {
	this.DBClusterParameterGroupName = DBClusterParameterGroupName;
    }

    /**
     * @return the BackupRetentionPeriod
     */
    public String getBackupRetentionPeriod() {
        return BackupRetentionPeriod;
    }

    /**
     * @param BackupRetentionPeriod the BackupRetentionPeriod to set
     */
    public void setBackupRetentionPeriod(String BackupRetentionPeriod) {
	this.BackupRetentionPeriod = BackupRetentionPeriod;
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