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
public class AwsResourceOpsworksStack {

    /**
     * If you're cloning an AWS OpsWorks stack, indicates whether to clone the source stack's permissions. 
     */
    private String ClonePermissions;

    /**
     * The Amazon Resource Name (ARN) of an IAM instance profile that is the default profile for all of the stack's Amazon EC2 instances. 
     */
    private String DefaultInstanceProfileArn;

    /**
     * Whether to associate the AWS OpsWorks built-in security groups with the stack's layers. 
     */
    private String UseOpsworksSecurityGroups;

    /**
     * The AWS OpsWorks agent version that you want to use. The agent communicates with the service and handles tasks such as initiating Chef runs in response to lifecycle events. For valid values, see the AgentVersion parameter for the CreateStack action in the AWS OpsWorks Stacks API Reference. 
     */
    private String AgentVersion;

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes bag. 
     */
    private String Attributes;

    /**
     * Describes the Chef configuration. For more information, see the CreateStack ChefConfiguration parameter in the AWS OpsWorks Stacks API Reference. 
     */
    private String ChefConfiguration;

    /**
     * The stack's default operating system. For more information, see CreateStack in the AWS OpsWorks Stacks API Reference. 
     */
    private String DefaultOs;

    /**
     * The name of the AWS OpsWorks stack. 
     */
    private String Name;

    /**
     * Contains the information required to retrieve a cookbook from a repository. 
     */
    private String CustomCookbooksSource;

    /**
     * The default root device type. This value is used by default for all instances in the stack, but you can override it when you create an instance. For more information, see CreateStack in the AWS OpsWorks Stacks API Reference. 
     */
    private String DefaultRootDeviceType;

    /**
     * If you're cloning an AWS OpsWorks stack, a list of AWS OpsWorks application stack IDs from the source stack to include in the cloned stack. 
     */
    private String CloneAppIds;

    /**
     * A default SSH key for the stack instances. You can override this value when you create or update an instance. 
     */
    private String DefaultSshKeyName;

    /**
     * Describes the configuration manager. When you create a stack, you use the configuration manager to specify the Chef version. For supported Chef versions, see the CreateStack ConfigurationManager parameter in the AWS OpsWorks Stacks API Reference. 
     */
    private String ConfigurationManager;

    /**
     * The stack's default subnet ID. All instances are launched into this subnet unless you specify another subnet ID when you create the instance. 
     */
    private String DefaultSubnetId;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this AWS OpsWorks stack. Use tags to manage your resources. 
     */
    private String Tags;

    /**
     * A user-defined custom JSON object. The custom JSON is used to override the corresponding default stack configuration JSON values. For more information, see CreateStack in the AWS OpsWorks Stacks API Reference. 
     */
    private String CustomJson;

    /**
     * The AWS Identity and Access Management (IAM) role that AWS OpsWorks uses to work with AWS resources on your behalf. You must specify an Amazon Resource Name (ARN) for an existing IAM role. 
     */
    private String ServiceRoleArn;

    /**
     * A list of Elastic IP addresses to register with the AWS OpsWorks stack. 
     */
    private String ElasticIps;

    /**
     * Whether the stack uses custom cookbooks. 
     */
    private String UseCustomCookbooks;

    /**
     * The stack's default Availability Zone, which must be in the specified region. 
     */
    private String DefaultAvailabilityZone;

    /**
     * The Amazon Relational Database Service (Amazon RDS) DB instance to register with the AWS OpsWorks stack. 
     */
    private String RdsDbInstances;

    /**
     * If you're cloning an AWS OpsWorks stack, the stack ID of the source AWS OpsWorks stack to clone. 
     */
    private String SourceStackId;

    /**
     * The ID of the VPC that the stack is to be launched into, which must be in the specified region. All instances are launched into this VPC. If you specify this property, you must specify the DefaultSubnetId property. 
     */
    private String VpcId;

    /**
     * The stack's host name theme, with spaces replaced by underscores. The theme is used to generate host names for the stack's instances. For more information, see CreateStack in the AWS OpsWorks Stacks API Reference. 
     */
    private String HostnameTheme;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Elastic Container Service (Amazon ECS) cluster to register with the AWS OpsWorks stack. 
     */
    private String EcsClusterArn;

    /**
     * @return the ClonePermissions
     */
    public String getClonePermissions() {
        return ClonePermissions;
    }

    /**
     * @param ClonePermissions the ClonePermissions to set
     */
    public void setClonePermissions(String ClonePermissions) {
	this.ClonePermissions = ClonePermissions;
    }

    /**
     * @return the DefaultInstanceProfileArn
     */
    public String getDefaultInstanceProfileArn() {
        return DefaultInstanceProfileArn;
    }

    /**
     * @param DefaultInstanceProfileArn the DefaultInstanceProfileArn to set
     */
    public void setDefaultInstanceProfileArn(String DefaultInstanceProfileArn) {
	this.DefaultInstanceProfileArn = DefaultInstanceProfileArn;
    }

    /**
     * @return the UseOpsworksSecurityGroups
     */
    public String getUseOpsworksSecurityGroups() {
        return UseOpsworksSecurityGroups;
    }

    /**
     * @param UseOpsworksSecurityGroups the UseOpsworksSecurityGroups to set
     */
    public void setUseOpsworksSecurityGroups(String UseOpsworksSecurityGroups) {
	this.UseOpsworksSecurityGroups = UseOpsworksSecurityGroups;
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
     * @return the Attributes
     */
    public String getAttributes() {
        return Attributes;
    }

    /**
     * @param Attributes the Attributes to set
     */
    public void setAttributes(String Attributes) {
	this.Attributes = Attributes;
    }

    /**
     * @return the ChefConfiguration
     */
    public String getChefConfiguration() {
        return ChefConfiguration;
    }

    /**
     * @param ChefConfiguration the ChefConfiguration to set
     */
    public void setChefConfiguration(String ChefConfiguration) {
	this.ChefConfiguration = ChefConfiguration;
    }

    /**
     * @return the DefaultOs
     */
    public String getDefaultOs() {
        return DefaultOs;
    }

    /**
     * @param DefaultOs the DefaultOs to set
     */
    public void setDefaultOs(String DefaultOs) {
	this.DefaultOs = DefaultOs;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }

    /**
     * @return the CustomCookbooksSource
     */
    public String getCustomCookbooksSource() {
        return CustomCookbooksSource;
    }

    /**
     * @param CustomCookbooksSource the CustomCookbooksSource to set
     */
    public void setCustomCookbooksSource(String CustomCookbooksSource) {
	this.CustomCookbooksSource = CustomCookbooksSource;
    }

    /**
     * @return the DefaultRootDeviceType
     */
    public String getDefaultRootDeviceType() {
        return DefaultRootDeviceType;
    }

    /**
     * @param DefaultRootDeviceType the DefaultRootDeviceType to set
     */
    public void setDefaultRootDeviceType(String DefaultRootDeviceType) {
	this.DefaultRootDeviceType = DefaultRootDeviceType;
    }

    /**
     * @return the CloneAppIds
     */
    public String getCloneAppIds() {
        return CloneAppIds;
    }

    /**
     * @param CloneAppIds the CloneAppIds to set
     */
    public void setCloneAppIds(String CloneAppIds) {
	this.CloneAppIds = CloneAppIds;
    }

    /**
     * @return the DefaultSshKeyName
     */
    public String getDefaultSshKeyName() {
        return DefaultSshKeyName;
    }

    /**
     * @param DefaultSshKeyName the DefaultSshKeyName to set
     */
    public void setDefaultSshKeyName(String DefaultSshKeyName) {
	this.DefaultSshKeyName = DefaultSshKeyName;
    }

    /**
     * @return the ConfigurationManager
     */
    public String getConfigurationManager() {
        return ConfigurationManager;
    }

    /**
     * @param ConfigurationManager the ConfigurationManager to set
     */
    public void setConfigurationManager(String ConfigurationManager) {
	this.ConfigurationManager = ConfigurationManager;
    }

    /**
     * @return the DefaultSubnetId
     */
    public String getDefaultSubnetId() {
        return DefaultSubnetId;
    }

    /**
     * @param DefaultSubnetId the DefaultSubnetId to set
     */
    public void setDefaultSubnetId(String DefaultSubnetId) {
	this.DefaultSubnetId = DefaultSubnetId;
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
     * @return the CustomJson
     */
    public String getCustomJson() {
        return CustomJson;
    }

    /**
     * @param CustomJson the CustomJson to set
     */
    public void setCustomJson(String CustomJson) {
	this.CustomJson = CustomJson;
    }

    /**
     * @return the ServiceRoleArn
     */
    public String getServiceRoleArn() {
        return ServiceRoleArn;
    }

    /**
     * @param ServiceRoleArn the ServiceRoleArn to set
     */
    public void setServiceRoleArn(String ServiceRoleArn) {
	this.ServiceRoleArn = ServiceRoleArn;
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
     * @return the UseCustomCookbooks
     */
    public String getUseCustomCookbooks() {
        return UseCustomCookbooks;
    }

    /**
     * @param UseCustomCookbooks the UseCustomCookbooks to set
     */
    public void setUseCustomCookbooks(String UseCustomCookbooks) {
	this.UseCustomCookbooks = UseCustomCookbooks;
    }

    /**
     * @return the DefaultAvailabilityZone
     */
    public String getDefaultAvailabilityZone() {
        return DefaultAvailabilityZone;
    }

    /**
     * @param DefaultAvailabilityZone the DefaultAvailabilityZone to set
     */
    public void setDefaultAvailabilityZone(String DefaultAvailabilityZone) {
	this.DefaultAvailabilityZone = DefaultAvailabilityZone;
    }

    /**
     * @return the RdsDbInstances
     */
    public String getRdsDbInstances() {
        return RdsDbInstances;
    }

    /**
     * @param RdsDbInstances the RdsDbInstances to set
     */
    public void setRdsDbInstances(String RdsDbInstances) {
	this.RdsDbInstances = RdsDbInstances;
    }

    /**
     * @return the SourceStackId
     */
    public String getSourceStackId() {
        return SourceStackId;
    }

    /**
     * @param SourceStackId the SourceStackId to set
     */
    public void setSourceStackId(String SourceStackId) {
	this.SourceStackId = SourceStackId;
    }

    /**
     * @return the VpcId
     */
    public String getVpcId() {
        return VpcId;
    }

    /**
     * @param VpcId the VpcId to set
     */
    public void setVpcId(String VpcId) {
	this.VpcId = VpcId;
    }

    /**
     * @return the HostnameTheme
     */
    public String getHostnameTheme() {
        return HostnameTheme;
    }

    /**
     * @param HostnameTheme the HostnameTheme to set
     */
    public void setHostnameTheme(String HostnameTheme) {
	this.HostnameTheme = HostnameTheme;
    }

    /**
     * @return the EcsClusterArn
     */
    public String getEcsClusterArn() {
        return EcsClusterArn;
    }

    /**
     * @param EcsClusterArn the EcsClusterArn to set
     */
    public void setEcsClusterArn(String EcsClusterArn) {
	this.EcsClusterArn = EcsClusterArn;
    }


}