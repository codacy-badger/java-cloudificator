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
public class AwsResourceInspectorAssessmenttemplate {

    /**
     * The ARN of the assessment target that corresponds to this assessment template. 
     */
    private String AssessmentTargetArn;

    /**
     * The duration in seconds specified for this assessment tempate. The default value is 3600 seconds (one hour). The maximum value is 86400 seconds (one day). 
     */
    private String DurationInSeconds;

    /**
     * The name of the assessment template. 
     */
    private String AssessmentTemplateName;

    /**
     * The rules packages that are specified for this assessment template. 
     */
    private String RulesPackageArns;

    /**
     * The user-defined attributes that are assigned to every generated finding from the assessment run that uses this assessment template. 
     */
    private String UserAttributesForFindings;

    /**
     * @return the AssessmentTargetArn
     */
    public String getAssessmentTargetArn() {
        return AssessmentTargetArn;
    }

    /**
     * @param AssessmentTargetArn the AssessmentTargetArn to set
     */
    public void setAssessmentTargetArn(String AssessmentTargetArn) {
	this.AssessmentTargetArn = AssessmentTargetArn;
    }

    /**
     * @return the DurationInSeconds
     */
    public String getDurationInSeconds() {
        return DurationInSeconds;
    }

    /**
     * @param DurationInSeconds the DurationInSeconds to set
     */
    public void setDurationInSeconds(String DurationInSeconds) {
	this.DurationInSeconds = DurationInSeconds;
    }

    /**
     * @return the AssessmentTemplateName
     */
    public String getAssessmentTemplateName() {
        return AssessmentTemplateName;
    }

    /**
     * @param AssessmentTemplateName the AssessmentTemplateName to set
     */
    public void setAssessmentTemplateName(String AssessmentTemplateName) {
	this.AssessmentTemplateName = AssessmentTemplateName;
    }

    /**
     * @return the RulesPackageArns
     */
    public String getRulesPackageArns() {
        return RulesPackageArns;
    }

    /**
     * @param RulesPackageArns the RulesPackageArns to set
     */
    public void setRulesPackageArns(String RulesPackageArns) {
	this.RulesPackageArns = RulesPackageArns;
    }

    /**
     * @return the UserAttributesForFindings
     */
    public String getUserAttributesForFindings() {
        return UserAttributesForFindings;
    }

    /**
     * @param UserAttributesForFindings the UserAttributesForFindings to set
     */
    public void setUserAttributesForFindings(String UserAttributesForFindings) {
	this.UserAttributesForFindings = UserAttributesForFindings;
    }


}