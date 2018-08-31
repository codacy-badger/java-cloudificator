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
public class AwsResourceSnsSubscription {

    /**
     * true if raw message delivery is enabled for the subscription. Raw messages are free of JSON formatting and can be sent to HTTP/S and Amazon SQS endpoints. For more information, see GetSubscriptionAttributes in the Amazon Simple Notification Service API Reference. 
     */
    private String RawMessageDelivery;

    /**
     * The endpoint that receives notifications from the Amazon SNS topic. The endpoint value depends on the protocol that you specify. For more information, see the Subscribe Endpoint parameter in the Amazon Simple Notification Service API Reference. 
     */
    private String Endpoint;

    /**
     * The filter policy JSON that is assigned to the subscription. For more information, see GetSubscriptionAttributes in the Amazon Simple Notification Service API Reference. 
     */
    private String FilterPolicy;

    /**
     * The Amazon Resource Name (ARN) of the topic to subscribe to. 
     */
    private String TopicArn;

    /**
     * The JSON serialization of the subscription's delivery policy. For more information, see GetSubscriptionAttributes in the Amazon Simple Notification Service API Reference. 
     */
    private String DeliveryPolicy;

    /**
     * The region in which the topic resides. 
     */
    private String Region;

    /**
     * The subscription's protocol. For more information, see the Subscribe Protocol parameter in the Amazon Simple Notification Service API Reference. 
     */
    private String Protocol;

    /**
     * @return the RawMessageDelivery
     */
    public String getRawMessageDelivery() {
        return RawMessageDelivery;
    }

    /**
     * @param RawMessageDelivery the RawMessageDelivery to set
     */
    public void setRawMessageDelivery(String RawMessageDelivery) {
	this.RawMessageDelivery = RawMessageDelivery;
    }

    /**
     * @return the Endpoint
     */
    public String getEndpoint() {
        return Endpoint;
    }

    /**
     * @param Endpoint the Endpoint to set
     */
    public void setEndpoint(String Endpoint) {
	this.Endpoint = Endpoint;
    }

    /**
     * @return the FilterPolicy
     */
    public String getFilterPolicy() {
        return FilterPolicy;
    }

    /**
     * @param FilterPolicy the FilterPolicy to set
     */
    public void setFilterPolicy(String FilterPolicy) {
	this.FilterPolicy = FilterPolicy;
    }

    /**
     * @return the TopicArn
     */
    public String getTopicArn() {
        return TopicArn;
    }

    /**
     * @param TopicArn the TopicArn to set
     */
    public void setTopicArn(String TopicArn) {
	this.TopicArn = TopicArn;
    }

    /**
     * @return the DeliveryPolicy
     */
    public String getDeliveryPolicy() {
        return DeliveryPolicy;
    }

    /**
     * @param DeliveryPolicy the DeliveryPolicy to set
     */
    public void setDeliveryPolicy(String DeliveryPolicy) {
	this.DeliveryPolicy = DeliveryPolicy;
    }

    /**
     * @return the Region
     */
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region the Region to set
     */
    public void setRegion(String Region) {
	this.Region = Region;
    }

    /**
     * @return the Protocol
     */
    public String getProtocol() {
        return Protocol;
    }

    /**
     * @param Protocol the Protocol to set
     */
    public void setProtocol(String Protocol) {
	this.Protocol = Protocol;
    }


}