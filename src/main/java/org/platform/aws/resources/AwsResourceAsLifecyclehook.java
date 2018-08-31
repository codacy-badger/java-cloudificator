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
public class AwsResourceAsLifecyclehook {

    /**
     * The name of the lifecycle hook. Length Constraints: Minimum length of 1. Maximum length of 255. 
     */
    private String LifecycleHookName;

    /**
     * The state of the Amazon EC2 instance to which you want to attach the lifecycle hook. For valid values, see the LifecycleTransition content for the LifecycleHook data type in the Amazon EC2 Auto Scaling API Reference. 
     */
    private String LifecycleTransition;

    /**
     * The name of the Auto Scaling group for the lifecycle hook. 
     */
    private String AutoScalingGroupName;

    /**
     * The amount of time (in seconds) that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action that you specified in the DefaultResult property. 
     */
    private String HeartbeatTimeout;

    /**
     * Additional information that you want to include when Auto Scaling sends a message to the notification target. 
     */
    private String NotificationMetadata;

    /**
     * The action the Auto Scaling group takes when the lifecycle hook timeout elapses or if an unexpected failure occurs. Valid values are CONTINUE (default) and ABANDON. 
     */
    private String DefaultResult;

    /**
     * The Amazon resource name (ARN) of the notification target that Auto Scaling uses to notify you when an instance is in the transition state for the lifecycle hook. You can specify an Amazon SQS queue or an Amazon SNS topic. The notification message includes the following information: lifecycle action token, user account ID, Auto Scaling group name, lifecycle hook name, instance ID, lifecycle transition, and notification metadata. 
     */
    private String NotificationTargetARN;

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target. The role requires permissions to Amazon SNS and Amazon SQS. 
     */
    private String RoleARN;

    /**
     * @return the LifecycleHookName
     */
    public String getLifecycleHookName() {
        return LifecycleHookName;
    }

    /**
     * @param LifecycleHookName the LifecycleHookName to set
     */
    public void setLifecycleHookName(String LifecycleHookName) {
	this.LifecycleHookName = LifecycleHookName;
    }

    /**
     * @return the LifecycleTransition
     */
    public String getLifecycleTransition() {
        return LifecycleTransition;
    }

    /**
     * @param LifecycleTransition the LifecycleTransition to set
     */
    public void setLifecycleTransition(String LifecycleTransition) {
	this.LifecycleTransition = LifecycleTransition;
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
     * @return the HeartbeatTimeout
     */
    public String getHeartbeatTimeout() {
        return HeartbeatTimeout;
    }

    /**
     * @param HeartbeatTimeout the HeartbeatTimeout to set
     */
    public void setHeartbeatTimeout(String HeartbeatTimeout) {
	this.HeartbeatTimeout = HeartbeatTimeout;
    }

    /**
     * @return the NotificationMetadata
     */
    public String getNotificationMetadata() {
        return NotificationMetadata;
    }

    /**
     * @param NotificationMetadata the NotificationMetadata to set
     */
    public void setNotificationMetadata(String NotificationMetadata) {
	this.NotificationMetadata = NotificationMetadata;
    }

    /**
     * @return the DefaultResult
     */
    public String getDefaultResult() {
        return DefaultResult;
    }

    /**
     * @param DefaultResult the DefaultResult to set
     */
    public void setDefaultResult(String DefaultResult) {
	this.DefaultResult = DefaultResult;
    }

    /**
     * @return the NotificationTargetARN
     */
    public String getNotificationTargetARN() {
        return NotificationTargetARN;
    }

    /**
     * @param NotificationTargetARN the NotificationTargetARN to set
     */
    public void setNotificationTargetARN(String NotificationTargetARN) {
	this.NotificationTargetARN = NotificationTargetARN;
    }

    /**
     * @return the RoleARN
     */
    public String getRoleARN() {
        return RoleARN;
    }

    /**
     * @param RoleARN the RoleARN to set
     */
    public void setRoleARN(String RoleARN) {
	this.RoleARN = RoleARN;
    }


}