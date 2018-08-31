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
public class AwsPropertiesEc2EbsVolume {

    /**
     * The snapshot from which to create the new volume. 
     */
    private String SnapshotId;

    /**
     * The volume type. If you set the type to io1, you must also set the Iops property. For valid values, see the VolumeType parameter for the CreateVolume action in the Amazon EC2 API Reference. 
     */
    private String VolumeType;

    /**
     * The Amazon Resource Name (ARN) of the AWS Key Management Service master key that is used to create the encrypted volume, such as arn:aws:kms:us-east-2:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef. If you create an encrypted volume and don't specify this property, AWS CloudFormation uses the default master key. 
     */
    private String KmsKeyId;

    /**
     * Indicates whether the volume is encrypted. You can attach encrypted Amazon EBS volumes only to instance types that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted. You can't create an encrypted volume from an unencrypted snapshot, or vice versa. If your AMI uses encrypted volumes, you can launch the AMI only on supported instance types. For more information, see Amazon EBS encryption in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String Encrypted;

    /**
     * The size of the volume, in gibibytes (GiBs). For more information about the valid sizes for each volume type, see the Size parameter for the CreateVolume action in the Amazon EC2 API Reference. 
     */
    private String Size;

    /**
     * Indicates whether the volume is auto-enabled for I/O operations. By default, Amazon EBS disables I/O to the volume from attached EC2 instances when it determines that a volume's data is potentially inconsistent. If the consistency of the volume is not a concern, and you prefer that the volume be made available immediately if it's impaired, you can configure the volume to automatically enable I/O. For more information, see Working with the AutoEnableIO Volume Attribute in the Amazon EC2 User Guide for Linux Instances. 
     */
    private String AutoEnableIO;

    /**
     * The Availability Zone in which to create the new volume. 
     */
    private String AvailabilityZone;

    /**
     * The number of I/O operations per second (IOPS) that the volume supports. For more information about the valid sizes for each volume type, see the Iops parameter for the CreateVolume action in the Amazon EC2 API Reference. 
     */
    private String Iops;

    /**
     * An arbitrary set of tags (key–value pairs) for this volume. 
     */
    private String Tags;

    /**
     * @return the SnapshotId
     */
    public String getSnapshotId() {
        return SnapshotId;
    }

    /**
     * @param SnapshotId the SnapshotId to set
     */
    public void setSnapshotId(String SnapshotId) {
	this.SnapshotId = SnapshotId;
    }

    /**
     * @return the VolumeType
     */
    public String getVolumeType() {
        return VolumeType;
    }

    /**
     * @param VolumeType the VolumeType to set
     */
    public void setVolumeType(String VolumeType) {
	this.VolumeType = VolumeType;
    }

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
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
	this.Size = Size;
    }

    /**
     * @return the AutoEnableIO
     */
    public String getAutoEnableIO() {
        return AutoEnableIO;
    }

    /**
     * @param AutoEnableIO the AutoEnableIO to set
     */
    public void setAutoEnableIO(String AutoEnableIO) {
	this.AutoEnableIO = AutoEnableIO;
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
     * @return the Iops
     */
    public String getIops() {
        return Iops;
    }

    /**
     * @param Iops the Iops to set
     */
    public void setIops(String Iops) {
	this.Iops = Iops;
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