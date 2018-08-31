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
public class AwsResourceLogsLoggroup {

    /**
     * The number of days log events are kept in CloudWatch Logs. When a log event expires, CloudWatch Logs automatically deletes it. For valid values, see PutRetentionPolicy in the Amazon CloudWatch Logs API Reference. 
     */
    private String RetentionInDays;

    /**
     * A name for the log group. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the log group. For more information, see Name Type. 
     */
    private String LogGroupName;

    /**
     * @return the RetentionInDays
     */
    public String getRetentionInDays() {
        return RetentionInDays;
    }

    /**
     * @param RetentionInDays the RetentionInDays to set
     */
    public void setRetentionInDays(String RetentionInDays) {
	this.RetentionInDays = RetentionInDays;
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