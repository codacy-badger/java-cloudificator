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
public class AwsPropertiesBeanstalkEnvironment {

    /**
     * The Amazon Resource Name (ARN) of the custom platform to use with the environment. For more information, see Custom Platforms in the AWS Elastic Beanstalk Developer Guide. 
     */
    private String PlatformArn;

    /**
     * The name of the application that is associated with this environment. 
     */
    private String ApplicationName;

    /**
     * A description that helps you identify this environment. 
     */
    private String Description;

    /**
     * A name for the Elastic Beanstalk environment. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the environment name. For more information, see Name Type. 
     */
    private String EnvironmentName;

    /**
     * Key-value pairs defining configuration options for this environment, such as the instance type. These options override the values that are defined in the solution stack or the configuration template. If you remove any options during a stack update, the removed options revert to default values. 
     */
    private String OptionSettings;

    /**
     * Specifies the tier to use in creating this environment. The environment tier that you choose determines whether Elastic Beanstalk provisions resources to support a web application that handles HTTP(S) requests or a web application that handles background-processing tasks. 
     */
    private String Tier;

    /**
     * The version to associate with the environment. 
     */
    private String VersionLabel;

    /**
     * The name of the Elastic Beanstalk configuration template to use with the environment. 
     */
    private String TemplateName;

    /**
     * The name of an Elastic Beanstalk solution stack that this configuration will use. For more information, see Supported Platforms in the AWS Elastic Beanstalk Developer Guide. 
     */
    private String SolutionStackName;

    /**
     * A prefix for your Elastic Beanstalk environment URL. 
     */
    private String CNAMEPrefix;

    /**
     * An arbitrary set of tags (key–value pairs) for this environment. 
     */
    private String Tags;

    /**
     * @return the PlatformArn
     */
    public String getPlatformArn() {
        return PlatformArn;
    }

    /**
     * @param PlatformArn the PlatformArn to set
     */
    public void setPlatformArn(String PlatformArn) {
	this.PlatformArn = PlatformArn;
    }

    /**
     * @return the ApplicationName
     */
    public String getApplicationName() {
        return ApplicationName;
    }

    /**
     * @param ApplicationName the ApplicationName to set
     */
    public void setApplicationName(String ApplicationName) {
	this.ApplicationName = ApplicationName;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the EnvironmentName
     */
    public String getEnvironmentName() {
        return EnvironmentName;
    }

    /**
     * @param EnvironmentName the EnvironmentName to set
     */
    public void setEnvironmentName(String EnvironmentName) {
	this.EnvironmentName = EnvironmentName;
    }

    /**
     * @return the OptionSettings
     */
    public String getOptionSettings() {
        return OptionSettings;
    }

    /**
     * @param OptionSettings the OptionSettings to set
     */
    public void setOptionSettings(String OptionSettings) {
	this.OptionSettings = OptionSettings;
    }

    /**
     * @return the Tier
     */
    public String getTier() {
        return Tier;
    }

    /**
     * @param Tier the Tier to set
     */
    public void setTier(String Tier) {
	this.Tier = Tier;
    }

    /**
     * @return the VersionLabel
     */
    public String getVersionLabel() {
        return VersionLabel;
    }

    /**
     * @param VersionLabel the VersionLabel to set
     */
    public void setVersionLabel(String VersionLabel) {
	this.VersionLabel = VersionLabel;
    }

    /**
     * @return the TemplateName
     */
    public String getTemplateName() {
        return TemplateName;
    }

    /**
     * @param TemplateName the TemplateName to set
     */
    public void setTemplateName(String TemplateName) {
	this.TemplateName = TemplateName;
    }

    /**
     * @return the SolutionStackName
     */
    public String getSolutionStackName() {
        return SolutionStackName;
    }

    /**
     * @param SolutionStackName the SolutionStackName to set
     */
    public void setSolutionStackName(String SolutionStackName) {
	this.SolutionStackName = SolutionStackName;
    }

    /**
     * @return the CNAMEPrefix
     */
    public String getCNAMEPrefix() {
        return CNAMEPrefix;
    }

    /**
     * @param CNAMEPrefix the CNAMEPrefix to set
     */
    public void setCNAMEPrefix(String CNAMEPrefix) {
	this.CNAMEPrefix = CNAMEPrefix;
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


}