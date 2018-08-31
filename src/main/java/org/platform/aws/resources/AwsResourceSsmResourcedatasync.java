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
public class AwsResourceSsmResourcedatasync {

    /**
     * The ARN of an encryption key for a destination in Amazon S3. You can use a KMS key to encrypt inventory data in Amazon S3. You must specify a key that exist in the same region as the destination Amazon S3 bucket. 
     */
    private String KMSKeyArn;

    /**
     * The name of the Amazon S3 bucket where the aggregated data is stored. 
     */
    private String BucketName;

    /**
     * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync. 
     */
    private String BucketRegion;

    /**
     * The format in which Resource Data Sync output will be stored in Amazon S3. The following format is currently supported: JsonSerDe 
     */
    private String SyncFormat;

    /**
     * A name for the Resource Data Sync. 
     */
    private String SyncName;

    /**
     * An Amazon S3 prefix for the bucket. 
     */
    private String BucketPrefix;

    /**
     * @return the KMSKeyArn
     */
    public String getKMSKeyArn() {
        return KMSKeyArn;
    }

    /**
     * @param KMSKeyArn the KMSKeyArn to set
     */
    public void setKMSKeyArn(String KMSKeyArn) {
	this.KMSKeyArn = KMSKeyArn;
    }

    /**
     * @return the BucketName
     */
    public String getBucketName() {
        return BucketName;
    }

    /**
     * @param BucketName the BucketName to set
     */
    public void setBucketName(String BucketName) {
	this.BucketName = BucketName;
    }

    /**
     * @return the BucketRegion
     */
    public String getBucketRegion() {
        return BucketRegion;
    }

    /**
     * @param BucketRegion the BucketRegion to set
     */
    public void setBucketRegion(String BucketRegion) {
	this.BucketRegion = BucketRegion;
    }

    /**
     * @return the SyncFormat
     */
    public String getSyncFormat() {
        return SyncFormat;
    }

    /**
     * @param SyncFormat the SyncFormat to set
     */
    public void setSyncFormat(String SyncFormat) {
	this.SyncFormat = SyncFormat;
    }

    /**
     * @return the SyncName
     */
    public String getSyncName() {
        return SyncName;
    }

    /**
     * @param SyncName the SyncName to set
     */
    public void setSyncName(String SyncName) {
	this.SyncName = SyncName;
    }

    /**
     * @return the BucketPrefix
     */
    public String getBucketPrefix() {
        return BucketPrefix;
    }

    /**
     * @param BucketPrefix the BucketPrefix to set
     */
    public void setBucketPrefix(String BucketPrefix) {
	this.BucketPrefix = BucketPrefix;
    }


}