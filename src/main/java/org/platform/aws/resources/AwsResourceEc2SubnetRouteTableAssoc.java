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
public class AwsResourceEc2SubnetRouteTableAssoc {

    /**
     * The ID of the route table. This is commonly written as a reference to a route table declared elsewhere in the template. For example: 
     */
    private String RouteTableId;

    /**
     * The ID of the subnet. This is commonly written as a reference to a subnet declared elsewhere in the template. For example: 
     */
    private String SubnetId;

    /**
     * @return the RouteTableId
     */
    public String getRouteTableId() {
        return RouteTableId;
    }

    /**
     * @param RouteTableId the RouteTableId to set
     */
    public void setRouteTableId(String RouteTableId) {
	this.RouteTableId = RouteTableId;
    }

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
    }


}