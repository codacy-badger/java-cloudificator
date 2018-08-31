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
public class AwsResourceEfsMounttarget {

    /**
     * A maximum of five VPC security group IDs that are in the same VPC as the subnet that is specified in the SubnetId property. For more information about security groups and mount targets, see Security in the Amazon Elastic File System User Guide. 
     */
    private String SecurityGroups;

    /**
     * The ID of the file system for which you want to create the mount target. 
     */
    private String FileSystemId;

    /**
     * An IPv4 address that is within the address range of the subnet that is specified in the SubnetId property. If you don't specify an IP address, Amazon EFS automatically assigns an address that is within the range of the subnet. 
     */
    private String IpAddress;

    /**
     * The ID of the subnet in which you want to add the mount target. 
     */
    private String SubnetId;

    /**
     * @return the SecurityGroups
     */
    public String getSecurityGroups() {
        return SecurityGroups;
    }

    /**
     * @param SecurityGroups the SecurityGroups to set
     */
    public void setSecurityGroups(String SecurityGroups) {
	this.SecurityGroups = SecurityGroups;
    }

    /**
     * @return the FileSystemId
     */
    public String getFileSystemId() {
        return FileSystemId;
    }

    /**
     * @param FileSystemId the FileSystemId to set
     */
    public void setFileSystemId(String FileSystemId) {
	this.FileSystemId = FileSystemId;
    }

    /**
     * @return the IpAddress
     */
    public String getIpAddress() {
        return IpAddress;
    }

    /**
     * @param IpAddress the IpAddress to set
     */
    public void setIpAddress(String IpAddress) {
	this.IpAddress = IpAddress;
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


}