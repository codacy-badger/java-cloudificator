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
public class AwsResourceEc2Vpc {

    /**
     * The allowed tenancy of instances launched into the VPC. 
     */
    private String InstanceTenancy;

    /**
     * The CIDR block you want the VPC to cover. For example: "10.0.0.0/16". 
     */
    private String CidrBlock;

    /**
     * Specifies whether DNS resolution is supported for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not. By default the value is set to true. 
     */
    private String EnableDnsSupport;

    /**
     * Specifies whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not. You can only set EnableDnsHostnames to true if you also set the EnableDnsSupport attribute to true. By default, the value is set to false. 
     */
    private String EnableDnsHostnames;

    /**
     * An arbitrary set of tags (key–value pairs) for this VPC. To name a VPC resource, specify a value for the Name key. 
     */
    private String Tags;

    /**
     * @return the InstanceTenancy
     */
    public String getInstanceTenancy() {
        return InstanceTenancy;
    }

    /**
     * @param InstanceTenancy the InstanceTenancy to set
     */
    public void setInstanceTenancy(String InstanceTenancy) {
	this.InstanceTenancy = InstanceTenancy;
    }

    /**
     * @return the CidrBlock
     */
    public String getCidrBlock() {
        return CidrBlock;
    }

    /**
     * @param CidrBlock the CidrBlock to set
     */
    public void setCidrBlock(String CidrBlock) {
	this.CidrBlock = CidrBlock;
    }

    /**
     * @return the EnableDnsSupport
     */
    public String getEnableDnsSupport() {
        return EnableDnsSupport;
    }

    /**
     * @param EnableDnsSupport the EnableDnsSupport to set
     */
    public void setEnableDnsSupport(String EnableDnsSupport) {
	this.EnableDnsSupport = EnableDnsSupport;
    }

    /**
     * @return the EnableDnsHostnames
     */
    public String getEnableDnsHostnames() {
        return EnableDnsHostnames;
    }

    /**
     * @param EnableDnsHostnames the EnableDnsHostnames to set
     */
    public void setEnableDnsHostnames(String EnableDnsHostnames) {
	this.EnableDnsHostnames = EnableDnsHostnames;
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