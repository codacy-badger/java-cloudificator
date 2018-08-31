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
public class AwsResourceEcsTaskdefinition {

    /**
     * The Amazon Resource Name (ARN) of the task execution role that containers in this task can assume. All containers in this task are granted the permissions that are specified in this role. 
     */
    private String ExecutionRoleArn;

    /**
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that grants containers in the task permission to call AWS APIs on your behalf. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide. 
     */
    private String TaskRoleArn;

    /**
     * A list of volume definitions in JSON format for the volumes that you can use in your container definitions. 
     */
    private String Volumes;

    /**
     * The amount (in MiB) of memory used by the task. If using the EC2 launch type, this field is optional and any value can be used. If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of valid values for the cpu parameter: 
     */
    private String Memory;

    /**
     * The placement constraints for the tasks in the service. 
     */
    private String PlacementConstraints;

    /**
     * A list of container definitions in JSON format that describes the containers that make up your task. 
     */
    private String ContainerDefinitions;

    /**
     * The number of cpu units used by the task. If using the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of valid values for the memory parameter: 
     */
    private String Cpu;

    /**
     * The name of a family that this task definition is registered to. A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task definition that you add. 
     */
    private String Family;

    /**
     * The launch type the task requires. If no value is specified, it will default to EC2. Valid values include EC2 and FARGATE. 
     */
    private String RequiresCompatibilities;

    /**
     * The Docker networking mode to use for the containers in the task, such as none, bridge, or host. For information about network modes, see NetworkMode in the Task Definition Parameters topic in the Amazon Elastic Container Service Developer Guide. 
     */
    private String NetworkMode;

    /**
     * @return the ExecutionRoleArn
     */
    public String getExecutionRoleArn() {
        return ExecutionRoleArn;
    }

    /**
     * @param ExecutionRoleArn the ExecutionRoleArn to set
     */
    public void setExecutionRoleArn(String ExecutionRoleArn) {
	this.ExecutionRoleArn = ExecutionRoleArn;
    }

    /**
     * @return the TaskRoleArn
     */
    public String getTaskRoleArn() {
        return TaskRoleArn;
    }

    /**
     * @param TaskRoleArn the TaskRoleArn to set
     */
    public void setTaskRoleArn(String TaskRoleArn) {
	this.TaskRoleArn = TaskRoleArn;
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
     * @return the Memory
     */
    public String getMemory() {
        return Memory;
    }

    /**
     * @param Memory the Memory to set
     */
    public void setMemory(String Memory) {
	this.Memory = Memory;
    }

    /**
     * @return the PlacementConstraints
     */
    public String getPlacementConstraints() {
        return PlacementConstraints;
    }

    /**
     * @param PlacementConstraints the PlacementConstraints to set
     */
    public void setPlacementConstraints(String PlacementConstraints) {
	this.PlacementConstraints = PlacementConstraints;
    }

    /**
     * @return the ContainerDefinitions
     */
    public String getContainerDefinitions() {
        return ContainerDefinitions;
    }

    /**
     * @param ContainerDefinitions the ContainerDefinitions to set
     */
    public void setContainerDefinitions(String ContainerDefinitions) {
	this.ContainerDefinitions = ContainerDefinitions;
    }

    /**
     * @return the Cpu
     */
    public String getCpu() {
        return Cpu;
    }

    /**
     * @param Cpu the Cpu to set
     */
    public void setCpu(String Cpu) {
	this.Cpu = Cpu;
    }

    /**
     * @return the Family
     */
    public String getFamily() {
        return Family;
    }

    /**
     * @param Family the Family to set
     */
    public void setFamily(String Family) {
	this.Family = Family;
    }

    /**
     * @return the RequiresCompatibilities
     */
    public String getRequiresCompatibilities() {
        return RequiresCompatibilities;
    }

    /**
     * @param RequiresCompatibilities the RequiresCompatibilities to set
     */
    public void setRequiresCompatibilities(String RequiresCompatibilities) {
	this.RequiresCompatibilities = RequiresCompatibilities;
    }

    /**
     * @return the NetworkMode
     */
    public String getNetworkMode() {
        return NetworkMode;
    }

    /**
     * @param NetworkMode the NetworkMode to set
     */
    public void setNetworkMode(String NetworkMode) {
	this.NetworkMode = NetworkMode;
    }


}