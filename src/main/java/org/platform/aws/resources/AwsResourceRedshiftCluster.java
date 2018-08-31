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
public class AwsResourceRedshiftCluster {

    /**
     * Specifies the name of the hardware security module (HSM) client certificate that the Amazon Redshift cluster uses to retrieve the data encryption keys stored in an HSM. 
     */
    private String HsmClientCertificateIdentifier;

    /**
     * The Elastic IP (EIP) address for the cluster. 
     */
    private String ElasticIp;

    /**
     * The number of days that automated snapshots are retained. The default value is 1. To disable automated snapshots, set the value to 0. 
     */
    private String AutomatedSnapshotRetentionPeriod;

    /**
     * Indicates whether the data in the cluster is encrypted at rest. The default value is false. 
     */
    private String Encrypted;

    /**
     * The name of the snapshot from which to create a new cluster. 
     */
    private String SnapshotIdentifier;

    /**
     * The port number on which the cluster accepts incoming connections. The default value is 5439. 
     */
    private String Port;

    /**
     * The number of compute nodes in the cluster. If you specify multi-node for the ClusterType parameter, you must specify a number greater than 1. 
     */
    private String NumberOfNodes;

    /**
     * The name of the parameter group that you want to associate with this cluster. 
     */
    private String ClusterParameterGroupName;

    /**
     * When a new version of Amazon Redshift is released, tells whether upgrades can be applied to the engine that is running on the cluster. The upgrades are applied during the maintenance window. The default value is true. 
     */
    private String AllowVersionUpgrade;

    /**
     * A list of VPC security groups that are associated with this cluster. 
     */
    private String VpcSecurityGroupIds;

    /**
     * When you restore from a snapshot from another AWS account, the 12-digit AWS account ID that contains that snapshot. 
     */
    private String OwnerAccount;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this cluster. Use tags to manage your resources. 
     */
    private String Tags;

    /**
     * The name of the cluster that the source snapshot was created from. For more information about restoring from a snapshot, see the RestoreFromClusterSnapshot action in the Amazon Redshift API Reference. 
     */
    private String SnapshotClusterIdentifier;

    /**
     * A list of AWS Identity and Access Management (IAM) roles that the cluster can use to access other AWS services. Supply the IAM roles by their Amazon Resource Name (ARN). You can provide a maximum of 10 IAM roles in a single request. A cluster can have a maximum of 10 IAM roles associated with it at a time. 
     */
    private String IamRoles;

    /**
     * The version of the Amazon Redshift engine that you want to deploy on the cluster. 
     */
    private String ClusterVersion;

    /**
     * The name of the HSM configuration that contains the information that the Amazon Redshift cluster can use to retrieve and store keys in an HSM. 
     */
    private String HsmConfigurationIdentifier;

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that you want to use to encrypt data in the cluster. 
     */
    private String KmsKeyId;

    /**
     * The Amazon Elastic Compute Cloud (Amazon EC2) Availability Zone in which you want to provision your Amazon Redshift cluster. For example, if you have several EC2 instances running in a specific Availability Zone, you might want the cluster to be provisioned in the same zone to decrease network latency. 
     */
    private String AvailabilityZone;

    /**
     * The weekly time range (in UTC) during which automated cluster maintenance can occur. The format of the time range is ddd:hh24:mi-ddd:hh24:mi. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * A list of security groups that you want to associate with this cluster. Applies to EC2-Classic. 
     */
    private String ClusterSecurityGroups;

    /**
     * The type of cluster. Specify single-node or multi-node (default). 
     */
    private String ClusterType;

    /**
     * The unique identifier of the cluster. 
     */
    private String ClusterIdentifier;

    /**
     * The password associated with the master user account for this cluster. 
     */
    private String MasterUserPassword;

    /**
     * The name of a cluster subnet group that you want to associate with this cluster. 
     */
    private String ClusterSubnetGroupName;

    /**
     * Configures Amazon Redshift to create audit log files, containing logging information such as queries and connection attempts, for this cluster. 
     */
    private String LoggingProperties;

    /**
     * The node type that is provisioned for this cluster. 
     */
    private String NodeType;

    /**
     * The user name that is associated with the master user account for this cluster. 
     */
    private String MasterUsername;

    /**
     * The name of the first database that will be created when the cluster is created. 
     */
    private String DBName;

    /**
     * Indicates whether the cluster can be accessed from a public network. 
     */
    private String PubliclyAccessible;

    /**
     * @return the HsmClientCertificateIdentifier
     */
    public String getHsmClientCertificateIdentifier() {
        return HsmClientCertificateIdentifier;
    }

    /**
     * @param HsmClientCertificateIdentifier the HsmClientCertificateIdentifier to set
     */
    public void setHsmClientCertificateIdentifier(String HsmClientCertificateIdentifier) {
	this.HsmClientCertificateIdentifier = HsmClientCertificateIdentifier;
    }

    /**
     * @return the ElasticIp
     */
    public String getElasticIp() {
        return ElasticIp;
    }

    /**
     * @param ElasticIp the ElasticIp to set
     */
    public void setElasticIp(String ElasticIp) {
	this.ElasticIp = ElasticIp;
    }

    /**
     * @return the AutomatedSnapshotRetentionPeriod
     */
    public String getAutomatedSnapshotRetentionPeriod() {
        return AutomatedSnapshotRetentionPeriod;
    }

    /**
     * @param AutomatedSnapshotRetentionPeriod the AutomatedSnapshotRetentionPeriod to set
     */
    public void setAutomatedSnapshotRetentionPeriod(String AutomatedSnapshotRetentionPeriod) {
	this.AutomatedSnapshotRetentionPeriod = AutomatedSnapshotRetentionPeriod;
    }

    /**
     * @return the Encrypted
     */
    public String getEncrypted() {
        return Encrypted;
    }

    /**
     * @param Encrypted the Encrypted to set
     */
    public void setEncrypted(String Encrypted) {
	this.Encrypted = Encrypted;
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
     * @return the NumberOfNodes
     */
    public String getNumberOfNodes() {
        return NumberOfNodes;
    }

    /**
     * @param NumberOfNodes the NumberOfNodes to set
     */
    public void setNumberOfNodes(String NumberOfNodes) {
	this.NumberOfNodes = NumberOfNodes;
    }

    /**
     * @return the ClusterParameterGroupName
     */
    public String getClusterParameterGroupName() {
        return ClusterParameterGroupName;
    }

    /**
     * @param ClusterParameterGroupName the ClusterParameterGroupName to set
     */
    public void setClusterParameterGroupName(String ClusterParameterGroupName) {
	this.ClusterParameterGroupName = ClusterParameterGroupName;
    }

    /**
     * @return the AllowVersionUpgrade
     */
    public String getAllowVersionUpgrade() {
        return AllowVersionUpgrade;
    }

    /**
     * @param AllowVersionUpgrade the AllowVersionUpgrade to set
     */
    public void setAllowVersionUpgrade(String AllowVersionUpgrade) {
	this.AllowVersionUpgrade = AllowVersionUpgrade;
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
     * @return the OwnerAccount
     */
    public String getOwnerAccount() {
        return OwnerAccount;
    }

    /**
     * @param OwnerAccount the OwnerAccount to set
     */
    public void setOwnerAccount(String OwnerAccount) {
	this.OwnerAccount = OwnerAccount;
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
     * @return the SnapshotClusterIdentifier
     */
    public String getSnapshotClusterIdentifier() {
        return SnapshotClusterIdentifier;
    }

    /**
     * @param SnapshotClusterIdentifier the SnapshotClusterIdentifier to set
     */
    public void setSnapshotClusterIdentifier(String SnapshotClusterIdentifier) {
	this.SnapshotClusterIdentifier = SnapshotClusterIdentifier;
    }

    /**
     * @return the IamRoles
     */
    public String getIamRoles() {
        return IamRoles;
    }

    /**
     * @param IamRoles the IamRoles to set
     */
    public void setIamRoles(String IamRoles) {
	this.IamRoles = IamRoles;
    }

    /**
     * @return the ClusterVersion
     */
    public String getClusterVersion() {
        return ClusterVersion;
    }

    /**
     * @param ClusterVersion the ClusterVersion to set
     */
    public void setClusterVersion(String ClusterVersion) {
	this.ClusterVersion = ClusterVersion;
    }

    /**
     * @return the HsmConfigurationIdentifier
     */
    public String getHsmConfigurationIdentifier() {
        return HsmConfigurationIdentifier;
    }

    /**
     * @param HsmConfigurationIdentifier the HsmConfigurationIdentifier to set
     */
    public void setHsmConfigurationIdentifier(String HsmConfigurationIdentifier) {
	this.HsmConfigurationIdentifier = HsmConfigurationIdentifier;
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
     * @return the ClusterSecurityGroups
     */
    public String getClusterSecurityGroups() {
        return ClusterSecurityGroups;
    }

    /**
     * @param ClusterSecurityGroups the ClusterSecurityGroups to set
     */
    public void setClusterSecurityGroups(String ClusterSecurityGroups) {
	this.ClusterSecurityGroups = ClusterSecurityGroups;
    }

    /**
     * @return the ClusterType
     */
    public String getClusterType() {
        return ClusterType;
    }

    /**
     * @param ClusterType the ClusterType to set
     */
    public void setClusterType(String ClusterType) {
	this.ClusterType = ClusterType;
    }

    /**
     * @return the ClusterIdentifier
     */
    public String getClusterIdentifier() {
        return ClusterIdentifier;
    }

    /**
     * @param ClusterIdentifier the ClusterIdentifier to set
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
	this.ClusterIdentifier = ClusterIdentifier;
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
     * @return the ClusterSubnetGroupName
     */
    public String getClusterSubnetGroupName() {
        return ClusterSubnetGroupName;
    }

    /**
     * @param ClusterSubnetGroupName the ClusterSubnetGroupName to set
     */
    public void setClusterSubnetGroupName(String ClusterSubnetGroupName) {
	this.ClusterSubnetGroupName = ClusterSubnetGroupName;
    }

    /**
     * @return the LoggingProperties
     */
    public String getLoggingProperties() {
        return LoggingProperties;
    }

    /**
     * @param LoggingProperties the LoggingProperties to set
     */
    public void setLoggingProperties(String LoggingProperties) {
	this.LoggingProperties = LoggingProperties;
    }

    /**
     * @return the NodeType
     */
    public String getNodeType() {
        return NodeType;
    }

    /**
     * @param NodeType the NodeType to set
     */
    public void setNodeType(String NodeType) {
	this.NodeType = NodeType;
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


}