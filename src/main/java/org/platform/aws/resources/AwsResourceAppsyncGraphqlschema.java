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
public class AwsResourceAppsyncGraphqlschema {

    /**
     * The text representation of a GraphQL schema in SDL format. 
     */
    private String Definition;

    /**
     * A location of a GraphQL schema file on an S3 bucket if you wish to provision with the schema living in S3 rather than embedded in your CloudFormation template. 
     */
    private String DefinitionS3Location;

    /**
     * The AWS AppSync GraphQL API identifier to which you will apply this schema. 
     */
    private String ApiId;

    /**
     * @return the Definition
     */
    public String getDefinition() {
        return Definition;
    }

    /**
     * @param Definition the Definition to set
     */
    public void setDefinition(String Definition) {
	this.Definition = Definition;
    }

    /**
     * @return the DefinitionS3Location
     */
    public String getDefinitionS3Location() {
        return DefinitionS3Location;
    }

    /**
     * @param DefinitionS3Location the DefinitionS3Location to set
     */
    public void setDefinitionS3Location(String DefinitionS3Location) {
	this.DefinitionS3Location = DefinitionS3Location;
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


}