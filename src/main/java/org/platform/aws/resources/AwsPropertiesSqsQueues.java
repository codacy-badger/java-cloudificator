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
public class AwsPropertiesSqsQueues {

    /**
     * Specifies the duration, in seconds, that the ReceiveMessage action call waits until a message is in the queue in order to include it in the response, as opposed to returning an empty response if a message isn't yet available. You can specify an integer from 1 to 20. The short polling is used as the default or when you specify 0 for this property. For more information, see Amazon SQS Long Poll. 
     */
    private String ReceiveMessageWaitTimeSeconds;

    /**
     * The time in seconds that the delivery of all messages in the queue is delayed. You can specify an integer value of 0 to 900 (15 minutes). The default value is 0. 
     */
    private String DelaySeconds;

    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SQS or a custom CMK. To use the AWS managed CMK for Amazon SQS, specify the alias alias/aws/sqs. For more information, see CreateQueue in the Amazon Simple Queue Service API Reference, Protecting Data Using Server-Side Encryption (SSE) and AWS KMS in the Amazon Simple Queue Service Developer Guide, or Customer Master Keys in the AWS Key Management Service Best Practices whitepaper. 
     */
    private String KmsMasterKeyId;

    /**
     * Specifies an existing dead letter queue to receive messages after the source queue (this queue) fails to process a message a specified number of times. 
     */
    private String RedrivePolicy;

    /**
     * Indicates whether this queue is a FIFO queue. For more information, see FIFO (First-In-First-Out) Queues in the Amazon Simple Queue Service Developer Guide. 
     */
    private String FifoQueue;

    /**
     * The number of seconds that Amazon SQS retains a message. You can specify an integer value from 60 seconds (1 minute) to 1209600 seconds (14 days). The default value is 345600 seconds (4 days). 
     */
    private String MessageRetentionPeriod;

    /**
     * The limit of how many bytes that a message can contain before Amazon SQS rejects it. You can specify an integer value from 1024 bytes (1 KiB) to 262144 bytes (256 KiB). The default value is 262144 (256 KiB). 
     */
    private String MaximumMessageSize;

    /**
     * For first-in-first-out (FIFO) queues, specifies whether to enable content-based deduplication. During the deduplication interval, Amazon SQS treats messages that are sent with identical content as duplicates and delivers only one copy of the message. For more information, see the ContentBasedDeduplication attribute for the CreateQueue action in the Amazon Simple Queue Service API Reference. 
     */
    private String ContentBasedDeduplication;

    /**
     * The length of time during which a message will be unavailable after a message is delivered from the queue. This blocks other components from receiving the same message and gives the initial component time to process and delete the message from the queue. 
     */
    private String VisibilityTimeout;

    /**
     * The length of time in seconds that Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. The value must be an integer between 60 (1 minute) and 86,400 (24 hours). The default is 300 (5 minutes). 
     */
    private String KmsDataKeyReusePeriodSeconds;

    /**
     * A name for the queue. To create a FIFO queue, the name of your FIFO queue must end with the .fifo suffix. For more information, see FIFO (First-In-First-Out) Queues in the Amazon Simple Queue Service Developer Guide. 
     */
    private String QueueName;

    /**
     * The tags that you want to attach to this queue. 
     */
    private String Tags;

    /**
     * @return the ReceiveMessageWaitTimeSeconds
     */
    public String getReceiveMessageWaitTimeSeconds() {
        return ReceiveMessageWaitTimeSeconds;
    }

    /**
     * @param ReceiveMessageWaitTimeSeconds the ReceiveMessageWaitTimeSeconds to set
     */
    public void setReceiveMessageWaitTimeSeconds(String ReceiveMessageWaitTimeSeconds) {
	this.ReceiveMessageWaitTimeSeconds = ReceiveMessageWaitTimeSeconds;
    }

    /**
     * @return the DelaySeconds
     */
    public String getDelaySeconds() {
        return DelaySeconds;
    }

    /**
     * @param DelaySeconds the DelaySeconds to set
     */
    public void setDelaySeconds(String DelaySeconds) {
	this.DelaySeconds = DelaySeconds;
    }

    /**
     * @return the KmsMasterKeyId
     */
    public String getKmsMasterKeyId() {
        return KmsMasterKeyId;
    }

    /**
     * @param KmsMasterKeyId the KmsMasterKeyId to set
     */
    public void setKmsMasterKeyId(String KmsMasterKeyId) {
	this.KmsMasterKeyId = KmsMasterKeyId;
    }

    /**
     * @return the RedrivePolicy
     */
    public String getRedrivePolicy() {
        return RedrivePolicy;
    }

    /**
     * @param RedrivePolicy the RedrivePolicy to set
     */
    public void setRedrivePolicy(String RedrivePolicy) {
	this.RedrivePolicy = RedrivePolicy;
    }

    /**
     * @return the FifoQueue
     */
    public String getFifoQueue() {
        return FifoQueue;
    }

    /**
     * @param FifoQueue the FifoQueue to set
     */
    public void setFifoQueue(String FifoQueue) {
	this.FifoQueue = FifoQueue;
    }

    /**
     * @return the MessageRetentionPeriod
     */
    public String getMessageRetentionPeriod() {
        return MessageRetentionPeriod;
    }

    /**
     * @param MessageRetentionPeriod the MessageRetentionPeriod to set
     */
    public void setMessageRetentionPeriod(String MessageRetentionPeriod) {
	this.MessageRetentionPeriod = MessageRetentionPeriod;
    }

    /**
     * @return the MaximumMessageSize
     */
    public String getMaximumMessageSize() {
        return MaximumMessageSize;
    }

    /**
     * @param MaximumMessageSize the MaximumMessageSize to set
     */
    public void setMaximumMessageSize(String MaximumMessageSize) {
	this.MaximumMessageSize = MaximumMessageSize;
    }

    /**
     * @return the ContentBasedDeduplication
     */
    public String getContentBasedDeduplication() {
        return ContentBasedDeduplication;
    }

    /**
     * @param ContentBasedDeduplication the ContentBasedDeduplication to set
     */
    public void setContentBasedDeduplication(String ContentBasedDeduplication) {
	this.ContentBasedDeduplication = ContentBasedDeduplication;
    }

    /**
     * @return the VisibilityTimeout
     */
    public String getVisibilityTimeout() {
        return VisibilityTimeout;
    }

    /**
     * @param VisibilityTimeout the VisibilityTimeout to set
     */
    public void setVisibilityTimeout(String VisibilityTimeout) {
	this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * @return the KmsDataKeyReusePeriodSeconds
     */
    public String getKmsDataKeyReusePeriodSeconds() {
        return KmsDataKeyReusePeriodSeconds;
    }

    /**
     * @param KmsDataKeyReusePeriodSeconds the KmsDataKeyReusePeriodSeconds to set
     */
    public void setKmsDataKeyReusePeriodSeconds(String KmsDataKeyReusePeriodSeconds) {
	this.KmsDataKeyReusePeriodSeconds = KmsDataKeyReusePeriodSeconds;
    }

    /**
     * @return the QueueName
     */
    public String getQueueName() {
        return QueueName;
    }

    /**
     * @param QueueName the QueueName to set
     */
    public void setQueueName(String QueueName) {
	this.QueueName = QueueName;
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