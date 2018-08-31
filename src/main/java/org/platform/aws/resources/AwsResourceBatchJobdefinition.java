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
public class AwsResourceBatchJobdefinition {

    /**
     * The type of job definition. 
     */
    private String Type;

    /**
     * Default parameters or parameter substitution placeholders that are set in the job definition. Parameters are specified as a key-value pair mapping. For more information about specifying parameters, see Job Definition Parameters in the AWS Batch User Guide. 
     */
    private String Parameters;

    /**
     * Specifies a job timeout configuration. 
     */
    private String Timeout;

    /**
     * The name of the job definition. 
     */
    private String JobDefinitionName;

    /**
     * An object with various properties specific to container-based jobs. 
     */
    private String ContainerProperties;

    /**
     * The retry strategy to use for failed jobs that are submitted with this job definition. 
     */
    private String RetryStrategy;

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
     * @return the Parameters
     */
    public String getParameters() {
        return Parameters;
    }

    /**
     * @param Parameters the Parameters to set
     */
    public void setParameters(String Parameters) {
	this.Parameters = Parameters;
    }

    /**
     * @return the Timeout
     */
    public String getTimeout() {
        return Timeout;
    }

    /**
     * @param Timeout the Timeout to set
     */
    public void setTimeout(String Timeout) {
	this.Timeout = Timeout;
    }

    /**
     * @return the JobDefinitionName
     */
    public String getJobDefinitionName() {
        return JobDefinitionName;
    }

    /**
     * @param JobDefinitionName the JobDefinitionName to set
     */
    public void setJobDefinitionName(String JobDefinitionName) {
	this.JobDefinitionName = JobDefinitionName;
    }

    /**
     * @return the ContainerProperties
     */
    public String getContainerProperties() {
        return ContainerProperties;
    }

    /**
     * @param ContainerProperties the ContainerProperties to set
     */
    public void setContainerProperties(String ContainerProperties) {
	this.ContainerProperties = ContainerProperties;
    }

    /**
     * @return the RetryStrategy
     */
    public String getRetryStrategy() {
        return RetryStrategy;
    }

    /**
     * @param RetryStrategy the RetryStrategy to set
     */
    public void setRetryStrategy(String RetryStrategy) {
	this.RetryStrategy = RetryStrategy;
    }


}