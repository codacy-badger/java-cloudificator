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
public class AwsResourceLogsDestination {

    /**
     * An AWS Identity and Access Management (IAM) policy that specifies who can write to your destination. 
     */
    private String DestinationPolicy;

    /**
     * The name of the CloudWatch Logs destination. 
     */
    private String DestinationName;

    /**
     * The ARN of the AWS resource that receives log events. Currently, you can specify only an Kinesis stream. 
     */
    private String TargetArn;

    /**
     * The Amazon Resource Name (ARN) of an IAM role that permits CloudWatch Logs to send data to the specified AWS resource (TargetArn). 
     */
    private String RoleArn;

    /**
     * @return the DestinationPolicy
     */
    public String getDestinationPolicy() {
        return DestinationPolicy;
    }

    /**
     * @param DestinationPolicy the DestinationPolicy to set
     */
    public void setDestinationPolicy(String DestinationPolicy) {
	this.DestinationPolicy = DestinationPolicy;
    }

    /**
     * @return the DestinationName
     */
    public String getDestinationName() {
        return DestinationName;
    }

    /**
     * @param DestinationName the DestinationName to set
     */
    public void setDestinationName(String DestinationName) {
	this.DestinationName = DestinationName;
    }

    /**
     * @return the TargetArn
     */
    public String getTargetArn() {
        return TargetArn;
    }

    /**
     * @param TargetArn the TargetArn to set
     */
    public void setTargetArn(String TargetArn) {
	this.TargetArn = TargetArn;
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