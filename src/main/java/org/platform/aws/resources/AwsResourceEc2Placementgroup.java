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
public class AwsResourceEc2Placementgroup {

    /**
     * The placement strategy, which relates to the instance types that can be added to the placement group. For example, for the cluster strategy, you can cluster C4 instance types but not T2 instance types. For valid values, see CreatePlacementGroup in the Amazon EC2 API Reference. By default, AWS CloudFormation sets the value of this property to cluster. 
     */
    private String Strategy;

    /**
     * @return the Strategy
     */
    public String getStrategy() {
        return Strategy;
    }

    /**
     * @param Strategy the Strategy to set
     */
    public void setStrategy(String Strategy) {
	this.Strategy = Strategy;
    }


}