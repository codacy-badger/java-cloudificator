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
public class AwsResourceWafRule {

    /**
     * A friendly name or description for the metrics of the rule. For valid values, see the MetricName parameter for the CreateRule action in the AWS WAF API Reference. 
     */
    private String MetricName;

    /**
     * The ByteMatchSet, IPSet, SizeConstraintSet, SqlInjectionMatchSet, or XssMatchSet objects to include in a rule. If you add more than one predicate to a rule, a request must match all conditions in order to be allowed or blocked. 
     */
    private String Predicates;

    /**
     * A friendly name or description of the rule. 
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
     * @return the Predicates
     */
    public String getPredicates() {
        return Predicates;
    }

    /**
     * @param Predicates the Predicates to set
     */
    public void setPredicates(String Predicates) {
	this.Predicates = Predicates;
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