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
public class AwsResourceKinesisanalyticsApplication {

    /**
     * The name of your Amazon Kinesis Data Analytics application. 
     */
    private String ApplicationName;

    /**
     * Use this parameter to configure the application input. 
     */
    private String Inputs;

    /**
     * The summary description of the application. 
     */
    private String ApplicationDescription;

    /**
     * One or more SQL statements that read input data, transform it, and generate output. 
     */
    private String ApplicationCode;

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
     * @return the Inputs
     */
    public String getInputs() {
        return Inputs;
    }

    /**
     * @param Inputs the Inputs to set
     */
    public void setInputs(String Inputs) {
	this.Inputs = Inputs;
    }

    /**
     * @return the ApplicationDescription
     */
    public String getApplicationDescription() {
        return ApplicationDescription;
    }

    /**
     * @param ApplicationDescription the ApplicationDescription to set
     */
    public void setApplicationDescription(String ApplicationDescription) {
	this.ApplicationDescription = ApplicationDescription;
    }

    /**
     * @return the ApplicationCode
     */
    public String getApplicationCode() {
        return ApplicationCode;
    }

    /**
     * @param ApplicationCode the ApplicationCode to set
     */
    public void setApplicationCode(String ApplicationCode) {
	this.ApplicationCode = ApplicationCode;
    }


}