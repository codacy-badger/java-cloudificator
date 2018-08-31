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
public class AwsResourceAppsyncApikey {

    /**
     * Unique description of your API Key. 
     */
    private String Description;

    /**
     * Expiration time of the API Key in seconds (using Unix Epoch time), with a minimum of 1 day and a maximum of 365 days. 
     */
    private String Expires;

    /**
     * Unique AWS AppSync GraphQL API Identifier for this API Key. 
     */
    private String ApiId;

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
     * @return the Expires
     */
    public String getExpires() {
        return Expires;
    }

    /**
     * @param Expires the Expires to set
     */
    public void setExpires(String Expires) {
	this.Expires = Expires;
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