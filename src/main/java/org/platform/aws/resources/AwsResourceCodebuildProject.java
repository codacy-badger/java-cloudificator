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
public class AwsResourceCodebuildProject {

    /**
     * A description of the project. Use the description to identify the purpose of the project. 
     */
    private String Description;

    /**
     * Settings that enable AWS CodeBuild to access resources in an Amazon VPC. For more information, see Use AWS CodeBuild with Amazon Virtual Private Cloud in the AWS CodeBuild User Guide. 
     */
    private String VpcConfig;

    /**
     * An array of source objects. Each source object contains source code settings for the project. 
     */
    private String SecondarySources;

    /**
     * The alias or Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) that AWS CodeBuild uses to encrypt the build output. If you don't specify a value, AWS CodeBuild uses the AWS-managed CMK for Amazon Simple Storage Service. 
     */
    private String EncryptionKey;

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source code every time a code change is pushed to the repository. 
     */
    private String Triggers;

    /**
     * An array of artifacts objects. Each artifacts object specifies output settings that the project generates during a build. 
     */
    private String SecondaryArtifacts;

    /**
     * The source code settings for the project, such as the source code's repository type and location. 
     */
    private String Source;

    /**
     * A name for the project. The name must be unique across all of the projects in your AWS account. 
     */
    private String Name;

    /**
     * The output settings for artifacts that the project generates during a build. 
     */
    private String Artifacts;

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build badge. For more information, see Build Badges Sample in the AWS CodeBuild User Guide. 
     */
    private String BadgeEnabled;

    /**
     * The ARN of the service role that AWS CodeBuild uses to interact with services on your behalf. 
     */
    private String ServiceRole;

    /**
     * The build environment settings for the project, such as the environment type or the environment variables to use for the build environment. 
     */
    private String Environment;

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project. 
     */
    private String Tags;

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies. 
     */
    private String Cache;

    /**
     * The number of minutes after which AWS CodeBuild stops the build if it's not complete. For valid values, see the timeoutInMinutes field in the AWS CodeBuild User Guide. 
     */
    private String TimeoutInMinutes;

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
     * @return the VpcConfig
     */
    public String getVpcConfig() {
        return VpcConfig;
    }

    /**
     * @param VpcConfig the VpcConfig to set
     */
    public void setVpcConfig(String VpcConfig) {
	this.VpcConfig = VpcConfig;
    }

    /**
     * @return the SecondarySources
     */
    public String getSecondarySources() {
        return SecondarySources;
    }

    /**
     * @param SecondarySources the SecondarySources to set
     */
    public void setSecondarySources(String SecondarySources) {
	this.SecondarySources = SecondarySources;
    }

    /**
     * @return the EncryptionKey
     */
    public String getEncryptionKey() {
        return EncryptionKey;
    }

    /**
     * @param EncryptionKey the EncryptionKey to set
     */
    public void setEncryptionKey(String EncryptionKey) {
	this.EncryptionKey = EncryptionKey;
    }

    /**
     * @return the Triggers
     */
    public String getTriggers() {
        return Triggers;
    }

    /**
     * @param Triggers the Triggers to set
     */
    public void setTriggers(String Triggers) {
	this.Triggers = Triggers;
    }

    /**
     * @return the SecondaryArtifacts
     */
    public String getSecondaryArtifacts() {
        return SecondaryArtifacts;
    }

    /**
     * @param SecondaryArtifacts the SecondaryArtifacts to set
     */
    public void setSecondaryArtifacts(String SecondaryArtifacts) {
	this.SecondaryArtifacts = SecondaryArtifacts;
    }

    /**
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
	this.Source = Source;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }

    /**
     * @return the Artifacts
     */
    public String getArtifacts() {
        return Artifacts;
    }

    /**
     * @param Artifacts the Artifacts to set
     */
    public void setArtifacts(String Artifacts) {
	this.Artifacts = Artifacts;
    }

    /**
     * @return the BadgeEnabled
     */
    public String getBadgeEnabled() {
        return BadgeEnabled;
    }

    /**
     * @param BadgeEnabled the BadgeEnabled to set
     */
    public void setBadgeEnabled(String BadgeEnabled) {
	this.BadgeEnabled = BadgeEnabled;
    }

    /**
     * @return the ServiceRole
     */
    public String getServiceRole() {
        return ServiceRole;
    }

    /**
     * @param ServiceRole the ServiceRole to set
     */
    public void setServiceRole(String ServiceRole) {
	this.ServiceRole = ServiceRole;
    }

    /**
     * @return the Environment
     */
    public String getEnvironment() {
        return Environment;
    }

    /**
     * @param Environment the Environment to set
     */
    public void setEnvironment(String Environment) {
	this.Environment = Environment;
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
     * @return the Cache
     */
    public String getCache() {
        return Cache;
    }

    /**
     * @param Cache the Cache to set
     */
    public void setCache(String Cache) {
	this.Cache = Cache;
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