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
public class AwsResourceKinesisanalyticsApplicationreferencedatasource {

    /**
     * The name of an existing application. 
     */
    private String ApplicationName;

    /**
     * The reference data source, which is an object in your Amazon Simple Storage Service (Amazon S3) bucket. 
     */
    private String ReferenceDataSource;

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
     * @return the ReferenceDataSource
     */
    public String getReferenceDataSource() {
        return ReferenceDataSource;
    }

    /**
     * @param ReferenceDataSource the ReferenceDataSource to set
     */
    public void setReferenceDataSource(String ReferenceDataSource) {
	this.ReferenceDataSource = ReferenceDataSource;
    }


}