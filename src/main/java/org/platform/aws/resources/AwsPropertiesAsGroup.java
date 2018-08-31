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
public class AwsPropertiesAsGroup {

    /**
     * The lifecycle hooks for the group, which specify actions to perform when Auto Scaling launches or terminates instances. For more information, see Amazon EC2 Auto Scaling Lifecycle Hooks in the Amazon EC2 Auto Scaling User Guide. 
     */
    private String LifecycleHookSpecificationList;

    /**
     * A list of Classic load balancers associated with this Auto Scaling group. To specify Application load balancers, use TargetGroupARNs. 
     */
    private String LoadBalancerNames;

    /**
     * Specifies the name of the associated AWS::AutoScaling::LaunchConfiguration resource. 
     */
    private String LaunchConfigurationName;

    /**
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. 
     */
    private String ServiceLinkedRoleARN;

    /**
     * The ID of the Amazon EC2 instance you want to use to create the Auto Scaling group. Use this property if you want to create an Auto Scaling group that uses an existing Amazon EC2 instance instead of a launch configuration. 
     */
    private String InstanceId;

    /**
     * A list of Amazon Resource Names (ARN) of target groups to associate with the Auto Scaling group. 
     */
    private String TargetGroupARNs;

    /**
     * Contains a list of availability zones for the group. 
     */
    private String AvailabilityZones;

    /**
     * The number of seconds after a scaling activity is completed before any further scaling activities can start. 
     */
    private String Cooldown;

    /**
     * An embedded property that configures an Auto Scaling group to send notifications when specified events take place. 
     */
    private String NotificationConfigurations;

    /**
     * Specifies the desired capacity for the Auto Scaling group. 
     */
    private String DesiredCapacity;

    /**
     * The length of time in seconds after a new EC2 instance comes into service that Auto Scaling starts checking its health. 
     */
    private String HealthCheckGracePeriod;

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group. 
     */
    private String MetricsCollection;

    /**
     * The maximum size of the Auto Scaling group. 
     */
    private String MaxSize;

    /**
     * The minimum size of the Auto Scaling group. 
     */
    private String MinSize;

    /**
     * A policy or a list of policies that are used to select the instances to terminate. The policies are executed in the order that you list them. 
     */
    private String TerminationPolicies;

    /**
     * The launch template to use to launch instances. 
     */
    private String LaunchTemplate;

    /**
     * The name of the Auto Scaling group. 
     */
    private String AutoScalingGroupName;

    /**
     * A list of subnet identifiers of Amazon Virtual Private Cloud (Amazon VPCs). 
     */
    private String VPCZoneIdentifier;

    /**
     * The name of an existing cluster placement group into which you want to launch your instances. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. 
     */
    private String PlacementGroup;

    /**
     * The service you want the health status from, Amazon EC2 or Elastic Load Balancer. Valid values are EC2 or ELB. 
     */
    private String HealthCheckType;

    /**
     * The Auto Scaling tags to attach to this resource. For more information about Auto Scaling tags, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide. 
     */
    private String Tags;

    /**
     * @return the LifecycleHookSpecificationList
     */
    public String getLifecycleHookSpecificationList() {
        return LifecycleHookSpecificationList;
    }

    /**
     * @param LifecycleHookSpecificationList the LifecycleHookSpecificationList to set
     */
    public void setLifecycleHookSpecificationList(String LifecycleHookSpecificationList) {
	this.LifecycleHookSpecificationList = LifecycleHookSpecificationList;
    }

    /**
     * @return the LoadBalancerNames
     */
    public String getLoadBalancerNames() {
        return LoadBalancerNames;
    }

    /**
     * @param LoadBalancerNames the LoadBalancerNames to set
     */
    public void setLoadBalancerNames(String LoadBalancerNames) {
	this.LoadBalancerNames = LoadBalancerNames;
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
     * @return the ServiceLinkedRoleARN
     */
    public String getServiceLinkedRoleARN() {
        return ServiceLinkedRoleARN;
    }

    /**
     * @param ServiceLinkedRoleARN the ServiceLinkedRoleARN to set
     */
    public void setServiceLinkedRoleARN(String ServiceLinkedRoleARN) {
	this.ServiceLinkedRoleARN = ServiceLinkedRoleARN;
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
     * @return the TargetGroupARNs
     */
    public String getTargetGroupARNs() {
        return TargetGroupARNs;
    }

    /**
     * @param TargetGroupARNs the TargetGroupARNs to set
     */
    public void setTargetGroupARNs(String TargetGroupARNs) {
	this.TargetGroupARNs = TargetGroupARNs;
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
     * @return the Cooldown
     */
    public String getCooldown() {
        return Cooldown;
    }

    /**
     * @param Cooldown the Cooldown to set
     */
    public void setCooldown(String Cooldown) {
	this.Cooldown = Cooldown;
    }

    /**
     * @return the NotificationConfigurations
     */
    public String getNotificationConfigurations() {
        return NotificationConfigurations;
    }

    /**
     * @param NotificationConfigurations the NotificationConfigurations to set
     */
    public void setNotificationConfigurations(String NotificationConfigurations) {
	this.NotificationConfigurations = NotificationConfigurations;
    }

    /**
     * @return the DesiredCapacity
     */
    public String getDesiredCapacity() {
        return DesiredCapacity;
    }

    /**
     * @param DesiredCapacity the DesiredCapacity to set
     */
    public void setDesiredCapacity(String DesiredCapacity) {
	this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * @return the HealthCheckGracePeriod
     */
    public String getHealthCheckGracePeriod() {
        return HealthCheckGracePeriod;
    }

    /**
     * @param HealthCheckGracePeriod the HealthCheckGracePeriod to set
     */
    public void setHealthCheckGracePeriod(String HealthCheckGracePeriod) {
	this.HealthCheckGracePeriod = HealthCheckGracePeriod;
    }

    /**
     * @return the MetricsCollection
     */
    public String getMetricsCollection() {
        return MetricsCollection;
    }

    /**
     * @param MetricsCollection the MetricsCollection to set
     */
    public void setMetricsCollection(String MetricsCollection) {
	this.MetricsCollection = MetricsCollection;
    }

    /**
     * @return the MaxSize
     */
    public String getMaxSize() {
        return MaxSize;
    }

    /**
     * @param MaxSize the MaxSize to set
     */
    public void setMaxSize(String MaxSize) {
	this.MaxSize = MaxSize;
    }

    /**
     * @return the MinSize
     */
    public String getMinSize() {
        return MinSize;
    }

    /**
     * @param MinSize the MinSize to set
     */
    public void setMinSize(String MinSize) {
	this.MinSize = MinSize;
    }

    /**
     * @return the TerminationPolicies
     */
    public String getTerminationPolicies() {
        return TerminationPolicies;
    }

    /**
     * @param TerminationPolicies the TerminationPolicies to set
     */
    public void setTerminationPolicies(String TerminationPolicies) {
	this.TerminationPolicies = TerminationPolicies;
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
     * @return the AutoScalingGroupName
     */
    public String getAutoScalingGroupName() {
        return AutoScalingGroupName;
    }

    /**
     * @param AutoScalingGroupName the AutoScalingGroupName to set
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
	this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * @return the VPCZoneIdentifier
     */
    public String getVPCZoneIdentifier() {
        return VPCZoneIdentifier;
    }

    /**
     * @param VPCZoneIdentifier the VPCZoneIdentifier to set
     */
    public void setVPCZoneIdentifier(String VPCZoneIdentifier) {
	this.VPCZoneIdentifier = VPCZoneIdentifier;
    }

    /**
     * @return the PlacementGroup
     */
    public String getPlacementGroup() {
        return PlacementGroup;
    }

    /**
     * @param PlacementGroup the PlacementGroup to set
     */
    public void setPlacementGroup(String PlacementGroup) {
	this.PlacementGroup = PlacementGroup;
    }

    /**
     * @return the HealthCheckType
     */
    public String getHealthCheckType() {
        return HealthCheckType;
    }

    /**
     * @param HealthCheckType the HealthCheckType to set
     */
    public void setHealthCheckType(String HealthCheckType) {
	this.HealthCheckType = HealthCheckType;
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