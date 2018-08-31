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
public class AwsPropertiesEc2EipAssociation {

    /**
     * [EC2-VPC] The private IP address that you want to associate with the Elastic IP address. The private IP address is restricted to the primary and secondary private IP addresses that are associated with the network interface. By default, the private IP address that is associated with the EIP is the primary private IP address of the network interface. 
     */
    private String PrivateIpAddress;

    /**
     * Instance ID of the Amazon EC2 instance that you want to associate with the Elastic IP address specified by the EIP property. If the instance has more than one network interface, you must specify a network interface ID. 
     */
    private String InstanceId;

    /**
     * [EC2-VPC] Allocation ID for the VPC Elastic IP address you want to associate with an Amazon EC2 instance in your VPC. 
     */
    private String AllocationId;

    /**
     * [EC2-VPC] The ID of the network interface to associate with the Elastic IP address. If the instance has more than one network interface, you must specify a network interface ID. 
     */
    private String NetworkInterfaceId;

    /**
     * Elastic IP address that you want to associate with the Amazon EC2 instance specified by the InstanceId property. You can specify an existing Elastic IP address or a reference to an Elastic IP address allocated with a AWS::EC2::EIP resource. 
     */
    private String EIP;

    /**
     * @return the PrivateIpAddress
     */
    public String getPrivateIpAddress() {
        return PrivateIpAddress;
    }

    /**
     * @param PrivateIpAddress the PrivateIpAddress to set
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
	this.PrivateIpAddress = PrivateIpAddress;
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
     * @return the AllocationId
     */
    public String getAllocationId() {
        return AllocationId;
    }

    /**
     * @param AllocationId the AllocationId to set
     */
    public void setAllocationId(String AllocationId) {
	this.AllocationId = AllocationId;
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
     * @return the EIP
     */
    public String getEIP() {
        return EIP;
    }

    /**
     * @param EIP the EIP to set
     */
    public void setEIP(String EIP) {
	this.EIP = EIP;
    }


}