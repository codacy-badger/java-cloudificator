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
public class AwsResourceOpsworksInstance {

    /**
     * The SSH key name of the instance. 
     */
    private String SshKeyName;

    /**
     * The tenancy of the instance. For more information, see the Tenancy parameter for the CreateInstance action in the AWS OpsWorks Stacks API Reference. 
     */
    private String Tenancy;

    /**
     * The instance architecture. 
     */
    private String Architecture;

    /**
     * The instance operating system. For more information, see CreateInstance in the AWS OpsWorks Stacks API Reference. 
     */
    private String Os;

    /**
     * The version of the AWS OpsWorks agent that AWS OpsWorks installs on each instance. AWS OpsWorks sends commands to the agent to performs tasks on your instances, such as starting Chef runs. For valid values, see the AgentVersion parameter for the CreateInstance action in the AWS OpsWorks Stacks API Reference. 
     */
    private String AgentVersion;

    /**
     * The instance's virtualization type, paravirtual or hvm. 
     */
    private String VirtualizationType;

    /**
     * A list of Elastic IP addresses to associate with the instance. 
     */
    private String ElasticIps;

    /**
     * A list of block devices that are mapped to the AWS OpsWorks instance. For more information, see the BlockDeviceMappings parameter for the CreateInstance action in the AWS OpsWorks Stacks API Reference. 
     */
    private String BlockDeviceMappings;

    /**
     * The name of the instance host. 
     */
    private String Hostname;

    /**
     * The instance Availability Zone. 
     */
    private String AvailabilityZone;

    /**
     * Whether to install operating system and package updates when the instance boots. 
     */
    private String InstallUpdatesOnBoot;

    /**
     * The ID of the instance's subnet. If the stack is running in a VPC, you can use this parameter to override the stack's default subnet ID value and direct AWS OpsWorks to launch the instance in a different subnet. 
     */
    private String SubnetId;

    /**
     * The time-based scaling configuration for the instance. 
     */
    private String TimeBasedAutoScaling;

    /**
     * Whether the instance is optimized for Amazon Elastic Block Store (Amazon EBS) I/O. If you specify an Amazon EBS-optimized instance type, AWS OpsWorks enables EBS optimization by default. For more information, see Amazon EBS–Optimized Instances in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String EbsOptimized;

    /**
     * The root device type of the instance. 
     */
    private String RootDeviceType;

    /**
     * The IDs of the AWS OpsWorks layers to associate with this instance. 
     */
    private String LayerIds;

    /**
     * A list of AWS OpsWorks volume IDs to associate with the instance. For more information, see AWS::OpsWorks::Volume. 
     */
    private String Volumes;

    /**
     * For scaling instances, the type of scaling. If you specify load-based scaling, do not specify a time-based scaling configuration. For valid values, see CreateInstance in the AWS OpsWorks Stacks API Reference. 
     */
    private String AutoScalingType;

    /**
     * The instance type, which must be supported by AWS OpsWorks. For more information, see CreateInstance in the AWS OpsWorks Stacks API Reference. 
     */
    private String InstanceType;

    /**
     * The ID of the custom Amazon Machine Image (AMI) to be used to create the instance. For more information about custom AMIs, see Using Custom AMIs in the AWS OpsWorks User Guide. 
     */
    private String AmiId;

    /**
     * The ID of the AWS OpsWorks stack that this instance will be associated with. 
     */
    private String StackId;

    /**
     * @return the SshKeyName
     */
    public String getSshKeyName() {
        return SshKeyName;
    }

    /**
     * @param SshKeyName the SshKeyName to set
     */
    public void setSshKeyName(String SshKeyName) {
	this.SshKeyName = SshKeyName;
    }

    /**
     * @return the Tenancy
     */
    public String getTenancy() {
        return Tenancy;
    }

    /**
     * @param Tenancy the Tenancy to set
     */
    public void setTenancy(String Tenancy) {
	this.Tenancy = Tenancy;
    }

    /**
     * @return the Architecture
     */
    public String getArchitecture() {
        return Architecture;
    }

    /**
     * @param Architecture the Architecture to set
     */
    public void setArchitecture(String Architecture) {
	this.Architecture = Architecture;
    }

    /**
     * @return the Os
     */
    public String getOs() {
        return Os;
    }

    /**
     * @param Os the Os to set
     */
    public void setOs(String Os) {
	this.Os = Os;
    }

    /**
     * @return the AgentVersion
     */
    public String getAgentVersion() {
        return AgentVersion;
    }

    /**
     * @param AgentVersion the AgentVersion to set
     */
    public void setAgentVersion(String AgentVersion) {
	this.AgentVersion = AgentVersion;
    }

    /**
     * @return the VirtualizationType
     */
    public String getVirtualizationType() {
        return VirtualizationType;
    }

    /**
     * @param VirtualizationType the VirtualizationType to set
     */
    public void setVirtualizationType(String VirtualizationType) {
	this.VirtualizationType = VirtualizationType;
    }

    /**
     * @return the ElasticIps
     */
    public String getElasticIps() {
        return ElasticIps;
    }

    /**
     * @param ElasticIps the ElasticIps to set
     */
    public void setElasticIps(String ElasticIps) {
	this.ElasticIps = ElasticIps;
    }

    /**
     * @return the BlockDeviceMappings
     */
    public String getBlockDeviceMappings() {
        return BlockDeviceMappings;
    }

    /**
     * @param BlockDeviceMappings the BlockDeviceMappings to set
     */
    public void setBlockDeviceMappings(String BlockDeviceMappings) {
	this.BlockDeviceMappings = BlockDeviceMappings;
    }

    /**
     * @return the Hostname
     */
    public String getHostname() {
        return Hostname;
    }

    /**
     * @param Hostname the Hostname to set
     */
    public void setHostname(String Hostname) {
	this.Hostname = Hostname;
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
     * @return the InstallUpdatesOnBoot
     */
    public String getInstallUpdatesOnBoot() {
        return InstallUpdatesOnBoot;
    }

    /**
     * @param InstallUpdatesOnBoot the InstallUpdatesOnBoot to set
     */
    public void setInstallUpdatesOnBoot(String InstallUpdatesOnBoot) {
	this.InstallUpdatesOnBoot = InstallUpdatesOnBoot;
    }

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
    }

    /**
     * @return the TimeBasedAutoScaling
     */
    public String getTimeBasedAutoScaling() {
        return TimeBasedAutoScaling;
    }

    /**
     * @param TimeBasedAutoScaling the TimeBasedAutoScaling to set
     */
    public void setTimeBasedAutoScaling(String TimeBasedAutoScaling) {
	this.TimeBasedAutoScaling = TimeBasedAutoScaling;
    }

    /**
     * @return the EbsOptimized
     */
    public String getEbsOptimized() {
        return EbsOptimized;
    }

    /**
     * @param EbsOptimized the EbsOptimized to set
     */
    public void setEbsOptimized(String EbsOptimized) {
	this.EbsOptimized = EbsOptimized;
    }

    /**
     * @return the RootDeviceType
     */
    public String getRootDeviceType() {
        return RootDeviceType;
    }

    /**
     * @param RootDeviceType the RootDeviceType to set
     */
    public void setRootDeviceType(String RootDeviceType) {
	this.RootDeviceType = RootDeviceType;
    }

    /**
     * @return the LayerIds
     */
    public String getLayerIds() {
        return LayerIds;
    }

    /**
     * @param LayerIds the LayerIds to set
     */
    public void setLayerIds(String LayerIds) {
	this.LayerIds = LayerIds;
    }

    /**
     * @return the Volumes
     */
    public String getVolumes() {
        return Volumes;
    }

    /**
     * @param Volumes the Volumes to set
     */
    public void setVolumes(String Volumes) {
	this.Volumes = Volumes;
    }

    /**
     * @return the AutoScalingType
     */
    public String getAutoScalingType() {
        return AutoScalingType;
    }

    /**
     * @param AutoScalingType the AutoScalingType to set
     */
    public void setAutoScalingType(String AutoScalingType) {
	this.AutoScalingType = AutoScalingType;
    }

    /**
     * @return the InstanceType
     */
    public String getInstanceType() {
        return InstanceType;
    }

    /**
     * @param InstanceType the InstanceType to set
     */
    public void setInstanceType(String InstanceType) {
	this.InstanceType = InstanceType;
    }

    /**
     * @return the AmiId
     */
    public String getAmiId() {
        return AmiId;
    }

    /**
     * @param AmiId the AmiId to set
     */
    public void setAmiId(String AmiId) {
	this.AmiId = AmiId;
    }

    /**
     * @return the StackId
     */
    public String getStackId() {
        return StackId;
    }

    /**
     * @param StackId the StackId to set
     */
    public void setStackId(String StackId) {
	this.StackId = StackId;
    }


}