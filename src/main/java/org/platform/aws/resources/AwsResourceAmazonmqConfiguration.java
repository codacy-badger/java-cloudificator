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
public class AwsResourceAmazonmqConfiguration {

    /**
     * The description of the configuration. 
     */
    private String Description;

    /**
     * The version of the broker engine. 
     */
    private String EngineVersion;

    /**
     * The base64-encoded XML configuration. 
     */
    private String Data;

    /**
     * The type of broker engine. 
     */
    private String EngineType;

    /**
     * The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long. 
     */
    private String Name;

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
     * @return the EngineVersion
     */
    public String getEngineVersion() {
        return EngineVersion;
    }

    /**
     * @param EngineVersion the EngineVersion to set
     */
    public void setEngineVersion(String EngineVersion) {
	this.EngineVersion = EngineVersion;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
	this.Data = Data;
    }

    /**
     * @return the EngineType
     */
    public String getEngineType() {
        return EngineType;
    }

    /**
     * @param EngineType the EngineType to set
     */
    public void setEngineType(String EngineType) {
	this.EngineType = EngineType;
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