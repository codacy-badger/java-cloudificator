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
public class AwsResourceApigatewayDomainname {

    /**
     * The custom domain name for your API in Amazon API Gateway. 
     */
    private String DomainName;

    /**
     * A list of the endpoint types of the domain name. 
     */
    private String EndpointConfiguration;

    /**
     * The reference to an AWS-managed certificate for use by the regional endpoint for the domain name. AWS Certificate Manager is the only supported source. 
     */
    private String RegionalCertificateArn;

    /**
     * The reference to an AWS-managed certificate for use by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source. For requirements and additional information about setting up certificates, see Get Certificates Ready in AWS Certificate Manager in the API Gateway Developer Guide. 
     */
    private String CertificateArn;

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
     * @return the EndpointConfiguration
     */
    public String getEndpointConfiguration() {
        return EndpointConfiguration;
    }

    /**
     * @param EndpointConfiguration the EndpointConfiguration to set
     */
    public void setEndpointConfiguration(String EndpointConfiguration) {
	this.EndpointConfiguration = EndpointConfiguration;
    }

    /**
     * @return the RegionalCertificateArn
     */
    public String getRegionalCertificateArn() {
        return RegionalCertificateArn;
    }

    /**
     * @param RegionalCertificateArn the RegionalCertificateArn to set
     */
    public void setRegionalCertificateArn(String RegionalCertificateArn) {
	this.RegionalCertificateArn = RegionalCertificateArn;
    }

    /**
     * @return the CertificateArn
     */
    public String getCertificateArn() {
        return CertificateArn;
    }

    /**
     * @param CertificateArn the CertificateArn to set
     */
    public void setCertificateArn(String CertificateArn) {
	this.CertificateArn = CertificateArn;
    }


}