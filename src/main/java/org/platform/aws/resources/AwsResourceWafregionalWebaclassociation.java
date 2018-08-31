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
public class AwsResourceWafregionalWebaclassociation {

    /**
     * The Amazon Resource Name (ARN) of the resource to protect with the web ACL. 
     */
    private String ResourceArn;

    /**
     * A unique identifier (ID) for the web ACL. 
     */
    private String WebACLId;

    /**
     * @return the ResourceArn
     */
    public String getResourceArn() {
        return ResourceArn;
    }

    /**
     * @param ResourceArn the ResourceArn to set
     */
    public void setResourceArn(String ResourceArn) {
	this.ResourceArn = ResourceArn;
    }

    /**
     * @return the WebACLId
     */
    public String getWebACLId() {
        return WebACLId;
    }

    /**
     * @param WebACLId the WebACLId to set
     */
    public void setWebACLId(String WebACLId) {
	this.WebACLId = WebACLId;
    }


}