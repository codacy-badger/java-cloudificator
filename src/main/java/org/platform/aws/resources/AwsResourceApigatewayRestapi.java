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
public class AwsResourceApigatewayRestapi {

    /**
     * A policy document that contains the permissions for this RestApi resource, in JSON format. 
     */
    private String Policy;

    /**
     * The Amazon Simple Storage Service (Amazon S3) location that points to an OpenAPI file, which defines a set of RESTful APIs in JSON or YAML format. 
     */
    private String BodyS3Location;

    /**
     * A description of the purpose of this API Gateway RestApi resource. 
     */
    private String Description;

    /**
     * A nullable integer that is used to enable compression (with non-negative between 0 and 10485760 (10M) bytes, inclusive) or disable compression (with a null value) on an API. When compression is enabled, compression or decompression is not applied on the payload if the payload size is smaller than this value. Setting it to zero allows compression for any payload size. 
     */
    private String MinimumCompressionSize;

    /**
     * Custom header parameters for the request. 
     */
    private String Parameters;

    /**
     * The ID of the API Gateway RestApi resource that you want to clone. 
     */
    private String CloneFrom;

    /**
     * The source of the API key for metering requests according to a usage plan. Valid values are: 
     */
    private String ApiKeySourceType;

    /**
     * A list of the endpoint types of the API. Use this property when creating an API. When importing an existing API, specify the endpoint configuration types using the Parameters property. 
     */
    private String EndpointConfiguration;

    /**
     * Indicates whether to roll back the resource if a warning occurs while API Gateway is creating the RestApi resource. 
     */
    private String FailOnWarnings;

    /**
     * An OpenAPI specification that defines a set of RESTful APIs in the JSON format. For YAML templates, you can also provide the specification in the YAML format. 
     */
    private String Body;

    /**
     * The list of binary media types that are supported by the RestApi resource, such as image/png or application/octet-stream. By default, RestApi supports only UTF-8-encoded text payloads. For more information, see Enable Support for Binary Payloads in API Gateway in the API Gateway Developer Guide. Duplicates are not allowed. 
     */
    private String BinaryMediaTypes;

    /**
     * A name for the API Gateway RestApi resource. 
     */
    private String Name;

    /**
     * @return the Policy
     */
    public String getPolicy() {
        return Policy;
    }

    /**
     * @param Policy the Policy to set
     */
    public void setPolicy(String Policy) {
	this.Policy = Policy;
    }

    /**
     * @return the BodyS3Location
     */
    public String getBodyS3Location() {
        return BodyS3Location;
    }

    /**
     * @param BodyS3Location the BodyS3Location to set
     */
    public void setBodyS3Location(String BodyS3Location) {
	this.BodyS3Location = BodyS3Location;
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
     * @return the MinimumCompressionSize
     */
    public String getMinimumCompressionSize() {
        return MinimumCompressionSize;
    }

    /**
     * @param MinimumCompressionSize the MinimumCompressionSize to set
     */
    public void setMinimumCompressionSize(String MinimumCompressionSize) {
	this.MinimumCompressionSize = MinimumCompressionSize;
    }

    /**
     * @return the Parameters
     */
    public String getParameters() {
        return Parameters;
    }

    /**
     * @param Parameters the Parameters to set
     */
    public void setParameters(String Parameters) {
	this.Parameters = Parameters;
    }

    /**
     * @return the CloneFrom
     */
    public String getCloneFrom() {
        return CloneFrom;
    }

    /**
     * @param CloneFrom the CloneFrom to set
     */
    public void setCloneFrom(String CloneFrom) {
	this.CloneFrom = CloneFrom;
    }

    /**
     * @return the ApiKeySourceType
     */
    public String getApiKeySourceType() {
        return ApiKeySourceType;
    }

    /**
     * @param ApiKeySourceType the ApiKeySourceType to set
     */
    public void setApiKeySourceType(String ApiKeySourceType) {
	this.ApiKeySourceType = ApiKeySourceType;
    }

    /**
     * @return the EndpointConfiguration
     */
    public String getEndpointConfiguration() {
        return EndpointConfiguration;
    }

    /**
     * @param EndpointConfiguration the EndpointConfiguration to set
     */
    public void setEndpointConfiguration(String EndpointConfiguration) {
	this.EndpointConfiguration = EndpointConfiguration;
    }

    /**
     * @return the FailOnWarnings
     */
    public String getFailOnWarnings() {
        return FailOnWarnings;
    }

    /**
     * @param FailOnWarnings the FailOnWarnings to set
     */
    public void setFailOnWarnings(String FailOnWarnings) {
	this.FailOnWarnings = FailOnWarnings;
    }

    /**
     * @return the Body
     */
    public String getBody() {
        return Body;
    }

    /**
     * @param Body the Body to set
     */
    public void setBody(String Body) {
	this.Body = Body;
    }

    /**
     * @return the BinaryMediaTypes
     */
    public String getBinaryMediaTypes() {
        return BinaryMediaTypes;
    }

    /**
     * @param BinaryMediaTypes the BinaryMediaTypes to set
     */
    public void setBinaryMediaTypes(String BinaryMediaTypes) {
	this.BinaryMediaTypes = BinaryMediaTypes;
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