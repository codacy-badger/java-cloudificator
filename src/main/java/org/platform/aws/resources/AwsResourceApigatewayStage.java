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
public class AwsResourceApigatewayStage {

    /**
     * The identifier of the client certificate that API Gateway uses to call your integration endpoints in the stage. 
     */
    private String ClientCertificateId;

    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value. Variable names are limited to alphanumeric characters. Values must match the following regular expression: [A-Za-z0-9-._~:/?#&amp;=,]+. 
     */
    private String Variables;

    /**
     * The ID of the deployment that the stage points to. 
     */
    private String DeploymentId;

    /**
     * A description of the stage's purpose. 
     */
    private String Description;

    /**
     * The version identifier of the API documentation snapshot. 
     */
    private String DocumentationVersion;

    /**
     * The name of the stage, which API Gateway uses as the first path segment in the invoked Uniform Resource Identifier (URI). 
     */
    private String StageName;

    /**
     * The ID of the RestApi resource that you're deploying with this stage. 
     */
    private String RestApiId;

    /**
     * Settings for all methods in the stage. 
     */
    private String MethodSettings;

    /**
     * The stage's cache cluster size. 
     */
    private String CacheClusterSize;

    /**
     * Indicates whether cache clustering is enabled for the stage. 
     */
    private String CacheClusterEnabled;

    /**
     * @return the ClientCertificateId
     */
    public String getClientCertificateId() {
        return ClientCertificateId;
    }

    /**
     * @param ClientCertificateId the ClientCertificateId to set
     */
    public void setClientCertificateId(String ClientCertificateId) {
	this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * @return the Variables
     */
    public String getVariables() {
        return Variables;
    }

    /**
     * @param Variables the Variables to set
     */
    public void setVariables(String Variables) {
	this.Variables = Variables;
    }

    /**
     * @return the DeploymentId
     */
    public String getDeploymentId() {
        return DeploymentId;
    }

    /**
     * @param DeploymentId the DeploymentId to set
     */
    public void setDeploymentId(String DeploymentId) {
	this.DeploymentId = DeploymentId;
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
     * @return the DocumentationVersion
     */
    public String getDocumentationVersion() {
        return DocumentationVersion;
    }

    /**
     * @param DocumentationVersion the DocumentationVersion to set
     */
    public void setDocumentationVersion(String DocumentationVersion) {
	this.DocumentationVersion = DocumentationVersion;
    }

    /**
     * @return the StageName
     */
    public String getStageName() {
        return StageName;
    }

    /**
     * @param StageName the StageName to set
     */
    public void setStageName(String StageName) {
	this.StageName = StageName;
    }

    /**
     * @return the RestApiId
     */
    public String getRestApiId() {
        return RestApiId;
    }

    /**
     * @param RestApiId the RestApiId to set
     */
    public void setRestApiId(String RestApiId) {
	this.RestApiId = RestApiId;
    }

    /**
     * @return the MethodSettings
     */
    public String getMethodSettings() {
        return MethodSettings;
    }

    /**
     * @param MethodSettings the MethodSettings to set
     */
    public void setMethodSettings(String MethodSettings) {
	this.MethodSettings = MethodSettings;
    }

    /**
     * @return the CacheClusterSize
     */
    public String getCacheClusterSize() {
        return CacheClusterSize;
    }

    /**
     * @param CacheClusterSize the CacheClusterSize to set
     */
    public void setCacheClusterSize(String CacheClusterSize) {
	this.CacheClusterSize = CacheClusterSize;
    }

    /**
     * @return the CacheClusterEnabled
     */
    public String getCacheClusterEnabled() {
        return CacheClusterEnabled;
    }

    /**
     * @param CacheClusterEnabled the CacheClusterEnabled to set
     */
    public void setCacheClusterEnabled(String CacheClusterEnabled) {
	this.CacheClusterEnabled = CacheClusterEnabled;
    }


}