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
public class AwsResourceApigatewayDocumentationpart {

    /**
     * The identifier of the targeted API entity. 
     */
    private String RestApiId;

    /**
     * The documentation content map of the targeted API entity. 
     */
    private String Properties;

    /**
     * The location of the API entity that the documentation applies to. 
     */
    private String Location;

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
     * @return the Properties
     */
    public String getProperties() {
        return Properties;
    }

    /**
     * @param Properties the Properties to set
     */
    public void setProperties(String Properties) {
	this.Properties = Properties;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
	this.Location = Location;
    }


}