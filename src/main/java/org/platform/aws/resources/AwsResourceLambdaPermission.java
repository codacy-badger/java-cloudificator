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
public class AwsResourceLambdaPermission {

    /**
     * The name (physical ID), Amazon Resource Name (ARN), or alias ARN of the Lambda function that you want to associate with this statement. Lambda adds this statement to the function's access policy. 
     */
    private String FunctionName;

    /**
     * The Lambda actions that you want to allow in this statement. For example, you can specify lambda:CreateFunction to specify a certain action, or use a wildcard (lambda:*) to grant permission to all Lambda actions. For a list of actions, see Actions and Condition Context Keys for AWS Lambda in the IAM User Guide. 
     */
    private String Action;

    /**
     * A unique token that must be supplied by the principal invoking the function. 
     */
    private String EventSourceToken;

    /**
     * The ARN of a resource that is invoking your function. When granting Amazon Simple Storage Service (Amazon S3) permission to invoke your function, specify this property with the bucket ARN as its value. This ensures that events generated only from the specified bucket, not just any bucket from any AWS account that creates a mapping to your function, can invoke the function. 
     */
    private String SourceArn;

    /**
     * The AWS account ID (without hyphens) of the source owner. For example, if you specify an S3 bucket in the SourceArn property, this value is the bucket owner's account ID. You can use this property to ensure that all source principals are owned by a specific account. 
     */
    private String SourceAccount;

    /**
     * The entity for which you are granting permission to invoke the Lambda function. This entity can be any valid AWS service principal, such as s3.amazonaws.com or sns.amazonaws.com, or, if you are granting cross-account permission, an AWS account ID. For example, you might want to allow a custom application in another AWS account to push events to Lambda by invoking your function. 
     */
    private String Principal;

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
     * @return the Action
     */
    public String getAction() {
        return Action;
    }

    /**
     * @param Action the Action to set
     */
    public void setAction(String Action) {
	this.Action = Action;
    }

    /**
     * @return the EventSourceToken
     */
    public String getEventSourceToken() {
        return EventSourceToken;
    }

    /**
     * @param EventSourceToken the EventSourceToken to set
     */
    public void setEventSourceToken(String EventSourceToken) {
	this.EventSourceToken = EventSourceToken;
    }

    /**
     * @return the SourceArn
     */
    public String getSourceArn() {
        return SourceArn;
    }

    /**
     * @param SourceArn the SourceArn to set
     */
    public void setSourceArn(String SourceArn) {
	this.SourceArn = SourceArn;
    }

    /**
     * @return the SourceAccount
     */
    public String getSourceAccount() {
        return SourceAccount;
    }

    /**
     * @param SourceAccount the SourceAccount to set
     */
    public void setSourceAccount(String SourceAccount) {
	this.SourceAccount = SourceAccount;
    }

    /**
     * @return the Principal
     */
    public String getPrincipal() {
        return Principal;
    }

    /**
     * @param Principal the Principal to set
     */
    public void setPrincipal(String Principal) {
	this.Principal = Principal;
    }


}