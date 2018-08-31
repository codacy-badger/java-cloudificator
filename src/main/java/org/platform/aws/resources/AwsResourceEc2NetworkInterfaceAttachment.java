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
public class AwsResourceEc2NetworkInterfaceAttachment {

    /**
     * The ID of the instance to which you will attach the ENI. 
     */
    private String InstanceId;

    /**
     * The network interface's position in the attachment order. For example, the first attached network interface has a DeviceIndex of 0. 
     */
    private String DeviceIndex;

    /**
     * The ID of the ENI that you want to attach. 
     */
    private String NetworkInterfaceId;

    /**
     * Whether to delete the network interface when the instance terminates. By default, this value is set to True. 
     */
    private String DeleteOnTermination;

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
     * @return the DeviceIndex
     */
    public String getDeviceIndex() {
        return DeviceIndex;
    }

    /**
     * @param DeviceIndex the DeviceIndex to set
     */
    public void setDeviceIndex(String DeviceIndex) {
	this.DeviceIndex = DeviceIndex;
    }

    /**
     * @return the NetworkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return NetworkInterfaceId;
    }

    /**
     * @param NetworkInterfaceId the NetworkInterfaceId to set
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
	this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * @return the DeleteOnTermination
     */
    public String getDeleteOnTermination() {
        return DeleteOnTermination;
    }

    /**
     * @param DeleteOnTermination the DeleteOnTermination to set
     */
    public void setDeleteOnTermination(String DeleteOnTermination) {
	this.DeleteOnTermination = DeleteOnTermination;
    }


}