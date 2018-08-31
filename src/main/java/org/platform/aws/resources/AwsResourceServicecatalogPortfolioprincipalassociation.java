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
public class AwsResourceServicecatalogPortfolioprincipalassociation {

    /**
     * The ARN of the principal (IAM user, role, or group). 
     */
    private String PrincipalARN;

    /**
     * The language code. 
     */
    private String AcceptLanguage;

    /**
     * The portfolio identifier. 
     */
    private String PortfolioId;

    /**
     * The principal type (IAM). 
     */
    private String PrincipalType;

    /**
     * @return the PrincipalARN
     */
    public String getPrincipalARN() {
        return PrincipalARN;
    }

    /**
     * @param PrincipalARN the PrincipalARN to set
     */
    public void setPrincipalARN(String PrincipalARN) {
	this.PrincipalARN = PrincipalARN;
    }

    /**
     * @return the AcceptLanguage
     */
    public String getAcceptLanguage() {
        return AcceptLanguage;
    }

    /**
     * @param AcceptLanguage the AcceptLanguage to set
     */
    public void setAcceptLanguage(String AcceptLanguage) {
	this.AcceptLanguage = AcceptLanguage;
    }

    /**
     * @return the PortfolioId
     */
    public String getPortfolioId() {
        return PortfolioId;
    }

    /**
     * @param PortfolioId the PortfolioId to set
     */
    public void setPortfolioId(String PortfolioId) {
	this.PortfolioId = PortfolioId;
    }

    /**
     * @return the PrincipalType
     */
    public String getPrincipalType() {
        return PrincipalType;
    }

    /**
     * @param PrincipalType the PrincipalType to set
     */
    public void setPrincipalType(String PrincipalType) {
	this.PrincipalType = PrincipalType;
    }


}