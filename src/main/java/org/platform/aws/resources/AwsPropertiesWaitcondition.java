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
public class AwsPropertiesWaitcondition {

    /**
     * The length of time (in seconds) to wait for the number of signals that the Count property specifies. Timeout is a minimum-bound property, meaning the timeout occurs no sooner than the time you specify, but can occur shortly thereafter. The maximum time that can be specified for this property is 12 hours (43200 seconds). 
     */
    private String Timeout;

    /**
     * The number of success signals that AWS CloudFormation must receive before it continues the stack creation process. When the wait condition receives the requisite number of success signals, AWS CloudFormation resumes the creation of the stack. If the wait condition does not receive the specified number of success signals before the Timeout period expires, AWS CloudFormation assumes that the wait condition has failed and rolls the stack back. 
     */
    private String Count;

    /**
     * A reference to the wait condition handle used to signal this wait condition. Use the Ref intrinsic function to specify an AWS::CloudFormation::WaitConditionHandle resource. 
     */
    private String Handle;

    /**
     * @return the Timeout
     */
    public String getTimeout() {
        return Timeout;
    }

    /**
     * @param Timeout the Timeout to set
     */
    public void setTimeout(String Timeout) {
	this.Timeout = Timeout;
    }

    /**
     * @return the Count
     */
    public String getCount() {
        return Count;
    }

    /**
     * @param Count the Count to set
     */
    public void setCount(String Count) {
	this.Count = Count;
    }

    /**
     * @return the Handle
     */
    public String getHandle() {
        return Handle;
    }

    /**
     * @param Handle the Handle to set
     */
    public void setHandle(String Handle) {
	this.Handle = Handle;
    }


}