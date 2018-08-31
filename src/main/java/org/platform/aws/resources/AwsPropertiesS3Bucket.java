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
public class AwsPropertiesS3Bucket {

    /**
     * The inventory configuration for an Amazon S3 bucket. Duplicates not allowed. 
     */
    private String InventoryConfigurations;

    /**
     * Specifies default encryption for a bucket using server-side encryption with either Amazon S3-managed keys (SSE-S3) or AWS KMS-managed keys (SSE-KMS). 
     */
    private String BucketEncryption;

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications. 
     */
    private String NotificationConfiguration;

    /**
     * Information used to configure the bucket as a static website. For more information, see Hosting Websites on Amazon S3. 
     */
    private String WebsiteConfiguration;

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime. For more information, see Object Lifecycle Management in the Amazon Simple Storage Service Developer Guide. 
     */
    private String LifecycleConfiguration;

    /**
     * Enables multiple variants of all objects in this bucket. You might enable versioning to prevent objects from being deleted or overwritten by mistake or to archive objects so that you can retrieve previous versions of them. 
     */
    private String VersioningConfiguration;

    /**
     * Settings that define a metrics configuration for the CloudWatch request metrics from the bucket. 
     */
    private String MetricsConfigurations;

    /**
     * A canned access control list (ACL) that grants predefined permissions to the bucket. For more information about canned ACLs, see Canned ACLs in the Amazon S3 documentation in the Amazon Simple Storage Service Developer Guide. 
     */
    private String AccessControl;

    /**
     * The configuration and any analyses for the analytics filter of an Amazon S3 bucket. Duplicates not allowed. 
     */
    private String AnalyticsConfigurations;

    /**
     * Configuration for the transfer acceleration state. For more information, see Amazon S3 Transfer Acceleration in the Amazon Simple Storage Service Developer Guide. 
     */
    private String AccelerateConfiguration;

    /**
     * A name for the bucket. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the bucket name. For more information, see Name Type. The bucket name must contain only lowercase letters, numbers, periods (.), and dashes (-). 
     */
    private String BucketName;

    /**
     * Rules that define cross-origin resource sharing of objects in this bucket. For more information, see Enabling Cross-Origin Resource Sharing in the Amazon Simple Storage Service Developer Guide. 
     */
    private String CorsConfiguration;

    /**
     * Settings that define where logs are stored. 
     */
    private String LoggingConfiguration;

    /**
     * Configuration for replicating objects in an S3 bucket. To enable replication, you must also enable versioning by using the VersioningConfiguration property. 
     */
    private String ReplicationConfiguration;

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket. 
     */
    private String Tags;

    /**
     * @return the InventoryConfigurations
     */
    public String getInventoryConfigurations() {
        return InventoryConfigurations;
    }

    /**
     * @param InventoryConfigurations the InventoryConfigurations to set
     */
    public void setInventoryConfigurations(String InventoryConfigurations) {
	this.InventoryConfigurations = InventoryConfigurations;
    }

    /**
     * @return the BucketEncryption
     */
    public String getBucketEncryption() {
        return BucketEncryption;
    }

    /**
     * @param BucketEncryption the BucketEncryption to set
     */
    public void setBucketEncryption(String BucketEncryption) {
	this.BucketEncryption = BucketEncryption;
    }

    /**
     * @return the NotificationConfiguration
     */
    public String getNotificationConfiguration() {
        return NotificationConfiguration;
    }

    /**
     * @param NotificationConfiguration the NotificationConfiguration to set
     */
    public void setNotificationConfiguration(String NotificationConfiguration) {
	this.NotificationConfiguration = NotificationConfiguration;
    }

    /**
     * @return the WebsiteConfiguration
     */
    public String getWebsiteConfiguration() {
        return WebsiteConfiguration;
    }

    /**
     * @param WebsiteConfiguration the WebsiteConfiguration to set
     */
    public void setWebsiteConfiguration(String WebsiteConfiguration) {
	this.WebsiteConfiguration = WebsiteConfiguration;
    }

    /**
     * @return the LifecycleConfiguration
     */
    public String getLifecycleConfiguration() {
        return LifecycleConfiguration;
    }

    /**
     * @param LifecycleConfiguration the LifecycleConfiguration to set
     */
    public void setLifecycleConfiguration(String LifecycleConfiguration) {
	this.LifecycleConfiguration = LifecycleConfiguration;
    }

    /**
     * @return the VersioningConfiguration
     */
    public String getVersioningConfiguration() {
        return VersioningConfiguration;
    }

    /**
     * @param VersioningConfiguration the VersioningConfiguration to set
     */
    public void setVersioningConfiguration(String VersioningConfiguration) {
	this.VersioningConfiguration = VersioningConfiguration;
    }

    /**
     * @return the MetricsConfigurations
     */
    public String getMetricsConfigurations() {
        return MetricsConfigurations;
    }

    /**
     * @param MetricsConfigurations the MetricsConfigurations to set
     */
    public void setMetricsConfigurations(String MetricsConfigurations) {
	this.MetricsConfigurations = MetricsConfigurations;
    }

    /**
     * @return the AccessControl
     */
    public String getAccessControl() {
        return AccessControl;
    }

    /**
     * @param AccessControl the AccessControl to set
     */
    public void setAccessControl(String AccessControl) {
	this.AccessControl = AccessControl;
    }

    /**
     * @return the AnalyticsConfigurations
     */
    public String getAnalyticsConfigurations() {
        return AnalyticsConfigurations;
    }

    /**
     * @param AnalyticsConfigurations the AnalyticsConfigurations to set
     */
    public void setAnalyticsConfigurations(String AnalyticsConfigurations) {
	this.AnalyticsConfigurations = AnalyticsConfigurations;
    }

    /**
     * @return the AccelerateConfiguration
     */
    public String getAccelerateConfiguration() {
        return AccelerateConfiguration;
    }

    /**
     * @param AccelerateConfiguration the AccelerateConfiguration to set
     */
    public void setAccelerateConfiguration(String AccelerateConfiguration) {
	this.AccelerateConfiguration = AccelerateConfiguration;
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
     * @return the CorsConfiguration
     */
    public String getCorsConfiguration() {
        return CorsConfiguration;
    }

    /**
     * @param CorsConfiguration the CorsConfiguration to set
     */
    public void setCorsConfiguration(String CorsConfiguration) {
	this.CorsConfiguration = CorsConfiguration;
    }

    /**
     * @return the LoggingConfiguration
     */
    public String getLoggingConfiguration() {
        return LoggingConfiguration;
    }

    /**
     * @param LoggingConfiguration the LoggingConfiguration to set
     */
    public void setLoggingConfiguration(String LoggingConfiguration) {
	this.LoggingConfiguration = LoggingConfiguration;
    }

    /**
     * @return the ReplicationConfiguration
     */
    public String getReplicationConfiguration() {
        return ReplicationConfiguration;
    }

    /**
     * @param ReplicationConfiguration the ReplicationConfiguration to set
     */
    public void setReplicationConfiguration(String ReplicationConfiguration) {
	this.ReplicationConfiguration = ReplicationConfiguration;
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