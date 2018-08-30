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
package org.platform.aws.sections;

import java.util.HashMap;

/**
 * The Class SectionConditions.
 *
 * @author Inaki Rodriguez
 */
public class SectionConditions {

    /** The values. */
    public HashMap<String, String> values = new HashMap<>();

    /**
     * Instantiates a new section conditions.
     */
    public SectionConditions() {
	values = new HashMap<>();
    }

    /**
     * Adds the condition.
     *
     * @param conditionName the condition name
     * @param conditionItem the condition item
     */
    public void addCondition(String conditionName, String conditionItem) {
	values.put(conditionName, conditionItem);
    }

    /**
     * Gets the properties.
     *
     * @return the properties
     */
    public HashMap<String, String> getProperties() {
	return values;
    }

}
