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
public class AwsResourceAutoscalingplansScalingplan {

    /**
     * A CloudFormation stack or a set of tags. You can create one scaling plan per application source. 
     */
    private String ApplicationSource;

    /**
     * The scaling instructions. 
     */
    private String ScalingInstructions;

    /**
     * @return the ApplicationSource
     */
    public String getApplicationSource() {
        return ApplicationSource;
    }

    /**
     * @param ApplicationSource the ApplicationSource to set
     */
    public void setApplicationSource(String ApplicationSource) {
	this.ApplicationSource = ApplicationSource;
    }

    /**
     * @return the ScalingInstructions
     */
    public String getScalingInstructions() {
        return ScalingInstructions;
    }

    /**
     * @param ScalingInstructions the ScalingInstructions to set
     */
    public void setScalingInstructions(String ScalingInstructions) {
	this.ScalingInstructions = ScalingInstructions;
    }


}