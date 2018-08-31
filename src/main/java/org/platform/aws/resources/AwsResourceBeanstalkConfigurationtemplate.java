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
public class AwsResourceBeanstalkConfigurationtemplate {

    /**
     * An environment whose settings you want to use to create the configuration template. You must specify this property if you don't specify the SolutionStackName or SourceConfiguration properties. 
     */
    private String EnvironmentId;

    /**
     * The Amazon Resource Name (ARN) of the custom platform. For more information, see Custom Platforms in the AWS Elastic Beanstalk Developer Guide. 
     */
    private String PlatformArn;

    /**
     * Name of the Elastic Beanstalk application that is associated with this configuration template. 
     */
    private String ApplicationName;

    /**
     * An optional description for this configuration. 
     */
    private String Description;

    /**
     * The options for the Elastic Beanstalk configuration, such as the instance type. For a complete list of Elastic Beanstalk configuration options, see Option Values, in the AWS Elastic Beanstalk Developer Guide. 
     */
    private String OptionSettings;

    /**
     * A configuration template that is associated with another Elastic Beanstalk application. If you specify the SolutionStackName property and the SourceConfiguration property, the solution stack in the source configuration template must match the value that you specified for the SolutionStackName property. 
     */
    private String SourceConfiguration;

    /**
     * The name of an Elastic Beanstalk solution stack that this configuration will use. A solution stack specifies the operating system, architecture, and application server for a configuration template, such as 64bit Amazon Linux 2013.09 running Tomcat 7 Java 7. For more information, see Supported Platforms in the AWS Elastic Beanstalk Developer Guide. 
     */
    private String SolutionStackName;

    /**
     * @return the EnvironmentId
     */
    public String getEnvironmentId() {
        return EnvironmentId;
    }

    /**
     * @param EnvironmentId the EnvironmentId to set
     */
    public void setEnvironmentId(String EnvironmentId) {
	this.EnvironmentId = EnvironmentId;
    }

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
     * @return the SourceConfiguration
     */
    public String getSourceConfiguration() {
        return SourceConfiguration;
    }

    /**
     * @param SourceConfiguration the SourceConfiguration to set
     */
    public void setSourceConfiguration(String SourceConfiguration) {
	this.SourceConfiguration = SourceConfiguration;
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


}