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
public class AwsPropertiesEc2EbsVolumeattachment {

    /**
     * The ID of the Amazon EBS volume. The volume and instance must be within the same Availability Zone. This value can be a reference to an AWS::EC2::Volume resource, or it can be the volume ID of an existing Amazon EBS volume. 
     */
    private String VolumeId;

    /**
     * The ID of the instance to which the volume attaches. This value can be a reference to an AWS::EC2::Instance resource, or it can be the physical ID of an existing EC2 instance. 
     */
    private String InstanceId;

    /**
     * How the device is exposed to the instance (e.g., /dev/sdh, or xvdh). 
     */
    private String Device;

    /**
     * @return the VolumeId
     */
    public String getVolumeId() {
        return VolumeId;
    }

    /**
     * @param VolumeId the VolumeId to set
     */
    public void setVolumeId(String VolumeId) {
	this.VolumeId = VolumeId;
    }

    /**
     * @return the InstanceId
     */
    public String getInstanceId() {
        return InstanceId;
    }

    /**
     * @param InstanceId the InstanceId to set
     */
    public void setInstanceId(String InstanceId) {
	this.InstanceId = InstanceId;
    }

    /**
     * @return the Device
     */
    public String getDevice() {
        return Device;
    }

    /**
     * @param Device the Device to set
     */
    public void setDevice(String Device) {
	this.Device = Device;
    }


}