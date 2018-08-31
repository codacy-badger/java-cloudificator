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
public class AwsResourceEc2Vpcendpointservice {

    /**
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service. 
     */
    private String NetworkLoadBalancerArns;

    /**
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To accept a request, use AcceptVpcEndpointConnections. 
     */
    private String AcceptanceRequired;

    /**
     * @return the NetworkLoadBalancerArns
     */
    public String getNetworkLoadBalancerArns() {
        return NetworkLoadBalancerArns;
    }

    /**
     * @param NetworkLoadBalancerArns the NetworkLoadBalancerArns to set
     */
    public void setNetworkLoadBalancerArns(String NetworkLoadBalancerArns) {
	this.NetworkLoadBalancerArns = NetworkLoadBalancerArns;
    }

    /**
     * @return the AcceptanceRequired
     */
    public String getAcceptanceRequired() {
        return AcceptanceRequired;
    }

    /**
     * @param AcceptanceRequired the AcceptanceRequired to set
     */
    public void setAcceptanceRequired(String AcceptanceRequired) {
	this.AcceptanceRequired = AcceptanceRequired;
    }


}