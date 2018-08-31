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
public class AwsResourceSsmAssociation {

    /**
     * The name of the association. 
     */
    private String AssociationName;

    /**
     * A Cron expression that specifies when the association is applied to the target. For more on working with Cron expressions, see Working with Cron and Rate Expressions for Systems Manager. 
     */
    private String ScheduleExpression;

    /**
     * Parameter values that the SSM document uses at runtime. 
     */
    private String Parameters;

    /**
     * The ID of the instance that the SSM document is associated with. 
     */
    private String InstanceId;

    /**
     * The targets that the SSM document sends commands to. 
     */
    private String Targets;

    /**
     * The version of the SSM document to associate with the target. 
     */
    private String DocumentVersion;

    /**
     * An Amazon S3 bucket where you want to store the results of this request. 
     */
    private String OutputLocation;

    /**
     * The name of the SSM document. 
     */
    private String Name;

    /**
     * @return the AssociationName
     */
    public String getAssociationName() {
        return AssociationName;
    }

    /**
     * @param AssociationName the AssociationName to set
     */
    public void setAssociationName(String AssociationName) {
	this.AssociationName = AssociationName;
    }

    /**
     * @return the ScheduleExpression
     */
    public String getScheduleExpression() {
        return ScheduleExpression;
    }

    /**
     * @param ScheduleExpression the ScheduleExpression to set
     */
    public void setScheduleExpression(String ScheduleExpression) {
	this.ScheduleExpression = ScheduleExpression;
    }

    /**
     * @return the Parameters
     */
    public String getParameters() {
        return Parameters;
    }

    /**
     * @param Parameters the Parameters to set
     */
    public void setParameters(String Parameters) {
	this.Parameters = Parameters;
    }

    /**
     * @return the InstanceId
     */
    public String getInstanceId() {
        return InstanceId;
    }

    /**
     * @param InstanceId the InstanceId to set
     */
    public void setInstanceId(String InstanceId) {
	this.InstanceId = InstanceId;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
    }

    /**
     * @return the DocumentVersion
     */
    public String getDocumentVersion() {
        return DocumentVersion;
    }

    /**
     * @param DocumentVersion the DocumentVersion to set
     */
    public void setDocumentVersion(String DocumentVersion) {
	this.DocumentVersion = DocumentVersion;
    }

    /**
     * @return the OutputLocation
     */
    public String getOutputLocation() {
        return OutputLocation;
    }

    /**
     * @param OutputLocation the OutputLocation to set
     */
    public void setOutputLocation(String OutputLocation) {
	this.OutputLocation = OutputLocation;
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