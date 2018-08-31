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
public class AwsResourceEc2VpcGatewayAttachment {

    /**
     * The ID of the Internet gateway. 
     */
    private String InternetGatewayId;

    /**
     * The ID of the VPC to associate with this gateway. 
     */
    private String VpcId;

    /**
     * The ID of the virtual private network (VPN) gateway to attach to the VPC. 
     */
    private String VpnGatewayId;

    /**
     * @return the InternetGatewayId
     */
    public String getInternetGatewayId() {
        return InternetGatewayId;
    }

    /**
     * @param InternetGatewayId the InternetGatewayId to set
     */
    public void setInternetGatewayId(String InternetGatewayId) {
	this.InternetGatewayId = InternetGatewayId;
    }

    /**
     * @return the VpcId
     */
    public String getVpcId() {
        return VpcId;
    }

    /**
     * @param VpcId the VpcId to set
     */
    public void setVpcId(String VpcId) {
	this.VpcId = VpcId;
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