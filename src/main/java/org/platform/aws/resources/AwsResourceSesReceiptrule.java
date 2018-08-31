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
public class AwsResourceSesReceiptrule {

    /**
     * The name of an existing rule after which the new rule will be placed. If this parameter is null, the new rule will be inserted at the beginning of the rule list. 
     */
    private String After;

    /**
     * The specified rule's name, actions, recipients, domains, enabled status, scan status, and TLS policy. 
     */
    private String Rule;

    /**
     * The name of the rule set that the receipt rule will be added to. 
     */
    private String RuleSetName;

    /**
     * @return the After
     */
    public String getAfter() {
        return After;
    }

    /**
     * @param After the After to set
     */
    public void setAfter(String After) {
	this.After = After;
    }

    /**
     * @return the Rule
     */
    public String getRule() {
        return Rule;
    }

    /**
     * @param Rule the Rule to set
     */
    public void setRule(String Rule) {
	this.Rule = Rule;
    }

    /**
     * @return the RuleSetName
     */
    public String getRuleSetName() {
        return RuleSetName;
    }

    /**
     * @param RuleSetName the RuleSetName to set
     */
    public void setRuleSetName(String RuleSetName) {
	this.RuleSetName = RuleSetName;
    }


}