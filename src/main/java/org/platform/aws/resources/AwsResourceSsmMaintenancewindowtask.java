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
public class AwsResourceSsmMaintenancewindowtask {

    /**
     * The maximum number of errors allowed before this task stops being scheduled. 
     */
    private String MaxErrors;

    /**
     * A description of the task. 
     */
    private String Description;

    /**
     * The role that's used when the task is executed. 
     */
    private String ServiceRoleArn;

    /**
     * The priority of the task in the Maintenance Window. The lower the number, the higher the priority. Tasks that have the same priority are scheduled in parallel. 
     */
    private String Priority;

    /**
     * The maximum number of targets that you can run this task for, in parallel. 
     */
    private String MaxConcurrency;

    /**
     * The targets, either instances or tags. 
     */
    private String Targets;

    /**
     * The task name. 
     */
    private String Name;

    /**
     * The resource that the task uses during execution. 
     */
    private String TaskArn;

    /**
     * The parameters for task execution. 
     */
    private String TaskInvocationParameters;

    /**
     * The ID of the Maintenance Window where the task is registered. 
     */
    private String WindowId;

    /**
     * The parameters to pass to the task when it's executed. 
     */
    private String TaskParameters;

    /**
     * The type of task. Valid values: RUN_COMMAND, AUTOMATION, LAMBDA, STEP_FUNCTION. 
     */
    private String TaskType;

    /**
     * Information about an Amazon S3 bucket to write task-level logs to. 
     */
    private String LoggingInfo;

    /**
     * @return the MaxErrors
     */
    public String getMaxErrors() {
        return MaxErrors;
    }

    /**
     * @param MaxErrors the MaxErrors to set
     */
    public void setMaxErrors(String MaxErrors) {
	this.MaxErrors = MaxErrors;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
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
     * @return the Priority
     */
    public String getPriority() {
        return Priority;
    }

    /**
     * @param Priority the Priority to set
     */
    public void setPriority(String Priority) {
	this.Priority = Priority;
    }

    /**
     * @return the MaxConcurrency
     */
    public String getMaxConcurrency() {
        return MaxConcurrency;
    }

    /**
     * @param MaxConcurrency the MaxConcurrency to set
     */
    public void setMaxConcurrency(String MaxConcurrency) {
	this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
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
     * @return the TaskArn
     */
    public String getTaskArn() {
        return TaskArn;
    }

    /**
     * @param TaskArn the TaskArn to set
     */
    public void setTaskArn(String TaskArn) {
	this.TaskArn = TaskArn;
    }

    /**
     * @return the TaskInvocationParameters
     */
    public String getTaskInvocationParameters() {
        return TaskInvocationParameters;
    }

    /**
     * @param TaskInvocationParameters the TaskInvocationParameters to set
     */
    public void setTaskInvocationParameters(String TaskInvocationParameters) {
	this.TaskInvocationParameters = TaskInvocationParameters;
    }

    /**
     * @return the WindowId
     */
    public String getWindowId() {
        return WindowId;
    }

    /**
     * @param WindowId the WindowId to set
     */
    public void setWindowId(String WindowId) {
	this.WindowId = WindowId;
    }

    /**
     * @return the TaskParameters
     */
    public String getTaskParameters() {
        return TaskParameters;
    }

    /**
     * @param TaskParameters the TaskParameters to set
     */
    public void setTaskParameters(String TaskParameters) {
	this.TaskParameters = TaskParameters;
    }

    /**
     * @return the TaskType
     */
    public String getTaskType() {
        return TaskType;
    }

    /**
     * @param TaskType the TaskType to set
     */
    public void setTaskType(String TaskType) {
	this.TaskType = TaskType;
    }

    /**
     * @return the LoggingInfo
     */
    public String getLoggingInfo() {
        return LoggingInfo;
    }

    /**
     * @param LoggingInfo the LoggingInfo to set
     */
    public void setLoggingInfo(String LoggingInfo) {
	this.LoggingInfo = LoggingInfo;
    }


}