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
public class AwsResourceElasticmapreduceInstancefleetconfig {

    /**
     * The node type that the instance fleet hosts. Valid values are MASTER, CORE, and TASK. 
     */
    private String InstanceFleetType;

    /**
     * The target capacity of On-Demand units for the instance fleet. This determines how many On-Demand Instances to provision. For more information, see InstanceFleetConfig in the Amazon EMR API Reference. 
     */
    private String TargetOnDemandCapacity;

    /**
     * The ID of the target cluster. 
     */
    private String ClusterId;

    /**
     * The target capacity of Spot units for the instance fleet. This determines how many Spot Instances to provision. For more information, see InstanceFleetConfig in the Amazon EMR API Reference. 
     */
    private String TargetSpotCapacity;

    /**
     * The launch specification for the instance fleet. 
     */
    private String LaunchSpecifications;

    /**
     * The instance type configurations that define the EC2 instances in the instance fleet. Duplicates not allowed. 
     */
    private String InstanceTypeConfigs;

    /**
     * The friendly name of the instance fleet. For constraints, see InstanceFleetConfig in the Amazon EMR API Reference. 
     */
    private String Name;

    /**
     * @return the InstanceFleetType
     */
    public String getInstanceFleetType() {
        return InstanceFleetType;
    }

    /**
     * @param InstanceFleetType the InstanceFleetType to set
     */
    public void setInstanceFleetType(String InstanceFleetType) {
	this.InstanceFleetType = InstanceFleetType;
    }

    /**
     * @return the TargetOnDemandCapacity
     */
    public String getTargetOnDemandCapacity() {
        return TargetOnDemandCapacity;
    }

    /**
     * @param TargetOnDemandCapacity the TargetOnDemandCapacity to set
     */
    public void setTargetOnDemandCapacity(String TargetOnDemandCapacity) {
	this.TargetOnDemandCapacity = TargetOnDemandCapacity;
    }

    /**
     * @return the ClusterId
     */
    public String getClusterId() {
        return ClusterId;
    }

    /**
     * @param ClusterId the ClusterId to set
     */
    public void setClusterId(String ClusterId) {
	this.ClusterId = ClusterId;
    }

    /**
     * @return the TargetSpotCapacity
     */
    public String getTargetSpotCapacity() {
        return TargetSpotCapacity;
    }

    /**
     * @param TargetSpotCapacity the TargetSpotCapacity to set
     */
    public void setTargetSpotCapacity(String TargetSpotCapacity) {
	this.TargetSpotCapacity = TargetSpotCapacity;
    }

    /**
     * @return the LaunchSpecifications
     */
    public String getLaunchSpecifications() {
        return LaunchSpecifications;
    }

    /**
     * @param LaunchSpecifications the LaunchSpecifications to set
     */
    public void setLaunchSpecifications(String LaunchSpecifications) {
	this.LaunchSpecifications = LaunchSpecifications;
    }

    /**
     * @return the InstanceTypeConfigs
     */
    public String getInstanceTypeConfigs() {
        return InstanceTypeConfigs;
    }

    /**
     * @param InstanceTypeConfigs the InstanceTypeConfigs to set
     */
    public void setInstanceTypeConfigs(String InstanceTypeConfigs) {
	this.InstanceTypeConfigs = InstanceTypeConfigs;
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