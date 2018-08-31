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
public class AwsResourceSagemakerEndpointconfig {

    /**
     * A list of the production variants that specify the models you want to host at this endpoint. 
     */
    private String ProductionVariants;

    /**
     * If you provide a AWS KMS key ID, Amazon SageMaker uses it to encrypt data at rest on the ML storage volume that is attached to your notebook instance. 
     */
    private String KmsKeyId;

    /**
     * The name of the endpoint configuration. 
     */
    private String EndpointConfigName;

    /**
     * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
     */
    private String Tags;

    /**
     * @return the ProductionVariants
     */
    public String getProductionVariants() {
        return ProductionVariants;
    }

    /**
     * @param ProductionVariants the ProductionVariants to set
     */
    public void setProductionVariants(String ProductionVariants) {
	this.ProductionVariants = ProductionVariants;
    }

    /**
     * @return the KmsKeyId
     */
    public String getKmsKeyId() {
        return KmsKeyId;
    }

    /**
     * @param KmsKeyId the KmsKeyId to set
     */
    public void setKmsKeyId(String KmsKeyId) {
	this.KmsKeyId = KmsKeyId;
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