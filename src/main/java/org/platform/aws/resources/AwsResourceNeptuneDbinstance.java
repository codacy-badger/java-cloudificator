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
public class AwsResourceNeptuneDbinstance {

    /**
     * Indicates whether the DB instance is encrypted. 
     */
    private String StorageEncrypted;

    /**
     * The name of an existing DB parameter group or a reference to an AWS::Neptune::DBParameterGroup resource created in the template. 
     */
    private String DBParameterGroupName;

    /**
     * The name of the compute and memory capacity classes of the DB instance. 
     */
    private String DBInstanceClass;

    /**
     * Required: No 
     */
    private String AllowMajorVersionUpgrade;

    /**
     * The name of an existing DB cluster that this instance is associated with. 
     */
    private String DBClusterIdentifier;

    /**
     * The name of the Availability Zone where the DB instance is located. You can't set the AvailabilityZone parameter if the MultiAZ parameter is set to true. 
     */
    private String AvailabilityZone;

    /**
     * The weekly time range (in UTC) during which system maintenance can occur. For valid values, see the PreferredMaintenanceWindow parameter for the CreateDBInstance action in the Amazon Neptune User Guide. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the maintenance window. The default value is true. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * A DB subnet group to associate with the DB instance. If you update this value, the new subnet group must be a subnet group in a new virtual private cloud (VPC). 
     */
    private String DBSubnetGroupName;

    /**
     * A name for the DB instance. If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance. For more information, see Name Type. 
     */
    private String DBInstanceIdentifier;

    /**
     * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB instance. If you're restoring from a shared manual DB snapshot, you must specify the ARN of the snapshot. 
     */
    private String DBSnapshotIdentifier;

    /**
     * An arbitrary set of tags (key–value pairs) for this DB instance. 
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
     * @return the DBParameterGroupName
     */
    public String getDBParameterGroupName() {
        return DBParameterGroupName;
    }

    /**
     * @param DBParameterGroupName the DBParameterGroupName to set
     */
    public void setDBParameterGroupName(String DBParameterGroupName) {
	this.DBParameterGroupName = DBParameterGroupName;
    }

    /**
     * @return the DBInstanceClass
     */
    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    /**
     * @param DBInstanceClass the DBInstanceClass to set
     */
    public void setDBInstanceClass(String DBInstanceClass) {
	this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * @return the AllowMajorVersionUpgrade
     */
    public String getAllowMajorVersionUpgrade() {
        return AllowMajorVersionUpgrade;
    }

    /**
     * @param AllowMajorVersionUpgrade the AllowMajorVersionUpgrade to set
     */
    public void setAllowMajorVersionUpgrade(String AllowMajorVersionUpgrade) {
	this.AllowMajorVersionUpgrade = AllowMajorVersionUpgrade;
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
     * @return the DBInstanceIdentifier
     */
    public String getDBInstanceIdentifier() {
        return DBInstanceIdentifier;
    }

    /**
     * @param DBInstanceIdentifier the DBInstanceIdentifier to set
     */
    public void setDBInstanceIdentifier(String DBInstanceIdentifier) {
	this.DBInstanceIdentifier = DBInstanceIdentifier;
    }

    /**
     * @return the DBSnapshotIdentifier
     */
    public String getDBSnapshotIdentifier() {
        return DBSnapshotIdentifier;
    }

    /**
     * @param DBSnapshotIdentifier the DBSnapshotIdentifier to set
     */
    public void setDBSnapshotIdentifier(String DBSnapshotIdentifier) {
	this.DBSnapshotIdentifier = DBSnapshotIdentifier;
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