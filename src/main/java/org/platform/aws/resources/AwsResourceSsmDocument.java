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
public class AwsResourceSsmDocument {

    /**
     * A JSON object that describes an instance configuration. For more information, see Creating Systems Manager Documents in the AWS Systems Manager User Guide. 
     */
    private String Content;

    /**
     * The type of document to create that relates to the purpose of your document, such as running commands, bootstrapping software, or automating tasks. For valid values, see the CreateDocument action in the AWS Systems Manager API Reference. 
     */
    private String DocumentType;

    /**
     * AWS CloudFormation resource tags to apply to the document, which can help you identify and categorize these resources. 
     */
    private String Tags;

    /**
     * @return the Content
     */
    public String getContent() {
        return Content;
    }

    /**
     * @param Content the Content to set
     */
    public void setContent(String Content) {
	this.Content = Content;
    }

    /**
     * @return the DocumentType
     */
    public String getDocumentType() {
        return DocumentType;
    }

    /**
     * @param DocumentType the DocumentType to set
     */
    public void setDocumentType(String DocumentType) {
	this.DocumentType = DocumentType;
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