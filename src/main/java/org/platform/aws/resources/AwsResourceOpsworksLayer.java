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
public class AwsResourceOpsworksLayer {

    /**
     * Whether to automatically heal Amazon EC2 instances that have become disconnected or timed out. 
     */
    private String EnableAutoHealing;

    /**
     * The load-based scaling configuration for the AWS OpsWorks layer. 
     */
    private String LoadBasedAutoScaling;

    /**
     * One or more user-defined key-value pairs to be added to the stack attributes bag. 
     */
    private String Attributes;

    /**
     * The Amazon Resource Name (ARN) of an IAM instance profile that is to be used for the Amazon EC2 instances in this layer. 
     */
    private String CustomInstanceProfileArn;

    /**
     * Whether to install operating system and package updates when the instance boots. 
     */
    private String InstallUpdatesOnBoot;

    /**
     * Describes the Amazon EBS volumes for this layer. 
     */
    private String VolumeConfigurations;

    /**
     * The AWS OpsWorks layer name. 
     */
    private String Name;

    /**
     * Custom security group IDs for this layer. 
     */
    private String CustomSecurityGroupIds;

    /**
     * The layer type. A stack cannot have more than one layer of the same type, except for the custom type. You can have any number of custom types. For more information, see CreateLayer in the AWS OpsWorks Stacks API Reference. 
     */
    private String Type;

    /**
     * Whether to automatically assign an Elastic IP address to Amazon EC2 instances in this layer. 
     */
    private String AutoAssignElasticIps;

    /**
     * The packages for this layer. 
     */
    private String Packages;

    /**
     * The lifecycle events for the AWS OpsWorks layer. 
     */
    private String LifecycleEventConfiguration;

    /**
     * The layer short name, which is used internally by AWS OpsWorks and by Chef recipes. The short name is also used as the name for the directory where your app files are installed. 
     */
    private String Shortname;

    /**
     * For AWS OpsWorks stacks that are running in a VPC, whether to automatically assign a public IP address to Amazon EC2 instances in this layer. 
     */
    private String AutoAssignPublicIps;

    /**
     * Custom event recipes for this layer. 
     */
    private String CustomRecipes;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this AWS OpsWorks layer. Use tags to manage your resources. 
     */
    private String Tags;

    /**
     * A custom stack configuration and deployment attributes that AWS OpsWorks installs on the layer's instances. For more information, see the CustomJson parameter for the CreateLayer action in the AWS OpsWorks Stacks API Reference. 
     */
    private String CustomJson;

    /**
     * The ID of the AWS OpsWorks stack that this layer will be associated with. 
     */
    private String StackId;

    /**
     * @return the EnableAutoHealing
     */
    public String getEnableAutoHealing() {
        return EnableAutoHealing;
    }

    /**
     * @param EnableAutoHealing the EnableAutoHealing to set
     */
    public void setEnableAutoHealing(String EnableAutoHealing) {
	this.EnableAutoHealing = EnableAutoHealing;
    }

    /**
     * @return the LoadBasedAutoScaling
     */
    public String getLoadBasedAutoScaling() {
        return LoadBasedAutoScaling;
    }

    /**
     * @param LoadBasedAutoScaling the LoadBasedAutoScaling to set
     */
    public void setLoadBasedAutoScaling(String LoadBasedAutoScaling) {
	this.LoadBasedAutoScaling = LoadBasedAutoScaling;
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
     * @return the CustomInstanceProfileArn
     */
    public String getCustomInstanceProfileArn() {
        return CustomInstanceProfileArn;
    }

    /**
     * @param CustomInstanceProfileArn the CustomInstanceProfileArn to set
     */
    public void setCustomInstanceProfileArn(String CustomInstanceProfileArn) {
	this.CustomInstanceProfileArn = CustomInstanceProfileArn;
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
     * @return the VolumeConfigurations
     */
    public String getVolumeConfigurations() {
        return VolumeConfigurations;
    }

    /**
     * @param VolumeConfigurations the VolumeConfigurations to set
     */
    public void setVolumeConfigurations(String VolumeConfigurations) {
	this.VolumeConfigurations = VolumeConfigurations;
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
     * @return the CustomSecurityGroupIds
     */
    public String getCustomSecurityGroupIds() {
        return CustomSecurityGroupIds;
    }

    /**
     * @param CustomSecurityGroupIds the CustomSecurityGroupIds to set
     */
    public void setCustomSecurityGroupIds(String CustomSecurityGroupIds) {
	this.CustomSecurityGroupIds = CustomSecurityGroupIds;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the AutoAssignElasticIps
     */
    public String getAutoAssignElasticIps() {
        return AutoAssignElasticIps;
    }

    /**
     * @param AutoAssignElasticIps the AutoAssignElasticIps to set
     */
    public void setAutoAssignElasticIps(String AutoAssignElasticIps) {
	this.AutoAssignElasticIps = AutoAssignElasticIps;
    }

    /**
     * @return the Packages
     */
    public String getPackages() {
        return Packages;
    }

    /**
     * @param Packages the Packages to set
     */
    public void setPackages(String Packages) {
	this.Packages = Packages;
    }

    /**
     * @return the LifecycleEventConfiguration
     */
    public String getLifecycleEventConfiguration() {
        return LifecycleEventConfiguration;
    }

    /**
     * @param LifecycleEventConfiguration the LifecycleEventConfiguration to set
     */
    public void setLifecycleEventConfiguration(String LifecycleEventConfiguration) {
	this.LifecycleEventConfiguration = LifecycleEventConfiguration;
    }

    /**
     * @return the Shortname
     */
    public String getShortname() {
        return Shortname;
    }

    /**
     * @param Shortname the Shortname to set
     */
    public void setShortname(String Shortname) {
	this.Shortname = Shortname;
    }

    /**
     * @return the AutoAssignPublicIps
     */
    public String getAutoAssignPublicIps() {
        return AutoAssignPublicIps;
    }

    /**
     * @param AutoAssignPublicIps the AutoAssignPublicIps to set
     */
    public void setAutoAssignPublicIps(String AutoAssignPublicIps) {
	this.AutoAssignPublicIps = AutoAssignPublicIps;
    }

    /**
     * @return the CustomRecipes
     */
    public String getCustomRecipes() {
        return CustomRecipes;
    }

    /**
     * @param CustomRecipes the CustomRecipes to set
     */
    public void setCustomRecipes(String CustomRecipes) {
	this.CustomRecipes = CustomRecipes;
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