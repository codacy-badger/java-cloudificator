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
public class AwsPropertiesAsLaunchconfig {

    /**
     * The tenancy of the instance. An instance with a tenancy of dedicated runs on single-tenant hardware and can only be launched in a VPC. You must set the value of this parameter to dedicated if want to launch dedicated instances in a shared tenancy VPC (a VPC with the instance placement tenancy attribute set to default). For more information, see CreateLaunchConfiguration in the Amazon EC2 Auto Scaling API Reference. 
     */
    private String PlacementTenancy;

    /**
     * A list that contains the EC2 security groups to assign to the instances in the Auto Scaling group. The list can contain the IDs of existing EC2 security groups or references to AWS::EC2::SecurityGroup resources created in the template. 
     */
    private String SecurityGroups;

    /**
     * The name of the launch configuration. This name must be unique within the scope of your AWS account. 
     */
    private String LaunchConfigurationName;

    /**
     * The ID of the Amazon EC2 instance you want to use to create the launch configuration. Use this property if you want the launch configuration to use settings from an existing Amazon EC2 instance. 
     */
    private String InstanceId;

    /**
     * The user data available to the launched EC2 instances. 
     */
    private String UserData;

    /**
     * The IDs of one or more security groups for the VPC that you specified in the ClassicLinkVPCId property. 
     */
    private String ClassicLinkVPCSecurityGroups;

    /**
     * Specifies how block devices are exposed to the instance. You can specify virtual devices and EBS volumes. 
     */
    private String BlockDeviceMappings;

    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance profile associated with the IAM role for the instance. The instance profile contains the IAM role. 
     */
    private String IamInstanceProfile;

    /**
     * Provides the ID of the kernel associated with the EC2 AMI. 
     */
    private String KernelId;

    /**
     * For Amazon EC2 instances in a VPC, indicates whether instances in the Auto Scaling group receive public IP addresses. If you specify true, each instance in the Auto Scaling receives a unique public IP address. 
     */
    private String AssociatePublicIpAddress;

    /**
     * The ID of a ClassicLink-enabled VPC to link your EC2-Classic instances to. You can specify this property only for EC2-Classic instances. For more information, see ClassicLink in the Amazon Elastic Compute Cloud User Guide. 
     */
    private String ClassicLinkVPCId;

    /**
     * Specifies whether the launch configuration is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. 
     */
    private String EbsOptimized;

    /**
     * Provides the name of the EC2 key pair. 
     */
    private String KeyName;

    /**
     * The spot price for this Auto Scaling group. If a spot price is set, then the Auto Scaling group will launch when the current spot price is less than the amount specified in the template. 
     */
    private String SpotPrice;

    /**
     * Provides the unique ID of the Amazon Machine Image (AMI) that was assigned during registration. 
     */
    private String ImageId;

    /**
     * Specifies the instance type of the EC2 instance. 
     */
    private String InstanceType;

    /**
     * The ID of the RAM disk to select. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, refer to the AWS Resource Center and search for the kernel ID. 
     */
    private String RamDiskId;

    /**
     * Indicates whether detailed instance monitoring is enabled for the Auto Scaling group. By default, this property is set to true (enabled). 
     */
    private String InstanceMonitoring;

    /**
     * @return the PlacementTenancy
     */
    public String getPlacementTenancy() {
        return PlacementTenancy;
    }

    /**
     * @param PlacementTenancy the PlacementTenancy to set
     */
    public void setPlacementTenancy(String PlacementTenancy) {
	this.PlacementTenancy = PlacementTenancy;
    }

    /**
     * @return the SecurityGroups
     */
    public String getSecurityGroups() {
        return SecurityGroups;
    }

    /**
     * @param SecurityGroups the SecurityGroups to set
     */
    public void setSecurityGroups(String SecurityGroups) {
	this.SecurityGroups = SecurityGroups;
    }

    /**
     * @return the LaunchConfigurationName
     */
    public String getLaunchConfigurationName() {
        return LaunchConfigurationName;
    }

    /**
     * @param LaunchConfigurationName the LaunchConfigurationName to set
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
	this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * @return the InstanceId
     */
    public String getInstanceId() {
        return InstanceId;
    }

    /**
     * @param InstanceId the InstanceId to set
     */
    public void setInstanceId(String InstanceId) {
	this.InstanceId = InstanceId;
    }

    /**
     * @return the UserData
     */
    public String getUserData() {
        return UserData;
    }

    /**
     * @param UserData the UserData to set
     */
    public void setUserData(String UserData) {
	this.UserData = UserData;
    }

    /**
     * @return the ClassicLinkVPCSecurityGroups
     */
    public String getClassicLinkVPCSecurityGroups() {
        return ClassicLinkVPCSecurityGroups;
    }

    /**
     * @param ClassicLinkVPCSecurityGroups the ClassicLinkVPCSecurityGroups to set
     */
    public void setClassicLinkVPCSecurityGroups(String ClassicLinkVPCSecurityGroups) {
	this.ClassicLinkVPCSecurityGroups = ClassicLinkVPCSecurityGroups;
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
     * @return the IamInstanceProfile
     */
    public String getIamInstanceProfile() {
        return IamInstanceProfile;
    }

    /**
     * @param IamInstanceProfile the IamInstanceProfile to set
     */
    public void setIamInstanceProfile(String IamInstanceProfile) {
	this.IamInstanceProfile = IamInstanceProfile;
    }

    /**
     * @return the KernelId
     */
    public String getKernelId() {
        return KernelId;
    }

    /**
     * @param KernelId the KernelId to set
     */
    public void setKernelId(String KernelId) {
	this.KernelId = KernelId;
    }

    /**
     * @return the AssociatePublicIpAddress
     */
    public String getAssociatePublicIpAddress() {
        return AssociatePublicIpAddress;
    }

    /**
     * @param AssociatePublicIpAddress the AssociatePublicIpAddress to set
     */
    public void setAssociatePublicIpAddress(String AssociatePublicIpAddress) {
	this.AssociatePublicIpAddress = AssociatePublicIpAddress;
    }

    /**
     * @return the ClassicLinkVPCId
     */
    public String getClassicLinkVPCId() {
        return ClassicLinkVPCId;
    }

    /**
     * @param ClassicLinkVPCId the ClassicLinkVPCId to set
     */
    public void setClassicLinkVPCId(String ClassicLinkVPCId) {
	this.ClassicLinkVPCId = ClassicLinkVPCId;
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
     * @return the KeyName
     */
    public String getKeyName() {
        return KeyName;
    }

    /**
     * @param KeyName the KeyName to set
     */
    public void setKeyName(String KeyName) {
	this.KeyName = KeyName;
    }

    /**
     * @return the SpotPrice
     */
    public String getSpotPrice() {
        return SpotPrice;
    }

    /**
     * @param SpotPrice the SpotPrice to set
     */
    public void setSpotPrice(String SpotPrice) {
	this.SpotPrice = SpotPrice;
    }

    /**
     * @return the ImageId
     */
    public String getImageId() {
        return ImageId;
    }

    /**
     * @param ImageId the ImageId to set
     */
    public void setImageId(String ImageId) {
	this.ImageId = ImageId;
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
     * @return the RamDiskId
     */
    public String getRamDiskId() {
        return RamDiskId;
    }

    /**
     * @param RamDiskId the RamDiskId to set
     */
    public void setRamDiskId(String RamDiskId) {
	this.RamDiskId = RamDiskId;
    }

    /**
     * @return the InstanceMonitoring
     */
    public String getInstanceMonitoring() {
        return InstanceMonitoring;
    }

    /**
     * @param InstanceMonitoring the InstanceMonitoring to set
     */
    public void setInstanceMonitoring(String InstanceMonitoring) {
	this.InstanceMonitoring = InstanceMonitoring;
    }


}