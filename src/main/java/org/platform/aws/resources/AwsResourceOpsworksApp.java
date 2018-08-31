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
public class AwsResourceOpsworksApp {

    /**
     * The app virtual host settings, with multiple domains separated by commas. For example, 'www.example.com, example.com'. 
     */
    private String Domains;

    /**
     * A list of databases to associate with the AWS OpsWorks app. 
     */
    private String DataSources;

    /**
     * Whether to enable SSL for this app. 
     */
    private String EnableSsl;

    /**
     * The app type. Each supported type is associated with a particular layer. For more information, see CreateApp in the AWS OpsWorks Stacks API Reference. 
     */
    private String Type;

    /**
     * A description of the app. 
     */
    private String Description;

    /**
     * The SSL configuration 
     */
    private String SslConfiguration;

    /**
     * One or more user-defined key-value pairs to be added to the app attributes bag. 
     */
    private String Attributes;

    /**
     * The environment variables to associate with the AWS OpsWorks app. 
     */
    private String Environment;

    /**
     * The app short name, which is used internally by AWS OpsWorks and by Chef recipes. 
     */
    private String Shortname;

    /**
     * The information required to retrieve an app from a repository. 
     */
    private String AppSource;

    /**
     * The name of the AWS OpsWorks app. 
     */
    private String Name;

    /**
     * The ID of the AWS OpsWorks stack to associate this app with. 
     */
    private String StackId;

    /**
     * @return the Domains
     */
    public String getDomains() {
        return Domains;
    }

    /**
     * @param Domains the Domains to set
     */
    public void setDomains(String Domains) {
	this.Domains = Domains;
    }

    /**
     * @return the DataSources
     */
    public String getDataSources() {
        return DataSources;
    }

    /**
     * @param DataSources the DataSources to set
     */
    public void setDataSources(String DataSources) {
	this.DataSources = DataSources;
    }

    /**
     * @return the EnableSsl
     */
    public String getEnableSsl() {
        return EnableSsl;
    }

    /**
     * @param EnableSsl the EnableSsl to set
     */
    public void setEnableSsl(String EnableSsl) {
	this.EnableSsl = EnableSsl;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
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
     * @return the SslConfiguration
     */
    public String getSslConfiguration() {
        return SslConfiguration;
    }

    /**
     * @param SslConfiguration the SslConfiguration to set
     */
    public void setSslConfiguration(String SslConfiguration) {
	this.SslConfiguration = SslConfiguration;
    }

    /**
     * @return the Attributes
     */
    public String getAttributes() {
        return Attributes;
    }

    /**
     * @param Attributes the Attributes to set
     */
    public void setAttributes(String Attributes) {
	this.Attributes = Attributes;
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
     * @return the Shortname
     */
    public String getShortname() {
        return Shortname;
    }

    /**
     * @param Shortname the Shortname to set
     */
    public void setShortname(String Shortname) {
	this.Shortname = Shortname;
    }

    /**
     * @return the AppSource
     */
    public String getAppSource() {
        return AppSource;
    }

    /**
     * @param AppSource the AppSource to set
     */
    public void setAppSource(String AppSource) {
	this.AppSource = AppSource;
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
     * @return the StackId
     */
    public String getStackId() {
        return StackId;
    }

    /**
     * @param StackId the StackId to set
     */
    public void setStackId(String StackId) {
	this.StackId = StackId;
    }


}