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
public class AwsResourceGameliftBuild {

    /**
     * A version to associate with this build. Version is useful if you want to track updates to your build package files. Versions don't need to be unique. 
     */
    private String Version;

    /**
     * The Amazon Simple Storage Service (Amazon S3) location where your build package files are located. 
     */
    private String StorageLocation;

    /**
     * An identifier to associate with this build. Build names don't need to be unique. 
     */
    private String Name;

    /**
     * @return the Version
     */
    public String getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String Version) {
	this.Version = Version;
    }

    /**
     * @return the StorageLocation
     */
    public String getStorageLocation() {
        return StorageLocation;
    }

    /**
     * @param StorageLocation the StorageLocation to set
     */
    public void setStorageLocation(String StorageLocation) {
	this.StorageLocation = StorageLocation;
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