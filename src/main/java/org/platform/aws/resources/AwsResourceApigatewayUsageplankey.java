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
public class AwsResourceApigatewayUsageplankey {

    /**
     * The type of usage plan key. Currently, the valid key type is API_KEY. 
     */
    private String KeyType;

    /**
     * The value of the usage plan key. 
     */
    private String UsagePlanId;

    /**
     * The ID of the usage plan key. 
     */
    private String KeyId;

    /**
     * @return the KeyType
     */
    public String getKeyType() {
        return KeyType;
    }

    /**
     * @param KeyType the KeyType to set
     */
    public void setKeyType(String KeyType) {
	this.KeyType = KeyType;
    }

    /**
     * @return the UsagePlanId
     */
    public String getUsagePlanId() {
        return UsagePlanId;
    }

    /**
     * @param UsagePlanId the UsagePlanId to set
     */
    public void setUsagePlanId(String UsagePlanId) {
	this.UsagePlanId = UsagePlanId;
    }

    /**
     * @return the KeyId
     */
    public String getKeyId() {
        return KeyId;
    }

    /**
     * @param KeyId the KeyId to set
     */
    public void setKeyId(String KeyId) {
	this.KeyId = KeyId;
    }


}