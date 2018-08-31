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
public class AwsResourceElasticloadbalancingv2Targetgroup {

    /**
     * The approximate number of seconds between health checks for an individual target. 
     */
    private String HealthCheckIntervalSeconds;

    /**
     * The HTTP codes that a healthy target uses when responding to a health check. If you specify TCP for the Protocol property, you must specify the range 200-399 for the Matcher property. 
     */
    private String Matcher;

    /**
     * The ping path destination where Elastic Load Balancing sends health check requests. 
     */
    private String HealthCheckPath;

    /**
     * The port on which the targets receive traffic. 
     */
    private String Port;

    /**
     * The targets to add to this target group. 
     */
    private String Targets;

    /**
     * The number of consecutive failed health checks that are required before a target is considered unhealthy. 
     */
    private String UnhealthyThresholdCount;

    /**
     * The number of seconds to wait for a response before considering that a health check has failed. 
     */
    private String HealthCheckTimeoutSeconds;

    /**
     * A name for the target group. 
     */
    private String Name;

    /**
     * The ID of the VPC in which your targets are located. 
     */
    private String VpcId;

    /**
     * The number of consecutive successful health checks that are required before an unhealthy target is considered healthy. 
     */
    private String HealthyThresholdCount;

    /**
     * The protocol that the load balancer uses when performing health checks on the targets, such as HTTP or HTTPS. 
     */
    private String HealthCheckProtocol;

    /**
     * Target group configurations. 
     */
    private String TargetGroupAttributes;

    /**
     * The registration type of the targets in this target group. Valid values are instance and ip. The default is instance. 
     */
    private String TargetType;

    /**
     * The port that the load balancer uses when performing health checks on the targets. 
     */
    private String HealthCheckPort;

    /**
     * The protocol to use for routing traffic to the targets. 
     */
    private String Protocol;

    /**
     * An arbitrary set of tags (key–value pairs) for the target group. Use tags to help manage resources. 
     */
    private String Tags;

    /**
     * @return the HealthCheckIntervalSeconds
     */
    public String getHealthCheckIntervalSeconds() {
        return HealthCheckIntervalSeconds;
    }

    /**
     * @param HealthCheckIntervalSeconds the HealthCheckIntervalSeconds to set
     */
    public void setHealthCheckIntervalSeconds(String HealthCheckIntervalSeconds) {
	this.HealthCheckIntervalSeconds = HealthCheckIntervalSeconds;
    }

    /**
     * @return the Matcher
     */
    public String getMatcher() {
        return Matcher;
    }

    /**
     * @param Matcher the Matcher to set
     */
    public void setMatcher(String Matcher) {
	this.Matcher = Matcher;
    }

    /**
     * @return the HealthCheckPath
     */
    public String getHealthCheckPath() {
        return HealthCheckPath;
    }

    /**
     * @param HealthCheckPath the HealthCheckPath to set
     */
    public void setHealthCheckPath(String HealthCheckPath) {
	this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * @return the Port
     */
    public String getPort() {
        return Port;
    }

    /**
     * @param Port the Port to set
     */
    public void setPort(String Port) {
	this.Port = Port;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
    }

    /**
     * @return the UnhealthyThresholdCount
     */
    public String getUnhealthyThresholdCount() {
        return UnhealthyThresholdCount;
    }

    /**
     * @param UnhealthyThresholdCount the UnhealthyThresholdCount to set
     */
    public void setUnhealthyThresholdCount(String UnhealthyThresholdCount) {
	this.UnhealthyThresholdCount = UnhealthyThresholdCount;
    }

    /**
     * @return the HealthCheckTimeoutSeconds
     */
    public String getHealthCheckTimeoutSeconds() {
        return HealthCheckTimeoutSeconds;
    }

    /**
     * @param HealthCheckTimeoutSeconds the HealthCheckTimeoutSeconds to set
     */
    public void setHealthCheckTimeoutSeconds(String HealthCheckTimeoutSeconds) {
	this.HealthCheckTimeoutSeconds = HealthCheckTimeoutSeconds;
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
     * @return the HealthyThresholdCount
     */
    public String getHealthyThresholdCount() {
        return HealthyThresholdCount;
    }

    /**
     * @param HealthyThresholdCount the HealthyThresholdCount to set
     */
    public void setHealthyThresholdCount(String HealthyThresholdCount) {
	this.HealthyThresholdCount = HealthyThresholdCount;
    }

    /**
     * @return the HealthCheckProtocol
     */
    public String getHealthCheckProtocol() {
        return HealthCheckProtocol;
    }

    /**
     * @param HealthCheckProtocol the HealthCheckProtocol to set
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
	this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * @return the TargetGroupAttributes
     */
    public String getTargetGroupAttributes() {
        return TargetGroupAttributes;
    }

    /**
     * @param TargetGroupAttributes the TargetGroupAttributes to set
     */
    public void setTargetGroupAttributes(String TargetGroupAttributes) {
	this.TargetGroupAttributes = TargetGroupAttributes;
    }

    /**
     * @return the TargetType
     */
    public String getTargetType() {
        return TargetType;
    }

    /**
     * @param TargetType the TargetType to set
     */
    public void setTargetType(String TargetType) {
	this.TargetType = TargetType;
    }

    /**
     * @return the HealthCheckPort
     */
    public String getHealthCheckPort() {
        return HealthCheckPort;
    }

    /**
     * @param HealthCheckPort the HealthCheckPort to set
     */
    public void setHealthCheckPort(String HealthCheckPort) {
	this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * @return the Protocol
     */
    public String getProtocol() {
        return Protocol;
    }

    /**
     * @param Protocol the Protocol to set
     */
    public void setProtocol(String Protocol) {
	this.Protocol = Protocol;
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