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
public class AwsPropertiesAsPolicy {

    /**
     * The aggregation type for the CloudWatch metrics. You can specify Minimum, Maximum, or Average. By default, AWS CloudFormation specifies Average. 
     */
    private String MetricAggregationType;

    /**
     * An Auto Scaling policy type. You can specify SimpleScaling, StepScaling, or TargetTrackingScaling. By default, AWS CloudFormation specifies SimpleScaling. For more information, see Dynamic Scaling in the Amazon EC2 Auto Scaling User Guide. 
     */
    private String PolicyType;

    /**
     * The number of instances by which to scale. The AdjustmentType property determines if AWS CloudFormation interprets this number as an absolute number (when the ExactCapacity value is specified), increase or decrease capacity by a specified number (when the ChangeInCapacity value is specified), or increase or decrease capacity as a percentage of the existing Auto Scaling group size (when the PercentChangeInCapacity value is specified). A positive value adds to the current capacity and a negative value subtracts from the current capacity. For exact capacity, you must specify a positive value. 
     */
    private String ScalingAdjustment;

    /**
     * The amount of time, in seconds, after a scaling activity completes before any further trigger-related scaling activities can start. 
     */
    private String Cooldown;

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach. 
     */
    private String StepAdjustments;

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling Group that you want to attach the policy to. 
     */
    private String AutoScalingGroupName;

    /**
     * For the PercentChangeInCapacity adjustment type, the minimum number of instances to scale. The scaling policy changes the desired capacity of the Auto Scaling group by a minimum of this many instances. This property replaces the MinAdjustmentStep property. 
     */
    private String MinAdjustmentMagnitude;

    /**
     * Configures a target tracking scaling policy. 
     */
    private String TargetTrackingConfiguration;

    /**
     * The estimated time, in seconds, until a newly launched instance can send metrics to CloudWatch. By default, Auto Scaling uses the cooldown period, as specified in the Cooldown property. 
     */
    private String EstimatedInstanceWarmup;

    /**
     * Specifies whether the ScalingAdjustment is an absolute number or a percentage of the current capacity. Valid values are ChangeInCapacity, ExactCapacity, and PercentChangeInCapacity. 
     */
    private String AdjustmentType;

    /**
     * @return the MetricAggregationType
     */
    public String getMetricAggregationType() {
        return MetricAggregationType;
    }

    /**
     * @param MetricAggregationType the MetricAggregationType to set
     */
    public void setMetricAggregationType(String MetricAggregationType) {
	this.MetricAggregationType = MetricAggregationType;
    }

    /**
     * @return the PolicyType
     */
    public String getPolicyType() {
        return PolicyType;
    }

    /**
     * @param PolicyType the PolicyType to set
     */
    public void setPolicyType(String PolicyType) {
	this.PolicyType = PolicyType;
    }

    /**
     * @return the ScalingAdjustment
     */
    public String getScalingAdjustment() {
        return ScalingAdjustment;
    }

    /**
     * @param ScalingAdjustment the ScalingAdjustment to set
     */
    public void setScalingAdjustment(String ScalingAdjustment) {
	this.ScalingAdjustment = ScalingAdjustment;
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
     * @return the StepAdjustments
     */
    public String getStepAdjustments() {
        return StepAdjustments;
    }

    /**
     * @param StepAdjustments the StepAdjustments to set
     */
    public void setStepAdjustments(String StepAdjustments) {
	this.StepAdjustments = StepAdjustments;
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
     * @return the MinAdjustmentMagnitude
     */
    public String getMinAdjustmentMagnitude() {
        return MinAdjustmentMagnitude;
    }

    /**
     * @param MinAdjustmentMagnitude the MinAdjustmentMagnitude to set
     */
    public void setMinAdjustmentMagnitude(String MinAdjustmentMagnitude) {
	this.MinAdjustmentMagnitude = MinAdjustmentMagnitude;
    }

    /**
     * @return the TargetTrackingConfiguration
     */
    public String getTargetTrackingConfiguration() {
        return TargetTrackingConfiguration;
    }

    /**
     * @param TargetTrackingConfiguration the TargetTrackingConfiguration to set
     */
    public void setTargetTrackingConfiguration(String TargetTrackingConfiguration) {
	this.TargetTrackingConfiguration = TargetTrackingConfiguration;
    }

    /**
     * @return the EstimatedInstanceWarmup
     */
    public String getEstimatedInstanceWarmup() {
        return EstimatedInstanceWarmup;
    }

    /**
     * @param EstimatedInstanceWarmup the EstimatedInstanceWarmup to set
     */
    public void setEstimatedInstanceWarmup(String EstimatedInstanceWarmup) {
	this.EstimatedInstanceWarmup = EstimatedInstanceWarmup;
    }

    /**
     * @return the AdjustmentType
     */
    public String getAdjustmentType() {
        return AdjustmentType;
    }

    /**
     * @param AdjustmentType the AdjustmentType to set
     */
    public void setAdjustmentType(String AdjustmentType) {
	this.AdjustmentType = AdjustmentType;
    }


}