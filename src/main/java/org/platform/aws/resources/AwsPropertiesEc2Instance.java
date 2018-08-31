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
public class AwsPropertiesEc2Instance {

    /**
     * The tenancy of the instance that you want to launch, such as default, dedicated, or host. If you specify a tenancy value of dedicated or host, you must launch the instance in a VPC. For more information, see Dedicated Instances in the Amazon VPC User Guide. 
     */
    private String Tenancy;

    /**
     * Valid only for Amazon EC2 security groups. A list that contains the Amazon EC2 security groups to assign to the Amazon EC2 instance. The list can contain both the name of existing Amazon EC2 security groups or references to AWS::EC2::SecurityGroup resources created in the template. 
     */
    private String SecurityGroups;

    /**
     * The private IP address for this instance. 
     */
    private String PrivateIpAddress;

    /**
     * Base64-encoded MIME user data that is made available to the instances. 
     */
    private String UserData;

    /**
     * Defines a set of Amazon Elastic Block Store block device mappings, ephemeral instance store block device mappings, or both. For more information, see Amazon Elastic Block Store or Amazon EC2 Instance Store in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String BlockDeviceMappings;

    /**
     * The name of an instance profile or a reference to an AWS::IAM::InstanceProfile resource. 
     */
    private String IamInstanceProfile;

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate with the instance's primary network interface. To specify a number of IPv6 addresses, use the Ipv6AddressCount property and don't specify this property. 
     */
    private String Ipv6Addresses;

    /**
     * The kernel ID. 
     */
    private String KernelId;

    /**
     * If you're using Amazon VPC, this property specifies the ID of the subnet that you want to launch the instance into. If you specified the NetworkInterfaces property, do not specify this property. 
     */
    private String SubnetId;

    /**
     * Specifies whether the instance is optimized for Amazon Elastic Block Store I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. 
     */
    private String EbsOptimized;

    /**
     * Specifies the Elastic GPUs. An Elastic GPU is a GPU resource that you can attach to your instance to accelerate the graphics performance of your applications. For more information, see Amazon EC2 Elastic GPUs in the Amazon EC2 User Guide for Windows Instances. Duplicates are not allowed. 
     */
    private String ElasticGpuSpecifications;

    /**
     * The Amazon EBS volumes to attach to the instance. 
     */
    private String Volumes;

    /**
     * The number of IPv6 addresses to associate with the instance's primary network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific IPv6 addresses, use the Ipv6Addresses property and don't specify this property. 
     */
    private String Ipv6AddressCount;

    /**
     * The launch template to use. 
     */
    private String LaunchTemplate;

    /**
     * A list of embedded objects that describes the network interfaces to associate with this instance. 
     */
    private String NetworkInterfaces;

    /**
     * Provides the unique ID of the Amazon Machine Image (AMI) that was assigned during registration. 
     */
    private String ImageId;

    /**
     * The instance type, such as t2.micro. The default type is m1.small. For a list of instance types, see Instance Families and Types. 
     */
    private String InstanceType;

    /**
     * Specifies whether detailed monitoring is enabled for the instance. 
     */
    private String Monitoring;

    /**
     * An arbitrary set of tags (key–value pairs) for this instance. 
     */
    private String Tags;

    /**
     * Reserved. 
     */
    private String AdditionalInfo;

    /**
     * Indicates whether an instance stops or terminates when you shut down the instance from the instance's operating system shutdown command. You can specify stop or terminate. For more information, see the RunInstances command in the Amazon EC2 API Reference. 
     */
    private String InstanceInitiatedShutdownBehavior;

    /**
     * Specifies the name of the Availability Zone in which the instance is located. 
     */
    private String AvailabilityZone;

    /**
     * If you specify host for the Affinity property, the ID of a dedicated host that the instance is associated with. If you don't specify an ID, Amazon EC2 launches the instance onto any available, compatible dedicated host in your account. This type of launch is called an untargeted launch. Note that for untargeted launches, you must have a compatible, dedicated host available to successfully launch instances. 
     */
    private String HostId;

    /**
     * A list that contains the security group IDs for VPC security groups to assign to the Amazon EC2 instance. If you specified the NetworkInterfaces property, do not specify this property. 
     */
    private String SecurityGroupIds;

    /**
     * Specifies whether the instance can be terminated through the API. 
     */
    private String DisableApiTermination;

    /**
     * Provides the name of the Amazon EC2 key pair. 
     */
    private String KeyName;

    /**
     * The ID of the RAM disk to select. Some kernels require additional drivers at launch. Check the kernel requirements for information about whether you need to specify a RAM disk. To find kernel requirements, go to the AWS Resource Center and search for the kernel ID. 
     */
    private String RamdiskId;

    /**
     * Controls whether source/destination checking is enabled on the instance. Also determines if an instance in a VPC will perform network address translation (NAT). 
     */
    private String SourceDestCheck;

    /**
     * The name of an existing placement group that you want to launch the instance into (for cluster instances). 
     */
    private String PlacementGroupName;

    /**
     * The SSM document and parameter values in AWS Systems Manager to associate with this instance. To use this property, you must specify an IAM instance profile role for the instance. For more information, see Create an Instance Profile for Systems Manager in the AWS Systems Manager User Guide. 
     */
    private String SsmAssociations;

    /**
     * Indicates whether Amazon Elastic Compute Cloud (Amazon EC2) always associates the instance with a dedicated host. If you want Amazon EC2 to always restart the instance (if it was stopped) onto the same host on which it was launched, specify host. If you want Amazon EC2 to restart the instance on any available host, but to try to launch the instance onto the last host it ran on (on a best-effort basis), specify default. 
     */
    private String Affinity;

    /**
     * Specifies the credit option for CPU usage of a T2 instance. 
     */
    private String CreditSpecification;

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
     * @return the PrivateIpAddress
     */
    public String getPrivateIpAddress() {
        return PrivateIpAddress;
    }

    /**
     * @param PrivateIpAddress the PrivateIpAddress to set
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
	this.PrivateIpAddress = PrivateIpAddress;
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
     * @return the Ipv6Addresses
     */
    public String getIpv6Addresses() {
        return Ipv6Addresses;
    }

    /**
     * @param Ipv6Addresses the Ipv6Addresses to set
     */
    public void setIpv6Addresses(String Ipv6Addresses) {
	this.Ipv6Addresses = Ipv6Addresses;
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
     * @return the ElasticGpuSpecifications
     */
    public String getElasticGpuSpecifications() {
        return ElasticGpuSpecifications;
    }

    /**
     * @param ElasticGpuSpecifications the ElasticGpuSpecifications to set
     */
    public void setElasticGpuSpecifications(String ElasticGpuSpecifications) {
	this.ElasticGpuSpecifications = ElasticGpuSpecifications;
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
     * @return the Ipv6AddressCount
     */
    public String getIpv6AddressCount() {
        return Ipv6AddressCount;
    }

    /**
     * @param Ipv6AddressCount the Ipv6AddressCount to set
     */
    public void setIpv6AddressCount(String Ipv6AddressCount) {
	this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * @return the LaunchTemplate
     */
    public String getLaunchTemplate() {
        return LaunchTemplate;
    }

    /**
     * @param LaunchTemplate the LaunchTemplate to set
     */
    public void setLaunchTemplate(String LaunchTemplate) {
	this.LaunchTemplate = LaunchTemplate;
    }

    /**
     * @return the NetworkInterfaces
     */
    public String getNetworkInterfaces() {
        return NetworkInterfaces;
    }

    /**
     * @param NetworkInterfaces the NetworkInterfaces to set
     */
    public void setNetworkInterfaces(String NetworkInterfaces) {
	this.NetworkInterfaces = NetworkInterfaces;
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
     * @return the Monitoring
     */
    public String getMonitoring() {
        return Monitoring;
    }

    /**
     * @param Monitoring the Monitoring to set
     */
    public void setMonitoring(String Monitoring) {
	this.Monitoring = Monitoring;
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
     * @return the AdditionalInfo
     */
    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    /**
     * @param AdditionalInfo the AdditionalInfo to set
     */
    public void setAdditionalInfo(String AdditionalInfo) {
	this.AdditionalInfo = AdditionalInfo;
    }

    /**
     * @return the InstanceInitiatedShutdownBehavior
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return InstanceInitiatedShutdownBehavior;
    }

    /**
     * @param InstanceInitiatedShutdownBehavior the InstanceInitiatedShutdownBehavior to set
     */
    public void setInstanceInitiatedShutdownBehavior(String InstanceInitiatedShutdownBehavior) {
	this.InstanceInitiatedShutdownBehavior = InstanceInitiatedShutdownBehavior;
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
     * @return the HostId
     */
    public String getHostId() {
        return HostId;
    }

    /**
     * @param HostId the HostId to set
     */
    public void setHostId(String HostId) {
	this.HostId = HostId;
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
     * @return the DisableApiTermination
     */
    public String getDisableApiTermination() {
        return DisableApiTermination;
    }

    /**
     * @param DisableApiTermination the DisableApiTermination to set
     */
    public void setDisableApiTermination(String DisableApiTermination) {
	this.DisableApiTermination = DisableApiTermination;
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
     * @return the RamdiskId
     */
    public String getRamdiskId() {
        return RamdiskId;
    }

    /**
     * @param RamdiskId the RamdiskId to set
     */
    public void setRamdiskId(String RamdiskId) {
	this.RamdiskId = RamdiskId;
    }

    /**
     * @return the SourceDestCheck
     */
    public String getSourceDestCheck() {
        return SourceDestCheck;
    }

    /**
     * @param SourceDestCheck the SourceDestCheck to set
     */
    public void setSourceDestCheck(String SourceDestCheck) {
	this.SourceDestCheck = SourceDestCheck;
    }

    /**
     * @return the PlacementGroupName
     */
    public String getPlacementGroupName() {
        return PlacementGroupName;
    }

    /**
     * @param PlacementGroupName the PlacementGroupName to set
     */
    public void setPlacementGroupName(String PlacementGroupName) {
	this.PlacementGroupName = PlacementGroupName;
    }

    /**
     * @return the SsmAssociations
     */
    public String getSsmAssociations() {
        return SsmAssociations;
    }

    /**
     * @param SsmAssociations the SsmAssociations to set
     */
    public void setSsmAssociations(String SsmAssociations) {
	this.SsmAssociations = SsmAssociations;
    }

    /**
     * @return the Affinity
     */
    public String getAffinity() {
        return Affinity;
    }

    /**
     * @param Affinity the Affinity to set
     */
    public void setAffinity(String Affinity) {
	this.Affinity = Affinity;
    }

    /**
     * @return the CreditSpecification
     */
    public String getCreditSpecification() {
        return CreditSpecification;
    }

    /**
     * @param CreditSpecification the CreditSpecification to set
     */
    public void setCreditSpecification(String CreditSpecification) {
	this.CreditSpecification = CreditSpecification;
    }


}