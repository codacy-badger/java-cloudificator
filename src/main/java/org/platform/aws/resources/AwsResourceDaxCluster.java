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
public class AwsResourceDaxCluster {

    /**
     * Whether server-side encryption is enabled or not. 
     */
    private String SSESpecification;

    /**
     * A description of the cluster. 
     */
    private String Description;

    /**
     * The number of nodes in the DAX cluster. A replication factor of 1 will create a single-node cluster, without any read replicas. For additional fault tolerance, you can create a multiple node cluster with one or more read replicas. To do this, set ReplicationFactor to 2 or more. 
     */
    private String ReplicationFactor;

    /**
     * The parameter group to be associated with the DAX cluster. 
     */
    private String ParameterGroupName;

    /**
     * The Availability Zones (AZs) in which the cluster nodes will be created. All nodes belonging to the cluster are placed in these Availability Zones. Use this parameter if you want to distribute the nodes across multiple AZs. 
     */
    private String AvailabilityZones;

    /**
     * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf. 
     */
    private String IAMRoleARN;

    /**
     * The name of the subnet group to be used for the replication group. 
     */
    private String SubnetGroupName;

    /**
     * Specifies the weekly time range during which maintenance on the DAX cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum maintenance window is a 60 minute period. Valid values for ddd are: 
     */
    private String PreferredMaintenanceWindow;

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which notifications will be sent. 
     */
    private String NotificationTopicARN;

    /**
     * A list of security group IDs to be assigned to each node in the DAX cluster. (Each of the security group ID is system-generated.) 
     */
    private String SecurityGroupIds;

    /**
     * The compute and memory capacity of the nodes in the cluster. 
     */
    private String NodeType;

    /**
     * The cluster identifier. This parameter is stored as a lowercase string. 
     */
    private String ClusterName;

    /**
     * A map of tags to associate with the DAX cluster. 
     */
    private String Tags;

    /**
     * @return the SSESpecification
     */
    public String getSSESpecification() {
        return SSESpecification;
    }

    /**
     * @param SSESpecification the SSESpecification to set
     */
    public void setSSESpecification(String SSESpecification) {
	this.SSESpecification = SSESpecification;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the ReplicationFactor
     */
    public String getReplicationFactor() {
        return ReplicationFactor;
    }

    /**
     * @param ReplicationFactor the ReplicationFactor to set
     */
    public void setReplicationFactor(String ReplicationFactor) {
	this.ReplicationFactor = ReplicationFactor;
    }

    /**
     * @return the ParameterGroupName
     */
    public String getParameterGroupName() {
        return ParameterGroupName;
    }

    /**
     * @param ParameterGroupName the ParameterGroupName to set
     */
    public void setParameterGroupName(String ParameterGroupName) {
	this.ParameterGroupName = ParameterGroupName;
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
     * @return the IAMRoleARN
     */
    public String getIAMRoleARN() {
        return IAMRoleARN;
    }

    /**
     * @param IAMRoleARN the IAMRoleARN to set
     */
    public void setIAMRoleARN(String IAMRoleARN) {
	this.IAMRoleARN = IAMRoleARN;
    }

    /**
     * @return the SubnetGroupName
     */
    public String getSubnetGroupName() {
        return SubnetGroupName;
    }

    /**
     * @param SubnetGroupName the SubnetGroupName to set
     */
    public void setSubnetGroupName(String SubnetGroupName) {
	this.SubnetGroupName = SubnetGroupName;
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
     * @return the NotificationTopicARN
     */
    public String getNotificationTopicARN() {
        return NotificationTopicARN;
    }

    /**
     * @param NotificationTopicARN the NotificationTopicARN to set
     */
    public void setNotificationTopicARN(String NotificationTopicARN) {
	this.NotificationTopicARN = NotificationTopicARN;
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