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
public class AwsResourceKinesisanalyticsApplicationoutput {

    /**
     * The name of the application to which you want to add the output configuration. 
     */
    private String ApplicationName;

    /**
     * An array of objects, each describing one output configuration. 
     */
    private String Output;

    /**
     * @return the ApplicationName
     */
    public String getApplicationName() {
        return ApplicationName;
    }

    /**
     * @param ApplicationName the ApplicationName to set
     */
    public void setApplicationName(String ApplicationName) {
	this.ApplicationName = ApplicationName;
    }

    /**
     * @return the Output
     */
    public String getOutput() {
        return Output;
    }

    /**
     * @param Output the Output to set
     */
    public void setOutput(String Output) {
	this.Output = Output;
    }


}