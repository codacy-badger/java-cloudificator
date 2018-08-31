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
public class AwsPropertiesSqsPolicy {

    /**
     * A policy document that contains the permissions for the specified Amazon SQS queues. For more information about Amazon SQS policies, see Creating Custom Policies Using the Access Policy Language in the Amazon Simple Queue Service Developer Guide. 
     */
    private String PolicyDocument;

    /**
     * The URLs of the queues to which you want to add the policy. You can use the Ref function to specify an AWS::SQS::Queue resource. 
     */
    private String Queues;

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

    /**
     * @return the Queues
     */
    public String getQueues() {
        return Queues;
    }

    /**
     * @param Queues the Queues to set
     */
    public void setQueues(String Queues) {
	this.Queues = Queues;
    }


}