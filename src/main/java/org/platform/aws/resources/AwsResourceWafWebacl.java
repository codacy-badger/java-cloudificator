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
public class AwsResourceWafWebacl {

    /**
     * A friendly name or description for the Amazon CloudWatch metric of this web ACL. For valid values, see the MetricName parameter of the CreateWebACL action in the AWS WAF API Reference. 
     */
    private String MetricName;

    /**
     * The action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. 
     */
    private String DefaultAction;

    /**
     * The rules to associate with the web ACL and the settings for each rule. 
     */
    private String Rules;

    /**
     * A friendly name or description of the web ACL. 
     */
    private String Name;

    /**
     * @return the MetricName
     */
    public String getMetricName() {
        return MetricName;
    }

    /**
     * @param MetricName the MetricName to set
     */
    public void setMetricName(String MetricName) {
	this.MetricName = MetricName;
    }

    /**
     * @return the DefaultAction
     */
    public String getDefaultAction() {
        return DefaultAction;
    }

    /**
     * @param DefaultAction the DefaultAction to set
     */
    public void setDefaultAction(String DefaultAction) {
	this.DefaultAction = DefaultAction;
    }

    /**
     * @return the Rules
     */
    public String getRules() {
        return Rules;
    }

    /**
     * @param Rules the Rules to set
     */
    public void setRules(String Rules) {
	this.Rules = Rules;
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