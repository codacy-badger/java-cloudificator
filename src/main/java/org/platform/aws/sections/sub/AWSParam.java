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
package org.platform.aws.sections.sub;

/**
 * The Class AWSParam.
 *
 * @author inakirodriguez
 * @See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#parameters-section-structure-syntax
 */
public class AWSParam {
	
	/**
	 * Instantiates a new AWS param.
	 */
	public AWSParam() {
		this.Type = "String";
	}
	
	// A regular expression that represents the patterns to allow for String types.
    /** The Allowed pattern. */
	// Required: No
	private String AllowedPattern;
	
	// An array containing the list of values allowed for the parameter.
    /** The Allowed values. */
	// Required: No
	private String AllowedValues;
	
	// A string that explains a constraint when the constraint is violated. For example, without a constraint description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user specifies an invalid value:
	// Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
    // By adding a constraint description, such as must only contain upper and lowercase letters, and numbers, you can display the following customized error message:
    // Malformed input-Parameter MyParameter must only contain upper and lower case letters and numbers
    /** The Constraint description. */
	// Required: No
	private String ConstraintDescription;
	
    // A value of the appropriate type for the template to use if no value is specified when a stack is created. If you define constraints for the parameter, you must specify a value that adheres to those constraints.
    /** The Default. */
    // Required: No
	private String Default;
	
	// A string of up to 4000 characters that describes the parameter.
    /** The Description. */
	// Required: No
	private String Description;
	
    // An integer value that determines the largest number of characters you want to allow for String types.
    /** The Max length. */
    // Required: No
	private String MaxLength;
	
	// A numeric value that determines the largest numeric value you want to allow for Number types.
	/** The Max value. */
	// Required: No
	private String MaxValue;
	
	// An integer value that determines the smallest number of characters you want to allow for String types.
    /** The Min length. */
	// Required: No
	private String MinLength;
	
	// A numeric value that determines the smallest numeric value you want to allow for Number types.
    /** The Min value. */
	// Required: No
	private String MinValue;
	
    // Whether to mask the parameter value when a call is made that describes the stack. If you set the value to true, the parameter value is masked with asterisks (*****).
    /** The No echo. */
    // Required: No
	private String NoEcho;
	
	// The data type for the parameter (DataType).
    // Required: Yes
	/** The Type. */
	/*
	 * AWS CloudFormation supports the following parameter types:
    String
        A literal string.
        For example, users could specify "MyUserName".
    Number
        An integer or float. AWS CloudFormation validates the parameter value as a number; however, when you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a string.
        For example, users could specify "8888".
    List<Number>
        An array of integers or floats that are separated by commas. AWS CloudFormation validates the parameter value as numbers; however, when you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a list of strings.
        For example, users could specify "80,20", and a Ref would result in ["80","20"].
    CommaDelimitedList
        An array of literal strings that are separated by commas. The total number of strings should be one more than the total number of commas. Also, each member string is space trimmed.
        For example, users could specify "test,dev,prod", and a Ref would result in ["test","dev","prod"].
    AWS-Specific Parameter Types
        AWS values such as Amazon EC2 key pair names and VPC IDs. For more information, see AWS-Specific Parameter Types.
    SSM Parameter Types
        Parameters that correspond to existing parameters in AWS Systems Manager Parameter Store. You specify a Systems Manager parameter key as the value of the SSM parameter, and AWS CloudFormation fetches the latest value from Parameter Store to use for the stack. For more information, see SSM Parameter Types. 
	 * */
	private String Type;

	/**
	 * Gets the allowed pattern.
	 *
	 * @return the allowed pattern
	 */
	public String getAllowedPattern() {
		return AllowedPattern;
	}

	/**
	 * Sets the allowed pattern.
	 *
	 * @param allowedPattern the new allowed pattern
	 */
	public void setAllowedPattern(String allowedPattern) {
		AllowedPattern = allowedPattern;
	}

	/**
	 * Gets the allowed values.
	 *
	 * @return the allowed values
	 */
	public String getAllowedValues() {
		return AllowedValues;
	}

	/**
	 * Sets the allowed values.
	 *
	 * @param allowedValues the new allowed values
	 */
	public void setAllowedValues(String allowedValues) {
		AllowedValues = allowedValues;
	}

	/**
	 * Gets the constraint description.
	 *
	 * @return the constraint description
	 */
	public String getConstraintDescription() {
		return ConstraintDescription;
	}

	/**
	 * Sets the constraint description.
	 *
	 * @param constraintDescription the new constraint description
	 */
	public void setConstraintDescription(String constraintDescription) {
		ConstraintDescription = constraintDescription;
	}

	/**
	 * Gets the default.
	 *
	 * @return the default
	 */
	public String getDefault() {
		return Default;
	}

	/**
	 * Sets the default.
	 *
	 * @param default1 the new default
	 */
	public void setDefault(String default1) {
		Default = default1;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		Description = description;
	}

	/**
	 * Gets the max length.
	 *
	 * @return the max length
	 */
	public String getMaxLength() {
		return MaxLength;
	}

	/**
	 * Sets the max length.
	 *
	 * @param maxLength the new max length
	 */
	public void setMaxLength(String maxLength) {
		MaxLength = maxLength;
	}

	/**
	 * Gets the max value.
	 *
	 * @return the max value
	 */
	public String getMaxValue() {
		return MaxValue;
	}

	/**
	 * Sets the max value.
	 *
	 * @param maxValue the new max value
	 */
	public void setMaxValue(String maxValue) {
		MaxValue = maxValue;
	}

	/**
	 * Gets the min length.
	 *
	 * @return the min length
	 */
	public String getMinLength() {
		return MinLength;
	}

	/**
	 * Sets the min length.
	 *
	 * @param minLength the new min length
	 */
	public void setMinLength(String minLength) {
		MinLength = minLength;
	}

	/**
	 * Gets the min value.
	 *
	 * @return the min value
	 */
	public String getMinValue() {
		return MinValue;
	}

	/**
	 * Sets the min value.
	 *
	 * @param minValue the new min value
	 */
	public void setMinValue(String minValue) {
		MinValue = minValue;
	}

	/**
	 * Gets the no echo.
	 *
	 * @return the no echo
	 */
	public String getNoEcho() {
		return NoEcho;
	}

	/**
	 * Sets the no echo.
	 *
	 * @param noEcho the new no echo
	 */
	public void setNoEcho(String noEcho) {
		NoEcho = noEcho;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return Type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		Type = type;
	}
	
	

}
