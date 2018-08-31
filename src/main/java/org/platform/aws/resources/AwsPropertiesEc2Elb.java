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
public class AwsPropertiesEc2Elb {

    /**
     * Required: No 
     */
    private String SecurityGroups;

    /**
     * Whether deregistered or unhealthy instances can complete all in-flight requests. 
     */
    private String ConnectionDrainingPolicy;

    /**
     * A list of elastic load balancing policies to apply to this elastic load balancer. Specify only back-end server policies. For more information, see DescribeLoadBalancerPolicyTypes in the Elastic Load Balancing API Reference version 2012-06-01. 
     */
    private String Policies;

    /**
     * For load balancers attached to an Amazon VPC, this parameter can be used to specify the type of load balancer to use. Specify internal to create an internal load balancer with a DNS name that resolves to private IP addresses or internet-facing to create a load balancer with a publicly resolvable DNS name, which resolves to public IP addresses. 
     */
    private String Scheme;

    /**
     * The Availability Zones in which to create the load balancer. You can specify the AvailabilityZones or Subnets property, but not both. 
     */
    private String AvailabilityZones;

    /**
     * Application health check for the instances. 
     */
    private String HealthCheck;

    /**
     * Captures detailed information for all requests made to your load balancer, such as the time a request was received, client’s IP address, latencies, request path, and server responses. 
     */
    private String AccessLoggingPolicy;

    /**
     * A list of EC2 instance IDs for the load balancer. 
     */
    private String Instances;

    /**
     * A name for the load balancer. For valid values, see the LoadBalancerName parameter for the CreateLoadBalancer action in the Elastic Load Balancing API Reference version 2012-06-01. 
     */
    private String LoadBalancerName;

    /**
     * One or more listeners for this load balancer. Each listener must be registered for a specific port, and you cannot have more than one listener for a given port. 
     */
    private String Listeners;

    /**
     * A list of subnet IDs in your virtual private cloud (VPC) to attach to your load balancer. Do not specify multiple subnets that are in the same Availability Zone. You can specify the AvailabilityZones or Subnets property, but not both. 
     */
    private String Subnets;

    /**
     * Whether cross-zone load balancing is enabled for the load balancer. With cross-zone load balancing, your load balancer nodes route traffic to the back-end instances across all Availability Zones. By default the CrossZone property is false. 
     */
    private String CrossZone;

    /**
     * Generates one or more stickiness policies with sticky session lifetimes that follow that of an application-generated cookie. These policies can be associated only with HTTP/HTTPS listeners. 
     */
    private String AppCookieStickinessPolicy;

    /**
     * Generates a stickiness policy with sticky session lifetimes controlled by the lifetime of the browser (user-agent), or by a specified expiration period. This policy can be associated only with HTTP/HTTPS listeners. 
     */
    private String LBCookieStickinessPolicy;

    /**
     * Specifies how long front-end and back-end connections of your load balancer can remain idle. 
     */
    private String ConnectionSettings;

    /**
     * An arbitrary set of tags (key-value pairs) for this load balancer. 
     */
    private String Tags;

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
     * @return the ConnectionDrainingPolicy
     */
    public String getConnectionDrainingPolicy() {
        return ConnectionDrainingPolicy;
    }

    /**
     * @param ConnectionDrainingPolicy the ConnectionDrainingPolicy to set
     */
    public void setConnectionDrainingPolicy(String ConnectionDrainingPolicy) {
	this.ConnectionDrainingPolicy = ConnectionDrainingPolicy;
    }

    /**
     * @return the Policies
     */
    public String getPolicies() {
        return Policies;
    }

    /**
     * @param Policies the Policies to set
     */
    public void setPolicies(String Policies) {
	this.Policies = Policies;
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
     * @return the AvailabilityZones
     */
    public String getAvailabilityZones() {
        return AvailabilityZones;
    }

    /**
     * @param AvailabilityZones the AvailabilityZones to set
     */
    public void setAvailabilityZones(String AvailabilityZones) {
	this.AvailabilityZones = AvailabilityZones;
    }

    /**
     * @return the HealthCheck
     */
    public String getHealthCheck() {
        return HealthCheck;
    }

    /**
     * @param HealthCheck the HealthCheck to set
     */
    public void setHealthCheck(String HealthCheck) {
	this.HealthCheck = HealthCheck;
    }

    /**
     * @return the AccessLoggingPolicy
     */
    public String getAccessLoggingPolicy() {
        return AccessLoggingPolicy;
    }

    /**
     * @param AccessLoggingPolicy the AccessLoggingPolicy to set
     */
    public void setAccessLoggingPolicy(String AccessLoggingPolicy) {
	this.AccessLoggingPolicy = AccessLoggingPolicy;
    }

    /**
     * @return the Instances
     */
    public String getInstances() {
        return Instances;
    }

    /**
     * @param Instances the Instances to set
     */
    public void setInstances(String Instances) {
	this.Instances = Instances;
    }

    /**
     * @return the LoadBalancerName
     */
    public String getLoadBalancerName() {
        return LoadBalancerName;
    }

    /**
     * @param LoadBalancerName the LoadBalancerName to set
     */
    public void setLoadBalancerName(String LoadBalancerName) {
	this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * @return the Listeners
     */
    public String getListeners() {
        return Listeners;
    }

    /**
     * @param Listeners the Listeners to set
     */
    public void setListeners(String Listeners) {
	this.Listeners = Listeners;
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
     * @return the CrossZone
     */
    public String getCrossZone() {
        return CrossZone;
    }

    /**
     * @param CrossZone the CrossZone to set
     */
    public void setCrossZone(String CrossZone) {
	this.CrossZone = CrossZone;
    }

    /**
     * @return the AppCookieStickinessPolicy
     */
    public String getAppCookieStickinessPolicy() {
        return AppCookieStickinessPolicy;
    }

    /**
     * @param AppCookieStickinessPolicy the AppCookieStickinessPolicy to set
     */
    public void setAppCookieStickinessPolicy(String AppCookieStickinessPolicy) {
	this.AppCookieStickinessPolicy = AppCookieStickinessPolicy;
    }

    /**
     * @return the LBCookieStickinessPolicy
     */
    public String getLBCookieStickinessPolicy() {
        return LBCookieStickinessPolicy;
    }

    /**
     * @param LBCookieStickinessPolicy the LBCookieStickinessPolicy to set
     */
    public void setLBCookieStickinessPolicy(String LBCookieStickinessPolicy) {
	this.LBCookieStickinessPolicy = LBCookieStickinessPolicy;
    }

    /**
     * @return the ConnectionSettings
     */
    public String getConnectionSettings() {
        return ConnectionSettings;
    }

    /**
     * @param ConnectionSettings the ConnectionSettings to set
     */
    public void setConnectionSettings(String ConnectionSettings) {
	this.ConnectionSettings = ConnectionSettings;
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