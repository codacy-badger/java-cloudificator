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
public class AwsPropertiesSnsPolicy {

    /**
     * The Amazon Resource Names (ARN) of the topics to which you want to add the policy. You can use the Ref function to specify an AWS::SNS::Topic resource. 
     */
    private String Topics;

    /**
     * A policy document that contains permissions to add to the specified SNS topics. 
     */
    private String PolicyDocument;

    /**
     * @return the Topics
     */
    public String getTopics() {
        return Topics;
    }

    /**
     * @param Topics the Topics to set
     */
    public void setTopics(String Topics) {
	this.Topics = Topics;
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