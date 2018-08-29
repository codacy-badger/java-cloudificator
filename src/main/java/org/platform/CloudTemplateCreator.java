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
package org.platform;

/**
 * Do not allow this class as an instance, instead create an specific template type class
 * @author inakirodriguez
 *
 */
public abstract class CloudTemplateCreator {
	
	// Make it transient to be ignored when serialization, like JSON representation
	public transient String templateType;
	public transient String templateFilename;
	
	public static final String AWS = "AWS_platform";
	public static final String AWS_TEMPLATE_VERSION_20100909 = "2010-09-09";
	
	abstract public void createTemplate();
	
	abstract public String generateTemplateJSON();
	
	abstract public String generateTemplateYAML();
	

}
