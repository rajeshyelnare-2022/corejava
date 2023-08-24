package com.yelnare.rajesh;

import java.util.regex.*;
import java.io.*;
import java.util.*;


public class ReplaceString {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String str = "<portlet-name> xxx  </portlet-name>";
	    Pattern p = Pattern.compile("(?<=\\<portlet-name\\>)(\\s*.*\\s*)(?=\\<\\/portlet-name\\>)");
		
		Matcher m = p.matcher(str);
		
		if(m.find()) {
			String str2 = m.group(1);
			System.out.println(str2);
		}
		
		InputStream fis=new FileInputStream("C:\\junk\\portletxml1.txt");
	    BufferedReader br=new BufferedReader(new InputStreamReader(fis));
	    String line;
	    String [] triplet = new String[3];
	    List<String[]> portlet = new ArrayList<String[]>();
	     int i = 1;
	    while((line=br.readLine())!=null) {
	         
	            if(i > 3)
	            {
	            	portlet.add(triplet);
	            	i = 1;
	            	triplet = new String[3];	   
	            }
	            
	            	triplet[i-1] = line;
	            	i++;
	            
	        }
	    for(String[] s : portlet )
	    	System.out.println(">"+s[0]+" "+s[1]+" "+s[2]);

	}
	
//	private static String returnReplace(String )

}
