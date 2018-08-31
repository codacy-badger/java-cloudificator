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
public class AwsResourceAthenaNamedquery {

    /**
     * A brief description of the query. 
     */
    private String Description;

    /**
     * The SQL query statements that comprise the query. 
     */
    private String QueryString;

    /**
     * The database to which the query belongs. 
     */
    private String Database;

    /**
     * The plain-language name of the query. 
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
     * @return the QueryString
     */
    public String getQueryString() {
        return QueryString;
    }

    /**
     * @param QueryString the QueryString to set
     */
    public void setQueryString(String QueryString) {
	this.QueryString = QueryString;
    }

    /**
     * @return the Database
     */
    public String getDatabase() {
        return Database;
    }

    /**
     * @param Database the Database to set
     */
    public void setDatabase(String Database) {
	this.Database = Database;
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