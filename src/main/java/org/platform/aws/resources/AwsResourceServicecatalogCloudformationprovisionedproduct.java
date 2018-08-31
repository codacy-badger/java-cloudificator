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
public class AwsResourceServicecatalogCloudformationprovisionedproduct {

    /**
     * The path identifier of the product. 
     */
    private String PathId;

    /**
     * Parameters specified by the administrator that are required for provisioning the product. 
     */
    private String ProvisioningParameters;

    /**
     * The product name. This name must be unique for the user. You must specify either the name or the ID of the product, but not both. 
     */
    private String ProductName;

    /**
     * The name of the provisioning artifact (also known as a version) for the product. This name must be unique for the product. You must specify either the name or the ID of the provisioning artifact, but not both. 
     */
    private String ProvisioningArtifactName;

    /**
     * The SNS topic ARNs for stack-related events. 
     */
    private String NotificationArns;

    /**
     * The language code. 
     */
    private String AcceptLanguage;

    /**
     * The product identifier. You must specify either the ID or the name of the product, but not both. 
     */
    private String ProductId;

    /**
     * One or more tags. 
     */
    private String Tags;

    /**
     * A user-friendly name for the provisioned product. This name must be unique for the AWS account and cannot be updated after the product is provisioned. 
     */
    private String ProvisionedProductName;

    /**
     * The identifier of the provisioning artifact (also known as a version) for the product. You must specify either the ID or the name of the provisioning artifact, but not both. 
     */
    private String ProvisioningArtifactId;

    /**
     * @return the PathId
     */
    public String getPathId() {
        return PathId;
    }

    /**
     * @param PathId the PathId to set
     */
    public void setPathId(String PathId) {
	this.PathId = PathId;
    }

    /**
     * @return the ProvisioningParameters
     */
    public String getProvisioningParameters() {
        return ProvisioningParameters;
    }

    /**
     * @param ProvisioningParameters the ProvisioningParameters to set
     */
    public void setProvisioningParameters(String ProvisioningParameters) {
	this.ProvisioningParameters = ProvisioningParameters;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
	this.ProductName = ProductName;
    }

    /**
     * @return the ProvisioningArtifactName
     */
    public String getProvisioningArtifactName() {
        return ProvisioningArtifactName;
    }

    /**
     * @param ProvisioningArtifactName the ProvisioningArtifactName to set
     */
    public void setProvisioningArtifactName(String ProvisioningArtifactName) {
	this.ProvisioningArtifactName = ProvisioningArtifactName;
    }

    /**
     * @return the NotificationArns
     */
    public String getNotificationArns() {
        return NotificationArns;
    }

    /**
     * @param NotificationArns the NotificationArns to set
     */
    public void setNotificationArns(String NotificationArns) {
	this.NotificationArns = NotificationArns;
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
     * @return the ProductId
     */
    public String getProductId() {
        return ProductId;
    }

    /**
     * @param ProductId the ProductId to set
     */
    public void setProductId(String ProductId) {
	this.ProductId = ProductId;
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
     * @return the ProvisionedProductName
     */
    public String getProvisionedProductName() {
        return ProvisionedProductName;
    }

    /**
     * @param ProvisionedProductName the ProvisionedProductName to set
     */
    public void setProvisionedProductName(String ProvisionedProductName) {
	this.ProvisionedProductName = ProvisionedProductName;
    }

    /**
     * @return the ProvisioningArtifactId
     */
    public String getProvisioningArtifactId() {
        return ProvisioningArtifactId;
    }

    /**
     * @param ProvisioningArtifactId the ProvisioningArtifactId to set
     */
    public void setProvisioningArtifactId(String ProvisioningArtifactId) {
	this.ProvisioningArtifactId = ProvisioningArtifactId;
    }


}