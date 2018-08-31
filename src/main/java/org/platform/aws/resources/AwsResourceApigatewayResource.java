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
public class AwsResourceApigatewayResource {

    /**
     * If you want to create a child resource, the ID of the parent resource. For resources without a parent, specify the RestApi root resource ID, such as { "Fn::GetAtt": ["MyRestApi", "RootResourceId"] }. 
     */
    private String ParentId;

    /**
     * A path name for the resource. 
     */
    private String PathPart;

    /**
     * The ID of the RestApi resource in which you want to create this resource. 
     */
    private String RestApiId;

    /**
     * @return the ParentId
     */
    public String getParentId() {
        return ParentId;
    }

    /**
     * @param ParentId the ParentId to set
     */
    public void setParentId(String ParentId) {
	this.ParentId = ParentId;
    }

    /**
     * @return the PathPart
     */
    public String getPathPart() {
        return PathPart;
    }

    /**
     * @param PathPart the PathPart to set
     */
    public void setPathPart(String PathPart) {
	this.PathPart = PathPart;
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