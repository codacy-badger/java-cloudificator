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
public class AwsResourceConfigConfigrule {

    /**
     * A description about this AWS Config rule. 
     */
    private String Description;

    /**
     * Defines which AWS resources will trigger an evaluation when their configurations change. The scope can include one or more resource types, a combination of a tag key and value, or a combination of one resource type and one resource ID. Specify a scope to constrain the resources that are evaluated. If you don't specify a scope, the rule evaluates all resources in the recording group. 
     */
    private String Scope;

    /**
     * A name for the AWS Config rule. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the rule name. For more information, see Name Type. 
     */
    private String ConfigRuleName;

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations. For valid values, see the ConfigRule data type in the AWS Config API Reference. 
     */
    private String MaximumExecutionFrequency;

    /**
     * Specifies the rule owner, the rule identifier, and the events that cause the function to evaluate your AWS resources. 
     */
    private String Source;

    /**
     * Input parameter values that are passed to the AWS Config rule (Lambda function). 
     */
    private String InputParameters;

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
     * @return the Scope
     */
    public String getScope() {
        return Scope;
    }

    /**
     * @param Scope the Scope to set
     */
    public void setScope(String Scope) {
	this.Scope = Scope;
    }

    /**
     * @return the ConfigRuleName
     */
    public String getConfigRuleName() {
        return ConfigRuleName;
    }

    /**
     * @param ConfigRuleName the ConfigRuleName to set
     */
    public void setConfigRuleName(String ConfigRuleName) {
	this.ConfigRuleName = ConfigRuleName;
    }

    /**
     * @return the MaximumExecutionFrequency
     */
    public String getMaximumExecutionFrequency() {
        return MaximumExecutionFrequency;
    }

    /**
     * @param MaximumExecutionFrequency the MaximumExecutionFrequency to set
     */
    public void setMaximumExecutionFrequency(String MaximumExecutionFrequency) {
	this.MaximumExecutionFrequency = MaximumExecutionFrequency;
    }

    /**
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
	this.Source = Source;
    }

    /**
     * @return the InputParameters
     */
    public String getInputParameters() {
        return InputParameters;
    }

    /**
     * @param InputParameters the InputParameters to set
     */
    public void setInputParameters(String InputParameters) {
	this.InputParameters = InputParameters;
    }


}