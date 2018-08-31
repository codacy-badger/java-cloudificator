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
public class AwsResourceWafregionalSizeconstraintset {

    /**
     * The size constraint and the part of the web request to check. 
     */
    private String SizeConstraints;

    /**
     * A friendly name or description for the SizeConstraintSet. 
     */
    private String Name;

    /**
     * @return the SizeConstraints
     */
    public String getSizeConstraints() {
        return SizeConstraints;
    }

    /**
     * @param SizeConstraints the SizeConstraints to set
     */
    public void setSizeConstraints(String SizeConstraints) {
	this.SizeConstraints = SizeConstraints;
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