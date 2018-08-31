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
public class AwsResourceRdsOptiongroup {

    /**
     * A description of the option group. 
     */
    private String OptionGroupDescription;

    /**
     * The configurations for this option group. 
     */
    private String OptionConfigurations;

    /**
     * The major version number of the database engine that this option group is associated with. 
     */
    private String MajorEngineVersion;

    /**
     * The name of the database engine that this option group is associated with. 
     */
    private String EngineName;

    /**
     * An arbitrary set of tags (key–value pairs) for this option group. 
     */
    private String Tags;

    /**
     * @return the OptionGroupDescription
     */
    public String getOptionGroupDescription() {
        return OptionGroupDescription;
    }

    /**
     * @param OptionGroupDescription the OptionGroupDescription to set
     */
    public void setOptionGroupDescription(String OptionGroupDescription) {
	this.OptionGroupDescription = OptionGroupDescription;
    }

    /**
     * @return the OptionConfigurations
     */
    public String getOptionConfigurations() {
        return OptionConfigurations;
    }

    /**
     * @param OptionConfigurations the OptionConfigurations to set
     */
    public void setOptionConfigurations(String OptionConfigurations) {
	this.OptionConfigurations = OptionConfigurations;
    }

    /**
     * @return the MajorEngineVersion
     */
    public String getMajorEngineVersion() {
        return MajorEngineVersion;
    }

    /**
     * @param MajorEngineVersion the MajorEngineVersion to set
     */
    public void setMajorEngineVersion(String MajorEngineVersion) {
	this.MajorEngineVersion = MajorEngineVersion;
    }

    /**
     * @return the EngineName
     */
    public String getEngineName() {
        return EngineName;
    }

    /**
     * @param EngineName the EngineName to set
     */
    public void setEngineName(String EngineName) {
	this.EngineName = EngineName;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}