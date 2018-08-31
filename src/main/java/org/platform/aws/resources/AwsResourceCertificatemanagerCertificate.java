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
public class AwsResourceCertificatemanagerCertificate {

    /**
     * Domain information that domain name registrars use to verify your identity. For more information and the default values, see Configure Email for Your Domain and Validate Domain Ownership in the AWS Certificate Manager User Guide. 
     */
    private String DomainValidationOptions;

    /**
     * Fully qualified domain name (FQDN), such as www.example.com, of the site that you want to secure with the ACM certificate. To protect several sites in the same domain, use an asterisk (*) to specify a wildcard. For example, *.example.com protects www.example.com, site.example.com, and images.example.com. 
     */
    private String DomainName;

    /**
     * The method you want to use if you are requesting a public certificate to validate that you own or control a domain. Valid values include EMAIL or DNS. We recommend that you use DNS validation. The default is EMAIL. 
     */
    private String ValidationMethod;

    /**
     * FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example, you can add www.example.net to a certificate for the www.example.com domain name so that users can reach your site by using either name. 
     */
    private String SubjectAlternativeNames;

    /**
     * An arbitrary set of tags (key–value pairs) for this ACM certificate. 
     */
    private String Tags;

    /**
     * @return the DomainValidationOptions
     */
    public String getDomainValidationOptions() {
        return DomainValidationOptions;
    }

    /**
     * @param DomainValidationOptions the DomainValidationOptions to set
     */
    public void setDomainValidationOptions(String DomainValidationOptions) {
	this.DomainValidationOptions = DomainValidationOptions;
    }

    /**
     * @return the DomainName
     */
    public String getDomainName() {
        return DomainName;
    }

    /**
     * @param DomainName the DomainName to set
     */
    public void setDomainName(String DomainName) {
	this.DomainName = DomainName;
    }

    /**
     * @return the ValidationMethod
     */
    public String getValidationMethod() {
        return ValidationMethod;
    }

    /**
     * @param ValidationMethod the ValidationMethod to set
     */
    public void setValidationMethod(String ValidationMethod) {
	this.ValidationMethod = ValidationMethod;
    }

    /**
     * @return the SubjectAlternativeNames
     */
    public String getSubjectAlternativeNames() {
        return SubjectAlternativeNames;
    }

    /**
     * @param SubjectAlternativeNames the SubjectAlternativeNames to set
     */
    public void setSubjectAlternativeNames(String SubjectAlternativeNames) {
	this.SubjectAlternativeNames = SubjectAlternativeNames;
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