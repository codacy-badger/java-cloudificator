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
public class AwsResourceApigatewayAccount {

    /**
     * The Amazon Resource Name (ARN) of an IAM role that has write access to CloudWatch Logs in your account. 
     */
    private String CloudWatchRoleArn;

    /**
     * @return the CloudWatchRoleArn
     */
    public String getCloudWatchRoleArn() {
        return CloudWatchRoleArn;
    }

    /**
     * @param CloudWatchRoleArn the CloudWatchRoleArn to set
     */
    public void setCloudWatchRoleArn(String CloudWatchRoleArn) {
	this.CloudWatchRoleArn = CloudWatchRoleArn;
    }


}