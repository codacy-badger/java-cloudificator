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
public class AwsResourceDmsCertificate {

    /**
     * The customer-assigned name of the certificate. Valid characters are A-z and 0-9. 
     */
    private String CertificateIdentifier;

    /**
     * The contents of the .pem X.509 certificate file for the certificate. 
     */
    private String CertificatePem;

    /**
     * The location of the imported Oracle Wallet certificate for use with SSL. 
     */
    private String CertificateWallet;

    /**
     * @return the CertificateIdentifier
     */
    public String getCertificateIdentifier() {
        return CertificateIdentifier;
    }

    /**
     * @param CertificateIdentifier the CertificateIdentifier to set
     */
    public void setCertificateIdentifier(String CertificateIdentifier) {
	this.CertificateIdentifier = CertificateIdentifier;
    }

    /**
     * @return the CertificatePem
     */
    public String getCertificatePem() {
        return CertificatePem;
    }

    /**
     * @param CertificatePem the CertificatePem to set
     */
    public void setCertificatePem(String CertificatePem) {
	this.CertificatePem = CertificatePem;
    }

    /**
     * @return the CertificateWallet
     */
    public String getCertificateWallet() {
        return CertificateWallet;
    }

    /**
     * @param CertificateWallet the CertificateWallet to set
     */
    public void setCertificateWallet(String CertificateWallet) {
	this.CertificateWallet = CertificateWallet;
    }


}