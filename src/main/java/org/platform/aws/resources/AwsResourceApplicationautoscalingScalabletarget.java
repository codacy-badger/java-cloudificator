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
public class AwsResourceApplicationautoscalingScalabletarget {

    /**
     * The scheduled actions for the scalable target. Duplicates aren't allowed. 
     */
    private String ScheduledActions;

    /**
     * The resource identifier to associate with this scalable target. This string consists of the resource type and unique identifier. For more information, see the ResourceId parameter for the RegisterScalableTarget action in the Application Auto Scaling API Reference, or see the ScalableTarget examples. 
     */
    private String ResourceId;

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource provided by your own application or service. For valid AWS service namespace values, see the RegisterScalableTarget action in the Application Auto Scaling API Reference. 
     */
    private String ServiceNamespace;

    /**
     * The scalable dimension that's associated with the scalable target. Specify the service namespace, resource type, and scaling property—for example, ecs:service:DesiredCount for the desired task count of an Amazon Elastic Container Service service. For valid values, see the ScalableDimension content for the ScalingPolicy data type in the Application Auto Scaling API Reference. 
     */
    private String ScalableDimension;

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling activity. 
     */
    private String MinCapacity;

    /**
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that allows Application Auto Scaling to modify your scalable target. 
     */
    private String RoleARN;

    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling activity. 
     */
    private String MaxCapacity;

    /**
     * @return the ScheduledActions
     */
    public String getScheduledActions() {
        return ScheduledActions;
    }

    /**
     * @param ScheduledActions the ScheduledActions to set
     */
    public void setScheduledActions(String ScheduledActions) {
	this.ScheduledActions = ScheduledActions;
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
     * @return the MinCapacity
     */
    public String getMinCapacity() {
        return MinCapacity;
    }

    /**
     * @param MinCapacity the MinCapacity to set
     */
    public void setMinCapacity(String MinCapacity) {
	this.MinCapacity = MinCapacity;
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

    /**
     * @return the MaxCapacity
     */
    public String getMaxCapacity() {
        return MaxCapacity;
    }

    /**
     * @param MaxCapacity the MaxCapacity to set
     */
    public void setMaxCapacity(String MaxCapacity) {
	this.MaxCapacity = MaxCapacity;
    }


}