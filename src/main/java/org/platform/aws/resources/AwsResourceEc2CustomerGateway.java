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
public class AwsResourceEc2CustomerGateway {

    /**
     * The type of VPN connection that this customer gateway supports. 
     */
    private String Type;

    /**
     * The internet-routable IP address for the customer gateway's outside interface. The address must be static. 
     */
    private String IpAddress;

    /**
     * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN). 
     */
    private String BgpAsn;

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
     * @return the IpAddress
     */
    public String getIpAddress() {
        return IpAddress;
    }

    /**
     * @param IpAddress the IpAddress to set
     */
    public void setIpAddress(String IpAddress) {
	this.IpAddress = IpAddress;
    }

    /**
     * @return the BgpAsn
     */
    public String getBgpAsn() {
        return BgpAsn;
    }

    /**
     * @param BgpAsn the BgpAsn to set
     */
    public void setBgpAsn(String BgpAsn) {
	this.BgpAsn = BgpAsn;
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