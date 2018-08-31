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
public class AwsPropertiesRdsDatabaseInstance {

    /**
     * Indicates whether the DB instance is encrypted. 
     */
    private String StorageEncrypted;

    /**
     * The time zone of the DB instance, which you can specify to match the time zone of your applications. To see which engines support time zones, see the Timezone parameter for the CreateDBInstance action in the Amazon RDS API Reference. 
     */
    private String Timezone;

    /**
     * For supported engines, specifies the character set to associate with the DB instance. For more information, see Appendix: Oracle Character Sets Supported in Amazon RDS in the Amazon RDS User Guide. 
     */
    private String CharacterSetName;

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that permits Amazon RDS to send enhanced monitoring metrics to Amazon CloudWatch, for example, arn:aws:iam::123456789012:role/emaccess. For information on creating a monitoring role, see To create an IAM role for Amazon RDS Enhanced Monitoring in the Amazon RDS User Guide. 
     */
    private String MonitoringRoleArn;

    /**
     * The port for the instance. 
     */
    private String Port;

    /**
     * The name of an existing DB cluster that this instance is associated with. If you specify this property, specify aurora for the Engine property and don't specify any of the following properties: AllocatedStorage, BackupRetentionPeriod, CharacterSetName, DBName, DBSecurityGroups, MasterUsername, MasterUserPassword, OptionGroupName, PreferredBackupWindow, PreferredMaintenanceWindow, Port, SourceDBInstanceIdentifier, StorageType, or VPCSecurityGroups. 
     */
    private String DBClusterIdentifier;

    /**
     * The daily time range during which automated backups are performed if automated backups are enabled, as determined by the BackupRetentionPeriod property. For valid values, see the PreferredBackupWindow parameter for the CreateDBInstance action in the Amazon RDS API Reference. 
     */
    private String PreferredBackupWindow;

    /**
     * The interval, in seconds, between points when Amazon RDS collects enhanced monitoring metrics for the DB instance. To disable metrics collection, specify 0. 
     */
    private String MonitoringInterval;

    /**
     * The name of an existing DB parameter group or a reference to an AWS::RDS::DBParameterGroup resource created in the template. 
     */
    private String DBParameterGroupName;

    /**
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. By default, Amazon RDS doesn't copy tags to snapshots. Amazon RDS doesn't copy tags with the aws:: prefix unless it's the DB instance's final snapshot (the snapshot when you delete the DB instance). 
     */
    private String CopyTagsToSnapshot;

    /**
     * Specifies if the database instance is a multiple Availability Zone deployment. You can't set the AvailabilityZone parameter if the MultiAZ parameter is set to true. Amazon Aurora storage is replicated across all the Availability Zones and doesn't require the MultiAZ option to be set. 
     */
    private String MultiAZ;

    /**
     * The name of an IAM role that Amazon RDS uses when calling the AWS Directory Service APIs. 
     */
    private String DomainIAMRoleName;

    /**
     * The database engine that the DB instance uses. This property is optional when you specify the DBSnapshotIdentifier property to create DB instances. 
     */
    private String Engine;

    /**
     * An arbitrary set of tags (key–value pairs) for this DB instance. 
     */
    private String Tags;

    /**
     * The license model of the DB instance. 
     */
    private String LicenseModel;

    /**
     * If you want to create a read replica DB instance, specify the ID of the source DB instance. Each DB instance can have a limited number of read replicas. For more information, see Working with Read Replicas in the Amazon Relational Database Service Developer Guide. 
     */
    private String SourceDBInstanceIdentifier;

    /**
     * The version number of the database engine that the DB instance uses. 
     */
    private String EngineVersion;

    /**
     * The storage type associated with this DB instance. 
     */
    private String StorageType;

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) master key that's used to encrypt the DB instance, such as arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef. If you enable the StorageEncrypted property but don't specify this property, AWS CloudFormation uses the default master key. If you specify this property, you must set the StorageEncrypted property to true. 
     */
    private String KmsKeyId;

    /**
     * The name of the compute and memory capacity classes of the DB instance. 
     */
    private String DBInstanceClass;

    /**
     * The name of the Availability Zone where the DB instance is located. You can't set the AvailabilityZone parameter if the MultiAZ parameter is set to true. 
     */
    private String AvailabilityZone;

    /**
     * The option group that this DB instance is associated with. 
     */
    private String OptionGroupName;

    /**
     * The weekly time range (in UTC) during which system maintenance can occur. For valid values, see the PreferredMaintenanceWindow parameter for the CreateDBInstance action in the Amazon RDS API Reference. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * Indicates that minor engine upgrades are applied automatically to the DB instance during the maintenance window. The default value is true. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * A DB subnet group to associate with the DB instance. If you update this value, the new subnet group must be a subnet group in a new VPC. 
     */
    private String DBSubnetGroupName;

    /**
     * The number of I/O operations per second (IOPS) that the database provisions. The value must be equal to or greater than 1000. 
     */
    private String Iops;

    /**
     * The ID of the region that contains the source DB instance for the read replica. 
     */
    private String SourceRegion;

    /**
     * A name for the DB instance. If you specify a name, AWS CloudFormation converts it to lowercase. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the DB instance. For more information, see Name Type. 
     */
    private String DBInstanceIdentifier;

    /**
     * The allocated storage size, specified in gigabytes (GB). 
     */
    private String AllocatedStorage;

    /**
     * The master password for the DB instance. 
     */
    private String MasterUserPassword;

    /**
     * A list of the VPC security group IDs to assign to the DB instance. The list can include both the physical IDs of existing VPC security groups and references to AWS::EC2::SecurityGroup resources created in the template. 
     */
    private String VPCSecurityGroups;

    /**
     * If you update the EngineVersion property to a version that's different from the DB instance's current major version, set this property to true. For more information, see ModifyDBInstance in the Amazon RDS API Reference. 
     */
    private String AllowMajorVersionUpgrade;

    /**
     * A list of the DB security groups to assign to the DB instance. The list can include both the name of existing DB security groups or references to AWS::RDS::DBSecurityGroup resources created in the template. 
     */
    private String DBSecurityGroups;

    /**
     * The master user name for the DB instance. 
     */
    private String MasterUsername;

    /**
     * The name of the DB instance that was provided at the time of creation, if one was specified. This same name is returned for the life of the DB instance. 
     */
    private String DBName;

    /**
     * The number of days during which automatic DB snapshots are retained. 
     */
    private String BackupRetentionPeriod;

    /**
     * Indicates whether the DB instance is an internet-facing instance. If you specify true, AWS CloudFormation creates an instance with a publicly resolvable DNS name, which resolves to a public IP address. If you specify false, AWS CloudFormation creates an internal instance with a DNS name that resolves to a private IP address. 
     */
    private String PubliclyAccessible;

    /**
     * For an Amazon RDS DB instance that's running Microsoft SQL Server, the Active Directory directory ID to create the instance in. Amazon RDS uses Windows Authentication to authenticate users that connect to the DB instance. For more information, see Using Windows Authentication with an Amazon RDS DB Instance Running Microsoft SQL Server in the Amazon RDS User Guide. 
     */
    private String Domain;

    /**
     * The name or Amazon Resource Name (ARN) of the DB snapshot that's used to restore the DB instance. If you're restoring from a shared manual DB snapshot, you must specify the ARN of the snapshot. 
     */
    private String DBSnapshotIdentifier;

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
     * @return the Timezone
     */
    public String getTimezone() {
        return Timezone;
    }

    /**
     * @param Timezone the Timezone to set
     */
    public void setTimezone(String Timezone) {
	this.Timezone = Timezone;
    }

    /**
     * @return the CharacterSetName
     */
    public String getCharacterSetName() {
        return CharacterSetName;
    }

    /**
     * @param CharacterSetName the CharacterSetName to set
     */
    public void setCharacterSetName(String CharacterSetName) {
	this.CharacterSetName = CharacterSetName;
    }

    /**
     * @return the MonitoringRoleArn
     */
    public String getMonitoringRoleArn() {
        return MonitoringRoleArn;
    }

    /**
     * @param MonitoringRoleArn the MonitoringRoleArn to set
     */
    public void setMonitoringRoleArn(String MonitoringRoleArn) {
	this.MonitoringRoleArn = MonitoringRoleArn;
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
     * @return the MonitoringInterval
     */
    public String getMonitoringInterval() {
        return MonitoringInterval;
    }

    /**
     * @param MonitoringInterval the MonitoringInterval to set
     */
    public void setMonitoringInterval(String MonitoringInterval) {
	this.MonitoringInterval = MonitoringInterval;
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
     * @return the CopyTagsToSnapshot
     */
    public String getCopyTagsToSnapshot() {
        return CopyTagsToSnapshot;
    }

    /**
     * @param CopyTagsToSnapshot the CopyTagsToSnapshot to set
     */
    public void setCopyTagsToSnapshot(String CopyTagsToSnapshot) {
	this.CopyTagsToSnapshot = CopyTagsToSnapshot;
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
     * @return the DomainIAMRoleName
     */
    public String getDomainIAMRoleName() {
        return DomainIAMRoleName;
    }

    /**
     * @param DomainIAMRoleName the DomainIAMRoleName to set
     */
    public void setDomainIAMRoleName(String DomainIAMRoleName) {
	this.DomainIAMRoleName = DomainIAMRoleName;
    }

    /**
     * @return the Engine
     */
    public String getEngine() {
        return Engine;
    }

    /**
     * @param Engine the Engine to set
     */
    public void setEngine(String Engine) {
	this.Engine = Engine;
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
     * @return the LicenseModel
     */
    public String getLicenseModel() {
        return LicenseModel;
    }

    /**
     * @param LicenseModel the LicenseModel to set
     */
    public void setLicenseModel(String LicenseModel) {
	this.LicenseModel = LicenseModel;
    }

    /**
     * @return the SourceDBInstanceIdentifier
     */
    public String getSourceDBInstanceIdentifier() {
        return SourceDBInstanceIdentifier;
    }

    /**
     * @param SourceDBInstanceIdentifier the SourceDBInstanceIdentifier to set
     */
    public void setSourceDBInstanceIdentifier(String SourceDBInstanceIdentifier) {
	this.SourceDBInstanceIdentifier = SourceDBInstanceIdentifier;
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
     * @return the StorageType
     */
    public String getStorageType() {
        return StorageType;
    }

    /**
     * @param StorageType the StorageType to set
     */
    public void setStorageType(String StorageType) {
	this.StorageType = StorageType;
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
     * @return the OptionGroupName
     */
    public String getOptionGroupName() {
        return OptionGroupName;
    }

    /**
     * @param OptionGroupName the OptionGroupName to set
     */
    public void setOptionGroupName(String OptionGroupName) {
	this.OptionGroupName = OptionGroupName;
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
     * @return the Iops
     */
    public String getIops() {
        return Iops;
    }

    /**
     * @param Iops the Iops to set
     */
    public void setIops(String Iops) {
	this.Iops = Iops;
    }

    /**
     * @return the SourceRegion
     */
    public String getSourceRegion() {
        return SourceRegion;
    }

    /**
     * @param SourceRegion the SourceRegion to set
     */
    public void setSourceRegion(String SourceRegion) {
	this.SourceRegion = SourceRegion;
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
     * @return the MasterUserPassword
     */
    public String getMasterUserPassword() {
        return MasterUserPassword;
    }

    /**
     * @param MasterUserPassword the MasterUserPassword to set
     */
    public void setMasterUserPassword(String MasterUserPassword) {
	this.MasterUserPassword = MasterUserPassword;
    }

    /**
     * @return the VPCSecurityGroups
     */
    public String getVPCSecurityGroups() {
        return VPCSecurityGroups;
    }

    /**
     * @param VPCSecurityGroups the VPCSecurityGroups to set
     */
    public void setVPCSecurityGroups(String VPCSecurityGroups) {
	this.VPCSecurityGroups = VPCSecurityGroups;
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
     * @return the DBSecurityGroups
     */
    public String getDBSecurityGroups() {
        return DBSecurityGroups;
    }

    /**
     * @param DBSecurityGroups the DBSecurityGroups to set
     */
    public void setDBSecurityGroups(String DBSecurityGroups) {
	this.DBSecurityGroups = DBSecurityGroups;
    }

    /**
     * @return the MasterUsername
     */
    public String getMasterUsername() {
        return MasterUsername;
    }

    /**
     * @param MasterUsername the MasterUsername to set
     */
    public void setMasterUsername(String MasterUsername) {
	this.MasterUsername = MasterUsername;
    }

    /**
     * @return the DBName
     */
    public String getDBName() {
        return DBName;
    }

    /**
     * @param DBName the DBName to set
     */
    public void setDBName(String DBName) {
	this.DBName = DBName;
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
     * @return the Domain
     */
    public String getDomain() {
        return Domain;
    }

    /**
     * @param Domain the Domain to set
     */
    public void setDomain(String Domain) {
	this.Domain = Domain;
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


}