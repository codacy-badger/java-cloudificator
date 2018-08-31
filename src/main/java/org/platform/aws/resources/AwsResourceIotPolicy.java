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
public class AwsResourceIotPolicy {

    /**
     * The name (the physical ID) of the AWS IoT policy. 
     */
    private String PolicyName;

    /**
     * The JSON document that describes the policy. 
     */
    private String PolicyDocument;

    /**
     * @return the PolicyName
     */
    public String getPolicyName() {
        return PolicyName;
    }

    /**
     * @param PolicyName the PolicyName to set
     */
    public void setPolicyName(String PolicyName) {
	this.PolicyName = PolicyName;
    }

    /**
     * @return the PolicyDocument
     */
    public String getPolicyDocument() {
        return PolicyDocument;
    }

    /**
     * @param PolicyDocument the PolicyDocument to set
     */
    public void setPolicyDocument(String PolicyDocument) {
	this.PolicyDocument = PolicyDocument;
    }


}