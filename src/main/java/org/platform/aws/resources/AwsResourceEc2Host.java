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
public class AwsResourceEc2Host {

    /**
     * Indicates if the host accepts EC2 instances with only matching configurations or if instances must also specify the host ID. Instances that don't specify a host ID can't launch onto a host with AutoPlacement set to off. By default, AWS CloudFormation sets this property to on. For more information, see Understanding Instance Placement and Host Affinity in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String AutoPlacement;

    /**
     * The Availability Zone (AZ) in which to launch the dedicated host. 
     */
    private String AvailabilityZone;

    /**
     * The instance type that the dedicated host accepts. Only instances of this type can be launched onto the host. For more information, see Supported Instance Types in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String InstanceType;

    /**
     * @return the AutoPlacement
     */
    public String getAutoPlacement() {
        return AutoPlacement;
    }

    /**
     * @param AutoPlacement the AutoPlacement to set
     */
    public void setAutoPlacement(String AutoPlacement) {
	this.AutoPlacement = AutoPlacement;
    }

    /**
     * @return the AvailabilityZone
     */
    public String getAvailabilityZone() {
        return AvailabilityZone;
    }

    /**
     * @param AvailabilityZone the AvailabilityZone to set
     */
    public void setAvailabilityZone(String AvailabilityZone) {
	this.AvailabilityZone = AvailabilityZone;
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


}