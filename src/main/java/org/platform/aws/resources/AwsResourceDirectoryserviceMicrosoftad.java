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
public class AwsResourceDirectoryserviceMicrosoftad {

    /**
     * Specifies the VPC settings of the Microsoft Active Directory server in AWS. 
     */
    private String VpcSettings;

    /**
     * A unique alias to assign to the Microsoft Active Directory in AWS. AWS Directory Service uses the alias to construct the access URL for the directory, such as http://alias.awsapps.com. By default, AWS CloudFormation does not create an alias. 
     */
    private String CreateAlias;

    /**
     * Whether to enable single sign-on for a Microsoft Active Directory in AWS. Single sign-on allows users in your directory to access certain AWS services from a computer joined to the directory without having to enter their credentials separately. If you don't specify a value, AWS CloudFormation disables single sign-on by default. 
     */
    private String EnableSso;

    /**
     * The NetBIOS name for your domain, such as CORP. If you don't specify a value, AWS Directory Service uses the first part of your directory DNS server name. For example, if your directory DNS server name is corp.example.com, AWS Directory Service specifies CORP for the NetBIOS name. 
     */
    private String ShortName;

    /**
     * The AWS Microsoft AD edition. Valid values include Standard and Enterprise. The default is Enterprise. 
     */
    private String Edition;

    /**
     * The fully qualified name for the Microsoft Active Directory in AWS, such as corp.example.com. The name doesn't need to be publicly resolvable; it will resolve inside your VPC only. 
     */
    private String Name;

    /**
     * The password for the default administrative user, Admin. 
     */
    private String Password;

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
     * @return the Edition
     */
    public String getEdition() {
        return Edition;
    }

    /**
     * @param Edition the Edition to set
     */
    public void setEdition(String Edition) {
	this.Edition = Edition;
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