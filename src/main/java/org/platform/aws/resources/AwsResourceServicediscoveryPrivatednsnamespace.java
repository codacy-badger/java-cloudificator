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
public class AwsResourceServicediscoveryPrivatednsnamespace {

    /**
     * A description for the namespace. 
     */
    private String Description;

    /**
     * The ID of the Amazon VPC that you want to associate the namespace with. 
     */
    private String Vpc;

    /**
     * The name that you want to assign to this namespace. When you create a namespace, Route 53 automatically creates a hosted zone that has the same name as the namespace. 
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
     * @return the Vpc
     */
    public String getVpc() {
        return Vpc;
    }

    /**
     * @param Vpc the Vpc to set
     */
    public void setVpc(String Vpc) {
	this.Vpc = Vpc;
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