package org.platform.aws.sections;

/**
 * @See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#parameters-section-structure-syntax
 * @author inakirodriguez
 *
 */
public class AWSParam {
	
	public AWSParam() {
		this.Type = "String";
	}
	
	// A regular expression that represents the patterns to allow for String types.
    // Required: No
	private String AllowedPattern;
	
	// An array containing the list of values allowed for the parameter.
    // Required: No
	private String AllowedValues;
	
	// A string that explains a constraint when the constraint is violated. For example, without a constraint description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user specifies an invalid value:
	// Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
    // By adding a constraint description, such as must only contain upper and lowercase letters, and numbers, you can display the following customized error message:
    // Malformed input-Parameter MyParameter must only contain upper and lower case letters and numbers
    // Required: No
	private String ConstraintDescription;
	
    // A value of the appropriate type for the template to use if no value is specified when a stack is created. If you define constraints for the parameter, you must specify a value that adheres to those constraints.
    // Required: No
	private String Default;
	
	// A string of up to 4000 characters that describes the parameter.
    // Required: No
	private String Description;
	
    // An integer value that determines the largest number of characters you want to allow for String types.
    // Required: No
	private String MaxLength;
	
	// A numeric value that determines the largest numeric value you want to allow for Number types.
	// Required: No
	private String MaxValue;
	
	// An integer value that determines the smallest number of characters you want to allow for String types.
    // Required: No
	private String MinLength;
	
	// A numeric value that determines the smallest numeric value you want to allow for Number types.
    // Required: No
	private String MinValue;
	
    // Whether to mask the parameter value when a call is made that describes the stack. If you set the value to true, the parameter value is masked with asterisks (*****).
    // Required: No
	private String NoEcho;
	
	// The data type for the parameter (DataType).
    // Required: Yes
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

	public String getAllowedPattern() {
		return AllowedPattern;
	}

	public void setAllowedPattern(String allowedPattern) {
		AllowedPattern = allowedPattern;
	}

	public String getAllowedValues() {
		return AllowedValues;
	}

	public void setAllowedValues(String allowedValues) {
		AllowedValues = allowedValues;
	}

	public String getConstraintDescription() {
		return ConstraintDescription;
	}

	public void setConstraintDescription(String constraintDescription) {
		ConstraintDescription = constraintDescription;
	}

	public String getDefault() {
		return Default;
	}

	public void setDefault(String default1) {
		Default = default1;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMaxLength() {
		return MaxLength;
	}

	public void setMaxLength(String maxLength) {
		MaxLength = maxLength;
	}

	public String getMaxValue() {
		return MaxValue;
	}

	public void setMaxValue(String maxValue) {
		MaxValue = maxValue;
	}

	public String getMinLength() {
		return MinLength;
	}

	public void setMinLength(String minLength) {
		MinLength = minLength;
	}

	public String getMinValue() {
		return MinValue;
	}

	public void setMinValue(String minValue) {
		MinValue = minValue;
	}

	public String getNoEcho() {
		return NoEcho;
	}

	public void setNoEcho(String noEcho) {
		NoEcho = noEcho;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	

}
