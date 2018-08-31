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
public class AwsPropertiesS3Policy {

    /**
     * The name of the Amazon S3 bucket to which the policy applies. 
     */
    private String Bucket;

    /**
     * A policy document containing permissions to add to the specified bucket. For more information, see Access Policy Language Overview in the Amazon Simple Storage Service Developer Guide. 
     */
    private String PolicyDocument;

    /**
     * @return the Bucket
     */
    public String getBucket() {
        return Bucket;
    }

    /**
     * @param Bucket the Bucket to set
     */
    public void setBucket(String Bucket) {
	this.Bucket = Bucket;
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