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
public class AwsPropertiesElasticacheCacheCluster {

    /**
     * A list of cache security group names that are associated with this cache cluster. If your cache cluster is in a VPC, specify the VpcSecurityGroupIds property instead. 
     */
    private String CacheSecurityGroupNames;

    /**
     * The version of the cache engine to be used for this cluster. 
     */
    private String EngineVersion;

    /**
     * The cache subnet group that you associate with a cache cluster. 
     */
    private String CacheSubnetGroupName;

    /**
     * The ARN of the snapshot file that you want to use to seed a new Redis cache cluster. If you manage a Redis instance outside of Amazon ElastiCache, you can create a new cache cluster in ElastiCache by using a snapshot file that is stored in an Amazon S3 bucket. 
     */
    private String SnapshotArns;

    /**
     * The port number on which each of the cache nodes will accept connections. 
     */
    private String Port;

    /**
     * The name of the cache parameter group that is associated with this cache cluster. 
     */
    private String CacheParameterGroupName;

    /**
     * The weekly time range (in UTC) during which system maintenance can occur. 
     */
    private String PreferredMaintenanceWindow;

    /**
     * Indicates that minor engine upgrades will be applied automatically to the cache cluster during the maintenance window. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which notifications will be sent. 
     */
    private String NotificationTopicArn;

    /**
     * The number of cache nodes that the cache cluster should have. 
     */
    private String NumCacheNodes;

    /**
     * The Amazon EC2 Availability Zone in which the cache cluster is created. 
     */
    private String PreferredAvailabilityZone;

    /**
     * The name of a snapshot from which to restore data into a new Redis cache cluster. 
     */
    private String SnapshotName;

    /**
     * For Redis cache clusters, the daily time range (in UTC) during which ElastiCache will begin taking a daily snapshot of your node group. For example, you can specify 05:00-09:00. 
     */
    private String SnapshotWindow;

    /**
     * The compute and memory capacity of nodes in a cache cluster. 
     */
    private String CacheNodeType;

    /**
     * For Redis cache clusters, the number of days for which ElastiCache retains automatic snapshots before deleting them. For example, if you set the value to 5, a snapshot that was taken today will be retained for 5 days before being deleted. 
     */
    private String SnapshotRetentionLimit;

    /**
     * For Memcached cache clusters, the list of Availability Zones in which cache nodes are created. The number of Availability Zones listed must equal the number of cache nodes. For example, if you want to create three nodes in two different Availability Zones, you can specify ["us-east-1a", "us-east-1a", "us-east-1b"], which would create two nodes in us-east-1a and one node in us-east-1b. 
     */
    private String PreferredAvailabilityZones;

    /**
     * A list of VPC security group IDs. If your cache cluster isn't in a VPC, specify the CacheSecurityGroupNames property instead. 
     */
    private String VpcSecurityGroupIds;

    /**
     * A name for the cache cluster. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the cache cluster. For more information, see Name Type. 
     */
    private String ClusterName;

    /**
     * The name of the cache engine to be used for this cache cluster, such as memcached or redis. 
     */
    private String Engine;

    /**
     * An arbitrary set of tags (key–value pairs) for this cache cluster. 
     */
    private String Tags;

    /**
     * For Memcached cache clusters, indicates whether the nodes are created in a single Availability Zone or across multiple Availability Zones in the cluster's region. For valid values, see CreateCacheCluster in the Amazon ElastiCache API Reference. 
     */
    private String AZMode;

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
     * @return the NumCacheNodes
     */
    public String getNumCacheNodes() {
        return NumCacheNodes;
    }

    /**
     * @param NumCacheNodes the NumCacheNodes to set
     */
    public void setNumCacheNodes(String NumCacheNodes) {
	this.NumCacheNodes = NumCacheNodes;
    }

    /**
     * @return the PreferredAvailabilityZone
     */
    public String getPreferredAvailabilityZone() {
        return PreferredAvailabilityZone;
    }

    /**
     * @param PreferredAvailabilityZone the PreferredAvailabilityZone to set
     */
    public void setPreferredAvailabilityZone(String PreferredAvailabilityZone) {
	this.PreferredAvailabilityZone = PreferredAvailabilityZone;
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
     * @return the PreferredAvailabilityZones
     */
    public String getPreferredAvailabilityZones() {
        return PreferredAvailabilityZones;
    }

    /**
     * @param PreferredAvailabilityZones the PreferredAvailabilityZones to set
     */
    public void setPreferredAvailabilityZones(String PreferredAvailabilityZones) {
	this.PreferredAvailabilityZones = PreferredAvailabilityZones;
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
     * @return the ClusterName
     */
    public String getClusterName() {
        return ClusterName;
    }

    /**
     * @param ClusterName the ClusterName to set
     */
    public void setClusterName(String ClusterName) {
	this.ClusterName = ClusterName;
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
     * @return the AZMode
     */
    public String getAZMode() {
        return AZMode;
    }

    /**
     * @param AZMode the AZMode to set
     */
    public void setAZMode(String AZMode) {
	this.AZMode = AZMode;
    }


}