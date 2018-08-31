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
public class AwsResourceElasticloadbalancingv2Listenerrule {

    /**
     * The Amazon Resource Name (ARN) of the listener that the rule applies to. 
     */
    private String ListenerArn;

    /**
     * The action that the listener takes when a request meets the specified condition. 
     */
    private String Actions;

    /**
     * The priority for the rule. Elastic Load Balancing evaluates rules in priority order, from the lowest value to the highest value. If a request satisfies a rule, Elastic Load Balancing ignores all subsequent rules. 
     */
    private String Priority;

    /**
     * The conditions under which a rule takes effect. 
     */
    private String Conditions;

    /**
     * @return the ListenerArn
     */
    public String getListenerArn() {
        return ListenerArn;
    }

    /**
     * @param ListenerArn the ListenerArn to set
     */
    public void setListenerArn(String ListenerArn) {
	this.ListenerArn = ListenerArn;
    }

    /**
     * @return the Actions
     */
    public String getActions() {
        return Actions;
    }

    /**
     * @param Actions the Actions to set
     */
    public void setActions(String Actions) {
	this.Actions = Actions;
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
     * @return the Conditions
     */
    public String getConditions() {
        return Conditions;
    }

    /**
     * @param Conditions the Conditions to set
     */
    public void setConditions(String Conditions) {
	this.Conditions = Conditions;
    }


}