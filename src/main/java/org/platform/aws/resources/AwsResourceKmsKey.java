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
public class AwsResourceKmsKey {

    /**
     * A description of the key. Use a description that helps your users decide whether the key is appropriate for a particular task. 
     */
    private String Description;

    /**
     * An AWS KMS key policy to attach to the key. Use a policy to specify who has permission to use the key and which actions they can perform. For more information, see Key Policies in the AWS Key Management Service Developer Guide. 
     */
    private String KeyPolicy;

    /**
     * Indicates whether the key is available for use. AWS CloudFormation sets this value to true by default. 
     */
    private String Enabled;

    /**
     * Indicates whether AWS KMS rotates the key. AWS CloudFormation sets this value to false by default. 
     */
    private String EnableKeyRotation;

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this key. Use tags to manage your resources. 
     */
    private String Tags;

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
     * @return the KeyPolicy
     */
    public String getKeyPolicy() {
        return KeyPolicy;
    }

    /**
     * @param KeyPolicy the KeyPolicy to set
     */
    public void setKeyPolicy(String KeyPolicy) {
	this.KeyPolicy = KeyPolicy;
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
     * @return the EnableKeyRotation
     */
    public String getEnableKeyRotation() {
        return EnableKeyRotation;
    }

    /**
     * @param EnableKeyRotation the EnableKeyRotation to set
     */
    public void setEnableKeyRotation(String EnableKeyRotation) {
	this.EnableKeyRotation = EnableKeyRotation;
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