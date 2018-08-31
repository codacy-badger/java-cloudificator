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
public class AwsPropertiesSnsTopic {

    /**
     * A developer-defined string that can be used to identify this SNS topic. 
     */
    private String DisplayName;

    /**
     * The SNS subscriptions (endpoints) for this topic. 
     */
    private String Subscription;

    /**
     * A name for the topic. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the topic name. For more information, see Name Type. 
     */
    private String TopicName;

    /**
     * @return the DisplayName
     */
    public String getDisplayName() {
        return DisplayName;
    }

    /**
     * @param DisplayName the DisplayName to set
     */
    public void setDisplayName(String DisplayName) {
	this.DisplayName = DisplayName;
    }

    /**
     * @return the Subscription
     */
    public String getSubscription() {
        return Subscription;
    }

    /**
     * @param Subscription the Subscription to set
     */
    public void setSubscription(String Subscription) {
	this.Subscription = Subscription;
    }

    /**
     * @return the TopicName
     */
    public String getTopicName() {
        return TopicName;
    }

    /**
     * @param TopicName the TopicName to set
     */
    public void setTopicName(String TopicName) {
	this.TopicName = TopicName;
    }


}