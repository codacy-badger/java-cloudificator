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
public class AwsResourceIamServicelinkedrole {

    /**
     * A string that you provide, which is combined with the service-provided prefix to form the complete role name. If you make multiple requests for the same service, then you must supply a different CustomSuffix for each request. Otherwise the request fails with a duplicate role name error. For example, you could add -1 or -debug to the suffix. 
     */
    private String CustomSuffix;

    /**
     * The description of the role. 
     */
    private String Description;

    /**
     * The service principal for the AWS service to which this role is attached. You use a string similar to a URL but without the http:// in front. For example: elasticbeanstalk.amazonaws.com. 
     */
    private String AWSServiceName;

    /**
     * @return the CustomSuffix
     */
    public String getCustomSuffix() {
        return CustomSuffix;
    }

    /**
     * @param CustomSuffix the CustomSuffix to set
     */
    public void setCustomSuffix(String CustomSuffix) {
	this.CustomSuffix = CustomSuffix;
    }

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
     * @return the AWSServiceName
     */
    public String getAWSServiceName() {
        return AWSServiceName;
    }

    /**
     * @param AWSServiceName the AWSServiceName to set
     */
    public void setAWSServiceName(String AWSServiceName) {
	this.AWSServiceName = AWSServiceName;
    }


}