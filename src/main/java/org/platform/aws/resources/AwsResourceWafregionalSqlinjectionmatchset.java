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
public class AwsResourceWafregionalSqlinjectionmatchset {

    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header. 
     */
    private String SqlInjectionMatchTuples;

    /**
     * A friendly name or description of the SqlInjectionMatchSet. 
     */
    private String Name;

    /**
     * @return the SqlInjectionMatchTuples
     */
    public String getSqlInjectionMatchTuples() {
        return SqlInjectionMatchTuples;
    }

    /**
     * @param SqlInjectionMatchTuples the SqlInjectionMatchTuples to set
     */
    public void setSqlInjectionMatchTuples(String SqlInjectionMatchTuples) {
	this.SqlInjectionMatchTuples = SqlInjectionMatchTuples;
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