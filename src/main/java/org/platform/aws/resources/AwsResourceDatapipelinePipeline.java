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
public class AwsResourceDatapipelinePipeline {

    /**
     * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to control permissions. For more information, see Controlling Access to Pipelines and Resources in the AWS Data Pipeline Developer Guide. 
     */
    private String PipelineTags;

    /**
     * Defines the variables that are in the pipeline definition. For more information, see Creating a Pipeline Using Parameterized Templates in the AWS Data Pipeline Developer Guide. 
     */
    private String ParameterObjects;

    /**
     * A description for the pipeline. 
     */
    private String Description;

    /**
     * Indicates whether to validate and start the pipeline or stop an active pipeline. By default, the value is set to true. 
     */
    private String Activate;

    /**
     * A list of pipeline objects that make up the pipeline. For more information about pipeline objects and a description of each object, see Pipeline Object Reference in the AWS Data Pipeline Developer Guide. 
     */
    private String PipelineObjects;

    /**
     * Defines the values for the parameters that are defined in the ParameterObjects property. For more information, see Creating a Pipeline Using Parameterized Templates in the AWS Data Pipeline Developer Guide. 
     */
    private String ParameterValues;

    /**
     * A name for the pipeline. Because AWS CloudFormation assigns each new pipeline a unique identifier, you can use the same name for multiple pipelines that are associated with your AWS account. 
     */
    private String Name;

    /**
     * @return the PipelineTags
     */
    public String getPipelineTags() {
        return PipelineTags;
    }

    /**
     * @param PipelineTags the PipelineTags to set
     */
    public void setPipelineTags(String PipelineTags) {
	this.PipelineTags = PipelineTags;
    }

    /**
     * @return the ParameterObjects
     */
    public String getParameterObjects() {
        return ParameterObjects;
    }

    /**
     * @param ParameterObjects the ParameterObjects to set
     */
    public void setParameterObjects(String ParameterObjects) {
	this.ParameterObjects = ParameterObjects;
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
     * @return the Activate
     */
    public String getActivate() {
        return Activate;
    }

    /**
     * @param Activate the Activate to set
     */
    public void setActivate(String Activate) {
	this.Activate = Activate;
    }

    /**
     * @return the PipelineObjects
     */
    public String getPipelineObjects() {
        return PipelineObjects;
    }

    /**
     * @param PipelineObjects the PipelineObjects to set
     */
    public void setPipelineObjects(String PipelineObjects) {
	this.PipelineObjects = PipelineObjects;
    }

    /**
     * @return the ParameterValues
     */
    public String getParameterValues() {
        return ParameterValues;
    }

    /**
     * @param ParameterValues the ParameterValues to set
     */
    public void setParameterValues(String ParameterValues) {
	this.ParameterValues = ParameterValues;
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


}