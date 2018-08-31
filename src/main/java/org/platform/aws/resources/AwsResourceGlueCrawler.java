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
public class AwsResourceGlueCrawler {

    /**
     * The Amazon Resource Name (ARN) of an IAM role that's used to access customer resources, such as Amazon S3 data. 
     */
    private String Role;

    /**
     * A list of UTF-8 strings that specify the custom classifiers that are associated with the crawler. 
     */
    private String Classifiers;

    /**
     * A description of the crawler and where it should be used. It must match the URI address multi-line string pattern: [\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]* 
     */
    private String Description;

    /**
     * Crawler configuration information. This versioned JSON string allows users to specify aspects of a crawler's behavior. For more information, see Configuring a Crawler.. 
     */
    private String Configuration;

    /**
     * The policy that specifies update and delete behaviors for the crawler. 
     */
    private String SchemaChangePolicy;

    /**
     * The schedule for the crawler. 
     */
    private String Schedule;

    /**
     * The name of the database where the crawler's output is stored. 
     */
    private String DatabaseName;

    /**
     * The crawler targets. 
     */
    private String Targets;

    /**
     * The table prefix that's used for catalog tables that are created. 
     */
    private String TablePrefix;

    /**
     * The name of the crawler. Must match the single-line string pattern: [\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]* 
     */
    private String Name;

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
	this.Role = Role;
    }

    /**
     * @return the Classifiers
     */
    public String getClassifiers() {
        return Classifiers;
    }

    /**
     * @param Classifiers the Classifiers to set
     */
    public void setClassifiers(String Classifiers) {
	this.Classifiers = Classifiers;
    }

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
     * @return the Configuration
     */
    public String getConfiguration() {
        return Configuration;
    }

    /**
     * @param Configuration the Configuration to set
     */
    public void setConfiguration(String Configuration) {
	this.Configuration = Configuration;
    }

    /**
     * @return the SchemaChangePolicy
     */
    public String getSchemaChangePolicy() {
        return SchemaChangePolicy;
    }

    /**
     * @param SchemaChangePolicy the SchemaChangePolicy to set
     */
    public void setSchemaChangePolicy(String SchemaChangePolicy) {
	this.SchemaChangePolicy = SchemaChangePolicy;
    }

    /**
     * @return the Schedule
     */
    public String getSchedule() {
        return Schedule;
    }

    /**
     * @param Schedule the Schedule to set
     */
    public void setSchedule(String Schedule) {
	this.Schedule = Schedule;
    }

    /**
     * @return the DatabaseName
     */
    public String getDatabaseName() {
        return DatabaseName;
    }

    /**
     * @param DatabaseName the DatabaseName to set
     */
    public void setDatabaseName(String DatabaseName) {
	this.DatabaseName = DatabaseName;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
    }

    /**
     * @return the TablePrefix
     */
    public String getTablePrefix() {
        return TablePrefix;
    }

    /**
     * @param TablePrefix the TablePrefix to set
     */
    public void setTablePrefix(String TablePrefix) {
	this.TablePrefix = TablePrefix;
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