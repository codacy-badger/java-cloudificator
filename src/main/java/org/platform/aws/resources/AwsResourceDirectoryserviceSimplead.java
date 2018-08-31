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
public class AwsResourceDirectoryserviceSimplead {

    /**
     * A description of the directory. 
     */
    private String Description;

    /**
     * Specifies the VPC settings of the directory server. 
     */
    private String VpcSettings;

    /**
     * The size of the directory. For valid values, see CreateDirectory in the AWS Directory Service API Reference. 
     */
    private String Size;

    /**
     * If set to true, creates an alias for a directory and assigns the alias to the directory. AWS Directory Service uses the alias to construct the access URL for the directory, such as http://alias.awsapps.com. By default, this property is set to false. 
     */
    private String CreateAlias;

    /**
     * Whether to enable single sign-on for a directory. If you don't specify a value, AWS CloudFormation disables single sign-on by default. 
     */
    private String EnableSso;

    /**
     * The NetBIOS name of the on-premises directory, such as CORP. 
     */
    private String ShortName;

    /**
     * The fully qualified name for the directory, such as corp.example.com. 
     */
    private String Name;

    /**
     * The password for the directory administrator. AWS Directory Service creates a directory administrator account with the user name Administrator and this password. 
     */
    private String Password;

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
     * @return the VpcSettings
     */
    public String getVpcSettings() {
        return VpcSettings;
    }

    /**
     * @param VpcSettings the VpcSettings to set
     */
    public void setVpcSettings(String VpcSettings) {
	this.VpcSettings = VpcSettings;
    }

    /**
     * @return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(String Size) {
	this.Size = Size;
    }

    /**
     * @return the CreateAlias
     */
    public String getCreateAlias() {
        return CreateAlias;
    }

    /**
     * @param CreateAlias the CreateAlias to set
     */
    public void setCreateAlias(String CreateAlias) {
	this.CreateAlias = CreateAlias;
    }

    /**
     * @return the EnableSso
     */
    public String getEnableSso() {
        return EnableSso;
    }

    /**
     * @param EnableSso the EnableSso to set
     */
    public void setEnableSso(String EnableSso) {
	this.EnableSso = EnableSso;
    }

    /**
     * @return the ShortName
     */
    public String getShortName() {
        return ShortName;
    }

    /**
     * @param ShortName the ShortName to set
     */
    public void setShortName(String ShortName) {
	this.ShortName = ShortName;
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
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
	this.Password = Password;
    }


}