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
public class AwsResourceIotThingprincipalattachment {

    /**
     * The name of the AWS IoT thing. 
     */
    private String ThingName;

    /**
     * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID. 
     */
    private String Principal;

    /**
     * @return the ThingName
     */
    public String getThingName() {
        return ThingName;
    }

    /**
     * @param ThingName the ThingName to set
     */
    public void setThingName(String ThingName) {
	this.ThingName = ThingName;
    }

    /**
     * @return the Principal
     */
    public String getPrincipal() {
        return Principal;
    }

    /**
     * @param Principal the Principal to set
     */
    public void setPrincipal(String Principal) {
	this.Principal = Principal;
    }


}