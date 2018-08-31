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
public class AwsResourceEmrInstancegroupconfig {

    /**
     * The ID of an Amazon EMR cluster that you want to associate this instance group with. 
     */
    private String JobFlowId;

    /**
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. An automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response to the value of a CloudWatch metric. For more information, see PutAutoScalingPolicy in the Amazon EMR API Reference. 
     */
    private String AutoScalingPolicy;

    /**
     * The bid price in USD for each Amazon EC2 instance in the instance group when launching instances (nodes) as Spot Instances. 
     */
    private String BidPrice;

    /**
     * The number of instances to launch in the instance group. 
     */
    private String InstanceCount;

    /**
     * Configures Amazon Elastic Block Store (Amazon EBS) storage volumes to attach to your instances. 
     */
    private String EbsConfiguration;

    /**
     * The role of the servers in the Amazon EMR cluster, such as TASK. For more information, see Instance Groups in the Amazon EMR Management Guide. 
     */
    private String InstanceRole;

    /**
     * A list of configurations to apply to this instance group. For more information see, Configuring Applications in the Amazon EMR Release Guide. 
     */
    private String Configurations;

    /**
     * The EC2 instance type for all instances in the instance group. For more information, see Instance Configurations in the Amazon EMR Management Guide. 
     */
    private String InstanceType;

    /**
     * The type of marketplace from which your instances are provisioned into this group, either ON_DEMAND or SPOT. For more information, see Amazon EC2 Purchasing Options. 
     */
    private String Market;

    /**
     * A name for the instance group. 
     */
    private String Name;

    /**
     * @return the JobFlowId
     */
    public String getJobFlowId() {
        return JobFlowId;
    }

    /**
     * @param JobFlowId the JobFlowId to set
     */
    public void setJobFlowId(String JobFlowId) {
	this.JobFlowId = JobFlowId;
    }

    /**
     * @return the AutoScalingPolicy
     */
    public String getAutoScalingPolicy() {
        return AutoScalingPolicy;
    }

    /**
     * @param AutoScalingPolicy the AutoScalingPolicy to set
     */
    public void setAutoScalingPolicy(String AutoScalingPolicy) {
	this.AutoScalingPolicy = AutoScalingPolicy;
    }

    /**
     * @return the BidPrice
     */
    public String getBidPrice() {
        return BidPrice;
    }

    /**
     * @param BidPrice the BidPrice to set
     */
    public void setBidPrice(String BidPrice) {
	this.BidPrice = BidPrice;
    }

    /**
     * @return the InstanceCount
     */
    public String getInstanceCount() {
        return InstanceCount;
    }

    /**
     * @param InstanceCount the InstanceCount to set
     */
    public void setInstanceCount(String InstanceCount) {
	this.InstanceCount = InstanceCount;
    }

    /**
     * @return the EbsConfiguration
     */
    public String getEbsConfiguration() {
        return EbsConfiguration;
    }

    /**
     * @param EbsConfiguration the EbsConfiguration to set
     */
    public void setEbsConfiguration(String EbsConfiguration) {
	this.EbsConfiguration = EbsConfiguration;
    }

    /**
     * @return the InstanceRole
     */
    public String getInstanceRole() {
        return InstanceRole;
    }

    /**
     * @param InstanceRole the InstanceRole to set
     */
    public void setInstanceRole(String InstanceRole) {
	this.InstanceRole = InstanceRole;
    }

    /**
     * @return the Configurations
     */
    public String getConfigurations() {
        return Configurations;
    }

    /**
     * @param Configurations the Configurations to set
     */
    public void setConfigurations(String Configurations) {
	this.Configurations = Configurations;
    }

    /**
     * @return the InstanceType
     */
    public String getInstanceType() {
        return InstanceType;
    }

    /**
     * @param InstanceType the InstanceType to set
     */
    public void setInstanceType(String InstanceType) {
	this.InstanceType = InstanceType;
    }

    /**
     * @return the Market
     */
    public String getMarket() {
        return Market;
    }

    /**
     * @param Market the Market to set
     */
    public void setMarket(String Market) {
	this.Market = Market;
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


}