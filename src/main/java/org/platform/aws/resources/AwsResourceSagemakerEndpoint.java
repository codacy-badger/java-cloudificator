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
public class AwsResourceSagemakerEndpoint {

    /**
     * The name of the endpoint. 
     */
    private String EndpointName;

    /**
     * The name of the AWS::SageMaker::EndpointConfig resource that specifies the configuration for the endpoint. 
     */
    private String EndpointConfigName;

    /**
     * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
     */
    private String Tags;

    /**
     * @return the EndpointName
     */
    public String getEndpointName() {
        return EndpointName;
    }

    /**
     * @param EndpointName the EndpointName to set
     */
    public void setEndpointName(String EndpointName) {
	this.EndpointName = EndpointName;
    }

    /**
     * @return the EndpointConfigName
     */
    public String getEndpointConfigName() {
        return EndpointConfigName;
    }

    /**
     * @param EndpointConfigName the EndpointConfigName to set
     */
    public void setEndpointConfigName(String EndpointConfigName) {
	this.EndpointConfigName = EndpointConfigName;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}