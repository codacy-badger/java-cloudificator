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
public class AwsResourceGlueClassifier {

    /**
     * A classifier for XML content. 
     */
    private String XMLClassifier;

    /**
     * A classifier for JSON content. 
     */
    private String JsonClassifier;

    /**
     * A classifier that uses grok. 
     */
    private String GrokClassifier;

    /**
     * @return the XMLClassifier
     */
    public String getXMLClassifier() {
        return XMLClassifier;
    }

    /**
     * @param XMLClassifier the XMLClassifier to set
     */
    public void setXMLClassifier(String XMLClassifier) {
	this.XMLClassifier = XMLClassifier;
    }

    /**
     * @return the JsonClassifier
     */
    public String getJsonClassifier() {
        return JsonClassifier;
    }

    /**
     * @param JsonClassifier the JsonClassifier to set
     */
    public void setJsonClassifier(String JsonClassifier) {
	this.JsonClassifier = JsonClassifier;
    }

    /**
     * @return the GrokClassifier
     */
    public String getGrokClassifier() {
        return GrokClassifier;
    }

    /**
     * @param GrokClassifier the GrokClassifier to set
     */
    public void setGrokClassifier(String GrokClassifier) {
	this.GrokClassifier = GrokClassifier;
    }


}