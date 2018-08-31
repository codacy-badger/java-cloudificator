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
public class AwsResourceKmsAlias {

    /**
     * The ID of the key for which you are creating the alias. Specify the key's globally unique identifier or Amazon Resource Name (ARN). You can't specify another alias. 
     */
    private String TargetKeyId;

    /**
     * The name of the alias. The name must start with alias followed by a forward slash, such as alias/. You can't specify aliases that begin with alias/AWS. These aliases are reserved. 
     */
    private String AliasName;

    /**
     * @return the TargetKeyId
     */
    public String getTargetKeyId() {
        return TargetKeyId;
    }

    /**
     * @param TargetKeyId the TargetKeyId to set
     */
    public void setTargetKeyId(String TargetKeyId) {
	this.TargetKeyId = TargetKeyId;
    }

    /**
     * @return the AliasName
     */
    public String getAliasName() {
        return AliasName;
    }

    /**
     * @param AliasName the AliasName to set
     */
    public void setAliasName(String AliasName) {
	this.AliasName = AliasName;
    }


}