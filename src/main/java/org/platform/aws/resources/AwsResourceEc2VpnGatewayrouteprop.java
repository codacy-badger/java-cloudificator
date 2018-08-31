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
public class AwsResourceEc2VpnGatewayrouteprop {

    /**
     * A list of routing table IDs that are associated with a VPC. The routing tables must be associated with the same VPC that the virtual private gateway is attached to. 
     */
    private String RouteTableIds;

    /**
     * The ID of the virtual private gateway that is attached to a VPC. The virtual private gateway must be attached to the same VPC that the routing tables are associated with. 
     */
    private String VpnGatewayId;

    /**
     * @return the RouteTableIds
     */
    public String getRouteTableIds() {
        return RouteTableIds;
    }

    /**
     * @param RouteTableIds the RouteTableIds to set
     */
    public void setRouteTableIds(String RouteTableIds) {
	this.RouteTableIds = RouteTableIds;
    }

    /**
     * @return the VpnGatewayId
     */
    public String getVpnGatewayId() {
        return VpnGatewayId;
    }

    /**
     * @param VpnGatewayId the VpnGatewayId to set
     */
    public void setVpnGatewayId(String VpnGatewayId) {
	this.VpnGatewayId = VpnGatewayId;
    }


}