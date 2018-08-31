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
public class AwsResourceApigatewayDocumentationversion {

    /**
     * The description of the API documentation snapshot. 
     */
    private String Description;

    /**
     * The version identifier of the API documentation snapshot. 
     */
    private String DocumentationVersion;

    /**
     * The identifier of the targeted API entity. 
     */
    private String RestApiId;

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
     * @return the DocumentationVersion
     */
    public String getDocumentationVersion() {
        return DocumentationVersion;
    }

    /**
     * @param DocumentationVersion the DocumentationVersion to set
     */
    public void setDocumentationVersion(String DocumentationVersion) {
	this.DocumentationVersion = DocumentationVersion;
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


}