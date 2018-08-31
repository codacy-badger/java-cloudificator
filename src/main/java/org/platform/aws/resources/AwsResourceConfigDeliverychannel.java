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
public class AwsResourceConfigDeliverychannel {

    /**
     * A key prefix (folder) for the specified S3 bucket. 
     */
    private String S3KeyPrefix;

    /**
     * Provides options for how AWS Config delivers configuration snapshots to the S3 bucket in your delivery channel. 
     */
    private String ConfigSnapshotDeliveryProperties;

    /**
     * The name of an S3 bucket where you want to store configuration history for the delivery channel. 
     */
    private String S3BucketName;

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (Amazon SNS) topic that AWS Config delivers notifications to. 
     */
    private String SnsTopicARN;

    /**
     * A name for the delivery channel. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the delivery channel name. For more information, see Name Type. 
     */
    private String Name;

    /**
     * @return the S3KeyPrefix
     */
    public String getS3KeyPrefix() {
        return S3KeyPrefix;
    }

    /**
     * @param S3KeyPrefix the S3KeyPrefix to set
     */
    public void setS3KeyPrefix(String S3KeyPrefix) {
	this.S3KeyPrefix = S3KeyPrefix;
    }

    /**
     * @return the ConfigSnapshotDeliveryProperties
     */
    public String getConfigSnapshotDeliveryProperties() {
        return ConfigSnapshotDeliveryProperties;
    }

    /**
     * @param ConfigSnapshotDeliveryProperties the ConfigSnapshotDeliveryProperties to set
     */
    public void setConfigSnapshotDeliveryProperties(String ConfigSnapshotDeliveryProperties) {
	this.ConfigSnapshotDeliveryProperties = ConfigSnapshotDeliveryProperties;
    }

    /**
     * @return the S3BucketName
     */
    public String getS3BucketName() {
        return S3BucketName;
    }

    /**
     * @param S3BucketName the S3BucketName to set
     */
    public void setS3BucketName(String S3BucketName) {
	this.S3BucketName = S3BucketName;
    }

    /**
     * @return the SnsTopicARN
     */
    public String getSnsTopicARN() {
        return SnsTopicARN;
    }

    /**
     * @param SnsTopicARN the SnsTopicARN to set
     */
    public void setSnsTopicARN(String SnsTopicARN) {
	this.SnsTopicARN = SnsTopicARN;
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