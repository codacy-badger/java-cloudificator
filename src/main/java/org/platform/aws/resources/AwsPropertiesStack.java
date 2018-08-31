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
public class AwsPropertiesStack {

    /**
     * The URL of a template that specifies the stack that you want to create as a resource. Template files can use any extension, such as .json, .yaml, .template, or .txt. The template must be stored on an Amazon S3 bucket, so the URL must have the form: https://s3.amazonaws.com/.../TemplateName.extension 
     */
    private String TemplateURL;

    /**
     * The set of parameters passed to AWS CloudFormation when this nested stack is created. 
     */
    private String Parameters;

    /**
     * A list of existing Amazon SNS topics where notifications about stack events are sent. 
     */
    private String NotificationARNs;

    /**
     * An arbitrary set of tags (key–value pairs) to describe this stack. 
     */
    private String Tags;

    /**
     * The length of time, in minutes, that AWS CloudFormation waits for the nested stack to reach the CREATE_COMPLETE state. The default is no timeout. When AWS CloudFormation detects that the nested stack has reached the CREATE_COMPLETE state, it marks the nested stack resource as CREATE_COMPLETE in the parent stack and resumes creating the parent stack. If the timeout period expires before the nested stack reaches CREATE_COMPLETE, AWS CloudFormation marks the nested stack as failed and rolls back both the nested stack and parent stack. 
     */
    private String TimeoutInMinutes;

    /**
     * @return the TemplateURL
     */
    public String getTemplateURL() {
        return TemplateURL;
    }

    /**
     * @param TemplateURL the TemplateURL to set
     */
    public void setTemplateURL(String TemplateURL) {
	this.TemplateURL = TemplateURL;
    }

    /**
     * @return the Parameters
     */
    public String getParameters() {
        return Parameters;
    }

    /**
     * @param Parameters the Parameters to set
     */
    public void setParameters(String Parameters) {
	this.Parameters = Parameters;
    }

    /**
     * @return the NotificationARNs
     */
    public String getNotificationARNs() {
        return NotificationARNs;
    }

    /**
     * @param NotificationARNs the NotificationARNs to set
     */
    public void setNotificationARNs(String NotificationARNs) {
	this.NotificationARNs = NotificationARNs;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }

    /**
     * @return the TimeoutInMinutes
     */
    public String getTimeoutInMinutes() {
        return TimeoutInMinutes;
    }

    /**
     * @param TimeoutInMinutes the TimeoutInMinutes to set
     */
    public void setTimeoutInMinutes(String TimeoutInMinutes) {
	this.TimeoutInMinutes = TimeoutInMinutes;
    }


}