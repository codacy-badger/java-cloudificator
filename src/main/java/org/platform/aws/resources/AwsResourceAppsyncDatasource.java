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
public class AwsResourceAppsyncDatasource {

    /**
     * Mandatory resource to return data from in customer AWS account. For a complete list of values, see CreateDataSource in the AWS AppSync API Reference for more information. 
     */
    private String Type;

    /**
     * Friendly description for this data source. 
     */
    private String Description;

    /**
     * The Amazon Resource Name (ARN) of the IAM role which the data source will use to connect to a resource. 
     */
    private String ServiceRoleArn;

    /**
     * Endpoints for an HTTP DataSource. 
     */
    private String HttpConfig;

    /**
     * A valid ARN of a Lambda function in your account. 
     */
    private String LambdaConfig;

    /**
     * Unique AWS AppSync GraphQL API Identifier where this data source will be created. 
     */
    private String ApiId;

    /**
     * Friendly name for you to identify your AppSync data source after creation. 
     */
    private String Name;

    /**
     * AwsRegion and TableName for an Amazon DynamoDB table in your account. 
     */
    private String DynamoDBConfig;

    /**
     * AwsRegion and Endpoints for an Amazon Elasticsearch Service domain in your account. 
     */
    private String ElasticsearchConfig;

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the ServiceRoleArn
     */
    public String getServiceRoleArn() {
        return ServiceRoleArn;
    }

    /**
     * @param ServiceRoleArn the ServiceRoleArn to set
     */
    public void setServiceRoleArn(String ServiceRoleArn) {
	this.ServiceRoleArn = ServiceRoleArn;
    }

    /**
     * @return the HttpConfig
     */
    public String getHttpConfig() {
        return HttpConfig;
    }

    /**
     * @param HttpConfig the HttpConfig to set
     */
    public void setHttpConfig(String HttpConfig) {
	this.HttpConfig = HttpConfig;
    }

    /**
     * @return the LambdaConfig
     */
    public String getLambdaConfig() {
        return LambdaConfig;
    }

    /**
     * @param LambdaConfig the LambdaConfig to set
     */
    public void setLambdaConfig(String LambdaConfig) {
	this.LambdaConfig = LambdaConfig;
    }

    /**
     * @return the ApiId
     */
    public String getApiId() {
        return ApiId;
    }

    /**
     * @param ApiId the ApiId to set
     */
    public void setApiId(String ApiId) {
	this.ApiId = ApiId;
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
     * @return the DynamoDBConfig
     */
    public String getDynamoDBConfig() {
        return DynamoDBConfig;
    }

    /**
     * @param DynamoDBConfig the DynamoDBConfig to set
     */
    public void setDynamoDBConfig(String DynamoDBConfig) {
	this.DynamoDBConfig = DynamoDBConfig;
    }

    /**
     * @return the ElasticsearchConfig
     */
    public String getElasticsearchConfig() {
        return ElasticsearchConfig;
    }

    /**
     * @param ElasticsearchConfig the ElasticsearchConfig to set
     */
    public void setElasticsearchConfig(String ElasticsearchConfig) {
	this.ElasticsearchConfig = ElasticsearchConfig;
    }


}