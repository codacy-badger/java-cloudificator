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
public class AwsResourceDynamodbTable {

    /**
     * Specifies the settings to enable server-side encryption. 
     */
    private String SSESpecification;

    /**
     * A name for the table. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the table name. For more information, see Name Type. 
     */
    private String TableName;

    /**
     * A list of attributes that describe the key schema for the table and indexes. Duplicates are allowed. 
     */
    private String AttributeDefinitions;

    /**
     * The settings for the DynamoDB table stream, which capture changes to items stored in the table. 
     */
    private String StreamSpecification;

    /**
     * Global secondary indexes to be created on the table. You can create up to 5 global secondary indexes. 
     */
    private String GlobalSecondaryIndexes;

    /**
     * The settings used to enable point in time recovery. 
     */
    private String PointInTimeRecoverySpecification;

    /**
     * Throughput for the specified table, which consists of values for ReadCapacityUnits and WriteCapacityUnits. For more information about the contents of a provisioned throughput structure, see Amazon DynamoDB Table ProvisionedThroughput. 
     */
    private String ProvisionedThroughput;

    /**
     * Specifies the attributes that make up the primary key for the table. The attributes in the KeySchema property must also be defined in the AttributeDefinitions property. 
     */
    private String KeySchema;

    /**
     * Local secondary indexes to be created on the table. You can create up to 5 local secondary indexes. Each index is scoped to a given hash key value. The size of each hash key can be up to 10 gigabytes. 
     */
    private String LocalSecondaryIndexes;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this table. Use tags to manage your resources. 
     */
    private String Tags;

    /**
     * Specifies the Time to Live (TTL) settings for the table. 
     */
    private String TimeToLiveSpecification;

    /**
     * @return the SSESpecification
     */
    public String getSSESpecification() {
        return SSESpecification;
    }

    /**
     * @param SSESpecification the SSESpecification to set
     */
    public void setSSESpecification(String SSESpecification) {
	this.SSESpecification = SSESpecification;
    }

    /**
     * @return the TableName
     */
    public String getTableName() {
        return TableName;
    }

    /**
     * @param TableName the TableName to set
     */
    public void setTableName(String TableName) {
	this.TableName = TableName;
    }

    /**
     * @return the AttributeDefinitions
     */
    public String getAttributeDefinitions() {
        return AttributeDefinitions;
    }

    /**
     * @param AttributeDefinitions the AttributeDefinitions to set
     */
    public void setAttributeDefinitions(String AttributeDefinitions) {
	this.AttributeDefinitions = AttributeDefinitions;
    }

    /**
     * @return the StreamSpecification
     */
    public String getStreamSpecification() {
        return StreamSpecification;
    }

    /**
     * @param StreamSpecification the StreamSpecification to set
     */
    public void setStreamSpecification(String StreamSpecification) {
	this.StreamSpecification = StreamSpecification;
    }

    /**
     * @return the GlobalSecondaryIndexes
     */
    public String getGlobalSecondaryIndexes() {
        return GlobalSecondaryIndexes;
    }

    /**
     * @param GlobalSecondaryIndexes the GlobalSecondaryIndexes to set
     */
    public void setGlobalSecondaryIndexes(String GlobalSecondaryIndexes) {
	this.GlobalSecondaryIndexes = GlobalSecondaryIndexes;
    }

    /**
     * @return the PointInTimeRecoverySpecification
     */
    public String getPointInTimeRecoverySpecification() {
        return PointInTimeRecoverySpecification;
    }

    /**
     * @param PointInTimeRecoverySpecification the PointInTimeRecoverySpecification to set
     */
    public void setPointInTimeRecoverySpecification(String PointInTimeRecoverySpecification) {
	this.PointInTimeRecoverySpecification = PointInTimeRecoverySpecification;
    }

    /**
     * @return the ProvisionedThroughput
     */
    public String getProvisionedThroughput() {
        return ProvisionedThroughput;
    }

    /**
     * @param ProvisionedThroughput the ProvisionedThroughput to set
     */
    public void setProvisionedThroughput(String ProvisionedThroughput) {
	this.ProvisionedThroughput = ProvisionedThroughput;
    }

    /**
     * @return the KeySchema
     */
    public String getKeySchema() {
        return KeySchema;
    }

    /**
     * @param KeySchema the KeySchema to set
     */
    public void setKeySchema(String KeySchema) {
	this.KeySchema = KeySchema;
    }

    /**
     * @return the LocalSecondaryIndexes
     */
    public String getLocalSecondaryIndexes() {
        return LocalSecondaryIndexes;
    }

    /**
     * @param LocalSecondaryIndexes the LocalSecondaryIndexes to set
     */
    public void setLocalSecondaryIndexes(String LocalSecondaryIndexes) {
	this.LocalSecondaryIndexes = LocalSecondaryIndexes;
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
     * @return the TimeToLiveSpecification
     */
    public String getTimeToLiveSpecification() {
        return TimeToLiveSpecification;
    }

    /**
     * @param TimeToLiveSpecification the TimeToLiveSpecification to set
     */
    public void setTimeToLiveSpecification(String TimeToLiveSpecification) {
	this.TimeToLiveSpecification = TimeToLiveSpecification;
    }


}