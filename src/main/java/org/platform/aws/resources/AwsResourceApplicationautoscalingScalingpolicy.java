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
public class AwsResourceApplicationautoscalingScalingpolicy {

    /**
     * An Application Auto Scaling policy type. 
     */
    private String PolicyType;

    /**
     * The unique resource identifier for the scalable target that this scaling policy applies to. For more information, see the ResourceId parameter for the PutScalingPolicy action in the Application Auto Scaling API Reference. 
     */
    private String ResourceId;

    /**
     * The AWS CloudFormation-generated ID of an Application Auto Scaling scalable target. For more information about the ID, see the Return Value section of the AWS::ApplicationAutoScaling::ScalableTarget resource. 
     */
    private String ScalingTargetId;

    /**
     * A name for the scaling policy. 
     */
    private String PolicyName;

    /**
     * The AWS service namespace of the scalable target that this scaling policy applies to. For a list of service namespaces, see AWS Service Namespaces in the AWS General Reference. 
     */
    private String ServiceNamespace;

    /**
     * The scalable dimension of the scalable target that this scaling policy applies to. The scalable dimension contains the service namespace, resource type, and scaling property, such as ecs:service:DesiredCount for the desired task count of an Amazon ECS service. 
     */
    private String ScalableDimension;

    /**
     * Configures a target tracking scaling policy. 
     */
    private String TargetTrackingScalingPolicyConfiguration;

    /**
     * A step policy that configures when Application Auto Scaling scales resources up or down, and by how much. 
     */
    private String StepScalingPolicyConfiguration;

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
     * @return the ResourceId
     */
    public String getResourceId() {
        return ResourceId;
    }

    /**
     * @param ResourceId the ResourceId to set
     */
    public void setResourceId(String ResourceId) {
	this.ResourceId = ResourceId;
    }

    /**
     * @return the ScalingTargetId
     */
    public String getScalingTargetId() {
        return ScalingTargetId;
    }

    /**
     * @param ScalingTargetId the ScalingTargetId to set
     */
    public void setScalingTargetId(String ScalingTargetId) {
	this.ScalingTargetId = ScalingTargetId;
    }

    /**
     * @return the PolicyName
     */
    public String getPolicyName() {
        return PolicyName;
    }

    /**
     * @param PolicyName the PolicyName to set
     */
    public void setPolicyName(String PolicyName) {
	this.PolicyName = PolicyName;
    }

    /**
     * @return the ServiceNamespace
     */
    public String getServiceNamespace() {
        return ServiceNamespace;
    }

    /**
     * @param ServiceNamespace the ServiceNamespace to set
     */
    public void setServiceNamespace(String ServiceNamespace) {
	this.ServiceNamespace = ServiceNamespace;
    }

    /**
     * @return the ScalableDimension
     */
    public String getScalableDimension() {
        return ScalableDimension;
    }

    /**
     * @param ScalableDimension the ScalableDimension to set
     */
    public void setScalableDimension(String ScalableDimension) {
	this.ScalableDimension = ScalableDimension;
    }

    /**
     * @return the TargetTrackingScalingPolicyConfiguration
     */
    public String getTargetTrackingScalingPolicyConfiguration() {
        return TargetTrackingScalingPolicyConfiguration;
    }

    /**
     * @param TargetTrackingScalingPolicyConfiguration the TargetTrackingScalingPolicyConfiguration to set
     */
    public void setTargetTrackingScalingPolicyConfiguration(String TargetTrackingScalingPolicyConfiguration) {
	this.TargetTrackingScalingPolicyConfiguration = TargetTrackingScalingPolicyConfiguration;
    }

    /**
     * @return the StepScalingPolicyConfiguration
     */
    public String getStepScalingPolicyConfiguration() {
        return StepScalingPolicyConfiguration;
    }

    /**
     * @param StepScalingPolicyConfiguration the StepScalingPolicyConfiguration to set
     */
    public void setStepScalingPolicyConfiguration(String StepScalingPolicyConfiguration) {
	this.StepScalingPolicyConfiguration = StepScalingPolicyConfiguration;
    }


}