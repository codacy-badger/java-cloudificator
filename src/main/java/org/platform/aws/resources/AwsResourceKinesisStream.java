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
public class AwsResourceKinesisStream {

    /**
     * Enables or updates server-side encryption using an AWS KMS key for a specified stream. 
     */
    private String StreamEncryption;

    /**
     * The number of hours for the data records that are stored in shards to remain accessible. The default value is 24. For more information about the stream retention period, see Changing the Data Retention Period in the Amazon Kinesis Developer Guide. 
     */
    private String RetentionPeriodHours;

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Kinesis stream. For information about constraints for this property, see Tag Restrictions in the Amazon Kinesis Developer Guide. 
     */
    private String Tags;

    /**
     * The name of the Kinesis stream. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the stream name. For more information, see Name Type. 
     */
    private String Name;

    /**
     * The number of shards that the stream uses. For greater provisioned throughput, increase the number of shards. 
     */
    private String ShardCount;

    /**
     * @return the StreamEncryption
     */
    public String getStreamEncryption() {
        return StreamEncryption;
    }

    /**
     * @param StreamEncryption the StreamEncryption to set
     */
    public void setStreamEncryption(String StreamEncryption) {
	this.StreamEncryption = StreamEncryption;
    }

    /**
     * @return the RetentionPeriodHours
     */
    public String getRetentionPeriodHours() {
        return RetentionPeriodHours;
    }

    /**
     * @param RetentionPeriodHours the RetentionPeriodHours to set
     */
    public void setRetentionPeriodHours(String RetentionPeriodHours) {
	this.RetentionPeriodHours = RetentionPeriodHours;
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

    /**
     * @return the ShardCount
     */
    public String getShardCount() {
        return ShardCount;
    }

    /**
     * @param ShardCount the ShardCount to set
     */
    public void setShardCount(String ShardCount) {
	this.ShardCount = ShardCount;
    }


}