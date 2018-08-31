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
public class AwsResourceEc2NetworkInterface {

    /**
     * Flag indicating whether traffic to or from the instance is validated. 
     */
    private String SourceDestCheck;

    /**
     * The description of this network interface. 
     */
    private String Description;

    /**
     * Assigns a single private IP address to the network interface, which is used as the primary private IP address. If you want to specify multiple private IP address, use the PrivateIpAddresses property. 
     */
    private String PrivateIpAddress;

    /**
     * Assigns a list of private IP addresses to the network interface. You can specify a primary private IP address by setting the value of the Primary property to true in the PrivateIpAddressSpecification property. If you want EC2 to automatically assign private IP addresses, use the SecondaryPrivateIpAddressCount property and do not specify this property. 
     */
    private String PrivateIpAddresses;

    /**
     * The number of secondary private IP addresses that EC2 automatically assigns to the network interface. EC2 uses the value of the PrivateIpAddress property as the primary private IP address. If you don't specify that property, EC2 automatically assigns both the primary and secondary private IP addresses. 
     */
    private String SecondaryPrivateIpAddressCount;

    /**
     * The number of IPv6 addresses to associate with the network interface. EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific IPv6 addresses, use the Ipv6Addresses property and don't specify this property. 
     */
    private String Ipv6AddressCount;

    /**
     * A list of security group IDs associated with this network interface. 
     */
    private String GroupSet;

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet to associate with the network interface. If you're specifying a number of IPv6 addresses, use the Ipv6AddressCount property and don't specify this property. 
     */
    private String Ipv6Addresses;

    /**
     * The ID of the subnet to associate with the network interface. 
     */
    private String SubnetId;

    /**
     * An arbitrary set of tags (key–value pairs) for this network interface. 
     */
    private String Tags;

    /**
     * @return the SourceDestCheck
     */
    public String getSourceDestCheck() {
        return SourceDestCheck;
    }

    /**
     * @param SourceDestCheck the SourceDestCheck to set
     */
    public void setSourceDestCheck(String SourceDestCheck) {
	this.SourceDestCheck = SourceDestCheck;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

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
     * @return the PrivateIpAddresses
     */
    public String getPrivateIpAddresses() {
        return PrivateIpAddresses;
    }

    /**
     * @param PrivateIpAddresses the PrivateIpAddresses to set
     */
    public void setPrivateIpAddresses(String PrivateIpAddresses) {
	this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * @return the SecondaryPrivateIpAddressCount
     */
    public String getSecondaryPrivateIpAddressCount() {
        return SecondaryPrivateIpAddressCount;
    }

    /**
     * @param SecondaryPrivateIpAddressCount the SecondaryPrivateIpAddressCount to set
     */
    public void setSecondaryPrivateIpAddressCount(String SecondaryPrivateIpAddressCount) {
	this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * @return the Ipv6AddressCount
     */
    public String getIpv6AddressCount() {
        return Ipv6AddressCount;
    }

    /**
     * @param Ipv6AddressCount the Ipv6AddressCount to set
     */
    public void setIpv6AddressCount(String Ipv6AddressCount) {
	this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * @return the GroupSet
     */
    public String getGroupSet() {
        return GroupSet;
    }

    /**
     * @param GroupSet the GroupSet to set
     */
    public void setGroupSet(String GroupSet) {
	this.GroupSet = GroupSet;
    }

    /**
     * @return the Ipv6Addresses
     */
    public String getIpv6Addresses() {
        return Ipv6Addresses;
    }

    /**
     * @param Ipv6Addresses the Ipv6Addresses to set
     */
    public void setIpv6Addresses(String Ipv6Addresses) {
	this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * @return the SubnetId
     */
    public String getSubnetId() {
        return SubnetId;
    }

    /**
     * @param SubnetId the SubnetId to set
     */
    public void setSubnetId(String SubnetId) {
	this.SubnetId = SubnetId;
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