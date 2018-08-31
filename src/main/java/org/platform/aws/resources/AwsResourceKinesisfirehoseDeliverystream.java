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
public class AwsResourceKinesisfirehoseDeliverystream {

    /**
     * When a Kinesis stream is used as the source for the delivery stream, a Kinesis Data Firehose DeliveryStream KinesisStreamSourceConfiguration containing the Kinesis stream ARN and the role ARN for the source stream. 
     */
    private String KinesisStreamSourceConfiguration;

    /**
     * An Amazon ES destination for the delivery stream. 
     */
    private String ElasticsearchDestinationConfiguration;

    /**
     * The delivery stream type. This property can be one of the following values: 
     */
    private String DeliveryStreamType;

    /**
     * An Amazon S3 destination for the delivery stream. 
     */
    private String S3DestinationConfiguration;

    /**
     * An Amazon Redshift destination for the delivery stream. 
     */
    private String RedshiftDestinationConfiguration;

    /**
     * A name for the delivery stream. 
     */
    private String DeliveryStreamName;

    /**
     * The configuration of a destination in Splunk for the delivery stream. 
     */
    private String SplunkDestinationConfiguration;

    /**
     * An Amazon S3 destination for the delivery stream. 
     */
    private String ExtendedS3DestinationConfiguration;

    /**
     * @return the KinesisStreamSourceConfiguration
     */
    public String getKinesisStreamSourceConfiguration() {
        return KinesisStreamSourceConfiguration;
    }

    /**
     * @param KinesisStreamSourceConfiguration the KinesisStreamSourceConfiguration to set
     */
    public void setKinesisStreamSourceConfiguration(String KinesisStreamSourceConfiguration) {
	this.KinesisStreamSourceConfiguration = KinesisStreamSourceConfiguration;
    }

    /**
     * @return the ElasticsearchDestinationConfiguration
     */
    public String getElasticsearchDestinationConfiguration() {
        return ElasticsearchDestinationConfiguration;
    }

    /**
     * @param ElasticsearchDestinationConfiguration the ElasticsearchDestinationConfiguration to set
     */
    public void setElasticsearchDestinationConfiguration(String ElasticsearchDestinationConfiguration) {
	this.ElasticsearchDestinationConfiguration = ElasticsearchDestinationConfiguration;
    }

    /**
     * @return the DeliveryStreamType
     */
    public String getDeliveryStreamType() {
        return DeliveryStreamType;
    }

    /**
     * @param DeliveryStreamType the DeliveryStreamType to set
     */
    public void setDeliveryStreamType(String DeliveryStreamType) {
	this.DeliveryStreamType = DeliveryStreamType;
    }

    /**
     * @return the S3DestinationConfiguration
     */
    public String getS3DestinationConfiguration() {
        return S3DestinationConfiguration;
    }

    /**
     * @param S3DestinationConfiguration the S3DestinationConfiguration to set
     */
    public void setS3DestinationConfiguration(String S3DestinationConfiguration) {
	this.S3DestinationConfiguration = S3DestinationConfiguration;
    }

    /**
     * @return the RedshiftDestinationConfiguration
     */
    public String getRedshiftDestinationConfiguration() {
        return RedshiftDestinationConfiguration;
    }

    /**
     * @param RedshiftDestinationConfiguration the RedshiftDestinationConfiguration to set
     */
    public void setRedshiftDestinationConfiguration(String RedshiftDestinationConfiguration) {
	this.RedshiftDestinationConfiguration = RedshiftDestinationConfiguration;
    }

    /**
     * @return the DeliveryStreamName
     */
    public String getDeliveryStreamName() {
        return DeliveryStreamName;
    }

    /**
     * @param DeliveryStreamName the DeliveryStreamName to set
     */
    public void setDeliveryStreamName(String DeliveryStreamName) {
	this.DeliveryStreamName = DeliveryStreamName;
    }

    /**
     * @return the SplunkDestinationConfiguration
     */
    public String getSplunkDestinationConfiguration() {
        return SplunkDestinationConfiguration;
    }

    /**
     * @param SplunkDestinationConfiguration the SplunkDestinationConfiguration to set
     */
    public void setSplunkDestinationConfiguration(String SplunkDestinationConfiguration) {
	this.SplunkDestinationConfiguration = SplunkDestinationConfiguration;
    }

    /**
     * @return the ExtendedS3DestinationConfiguration
     */
    public String getExtendedS3DestinationConfiguration() {
        return ExtendedS3DestinationConfiguration;
    }

    /**
     * @param ExtendedS3DestinationConfiguration the ExtendedS3DestinationConfiguration to set
     */
    public void setExtendedS3DestinationConfiguration(String ExtendedS3DestinationConfiguration) {
	this.ExtendedS3DestinationConfiguration = ExtendedS3DestinationConfiguration;
    }


}