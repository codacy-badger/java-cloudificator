package org.utils;

/**
 * @author inakirodriguez
 *
 */
public class MainUtils {
	
	// Loop all lines and replace the lines '! ****** ' for ! ******
	public static String getRemovedQuoteForIntrinsecFunctions(String inputString) {		
		String stringToBeFixed = inputString;
		
		final String CHAR_SINGLE_QUOTE = "'";
		final String CHAR_SINGLE_QUOTE_PLUS_EXCLAMATION = "'!";
		final String CHAR_NEW_LINE = "\n";
		final String CHAR_EMPTY = "";
		
		StringBuilder stringBuffer = new StringBuilder();
		String[] lines = stringToBeFixed.split(CHAR_NEW_LINE);
		for(String line : lines) {
			if(line.contains(CHAR_SINGLE_QUOTE_PLUS_EXCLAMATION) && line.endsWith(CHAR_SINGLE_QUOTE)) {
				String lineToModify = line;
				lineToModify = lineToModify.replaceFirst(CHAR_SINGLE_QUOTE, CHAR_EMPTY);
				lineToModify = lineToModify.substring(0, lineToModify.length()-1);
				stringBuffer.append(lineToModify);
				stringBuffer.append(CHAR_NEW_LINE);
			}else {
				stringBuffer.append(line);
				stringBuffer.append(CHAR_NEW_LINE);
			}
		}
		return stringBuffer.toString();
	}

}
