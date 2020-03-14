package com;
/**
 * 
 * This class includes string operations
 * concat
 * remove capital letters
 * replace vowels with #
 * @author vivek.singh
 *
 */
public class ReplaceString {
	
	private String stringOperations(String s)
	{
		 s=s+s;
		 s=s.replaceAll("[^a-z]","");
		 s=s.replace("a","#" );
		 s=s.replace("e","#" );
		 s=s.replace("i","#" );
		 s=s.replace("o","#" );
		 s=s.replace("u","#" );
		return s;
	}
	
	public static void main(String args[])
	{
		String S="Huge";
		ReplaceString replace= new ReplaceString();
		System.out.println(replace.stringOperations(S));
	}

}
