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
public class AwsResourceIotTopicrule {

    /**
     * The actions associated with the AWS IoT rule. 
     */
    private String TopicRulePayload;

    /**
     * The name (the physical ID) of the AWS IoT rule. 
     */
    private String RuleName;

    /**
     * @return the TopicRulePayload
     */
    public String getTopicRulePayload() {
        return TopicRulePayload;
    }

    /**
     * @param TopicRulePayload the TopicRulePayload to set
     */
    public void setTopicRulePayload(String TopicRulePayload) {
	this.TopicRulePayload = TopicRulePayload;
    }

    /**
     * @return the RuleName
     */
    public String getRuleName() {
        return RuleName;
    }

    /**
     * @param RuleName the RuleName to set
     */
    public void setRuleName(String RuleName) {
	this.RuleName = RuleName;
    }


}