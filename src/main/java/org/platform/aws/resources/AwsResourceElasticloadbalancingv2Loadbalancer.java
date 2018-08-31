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
public class AwsResourceElasticloadbalancingv2Loadbalancer {

    /**
     * [Application Load Balancers] The type of IP addresses that are used by the load balancer's subnets, such as ipv4 (for IPv4 addresses) or dualstack (for IPv4 and IPv6 addresses). For valid values, see the IpAddressType parameter for the CreateLoadBalancer action in the Elastic Load Balancing API Reference version 2015-12-01. The default value is ipv4. 
     */
    private String IpAddressType;

    /**
     * Specifies the load balancer configuration. 
     */
    private String LoadBalancerAttributes;

    /**
     * [Application Load Balancers] Specifies a list of the IDs of the security groups to assign to the load balancer. 
     */
    private String SecurityGroups;

    /**
     * The subnets to attach to the load balancer, specified as a list of subnet IDs. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. 
     */
    private String Subnets;

    /**
     * Specifies the type of load balancer to create. Valid values are application and network.The default is application. 
     */
    private String Type;

    /**
     * Specifies whether the load balancer is internal or Internet-facing. Valid values are internet-facing and internal. The default is internet-facing. 
     */
    private String Scheme;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this load balancer. Use tags to manage your resources. 
     */
    private String Tags;

    /**
     * Specifies a name for the load balancer. This name must be unique within your AWS account and can have a maximum of 32 alphanumeric characters and hyphens. A name can't begin or end with a hyphen. 
     */
    private String Name;

    /**
     * The subnets to attach to the load balancer, specified as a list of SubnetMapping property types. You can specify only one subnet per Availability Zone. You must specify either subnets or subnet mappings. 
     */
    private String SubnetMappings;

    /**
     * @return the IpAddressType
     */
    public String getIpAddressType() {
        return IpAddressType;
    }

    /**
     * @param IpAddressType the IpAddressType to set
     */
    public void setIpAddressType(String IpAddressType) {
	this.IpAddressType = IpAddressType;
    }

    /**
     * @return the LoadBalancerAttributes
     */
    public String getLoadBalancerAttributes() {
        return LoadBalancerAttributes;
    }

    /**
     * @param LoadBalancerAttributes the LoadBalancerAttributes to set
     */
    public void setLoadBalancerAttributes(String LoadBalancerAttributes) {
	this.LoadBalancerAttributes = LoadBalancerAttributes;
    }

    /**
     * @return the SecurityGroups
     */
    public String getSecurityGroups() {
        return SecurityGroups;
    }

    /**
     * @param SecurityGroups the SecurityGroups to set
     */
    public void setSecurityGroups(String SecurityGroups) {
	this.SecurityGroups = SecurityGroups;
    }

    /**
     * @return the Subnets
     */
    public String getSubnets() {
        return Subnets;
    }

    /**
     * @param Subnets the Subnets to set
     */
    public void setSubnets(String Subnets) {
	this.Subnets = Subnets;
    }

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
     * @return the Scheme
     */
    public String getScheme() {
        return Scheme;
    }

    /**
     * @param Scheme the Scheme to set
     */
    public void setScheme(String Scheme) {
	this.Scheme = Scheme;
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

    /**
     * @return the SubnetMappings
     */
    public String getSubnetMappings() {
        return SubnetMappings;
    }

    /**
     * @param SubnetMappings the SubnetMappings to set
     */
    public void setSubnetMappings(String SubnetMappings) {
	this.SubnetMappings = SubnetMappings;
    }


}