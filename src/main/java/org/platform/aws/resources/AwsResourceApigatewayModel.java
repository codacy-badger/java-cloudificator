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
public class AwsResourceApigatewayModel {

    /**
     * A description that identifies this model. 
     */
    private String Description;

    /**
     * The content type for the model. 
     */
    private String ContentType;

    /**
     * The schema to use to transform data to one or more output formats. Specify null ({}) if you don't want to specify a schema. 
     */
    private String Schema;

    /**
     * The ID of a REST API with which to associate this model. 
     */
    private String RestApiId;

    /**
     * A name for the model. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name. For more information, see Name Type. 
     */
    private String Name;

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
     * @return the ContentType
     */
    public String getContentType() {
        return ContentType;
    }

    /**
     * @param ContentType the ContentType to set
     */
    public void setContentType(String ContentType) {
	this.ContentType = ContentType;
    }

    /**
     * @return the Schema
     */
    public String getSchema() {
        return Schema;
    }

    /**
     * @param Schema the Schema to set
     */
    public void setSchema(String Schema) {
	this.Schema = Schema;
    }

    /**
     * @return the RestApiId
     */
    public String getRestApiId() {
        return RestApiId;
    }

    /**
     * @param RestApiId the RestApiId to set
     */
    public void setRestApiId(String RestApiId) {
	this.RestApiId = RestApiId;
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