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
public class AwsResourceIotCertificate {

    /**
     * The status of the certificate. 
     */
    private String Status;

    /**
     * The certificate signing request (CSR). 
     */
    private String CertificateSigningRequest;

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
	this.Status = Status;
    }

    /**
     * @return the CertificateSigningRequest
     */
    public String getCertificateSigningRequest() {
        return CertificateSigningRequest;
    }

    /**
     * @param CertificateSigningRequest the CertificateSigningRequest to set
     */
    public void setCertificateSigningRequest(String CertificateSigningRequest) {
	this.CertificateSigningRequest = CertificateSigningRequest;
    }


}