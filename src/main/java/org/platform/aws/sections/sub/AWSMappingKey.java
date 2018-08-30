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
package org.platform.aws.sections.sub;

/**
 * @author inakirodriguez
 *
 */
public class AWSMappingKey {

    private String keyPairId;
    private String keyPairValue;

    /**
     * @param keyPairId
     * @param keyPairValue
     */
    public AWSMappingKey(String keyPairId, String keyPairValue) {
	this.keyPairId = keyPairId;
	this.keyPairValue = keyPairValue;
    }

    /**
     * @return the keyPairId
     */
    public String getKeyPairId() {
	return keyPairId;
    }

    /**
     * @param keyPairId the keyPairId to set
     */
    public void setKeyPairId(String keyPairId) {
	this.keyPairId = keyPairId;
    }

    /**
     * @return the keyPairValue
     */
    public String getKeyPairValue() {
	return keyPairValue;
    }

    /**
     * @param keyPairValue the keyPairValue to set
     */
    public void setKeyPairValue(String keyPairValue) {
	this.keyPairValue = keyPairValue;
    }

}
