package com.yelnare.rajesh;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTagx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "<portlet-name> xxx  </portlet-name>";
		
		System.out.println(replace(str,"portlet-name","tag2-new"));
		
		
	}
	public static String replace (String s, String origTag, String newTag) {
		
		String patternString = "(?<=\\<"+origTag+"\\>)(\\s*.*\\s*)(?=\\<\\/"+origTag+"\\>)";
	    //Pattern p = Pattern.compile("(?<=\\<portlet-name\\>)(\\s*.*\\s*)(?=\\<\\/portlet-name\\>)");
		Pattern p = Pattern.compile(patternString);
		Matcher m = p.matcher(s);
		String str2 = null;
		if(m.find()) {
			str2= m.group(1);
			System.out.println(str2);
		}
		return "<"+newTag+">"+str2+"</"+newTag+">";
	}

}
