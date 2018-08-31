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
public class AwsResourceWafregionalBytematchset {

    /**
     * Settings for the ByteMatchSet, such as the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests. 
     */
    private String ByteMatchTuples;

    /**
     * A friendly name or description of the ByteMatchSet. 
     */
    private String Name;

    /**
     * @return the ByteMatchTuples
     */
    public String getByteMatchTuples() {
        return ByteMatchTuples;
    }

    /**
     * @param ByteMatchTuples the ByteMatchTuples to set
     */
    public void setByteMatchTuples(String ByteMatchTuples) {
	this.ByteMatchTuples = ByteMatchTuples;
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