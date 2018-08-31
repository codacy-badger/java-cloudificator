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
public class AwsResourceLambdaVersion {

    /**
     * The Lambda function for which you want to publish a version. You can specify the function's name or its Amazon Resource Name (ARN). 
     */
    private String FunctionName;

    /**
     * A description of the version you are publishing. If you don't specify a value, Lambda copies the description from the $LATEST version of the function. 
     */
    private String Description;

    /**
     * The SHA-256 hash of the deployment package that you want to publish. This value must match the SHA-256 hash of the $LATEST version of the function. Specify this property to validate that you are publishing the correct package. 
     */
    private String CodeSha256;

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
     * @return the CodeSha256
     */
    public String getCodeSha256() {
        return CodeSha256;
    }

    /**
     * @param CodeSha256 the CodeSha256 to set
     */
    public void setCodeSha256(String CodeSha256) {
	this.CodeSha256 = CodeSha256;
    }


}