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
public class AwsResourceElasticacheReplicationgroup {

    /**
     * A list of Availability Zones in which the cache clusters in this replication group are created. 
     */
    private String PreferredCacheClusterAZs;

    /**
     * A list of cache security group names to associate with this replication group. 
     */
    private String CacheSecurityGroupNames;

    /**
     * Configuration options for the node group (shard). 
     */
    private String NodeGroupConfiguration;

    /**
     * A single-element string list that specifies an ARN of a Redis .rdb snapshot file that is stored in Amazon Simple Storage Service (Amazon S3). The snapshot file populates the node group. The Amazon S3 object name in the ARN cannot contain commas. For example, you can specify arn:aws:s3:::my_bucket/snapshot1.rdb. 
     */
    private String SnapshotArns;

    /**
     * The port number on which each member of the replication group accepts connections. 
     */
    private String Port;

    /**
     * The number of node groups (shards) for this Redis (clustered mode enabled) replication group. For Redis (clustered mode disabled), either omit this property or set it to 1. 
     */
    private String NumNodeGroups;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic to which notifications are sent. 
     */
    private String NotificationTopicArn;

    /**
     * The name of a snapshot from which to restore data into the replication group. 
     */
    private String SnapshotName;

    /**
     * Indicates whether Multi-AZ is enabled. When Multi-AZ is enabled, a read-only replica is automatically promoted to a read-write primary cluster if the existing primary cluster fails. If you specify true, you must specify a value greater than 1 for the NumCacheClusters property. By default, AWS CloudFormation sets the value to true. 
     */
    private String AutomaticFailoverEnabled;

    /**
     * The number of replica nodes in each node group (shard). For valid values, see CreateReplicationGroup in the Amazon ElastiCache API Reference Guide. 
     */
    private String ReplicasPerNodeGroup;

    /**
     * A description of the replication group. 
     */
    private String ReplicationGroupDescription;

    /**
     * Indicates whether to enable in-transit encryption. The default value is false. For more information about how you can use this property, see CreateReplicationGroup in the Amazon ElastiCache API Reference. 
     */
    private String TransitEncryptionEnabled;

    /**
     * An ID for the replication group. If you don't specify an ID, AWS CloudFormation generates a unique physical ID. For more information, see Name Type. 
     */
    private String ReplicationGroupId;

    /**
     * The name of the cache engine to use for the cache clusters in this replication group. Currently, you can specify only redis. 
     */
    private String Engine;

    /**
     * An arbitrary set of tags (key–value pairs) for this replication group. 
     */
    private String Tags;

    /**
     * The number of cache clusters for this replication group. If automatic failover is enabled, you must specify a value greater than 1. For valid values, see CreateReplicationGroup in the Amazon ElastiCache API Reference Guide. 
     */
    private String NumCacheClusters;

    /**
     * The version number of the cache engine to use for the cache clusters in this replication group. 
     */
    private String EngineVersion;

    /**
     * The name of a cache subnet group to use for this replication group. 
     */
    private String CacheSubnetGroupName;

    /**
     * The name of the parameter group to associate with this replication group. For valid and default values, see CreateReplicationGroup in the Amazon ElastiCache API Reference Guide. 
     */
    private String CacheParameterGroupName;

    /**
     * The weekly time range during which system maintenance can occur. Use the following format to specify a time range: ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). For example, you can specify sun:22:00-sun:23:30 for Sunday from 10 PM to 11:30 PM. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * The cache cluster that ElastiCache uses as the primary cluster for the replication group. The cache cluster must have a status of available. 
     */
    private String PrimaryClusterId;

    /**
     * Indicates whether to enable encryption at rest. The default value is false. For more information about how you can use this property, see CreateReplicationGroup in the Amazon ElastiCache API Reference. 
     */
    private String AtRestEncryptionEnabled;

    /**
     * Currently, this property isn't used by ElastiCache. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * A list of Amazon Virtual Private Cloud (Amazon VPC) security groups to associate with this replication group. 
     */
    private String SecurityGroupIds;

    /**
     * The time range (in UTC) when ElastiCache takes a daily snapshot of the node group that you specified in the SnapshottingClusterId property. For example, you can specify 05:00-09:00. 
     */
    private String SnapshotWindow;

    /**
     * The compute and memory capacity of nodes in the node group. For valid values, see CreateReplicationGroup in the Amazon ElastiCache API Reference Guide. 
     */
    private String CacheNodeType;

    /**
     * The number of days that ElastiCache retains automatic snapshots before deleting them. 
     */
    private String SnapshotRetentionLimit;

    /**
     * The ID of the cache cluster that ElastiCache uses as the daily snapshot source for the replication group. 
     */
    private String SnapshottingClusterId;

    /**
     * The password that's used to access a password-protected server. For constraints, see CreateReplicationGroup in the Amazon ElastiCache API Reference. 
     */
    private String AuthToken;

    /**
     * @return the PreferredCacheClusterAZs
     */
    public String getPreferredCacheClusterAZs() {
        return PreferredCacheClusterAZs;
    }

    /**
     * @param PreferredCacheClusterAZs the PreferredCacheClusterAZs to set
     */
    public void setPreferredCacheClusterAZs(String PreferredCacheClusterAZs) {
	this.PreferredCacheClusterAZs = PreferredCacheClusterAZs;
    }

    /**
     * @return the CacheSecurityGroupNames
     */
    public String getCacheSecurityGroupNames() {
        return CacheSecurityGroupNames;
    }

    /**
     * @param CacheSecurityGroupNames the CacheSecurityGroupNames to set
     */
    public void setCacheSecurityGroupNames(String CacheSecurityGroupNames) {
	this.CacheSecurityGroupNames = CacheSecurityGroupNames;
    }

    /**
     * @return the NodeGroupConfiguration
     */
    public String getNodeGroupConfiguration() {
        return NodeGroupConfiguration;
    }

    /**
     * @param NodeGroupConfiguration the NodeGroupConfiguration to set
     */
    public void setNodeGroupConfiguration(String NodeGroupConfiguration) {
	this.NodeGroupConfiguration = NodeGroupConfiguration;
    }

    /**
     * @return the SnapshotArns
     */
    public String getSnapshotArns() {
        return SnapshotArns;
    }

    /**
     * @param SnapshotArns the SnapshotArns to set
     */
    public void setSnapshotArns(String SnapshotArns) {
	this.SnapshotArns = SnapshotArns;
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
     * @return the NumNodeGroups
     */
    public String getNumNodeGroups() {
        return NumNodeGroups;
    }

    /**
     * @param NumNodeGroups the NumNodeGroups to set
     */
    public void setNumNodeGroups(String NumNodeGroups) {
	this.NumNodeGroups = NumNodeGroups;
    }

    /**
     * @return the NotificationTopicArn
     */
    public String getNotificationTopicArn() {
        return NotificationTopicArn;
    }

    /**
     * @param NotificationTopicArn the NotificationTopicArn to set
     */
    public void setNotificationTopicArn(String NotificationTopicArn) {
	this.NotificationTopicArn = NotificationTopicArn;
    }

    /**
     * @return the SnapshotName
     */
    public String getSnapshotName() {
        return SnapshotName;
    }

    /**
     * @param SnapshotName the SnapshotName to set
     */
    public void setSnapshotName(String SnapshotName) {
	this.SnapshotName = SnapshotName;
    }

    /**
     * @return the AutomaticFailoverEnabled
     */
    public String getAutomaticFailoverEnabled() {
        return AutomaticFailoverEnabled;
    }

    /**
     * @param AutomaticFailoverEnabled the AutomaticFailoverEnabled to set
     */
    public void setAutomaticFailoverEnabled(String AutomaticFailoverEnabled) {
	this.AutomaticFailoverEnabled = AutomaticFailoverEnabled;
    }

    /**
     * @return the ReplicasPerNodeGroup
     */
    public String getReplicasPerNodeGroup() {
        return ReplicasPerNodeGroup;
    }

    /**
     * @param ReplicasPerNodeGroup the ReplicasPerNodeGroup to set
     */
    public void setReplicasPerNodeGroup(String ReplicasPerNodeGroup) {
	this.ReplicasPerNodeGroup = ReplicasPerNodeGroup;
    }

    /**
     * @return the ReplicationGroupDescription
     */
    public String getReplicationGroupDescription() {
        return ReplicationGroupDescription;
    }

    /**
     * @param ReplicationGroupDescription the ReplicationGroupDescription to set
     */
    public void setReplicationGroupDescription(String ReplicationGroupDescription) {
	this.ReplicationGroupDescription = ReplicationGroupDescription;
    }

    /**
     * @return the TransitEncryptionEnabled
     */
    public String getTransitEncryptionEnabled() {
        return TransitEncryptionEnabled;
    }

    /**
     * @param TransitEncryptionEnabled the TransitEncryptionEnabled to set
     */
    public void setTransitEncryptionEnabled(String TransitEncryptionEnabled) {
	this.TransitEncryptionEnabled = TransitEncryptionEnabled;
    }

    /**
     * @return the ReplicationGroupId
     */
    public String getReplicationGroupId() {
        return ReplicationGroupId;
    }

    /**
     * @param ReplicationGroupId the ReplicationGroupId to set
     */
    public void setReplicationGroupId(String ReplicationGroupId) {
	this.ReplicationGroupId = ReplicationGroupId;
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
     * @return the NumCacheClusters
     */
    public String getNumCacheClusters() {
        return NumCacheClusters;
    }

    /**
     * @param NumCacheClusters the NumCacheClusters to set
     */
    public void setNumCacheClusters(String NumCacheClusters) {
	this.NumCacheClusters = NumCacheClusters;
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
     * @return the CacheSubnetGroupName
     */
    public String getCacheSubnetGroupName() {
        return CacheSubnetGroupName;
    }

    /**
     * @param CacheSubnetGroupName the CacheSubnetGroupName to set
     */
    public void setCacheSubnetGroupName(String CacheSubnetGroupName) {
	this.CacheSubnetGroupName = CacheSubnetGroupName;
    }

    /**
     * @return the CacheParameterGroupName
     */
    public String getCacheParameterGroupName() {
        return CacheParameterGroupName;
    }

    /**
     * @param CacheParameterGroupName the CacheParameterGroupName to set
     */
    public void setCacheParameterGroupName(String CacheParameterGroupName) {
	this.CacheParameterGroupName = CacheParameterGroupName;
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
     * @return the PrimaryClusterId
     */
    public String getPrimaryClusterId() {
        return PrimaryClusterId;
    }

    /**
     * @param PrimaryClusterId the PrimaryClusterId to set
     */
    public void setPrimaryClusterId(String PrimaryClusterId) {
	this.PrimaryClusterId = PrimaryClusterId;
    }

    /**
     * @return the AtRestEncryptionEnabled
     */
    public String getAtRestEncryptionEnabled() {
        return AtRestEncryptionEnabled;
    }

    /**
     * @param AtRestEncryptionEnabled the AtRestEncryptionEnabled to set
     */
    public void setAtRestEncryptionEnabled(String AtRestEncryptionEnabled) {
	this.AtRestEncryptionEnabled = AtRestEncryptionEnabled;
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
     * @return the SecurityGroupIds
     */
    public String getSecurityGroupIds() {
        return SecurityGroupIds;
    }

    /**
     * @param SecurityGroupIds the SecurityGroupIds to set
     */
    public void setSecurityGroupIds(String SecurityGroupIds) {
	this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * @return the SnapshotWindow
     */
    public String getSnapshotWindow() {
        return SnapshotWindow;
    }

    /**
     * @param SnapshotWindow the SnapshotWindow to set
     */
    public void setSnapshotWindow(String SnapshotWindow) {
	this.SnapshotWindow = SnapshotWindow;
    }

    /**
     * @return the CacheNodeType
     */
    public String getCacheNodeType() {
        return CacheNodeType;
    }

    /**
     * @param CacheNodeType the CacheNodeType to set
     */
    public void setCacheNodeType(String CacheNodeType) {
	this.CacheNodeType = CacheNodeType;
    }

    /**
     * @return the SnapshotRetentionLimit
     */
    public String getSnapshotRetentionLimit() {
        return SnapshotRetentionLimit;
    }

    /**
     * @param SnapshotRetentionLimit the SnapshotRetentionLimit to set
     */
    public void setSnapshotRetentionLimit(String SnapshotRetentionLimit) {
	this.SnapshotRetentionLimit = SnapshotRetentionLimit;
    }

    /**
     * @return the SnapshottingClusterId
     */
    public String getSnapshottingClusterId() {
        return SnapshottingClusterId;
    }

    /**
     * @param SnapshottingClusterId the SnapshottingClusterId to set
     */
    public void setSnapshottingClusterId(String SnapshottingClusterId) {
	this.SnapshottingClusterId = SnapshottingClusterId;
    }

    /**
     * @return the AuthToken
     */
    public String getAuthToken() {
        return AuthToken;
    }

    /**
     * @param AuthToken the AuthToken to set
     */
    public void setAuthToken(String AuthToken) {
	this.AuthToken = AuthToken;
    }


}