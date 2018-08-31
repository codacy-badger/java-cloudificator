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
public class AwsResourceEmrCluster {

    /**
     * (Intended for advanced uses only.) Additional features that you want to select. This is meta information about third-party applications that third-party vendors use for testing purposes. 
     */
    private String AdditionalInfo;

    /**
     * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. 
     */
    private String KerberosAttributes;

    /**
     * The software applications to deploy on the cluster, and the arguments that Amazon EMR passes to those applications. 
     */
    private String Applications;

    /**
     * An AWS Identity and Access Management (IAM) role for automatic scaling policies. The default role is EMR_AutoScaling_DefaultRole. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate Amazon EC2 instances in an instance group. 
     */
    private String AutoScalingRole;

    /**
     * The size, in GiB, of the EBS root device volume of the Linux AMI that's used for each EC2 instance. 
     */
    private String EbsRootVolumeSize;

    /**
     * A custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). For more information, see Using a Custom AMI in the Amazon EMR Management Guide. 
     */
    private String CustomAmiId;

    /**
     * A name for the Amazon EMR cluster. 
     */
    private String Name;

    /**
     * Configures the EC2 instances that run jobs in the Amazon EMR cluster. 
     */
    private String Instances;

    /**
     * Indicates how individual EC2 instances terminate when an automatic scale-in activity occurs or an instance group is resized. For more information, see Cluster in the Amazon EMR API Reference. 
     */
    private String ScaleDownBehavior;

    /**
     * The IAM role that Amazon EMR assumes to access AWS resources on your behalf. For more information, see Configure IAM Roles for Amazon EMR in the Amazon EMR Management Guide. 
     */
    private String ServiceRole;

    /**
     * An S3 bucket location that Amazon EMR writes logs files to from a job flow. If you don't specify a value, Amazon EMR doesn't write any log files. 
     */
    private String LogUri;

    /**
     * (Also called instance profile and EC2 role.) Accepts an instance profile that's associated with the role that you want to use. All EC2 instances in the cluster assume this role. For more information, see Create and Use IAM Roles for Amazon EMR in the Amazon EMR Management Guide. 
     */
    private String JobFlowRole;

    /**
     * Indicates whether the instances in the cluster are visible to all IAM users in the AWS account. If you specify true, all IAM users can view and (if they have permissions) manage the instances. If you specify false, only the IAM user that created the cluster can view and manage it. 
     */
    private String VisibleToAllUsers;

    /**
     * A list of bootstrap actions that Amazon EMR runs before starting applications on the cluster. 
     */
    private String BootstrapActions;

    /**
     * The name of the security configuration that's applied to the cluster. 
     */
    private String SecurityConfiguration;

    /**
     * The software configuration of the Amazon EMR cluster. 
     */
    private String Configurations;

    /**
     * The Amazon EMR software release label. A release is a set of software applications and components that you can install and configure on an Amazon EMR cluster. For more information, see About Amazon EMR Releases in the Amazon EMR Release Guide. 
     */
    private String ReleaseLabel;

    /**
     * An arbitrary set of tags (key–value pairs) to help you identify the Amazon EMR cluster. 
     */
    private String Tags;

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
     * @return the KerberosAttributes
     */
    public String getKerberosAttributes() {
        return KerberosAttributes;
    }

    /**
     * @param KerberosAttributes the KerberosAttributes to set
     */
    public void setKerberosAttributes(String KerberosAttributes) {
	this.KerberosAttributes = KerberosAttributes;
    }

    /**
     * @return the Applications
     */
    public String getApplications() {
        return Applications;
    }

    /**
     * @param Applications the Applications to set
     */
    public void setApplications(String Applications) {
	this.Applications = Applications;
    }

    /**
     * @return the AutoScalingRole
     */
    public String getAutoScalingRole() {
        return AutoScalingRole;
    }

    /**
     * @param AutoScalingRole the AutoScalingRole to set
     */
    public void setAutoScalingRole(String AutoScalingRole) {
	this.AutoScalingRole = AutoScalingRole;
    }

    /**
     * @return the EbsRootVolumeSize
     */
    public String getEbsRootVolumeSize() {
        return EbsRootVolumeSize;
    }

    /**
     * @param EbsRootVolumeSize the EbsRootVolumeSize to set
     */
    public void setEbsRootVolumeSize(String EbsRootVolumeSize) {
	this.EbsRootVolumeSize = EbsRootVolumeSize;
    }

    /**
     * @return the CustomAmiId
     */
    public String getCustomAmiId() {
        return CustomAmiId;
    }

    /**
     * @param CustomAmiId the CustomAmiId to set
     */
    public void setCustomAmiId(String CustomAmiId) {
	this.CustomAmiId = CustomAmiId;
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
     * @return the Instances
     */
    public String getInstances() {
        return Instances;
    }

    /**
     * @param Instances the Instances to set
     */
    public void setInstances(String Instances) {
	this.Instances = Instances;
    }

    /**
     * @return the ScaleDownBehavior
     */
    public String getScaleDownBehavior() {
        return ScaleDownBehavior;
    }

    /**
     * @param ScaleDownBehavior the ScaleDownBehavior to set
     */
    public void setScaleDownBehavior(String ScaleDownBehavior) {
	this.ScaleDownBehavior = ScaleDownBehavior;
    }

    /**
     * @return the ServiceRole
     */
    public String getServiceRole() {
        return ServiceRole;
    }

    /**
     * @param ServiceRole the ServiceRole to set
     */
    public void setServiceRole(String ServiceRole) {
	this.ServiceRole = ServiceRole;
    }

    /**
     * @return the LogUri
     */
    public String getLogUri() {
        return LogUri;
    }

    /**
     * @param LogUri the LogUri to set
     */
    public void setLogUri(String LogUri) {
	this.LogUri = LogUri;
    }

    /**
     * @return the JobFlowRole
     */
    public String getJobFlowRole() {
        return JobFlowRole;
    }

    /**
     * @param JobFlowRole the JobFlowRole to set
     */
    public void setJobFlowRole(String JobFlowRole) {
	this.JobFlowRole = JobFlowRole;
    }

    /**
     * @return the VisibleToAllUsers
     */
    public String getVisibleToAllUsers() {
        return VisibleToAllUsers;
    }

    /**
     * @param VisibleToAllUsers the VisibleToAllUsers to set
     */
    public void setVisibleToAllUsers(String VisibleToAllUsers) {
	this.VisibleToAllUsers = VisibleToAllUsers;
    }

    /**
     * @return the BootstrapActions
     */
    public String getBootstrapActions() {
        return BootstrapActions;
    }

    /**
     * @param BootstrapActions the BootstrapActions to set
     */
    public void setBootstrapActions(String BootstrapActions) {
	this.BootstrapActions = BootstrapActions;
    }

    /**
     * @return the SecurityConfiguration
     */
    public String getSecurityConfiguration() {
        return SecurityConfiguration;
    }

    /**
     * @param SecurityConfiguration the SecurityConfiguration to set
     */
    public void setSecurityConfiguration(String SecurityConfiguration) {
	this.SecurityConfiguration = SecurityConfiguration;
    }

    /**
     * @return the Configurations
     */
    public String getConfigurations() {
        return Configurations;
    }

    /**
     * @param Configurations the Configurations to set
     */
    public void setConfigurations(String Configurations) {
	this.Configurations = Configurations;
    }

    /**
     * @return the ReleaseLabel
     */
    public String getReleaseLabel() {
        return ReleaseLabel;
    }

    /**
     * @param ReleaseLabel the ReleaseLabel to set
     */
    public void setReleaseLabel(String ReleaseLabel) {
	this.ReleaseLabel = ReleaseLabel;
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