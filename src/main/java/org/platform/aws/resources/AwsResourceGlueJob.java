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
public class AwsResourceGlueJob {

    /**
     * The role that's associated with the job. 
     */
    private String Role;

    /**
     * UTF-8 string–to–UTF-8 string key-value pairs that specify the default parameters for the job. 
     */
    private String DefaultArguments;

    /**
     * The connections that are used by the job. 
     */
    private String Connections;

    /**
     * The maximum number of times to retry this job if it fails. 
     */
    private String MaxRetries;

    /**
     * The description of the job. 
     */
    private String Description;

    /**
     * The location of the logs for the job. 
     */
    private String LogUri;

    /**
     * The code that executes a job. 
     */
    private String Command;

    /**
     * The number of capacity units that are allocated to this job. 
     */
    private String AllocatedCapacity;

    /**
     * The execution property of the job, which specifies the maximum number of concurrent runs that are allowed for the job. 
     */
    private String ExecutionProperty;

    /**
     * The name of the job. It must match the single-line string pattern: [\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]* 
     */
    private String Name;

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
	this.Role = Role;
    }

    /**
     * @return the DefaultArguments
     */
    public String getDefaultArguments() {
        return DefaultArguments;
    }

    /**
     * @param DefaultArguments the DefaultArguments to set
     */
    public void setDefaultArguments(String DefaultArguments) {
	this.DefaultArguments = DefaultArguments;
    }

    /**
     * @return the Connections
     */
    public String getConnections() {
        return Connections;
    }

    /**
     * @param Connections the Connections to set
     */
    public void setConnections(String Connections) {
	this.Connections = Connections;
    }

    /**
     * @return the MaxRetries
     */
    public String getMaxRetries() {
        return MaxRetries;
    }

    /**
     * @param MaxRetries the MaxRetries to set
     */
    public void setMaxRetries(String MaxRetries) {
	this.MaxRetries = MaxRetries;
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
     * @return the Command
     */
    public String getCommand() {
        return Command;
    }

    /**
     * @param Command the Command to set
     */
    public void setCommand(String Command) {
	this.Command = Command;
    }

    /**
     * @return the AllocatedCapacity
     */
    public String getAllocatedCapacity() {
        return AllocatedCapacity;
    }

    /**
     * @param AllocatedCapacity the AllocatedCapacity to set
     */
    public void setAllocatedCapacity(String AllocatedCapacity) {
	this.AllocatedCapacity = AllocatedCapacity;
    }

    /**
     * @return the ExecutionProperty
     */
    public String getExecutionProperty() {
        return ExecutionProperty;
    }

    /**
     * @param ExecutionProperty the ExecutionProperty to set
     */
    public void setExecutionProperty(String ExecutionProperty) {
	this.ExecutionProperty = ExecutionProperty;
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


}