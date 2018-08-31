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
public class AwsResourceOpsworksVolume {

    /**
     * The mount point for the Amazon EBS volume, such as /mnt/disk1. 
     */
    private String MountPoint;

    /**
     * The ID of the Amazon EBS volume to register with the AWS OpsWorks stack. 
     */
    private String Ec2VolumeId;

    /**
     * A name for the Amazon EBS volume. 
     */
    private String Name;

    /**
     * The ID of the AWS OpsWorks stack that AWS OpsWorks registers the volume to. 
     */
    private String StackId;

    /**
     * @return the MountPoint
     */
    public String getMountPoint() {
        return MountPoint;
    }

    /**
     * @param MountPoint the MountPoint to set
     */
    public void setMountPoint(String MountPoint) {
	this.MountPoint = MountPoint;
    }

    /**
     * @return the Ec2VolumeId
     */
    public String getEc2VolumeId() {
        return Ec2VolumeId;
    }

    /**
     * @param Ec2VolumeId the Ec2VolumeId to set
     */
    public void setEc2VolumeId(String Ec2VolumeId) {
	this.Ec2VolumeId = Ec2VolumeId;
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
     * @return the StackId
     */
    public String getStackId() {
        return StackId;
    }

    /**
     * @param StackId the StackId to set
     */
    public void setStackId(String StackId) {
	this.StackId = StackId;
    }


}