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
public class AwsResourceAppsyncResolver {

    /**
     * A location of a response mapping template on an S3 bucket if you wish to provision with the template file living in S3 rather than embedded in your CloudFormation template. 
     */
    private String ResponseMappingTemplateS3Location;

    /**
     * The GraphQL type that will invoke this resolver. 
     */
    private String TypeName;

    /**
     * The AWS AppSync data source that this resolver will run against in order to return data to the caller. 
     */
    private String DataSourceName;

    /**
     * The resolver’s request mapping template, written in text within the CloudFormation template. 
     */
    private String RequestMappingTemplate;

    /**
     * The resolver’s response mapping template, written in text within the CloudFormation template. 
     */
    private String ResponseMappingTemplate;

    /**
     * A location of a request mapping template on an S3 bucket if you wish to provision with the template file living in S3 rather than embedded in your CloudFormation template. 
     */
    private String RequestMappingTemplateS3Location;

    /**
     * The AWS AppSync GraphQL API which you will attach this resolver. 
     */
    private String ApiId;

    /**
     * The GraphQL field on a type that will invoke the resolver. 
     */
    private String FieldName;

    /**
     * @return the ResponseMappingTemplateS3Location
     */
    public String getResponseMappingTemplateS3Location() {
        return ResponseMappingTemplateS3Location;
    }

    /**
     * @param ResponseMappingTemplateS3Location the ResponseMappingTemplateS3Location to set
     */
    public void setResponseMappingTemplateS3Location(String ResponseMappingTemplateS3Location) {
	this.ResponseMappingTemplateS3Location = ResponseMappingTemplateS3Location;
    }

    /**
     * @return the TypeName
     */
    public String getTypeName() {
        return TypeName;
    }

    /**
     * @param TypeName the TypeName to set
     */
    public void setTypeName(String TypeName) {
	this.TypeName = TypeName;
    }

    /**
     * @return the DataSourceName
     */
    public String getDataSourceName() {
        return DataSourceName;
    }

    /**
     * @param DataSourceName the DataSourceName to set
     */
    public void setDataSourceName(String DataSourceName) {
	this.DataSourceName = DataSourceName;
    }

    /**
     * @return the RequestMappingTemplate
     */
    public String getRequestMappingTemplate() {
        return RequestMappingTemplate;
    }

    /**
     * @param RequestMappingTemplate the RequestMappingTemplate to set
     */
    public void setRequestMappingTemplate(String RequestMappingTemplate) {
	this.RequestMappingTemplate = RequestMappingTemplate;
    }

    /**
     * @return the ResponseMappingTemplate
     */
    public String getResponseMappingTemplate() {
        return ResponseMappingTemplate;
    }

    /**
     * @param ResponseMappingTemplate the ResponseMappingTemplate to set
     */
    public void setResponseMappingTemplate(String ResponseMappingTemplate) {
	this.ResponseMappingTemplate = ResponseMappingTemplate;
    }

    /**
     * @return the RequestMappingTemplateS3Location
     */
    public String getRequestMappingTemplateS3Location() {
        return RequestMappingTemplateS3Location;
    }

    /**
     * @param RequestMappingTemplateS3Location the RequestMappingTemplateS3Location to set
     */
    public void setRequestMappingTemplateS3Location(String RequestMappingTemplateS3Location) {
	this.RequestMappingTemplateS3Location = RequestMappingTemplateS3Location;
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
     * @return the FieldName
     */
    public String getFieldName() {
        return FieldName;
    }

    /**
     * @param FieldName the FieldName to set
     */
    public void setFieldName(String FieldName) {
	this.FieldName = FieldName;
    }


}