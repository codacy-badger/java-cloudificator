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
public class AwsPropertiesElasticacheParameterGroup {

    /**
     * The description for the Cache Parameter Group. 
     */
    private String Description;

    /**
     * A comma-delimited list of parameter name/value pairs. For more information, go to ModifyCacheParameterGroup in the Amazon ElastiCache API Reference Guide. 
     */
    private String Properties;

    /**
     * The name of the cache parameter group family that the cache parameter group can be used with. 
     */
    private String CacheParameterGroupFamily;

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
     * @return the Properties
     */
    public String getProperties() {
        return Properties;
    }

    /**
     * @param Properties the Properties to set
     */
    public void setProperties(String Properties) {
	this.Properties = Properties;
    }

    /**
     * @return the CacheParameterGroupFamily
     */
    public String getCacheParameterGroupFamily() {
        return CacheParameterGroupFamily;
    }

    /**
     * @param CacheParameterGroupFamily the CacheParameterGroupFamily to set
     */
    public void setCacheParameterGroupFamily(String CacheParameterGroupFamily) {
	this.CacheParameterGroupFamily = CacheParameterGroupFamily;
    }


}