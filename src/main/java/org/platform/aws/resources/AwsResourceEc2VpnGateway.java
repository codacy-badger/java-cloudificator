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
public class AwsResourceEc2VpnGateway {

    /**
     * The type of VPN connection this virtual private gateway supports. The only valid value is "ipsec.1". 
     */
    private String Type;

    /**
     * The private Autonomous System Number (ASN) for the Amazon side of a BGP session. 
     */
    private String AmazonSideAsn;

    /**
     * An arbitrary set of tags (key–value pairs) for this resource. 
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
     * @return the AmazonSideAsn
     */
    public String getAmazonSideAsn() {
        return AmazonSideAsn;
    }

    /**
     * @param AmazonSideAsn the AmazonSideAsn to set
     */
    public void setAmazonSideAsn(String AmazonSideAsn) {
	this.AmazonSideAsn = AmazonSideAsn;
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