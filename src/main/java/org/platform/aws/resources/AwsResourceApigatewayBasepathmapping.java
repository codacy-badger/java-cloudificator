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
public class AwsResourceApigatewayBasepathmapping {

    /**
     * The domain name of a DomainName resource. 
     */
    private String DomainName;

    /**
     * The name of the API. 
     */
    private String RestApiId;

    /**
     * The name of the API's stage. 
     */
    private String Stage;

    /**
     * The base path name that callers of the API must provide in the URL after the domain name. If you specify this property, it can't be an empty string. 
     */
    private String BasePath;

    /**
     * @return the DomainName
     */
    public String getDomainName() {
        return DomainName;
    }

    /**
     * @param DomainName the DomainName to set
     */
    public void setDomainName(String DomainName) {
	this.DomainName = DomainName;
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
     * @return the Stage
     */
    public String getStage() {
        return Stage;
    }

    /**
     * @param Stage the Stage to set
     */
    public void setStage(String Stage) {
	this.Stage = Stage;
    }

    /**
     * @return the BasePath
     */
    public String getBasePath() {
        return BasePath;
    }

    /**
     * @param BasePath the BasePath to set
     */
    public void setBasePath(String BasePath) {
	this.BasePath = BasePath;
    }


}