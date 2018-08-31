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
public class AwsResourceEc2VpnConnection {

    /**
     * The type of VPN connection this virtual private gateway supports. 
     */
    private String Type;

    /**
     * The tunnel options for the VPN connection. Duplicates not allowed. 
     */
    private String VpnTunnelOptionsSpecifications;

    /**
     * The ID of the customer gateway. This can either be an embedded JSON object or a reference to a Gateway ID. 
     */
    private String CustomerGatewayId;

    /**
     * The ID of the virtual private gateway. This can either be an embedded JSON object or a reference to a Gateway ID. 
     */
    private String VpnGatewayId;

    /**
     * Indicates whether the VPN connection requires static routes. 
     */
    private String StaticRoutesOnly;

    /**
     * The tags that you want to attach to the resource. 
     */
    private String Tags;

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the VpnTunnelOptionsSpecifications
     */
    public String getVpnTunnelOptionsSpecifications() {
        return VpnTunnelOptionsSpecifications;
    }

    /**
     * @param VpnTunnelOptionsSpecifications the VpnTunnelOptionsSpecifications to set
     */
    public void setVpnTunnelOptionsSpecifications(String VpnTunnelOptionsSpecifications) {
	this.VpnTunnelOptionsSpecifications = VpnTunnelOptionsSpecifications;
    }

    /**
     * @return the CustomerGatewayId
     */
    public String getCustomerGatewayId() {
        return CustomerGatewayId;
    }

    /**
     * @param CustomerGatewayId the CustomerGatewayId to set
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
	this.CustomerGatewayId = CustomerGatewayId;
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

    /**
     * @return the StaticRoutesOnly
     */
    public String getStaticRoutesOnly() {
        return StaticRoutesOnly;
    }

    /**
     * @param StaticRoutesOnly the StaticRoutesOnly to set
     */
    public void setStaticRoutesOnly(String StaticRoutesOnly) {
	this.StaticRoutesOnly = StaticRoutesOnly;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}