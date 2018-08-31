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
public class AwsResourceInspectorAssessmenttarget {

    /**
     * The name of the Amazon Inspector assessment target. 
     */
    private String AssessmentTargetName;

    /**
     * The ARN that specifies the resource group that is associated with the assessment target. 
     */
    private String ResourceGroupArn;

    /**
     * @return the AssessmentTargetName
     */
    public String getAssessmentTargetName() {
        return AssessmentTargetName;
    }

    /**
     * @param AssessmentTargetName the AssessmentTargetName to set
     */
    public void setAssessmentTargetName(String AssessmentTargetName) {
	this.AssessmentTargetName = AssessmentTargetName;
    }

    /**
     * @return the ResourceGroupArn
     */
    public String getResourceGroupArn() {
        return ResourceGroupArn;
    }

    /**
     * @param ResourceGroupArn the ResourceGroupArn to set
     */
    public void setResourceGroupArn(String ResourceGroupArn) {
	this.ResourceGroupArn = ResourceGroupArn;
    }


}