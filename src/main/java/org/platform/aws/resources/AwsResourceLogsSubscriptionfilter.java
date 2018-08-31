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
public class AwsResourceLogsSubscriptionfilter {

    /**
     * The filtering expressions that restrict what gets delivered to the destination AWS resource. For more information about the filter pattern syntax, see Filter and Pattern Syntax in the Amazon CloudWatch User Guide. 
     */
    private String FilterPattern;

    /**
     * The log group to associate with the subscription filter. All log events that are uploaded to this log group are filtered and delivered to the specified AWS resource if the filter pattern matches the log events. 
     */
    private String LogGroupName;

    /**
     * The Amazon Resource Name (ARN) of the Kinesis stream, Kinesis Data Firehose delivery stream, or Lambda function that you want to use as the subscription feed destination. 
     */
    private String DestinationArn;

    /**
     * An IAM role that grants CloudWatch Logs permission to put data into the specified Kinesis stream. For Lambda and CloudWatch Logs destinations, don't specify this property because CloudWatch Logs gets the necessary permissions from the destination resource. 
     */
    private String RoleArn;

    /**
     * @return the FilterPattern
     */
    public String getFilterPattern() {
        return FilterPattern;
    }

    /**
     * @param FilterPattern the FilterPattern to set
     */
    public void setFilterPattern(String FilterPattern) {
	this.FilterPattern = FilterPattern;
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

    /**
     * @return the DestinationArn
     */
    public String getDestinationArn() {
        return DestinationArn;
    }

    /**
     * @param DestinationArn the DestinationArn to set
     */
    public void setDestinationArn(String DestinationArn) {
	this.DestinationArn = DestinationArn;
    }

    /**
     * @return the RoleArn
     */
    public String getRoleArn() {
        return RoleArn;
    }

    /**
     * @param RoleArn the RoleArn to set
     */
    public void setRoleArn(String RoleArn) {
	this.RoleArn = RoleArn;
    }


}