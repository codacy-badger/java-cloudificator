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
package org.utils;

import java.lang.reflect.Field;

import org.platform.aws.MandatoryPropertyType;
import org.platform.aws.sections.sub.AWSResource;

/**
 * The Class MainUtils.
 *
 * @author inakirodriguez
 */
public class MainUtils {

    private MainUtils() {
    }

    /**
     * Gets the removed quote for intrinsec functions.
     *
     * @param inputString the input string
     * @return the removed quote for intrinsec functions
     */
    // Loop all lines and replace the lines '! ****** ' for ! ******
    public static String getRemovedQuoteForIntrinsecFunctions(String inputString) {
	String stringToBeFixed = inputString;

	final String CHAR_SINGLE_QUOTE = "'";
	final String CHAR_SINGLE_QUOTE_PLUS_EXCLAMATION = "'!";
	final String CHAR_NEW_LINE = "\n";
	final String CHAR_EMPTY = "";

	StringBuilder stringBuffer = new StringBuilder();
	String[] lines = stringToBeFixed.split(CHAR_NEW_LINE);
	for (String line : lines) {
	    if (line.contains(CHAR_SINGLE_QUOTE_PLUS_EXCLAMATION) && line.endsWith(CHAR_SINGLE_QUOTE)) {
		String lineToModify = line;
		lineToModify = lineToModify.replaceFirst(CHAR_SINGLE_QUOTE, CHAR_EMPTY);
		lineToModify = lineToModify.substring(0, lineToModify.length() - 1);
		stringBuffer.append(lineToModify);
		stringBuffer.append(CHAR_NEW_LINE);
	    } else {
		stringBuffer.append(line);
		stringBuffer.append(CHAR_NEW_LINE);
	    }
	}
	return stringBuffer.toString();
    }

    /**
     * Checks for required fields missing value.
     *
     * @param awsParam
     *
     * @param awsParam the class to check
     * @return true, if successful
     * @throws NoSuchFieldException     the no such field exception
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     */
    public static boolean hasRequiredFieldsMissingValue(AWSResource awsParam)
	    throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException {
	Field mainField = awsParam.getClass().getDeclaredField("Properties");
	Field[] fieldsToCheck = Class.forName(mainField.getType().getName()).getDeclaredFields();

	for (Field field : fieldsToCheck) {
	    if (field.isAnnotationPresent(MandatoryPropertyType.class)) {
		// String fieldName = field.getName();
		Object instance = mainField.get(awsParam);
		Object myString = field.get(instance);

		if (myString == null) {
		    return true;
		}
	    }
	}

	return false;
    }

}
