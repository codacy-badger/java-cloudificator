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
public class AwsResourceLambdaAlias {

    /**
     * The Lambda function that you want to associate with this alias. You can specify the function's name or its Amazon Resource Name (ARN). 
     */
    private String FunctionName;

    /**
     * Information about the alias, such as its purpose or the Lambda function that is associated with it. 
     */
    private String Description;

    /**
     * The version of the Lambda function that you want to associate with this alias. 
     */
    private String FunctionVersion;

    /**
     * Use this parameter to point your alias to two different function versions, allowing you to dictate what percentage of traffic will invoke each version. For more information, see Routing Traffic to Different Function Versions Using Aliases in the AWS Lambda Developer Guide. 
     */
    private String RoutingConfig;

    /**
     * A name for the alias. 
     */
    private String Name;

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
     * @return the FunctionVersion
     */
    public String getFunctionVersion() {
        return FunctionVersion;
    }

    /**
     * @param FunctionVersion the FunctionVersion to set
     */
    public void setFunctionVersion(String FunctionVersion) {
	this.FunctionVersion = FunctionVersion;
    }

    /**
     * @return the RoutingConfig
     */
    public String getRoutingConfig() {
        return RoutingConfig;
    }

    /**
     * @param RoutingConfig the RoutingConfig to set
     */
    public void setRoutingConfig(String RoutingConfig) {
	this.RoutingConfig = RoutingConfig;
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