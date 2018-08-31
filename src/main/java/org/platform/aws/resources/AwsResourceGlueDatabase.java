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
public class AwsResourceGlueDatabase {

    /**
     * The metadata of the database. 
     */
    private String DatabaseInput;

    /**
     * The ID of the data catalog to create the catalog object in. Currently, this should be the AWS account ID. 
     */
    private String CatalogId;

    /**
     * @return the DatabaseInput
     */
    public String getDatabaseInput() {
        return DatabaseInput;
    }

    /**
     * @param DatabaseInput the DatabaseInput to set
     */
    public void setDatabaseInput(String DatabaseInput) {
	this.DatabaseInput = DatabaseInput;
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


}