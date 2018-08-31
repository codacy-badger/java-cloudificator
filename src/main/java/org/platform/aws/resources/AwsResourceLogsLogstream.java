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
public class AwsResourceLogsLogstream {

    /**
     * The name of the log stream to create. The name must be unique within the log group. 
     */
    private String LogStreamName;

    /**
     * The name of the log group where the log stream is created. 
     */
    private String LogGroupName;

    /**
     * @return the LogStreamName
     */
    public String getLogStreamName() {
        return LogStreamName;
    }

    /**
     * @param LogStreamName the LogStreamName to set
     */
    public void setLogStreamName(String LogStreamName) {
	this.LogStreamName = LogStreamName;
    }

    /**
     * @return the LogGroupName
     */
    public String getLogGroupName() {
        return LogGroupName;
    }

    /**
     * @param LogGroupName the LogGroupName to set
     */
    public void setLogGroupName(String LogGroupName) {
	this.LogGroupName = LogGroupName;
    }


}