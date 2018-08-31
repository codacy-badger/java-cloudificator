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
public class AwsResourceSagemakerNotebookinstancelifecycleconfig {

    /**
     * A shell script that runs once when you create a notebook instance, and then each time you start the notebook instance. 
     */
    private String OnStart;

    /**
     * The name of the lifecycle configuration. 
     */
    private String NotebookInstanceLifecycleConfigName;

    /**
     * A shell script that runs only once, when you create a notebook instance. 
     */
    private String OnCreate;

    /**
     * @return the OnStart
     */
    public String getOnStart() {
        return OnStart;
    }

    /**
     * @param OnStart the OnStart to set
     */
    public void setOnStart(String OnStart) {
	this.OnStart = OnStart;
    }

    /**
     * @return the NotebookInstanceLifecycleConfigName
     */
    public String getNotebookInstanceLifecycleConfigName() {
        return NotebookInstanceLifecycleConfigName;
    }

    /**
     * @param NotebookInstanceLifecycleConfigName the NotebookInstanceLifecycleConfigName to set
     */
    public void setNotebookInstanceLifecycleConfigName(String NotebookInstanceLifecycleConfigName) {
	this.NotebookInstanceLifecycleConfigName = NotebookInstanceLifecycleConfigName;
    }

    /**
     * @return the OnCreate
     */
    public String getOnCreate() {
        return OnCreate;
    }

    /**
     * @param OnCreate the OnCreate to set
     */
    public void setOnCreate(String OnCreate) {
	this.OnCreate = OnCreate;
    }


}