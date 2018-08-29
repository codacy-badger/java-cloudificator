package org.platform.aws.sections.sub;

// @See https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html
public class AWSOutput {
	
	// An identifier for the current output. The logical ID must be alphanumeric (a-z, A-Z, 0-9) and unique within the template.
	private String Logical_ID;

	// (optional)
	// A String type that describes the output value. The value for the description declaration must be a literal string that is between 0 and 1024 bytes in length. You cannot use a parameter or function to specify the description. The description can be a maximum of 4 K in length.
	private String Description;

    // (required)
	// The value of the property returned by the aws cloudformation describe-stacks command. The value of an output can include literals, parameter references, pseudo-parameters, a mapping value, or intrinsic functions.
    private String Value;

    // (optional)
    private String Export;

	public String getLogical_ID() {
		return Logical_ID;
	}

	public void setLogical_ID(String logical_ID) {
		Logical_ID = logical_ID;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public String getExport() {
		return Export;
	}

	public void setExport(String export) {
		Export = export;
	}
    
    

}
