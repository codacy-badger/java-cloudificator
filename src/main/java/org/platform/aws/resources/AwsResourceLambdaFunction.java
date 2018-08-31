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
public class AwsResourceLambdaFunction {

    /**
     * The amount of memory, in MB, that is allocated to your Lambda function. Lambda uses this value to proportionally allocate the amount of CPU power. For more information, see Resource Model in the AWS Lambda Developer Guide. 
     */
    private String MemorySize;

    /**
     * A description of the function. 
     */
    private String Description;

    /**
     * The parent object that contains your Lambda function's tracing settings. By default, the Mode property is set to PassThrough. For valid values, see the TracingConfig data type in the AWS Lambda Developer Guide. 
     */
    private String TracingConfig;

    /**
     * If the Lambda function requires access to resources in a VPC, specify a VPC configuration that Lambda uses to set up an elastic network interface (ENI). The ENI enables your function to connect to other resources in your VPC, but it doesn't provide public Internet access. If your function requires Internet access (for example, to access AWS services that don't have VPC endpoints), configure a Network Address Translation (NAT) instance inside your VPC or use an Amazon Virtual Private Cloud (Amazon VPC) NAT gateway. For more information, see NAT Gateways in the Amazon VPC User Guide. 
     */
    private String VpcConfig;

    /**
     * Configures how Lambda handles events that it can't process. If you don't specify a Dead Letter Queue (DLQ) configuration, Lambda discards events after the maximum number of retries. For more information, see Dead Letter Queues in the AWS Lambda Developer Guide. 
     */
    private String DeadLetterConfig;

    /**
     * The function execution time (in seconds) after which Lambda terminates the function. Because the execution time affects cost, set this value based on the function's expected execution time. By default, Timeout is set to 3 seconds. For more information, see the FAQs. 
     */
    private String Timeout;

    /**
     * The name of the function (within your source code) that Lambda calls to start running your code. For more information, see the Handler property in the AWS Lambda Developer Guide. 
     */
    private String Handler;

    /**
     * The maximum of concurrent executions you want reserved for the function. For more information on reserved concurrency limits, see Managing Concurrency in the AWS Lambda Developer Guide. 
     */
    private String ReservedConcurrentExecutions;

    /**
     * The source code of your Lambda function. You can point to a file in an Amazon Simple Storage Service (Amazon S3) bucket or specify your source code as inline text. 
     */
    private String Code;

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) execution role that Lambda assumes when it runs your code to access AWS services. 
     */
    private String Role;

    /**
     * A name for the function. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the function's name. For more information, see Name Type. 
     */
    private String FunctionName;

    /**
     * The runtime environment for the Lambda function that you are uploading. For valid values, see the Runtime property in the AWS Lambda Developer Guide. 
     */
    private String Runtime;

    /**
     * The Amazon Resource Name (ARN) of an AWS Key Management Service (AWS KMS) key that Lambda uses to encrypt and decrypt environment variable values. 
     */
    private String KmsKeyArn;

    /**
     * Key-value pairs that Lambda caches and makes available for your Lambda functions. Use environment variables to apply configuration changes, such as test and production environment configurations, without changing your Lambda function source code. 
     */
    private String Environment;

    /**
     * An arbitrary set of tags (key–value pairs) for this Lambda function. 
     */
    private String Tags;

    /**
     * @return the MemorySize
     */
    public String getMemorySize() {
        return MemorySize;
    }

    /**
     * @param MemorySize the MemorySize to set
     */
    public void setMemorySize(String MemorySize) {
	this.MemorySize = MemorySize;
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
     * @return the TracingConfig
     */
    public String getTracingConfig() {
        return TracingConfig;
    }

    /**
     * @param TracingConfig the TracingConfig to set
     */
    public void setTracingConfig(String TracingConfig) {
	this.TracingConfig = TracingConfig;
    }

    /**
     * @return the VpcConfig
     */
    public String getVpcConfig() {
        return VpcConfig;
    }

    /**
     * @param VpcConfig the VpcConfig to set
     */
    public void setVpcConfig(String VpcConfig) {
	this.VpcConfig = VpcConfig;
    }

    /**
     * @return the DeadLetterConfig
     */
    public String getDeadLetterConfig() {
        return DeadLetterConfig;
    }

    /**
     * @param DeadLetterConfig the DeadLetterConfig to set
     */
    public void setDeadLetterConfig(String DeadLetterConfig) {
	this.DeadLetterConfig = DeadLetterConfig;
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
     * @return the Handler
     */
    public String getHandler() {
        return Handler;
    }

    /**
     * @param Handler the Handler to set
     */
    public void setHandler(String Handler) {
	this.Handler = Handler;
    }

    /**
     * @return the ReservedConcurrentExecutions
     */
    public String getReservedConcurrentExecutions() {
        return ReservedConcurrentExecutions;
    }

    /**
     * @param ReservedConcurrentExecutions the ReservedConcurrentExecutions to set
     */
    public void setReservedConcurrentExecutions(String ReservedConcurrentExecutions) {
	this.ReservedConcurrentExecutions = ReservedConcurrentExecutions;
    }

    /**
     * @return the Code
     */
    public String getCode() {
        return Code;
    }

    /**
     * @param Code the Code to set
     */
    public void setCode(String Code) {
	this.Code = Code;
    }

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
     * @return the FunctionName
     */
    public String getFunctionName() {
        return FunctionName;
    }

    /**
     * @param FunctionName the FunctionName to set
     */
    public void setFunctionName(String FunctionName) {
	this.FunctionName = FunctionName;
    }

    /**
     * @return the Runtime
     */
    public String getRuntime() {
        return Runtime;
    }

    /**
     * @param Runtime the Runtime to set
     */
    public void setRuntime(String Runtime) {
	this.Runtime = Runtime;
    }

    /**
     * @return the KmsKeyArn
     */
    public String getKmsKeyArn() {
        return KmsKeyArn;
    }

    /**
     * @param KmsKeyArn the KmsKeyArn to set
     */
    public void setKmsKeyArn(String KmsKeyArn) {
	this.KmsKeyArn = KmsKeyArn;
    }

    /**
     * @return the Environment
     */
    public String getEnvironment() {
        return Environment;
    }

    /**
     * @param Environment the Environment to set
     */
    public void setEnvironment(String Environment) {
	this.Environment = Environment;
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