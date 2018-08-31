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
public class AwsResourceGameliftAlias {

    /**
     * Information that helps you identify the purpose of this alias. 
     */
    private String Description;

    /**
     * A routing configuration that specifies where traffic is directed for this alias, such as to a fleet or to a message. 
     */
    private String RoutingStrategy;

    /**
     * An identifier to associate with this alias. Alias names don't need to be unique. 
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
     * @return the RoutingStrategy
     */
    public String getRoutingStrategy() {
        return RoutingStrategy;
    }

    /**
     * @param RoutingStrategy the RoutingStrategy to set
     */
    public void setRoutingStrategy(String RoutingStrategy) {
	this.RoutingStrategy = RoutingStrategy;
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