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
public class AwsResourceEc2Flowlog {

    /**
     * The ID of the subnet, network interface, or VPC for which you want to create a flow log. 
     */
    private String ResourceId;

    /**
     * The type of resource that you specified in the ResourceId property. For example, if you specified a VPC ID for the ResourceId property, specify VPC for this property. For valid values, see the ResourceType parameter for the CreateFlowLogs action in the Amazon EC2 API Reference. 
     */
    private String ResourceType;

    /**
     * The name of a new or existing CloudWatch Logs log group where Amazon EC2 publishes your flow logs. 
     */
    private String LogGroupName;

    /**
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that permits Amazon EC2 to publish flow logs to a CloudWatch Logs log group in your account. 
     */
    private String DeliverLogsPermissionArn;

    /**
     * The type of traffic to log. You can log traffic that the resource accepts or rejects, or all traffic. For valid values, see the TrafficType parameter for the CreateFlowLogs action in the Amazon EC2 API Reference. 
     */
    private String TrafficType;

    /**
     * @return the ResourceId
     */
    public String getResourceId() {
        return ResourceId;
    }

    /**
     * @param ResourceId the ResourceId to set
     */
    public void setResourceId(String ResourceId) {
	this.ResourceId = ResourceId;
    }

    /**
     * @return the ResourceType
     */
    public String getResourceType() {
        return ResourceType;
    }

    /**
     * @param ResourceType the ResourceType to set
     */
    public void setResourceType(String ResourceType) {
	this.ResourceType = ResourceType;
    }

    /**
     * @return the LogGroupName
     */
    public String getLogGroupName() {
        return LogGroupName;
    }

    /**
     * @param LogGroupName the LogGroupName to set
     */
    public void setLogGroupName(String LogGroupName) {
	this.LogGroupName = LogGroupName;
    }

    /**
     * @return the DeliverLogsPermissionArn
     */
    public String getDeliverLogsPermissionArn() {
        return DeliverLogsPermissionArn;
    }

    /**
     * @param DeliverLogsPermissionArn the DeliverLogsPermissionArn to set
     */
    public void setDeliverLogsPermissionArn(String DeliverLogsPermissionArn) {
	this.DeliverLogsPermissionArn = DeliverLogsPermissionArn;
    }

    /**
     * @return the TrafficType
     */
    public String getTrafficType() {
        return TrafficType;
    }

    /**
     * @param TrafficType the TrafficType to set
     */
    public void setTrafficType(String TrafficType) {
	this.TrafficType = TrafficType;
    }


}