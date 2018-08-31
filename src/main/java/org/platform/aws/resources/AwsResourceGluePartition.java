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
public class AwsResourceGluePartition {

    /**
     * The name of the metadata table to create the partition in. 
     */
    private String TableName;

    /**
     * The name of the catalog database to create the partition in. It must match the single-line string pattern: [\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]* 
     */
    private String DatabaseName;

    /**
     * The ID of the data catalog to create the catalog object in. Currently, this should be the AWS account ID. 
     */
    private String CatalogId;

    /**
     * The metadata of the partition. 
     */
    private String PartitionInput;

    /**
     * @return the TableName
     */
    public String getTableName() {
        return TableName;
    }

    /**
     * @param TableName the TableName to set
     */
    public void setTableName(String TableName) {
	this.TableName = TableName;
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
     * @return the CatalogId
     */
    public String getCatalogId() {
        return CatalogId;
    }

    /**
     * @param CatalogId the CatalogId to set
     */
    public void setCatalogId(String CatalogId) {
	this.CatalogId = CatalogId;
    }

    /**
     * @return the PartitionInput
     */
    public String getPartitionInput() {
        return PartitionInput;
    }

    /**
     * @param PartitionInput the PartitionInput to set
     */
    public void setPartitionInput(String PartitionInput) {
	this.PartitionInput = PartitionInput;
    }


}