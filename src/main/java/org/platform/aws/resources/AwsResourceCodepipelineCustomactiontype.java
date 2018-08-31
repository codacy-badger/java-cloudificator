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
public class AwsResourceCodepipelineCustomactiontype {

    /**
     * The category of the custom action, such as a source action or a build action. For valid values, see CreateCustomActionType in the AWS CodePipeline API Reference. 
     */
    private String Category;

    /**
     * The input artifact details for this custom action. 
     */
    private String InputArtifactDetails;

    /**
     * The version number of this custom action. For length constraints, see the version parameter of the CreateCustomActionType action in the AWS CodePipeline API Reference. 
     */
    private String Version;

    /**
     * The output artifact details for this custom action. 
     */
    private String OutputArtifactDetails;

    /**
     * The configuration properties for the custom action. 
     */
    private String ConfigurationProperties;

    /**
     * URLs that provide users information about this custom action. 
     */
    private String Settings;

    /**
     * The name of the service provider that AWS CodePipeline uses for this custom action. 
     */
    private String Provider;

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
	this.Category = Category;
    }

    /**
     * @return the InputArtifactDetails
     */
    public String getInputArtifactDetails() {
        return InputArtifactDetails;
    }

    /**
     * @param InputArtifactDetails the InputArtifactDetails to set
     */
    public void setInputArtifactDetails(String InputArtifactDetails) {
	this.InputArtifactDetails = InputArtifactDetails;
    }

    /**
     * @return the Version
     */
    public String getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String Version) {
	this.Version = Version;
    }

    /**
     * @return the OutputArtifactDetails
     */
    public String getOutputArtifactDetails() {
        return OutputArtifactDetails;
    }

    /**
     * @param OutputArtifactDetails the OutputArtifactDetails to set
     */
    public void setOutputArtifactDetails(String OutputArtifactDetails) {
	this.OutputArtifactDetails = OutputArtifactDetails;
    }

    /**
     * @return the ConfigurationProperties
     */
    public String getConfigurationProperties() {
        return ConfigurationProperties;
    }

    /**
     * @param ConfigurationProperties the ConfigurationProperties to set
     */
    public void setConfigurationProperties(String ConfigurationProperties) {
	this.ConfigurationProperties = ConfigurationProperties;
    }

    /**
     * @return the Settings
     */
    public String getSettings() {
        return Settings;
    }

    /**
     * @param Settings the Settings to set
     */
    public void setSettings(String Settings) {
	this.Settings = Settings;
    }

    /**
     * @return the Provider
     */
    public String getProvider() {
        return Provider;
    }

    /**
     * @param Provider the Provider to set
     */
    public void setProvider(String Provider) {
	this.Provider = Provider;
    }


}