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
public class AwsResourceCloudtrailTrail {

    /**
     * Indicates whether the trail is publishing events from global services, such as IAM, to the log files. By default, AWS CloudFormation sets this value to false. 
     */
    private String IncludeGlobalServiceEvents;

    /**
     * Configures logging for management and data events. 
     */
    private String EventSelectors;

    /**
     * The AWS Key Management Service (AWS KMS) key ID that you want to use to encrypt CloudTrail logs. You can specify an alias name (prefixed with alias/), an alias ARN, a key ARN, or a globally unique identifier. 
     */
    private String KMSKeyId;

    /**
     * The role ARN that Amazon CloudWatch Logs (CloudWatch Logs) assumes to write logs to a log group. For more information, see Role Policy Document for CloudTrail to Use CloudWatch Logs for Monitoring in the AWS CloudTrail User Guide. 
     */
    private String CloudWatchLogsRoleArn;

    /**
     * An Amazon S3 object key prefix that precedes the name of all log files. 
     */
    private String S3KeyPrefix;

    /**
     * The name of the trail. For constraint information, see CreateTrail in the AWS CloudTrail API Reference. 
     */
    private String TrailName;

    /**
     * The Amazon Resource Name (ARN) of a log group to which CloudTrail logs will be delivered. 
     */
    private String CloudWatchLogsLogGroupArn;

    /**
     * The name of an Amazon SNS topic that is notified when new log files are published. 
     */
    private String SnsTopicName;

    /**
     * Indicates whether the CloudTrail trail is created in the region in which you create the stack (false) or in all regions (true). By default, AWS CloudFormation sets this value to false. For more information, see How Does CloudTrail Behave Regionally and Globally? in the AWS CloudTrail User Guide. 
     */
    private String IsMultiRegionTrail;

    /**
     * The name of the Amazon S3 bucket where CloudTrail publishes log files. 
     */
    private String S3BucketName;

    /**
     * Indicates whether CloudTrail validates the integrity of log files. By default, AWS CloudFormation sets this value to false. When you disable log file integrity validation, CloudTrail stops creating digest files. For more information, see CreateTrail in the AWS CloudTrail API Reference. 
     */
    private String EnableLogFileValidation;

    /**
     * An arbitrary set of tags (key–value pairs) for this trail. 
     */
    private String Tags;

    /**
     * Indicates whether the CloudTrail trail is currently logging AWS API calls. 
     */
    private String IsLogging;

    /**
     * @return the IncludeGlobalServiceEvents
     */
    public String getIncludeGlobalServiceEvents() {
        return IncludeGlobalServiceEvents;
    }

    /**
     * @param IncludeGlobalServiceEvents the IncludeGlobalServiceEvents to set
     */
    public void setIncludeGlobalServiceEvents(String IncludeGlobalServiceEvents) {
	this.IncludeGlobalServiceEvents = IncludeGlobalServiceEvents;
    }

    /**
     * @return the EventSelectors
     */
    public String getEventSelectors() {
        return EventSelectors;
    }

    /**
     * @param EventSelectors the EventSelectors to set
     */
    public void setEventSelectors(String EventSelectors) {
	this.EventSelectors = EventSelectors;
    }

    /**
     * @return the KMSKeyId
     */
    public String getKMSKeyId() {
        return KMSKeyId;
    }

    /**
     * @param KMSKeyId the KMSKeyId to set
     */
    public void setKMSKeyId(String KMSKeyId) {
	this.KMSKeyId = KMSKeyId;
    }

    /**
     * @return the CloudWatchLogsRoleArn
     */
    public String getCloudWatchLogsRoleArn() {
        return CloudWatchLogsRoleArn;
    }

    /**
     * @param CloudWatchLogsRoleArn the CloudWatchLogsRoleArn to set
     */
    public void setCloudWatchLogsRoleArn(String CloudWatchLogsRoleArn) {
	this.CloudWatchLogsRoleArn = CloudWatchLogsRoleArn;
    }

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
     * @return the TrailName
     */
    public String getTrailName() {
        return TrailName;
    }

    /**
     * @param TrailName the TrailName to set
     */
    public void setTrailName(String TrailName) {
	this.TrailName = TrailName;
    }

    /**
     * @return the CloudWatchLogsLogGroupArn
     */
    public String getCloudWatchLogsLogGroupArn() {
        return CloudWatchLogsLogGroupArn;
    }

    /**
     * @param CloudWatchLogsLogGroupArn the CloudWatchLogsLogGroupArn to set
     */
    public void setCloudWatchLogsLogGroupArn(String CloudWatchLogsLogGroupArn) {
	this.CloudWatchLogsLogGroupArn = CloudWatchLogsLogGroupArn;
    }

    /**
     * @return the SnsTopicName
     */
    public String getSnsTopicName() {
        return SnsTopicName;
    }

    /**
     * @param SnsTopicName the SnsTopicName to set
     */
    public void setSnsTopicName(String SnsTopicName) {
	this.SnsTopicName = SnsTopicName;
    }

    /**
     * @return the IsMultiRegionTrail
     */
    public String getIsMultiRegionTrail() {
        return IsMultiRegionTrail;
    }

    /**
     * @param IsMultiRegionTrail the IsMultiRegionTrail to set
     */
    public void setIsMultiRegionTrail(String IsMultiRegionTrail) {
	this.IsMultiRegionTrail = IsMultiRegionTrail;
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
     * @return the EnableLogFileValidation
     */
    public String getEnableLogFileValidation() {
        return EnableLogFileValidation;
    }

    /**
     * @param EnableLogFileValidation the EnableLogFileValidation to set
     */
    public void setEnableLogFileValidation(String EnableLogFileValidation) {
	this.EnableLogFileValidation = EnableLogFileValidation;
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

    /**
     * @return the IsLogging
     */
    public String getIsLogging() {
        return IsLogging;
    }

    /**
     * @param IsLogging the IsLogging to set
     */
    public void setIsLogging(String IsLogging) {
	this.IsLogging = IsLogging;
    }


}