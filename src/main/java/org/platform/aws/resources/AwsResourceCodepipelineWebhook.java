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
public class AwsResourceCodepipelineWebhook {

    /**
     * Properties that configure the authentication applied to incoming webhook trigger requests. For more information, see Webhook Definition in the AWS CodePipeline API Reference. 
     */
    private String AuthenticationConfiguration;

    /**
     * A list of rules applied to the body/payload sent in the POST request to a webhook URL. All defined rules must pass for the request to be accepted and the pipeline started. 
     */
    private String Filters;

    /**
     * The type of authentication scheme that allows the trigger request to be accepted. For more information, see Webhook Definition in the AWS CodePipeline API Reference. 
     */
    private String Authentication;

    /**
     * The name of the pipeline you want to connect to the webhook. 
     */
    private String TargetPipeline;

    /**
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline. 
     */
    private String TargetAction;

    /**
     * The name of the webhook to be created and, if applicable, to register with a supported third party. 
     */
    private String Name;

    /**
     * Indicates whether to register the webhook with a third party. Third party registration configures a connection between the webhook that was created and the external tool, such as GitHub, with events to be detected. 
     */
    private String RegisterWithThirdParty;

    /**
     * The version number of the pipeline to be connected to the trigger request. 
     */
    private String TargetPipelineVersion;

    /**
     * @return the AuthenticationConfiguration
     */
    public String getAuthenticationConfiguration() {
        return AuthenticationConfiguration;
    }

    /**
     * @param AuthenticationConfiguration the AuthenticationConfiguration to set
     */
    public void setAuthenticationConfiguration(String AuthenticationConfiguration) {
	this.AuthenticationConfiguration = AuthenticationConfiguration;
    }

    /**
     * @return the Filters
     */
    public String getFilters() {
        return Filters;
    }

    /**
     * @param Filters the Filters to set
     */
    public void setFilters(String Filters) {
	this.Filters = Filters;
    }

    /**
     * @return the Authentication
     */
    public String getAuthentication() {
        return Authentication;
    }

    /**
     * @param Authentication the Authentication to set
     */
    public void setAuthentication(String Authentication) {
	this.Authentication = Authentication;
    }

    /**
     * @return the TargetPipeline
     */
    public String getTargetPipeline() {
        return TargetPipeline;
    }

    /**
     * @param TargetPipeline the TargetPipeline to set
     */
    public void setTargetPipeline(String TargetPipeline) {
	this.TargetPipeline = TargetPipeline;
    }

    /**
     * @return the TargetAction
     */
    public String getTargetAction() {
        return TargetAction;
    }

    /**
     * @param TargetAction the TargetAction to set
     */
    public void setTargetAction(String TargetAction) {
	this.TargetAction = TargetAction;
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
     * @return the RegisterWithThirdParty
     */
    public String getRegisterWithThirdParty() {
        return RegisterWithThirdParty;
    }

    /**
     * @param RegisterWithThirdParty the RegisterWithThirdParty to set
     */
    public void setRegisterWithThirdParty(String RegisterWithThirdParty) {
	this.RegisterWithThirdParty = RegisterWithThirdParty;
    }

    /**
     * @return the TargetPipelineVersion
     */
    public String getTargetPipelineVersion() {
        return TargetPipelineVersion;
    }

    /**
     * @param TargetPipelineVersion the TargetPipelineVersion to set
     */
    public void setTargetPipelineVersion(String TargetPipelineVersion) {
	this.TargetPipelineVersion = TargetPipelineVersion;
    }


}