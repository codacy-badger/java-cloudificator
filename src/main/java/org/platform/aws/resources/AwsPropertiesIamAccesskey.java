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
public class AwsPropertiesIamAccesskey {

    /**
     * The status of the access key. By default, AWS CloudFormation sets this property value to Active. 
     */
    private String Status;

    /**
     * This value is specific to AWS CloudFormation and can only be incremented. Incrementing this value notifies AWS CloudFormation that you want to rotate your access key. When you update your stack, AWS CloudFormation will replace the existing access key with a new key. 
     */
    private String Serial;

    /**
     * The name of the user that the new key will belong to. 
     */
    private String UserName;

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
	this.Status = Status;
    }

    /**
     * @return the Serial
     */
    public String getSerial() {
        return Serial;
    }

    /**
     * @param Serial the Serial to set
     */
    public void setSerial(String Serial) {
	this.Serial = Serial;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
	this.UserName = UserName;
    }


}