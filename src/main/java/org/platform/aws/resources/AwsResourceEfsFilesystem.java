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
public class AwsResourceEfsFilesystem {

    /**
     * The ID of the AWS KMS customer master key (CMK) to use to protect the encrypted file system. This parameter is only required if you want to use a non-default CMK. For more information, see CreateFileSystem in the Amazon Elastic File System User Guide. 
     */
    private String KmsKeyId;

    /**
     * The performance mode of the file system. For valid values, see the PerformanceMode parameter for the CreateFileSystem action in the Amazon Elastic File System User Guide. 
     */
    private String PerformanceMode;

    /**
     * Tags to associate with the file system. 
     */
    private String FileSystemTags;

    /**
     * A boolean value that, if true, creates an encrypted file system. For more information, see CreateFileSystem in the Amazon Elastic File System User Guide. 
     */
    private String Encrypted;

    /**
     * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see Amazon EFS Limits That You Can Increase in the Amazon Elastic File System User Guide. 
     */
    private String ProvisionedThroughputInMibps;

    /**
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode change. 
     */
    private String ThroughputMode;

    /**
     * @return the KmsKeyId
     */
    public String getKmsKeyId() {
        return KmsKeyId;
    }

    /**
     * @param KmsKeyId the KmsKeyId to set
     */
    public void setKmsKeyId(String KmsKeyId) {
	this.KmsKeyId = KmsKeyId;
    }

    /**
     * @return the PerformanceMode
     */
    public String getPerformanceMode() {
        return PerformanceMode;
    }

    /**
     * @param PerformanceMode the PerformanceMode to set
     */
    public void setPerformanceMode(String PerformanceMode) {
	this.PerformanceMode = PerformanceMode;
    }

    /**
     * @return the FileSystemTags
     */
    public String getFileSystemTags() {
        return FileSystemTags;
    }

    /**
     * @param FileSystemTags the FileSystemTags to set
     */
    public void setFileSystemTags(String FileSystemTags) {
	this.FileSystemTags = FileSystemTags;
    }

    /**
     * @return the Encrypted
     */
    public String getEncrypted() {
        return Encrypted;
    }

    /**
     * @param Encrypted the Encrypted to set
     */
    public void setEncrypted(String Encrypted) {
	this.Encrypted = Encrypted;
    }

    /**
     * @return the ProvisionedThroughputInMibps
     */
    public String getProvisionedThroughputInMibps() {
        return ProvisionedThroughputInMibps;
    }

    /**
     * @param ProvisionedThroughputInMibps the ProvisionedThroughputInMibps to set
     */
    public void setProvisionedThroughputInMibps(String ProvisionedThroughputInMibps) {
	this.ProvisionedThroughputInMibps = ProvisionedThroughputInMibps;
    }

    /**
     * @return the ThroughputMode
     */
    public String getThroughputMode() {
        return ThroughputMode;
    }

    /**
     * @param ThroughputMode the ThroughputMode to set
     */
    public void setThroughputMode(String ThroughputMode) {
	this.ThroughputMode = ThroughputMode;
    }


}