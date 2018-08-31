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
public class AwsResourceApigatewayApikey {

    /**
     * A description of the purpose of the API key. 
     */
    private String Description;

    /**
     * A list of stages to associate with this API key. 
     */
    private String StageKeys;

    /**
     * Indicates whether the API key can be used by clients. 
     */
    private String Enabled;

    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace. 
     */
    private String CustomerId;

    /**
     * Specifies whether the key identifier is distinct from the created API key value. 
     */
    private String GenerateDistinctId;

    /**
     * A name for the API key. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name. For more information, see Name Type. 
     */
    private String Name;

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the StageKeys
     */
    public String getStageKeys() {
        return StageKeys;
    }

    /**
     * @param StageKeys the StageKeys to set
     */
    public void setStageKeys(String StageKeys) {
	this.StageKeys = StageKeys;
    }

    /**
     * @return the Enabled
     */
    public String getEnabled() {
        return Enabled;
    }

    /**
     * @param Enabled the Enabled to set
     */
    public void setEnabled(String Enabled) {
	this.Enabled = Enabled;
    }

    /**
     * @return the CustomerId
     */
    public String getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(String CustomerId) {
	this.CustomerId = CustomerId;
    }

    /**
     * @return the GenerateDistinctId
     */
    public String getGenerateDistinctId() {
        return GenerateDistinctId;
    }

    /**
     * @param GenerateDistinctId the GenerateDistinctId to set
     */
    public void setGenerateDistinctId(String GenerateDistinctId) {
	this.GenerateDistinctId = GenerateDistinctId;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}