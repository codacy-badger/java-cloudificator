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
public class AwsResourceConfigAggregationauthorization {

    /**
     * The 12 digit account ID of the account authorized to aggregate data. 
     */
    private String AuthorizedAccountId;

    /**
     * The region authorized to collect aggregated data. 
     */
    private String AuthorizedAwsRegion;

    /**
     * @return the AuthorizedAccountId
     */
    public String getAuthorizedAccountId() {
        return AuthorizedAccountId;
    }

    /**
     * @param AuthorizedAccountId the AuthorizedAccountId to set
     */
    public void setAuthorizedAccountId(String AuthorizedAccountId) {
	this.AuthorizedAccountId = AuthorizedAccountId;
    }

    /**
     * @return the AuthorizedAwsRegion
     */
    public String getAuthorizedAwsRegion() {
        return AuthorizedAwsRegion;
    }

    /**
     * @param AuthorizedAwsRegion the AuthorizedAwsRegion to set
     */
    public void setAuthorizedAwsRegion(String AuthorizedAwsRegion) {
	this.AuthorizedAwsRegion = AuthorizedAwsRegion;
    }


}