package com.interviewPrep.leetcode.easy.lengthoflastword;

public class SecondApproach {

	public static void main(String[] args) {


		String s = "Hello World";
		
		SecondApproach sa = new SecondApproach();
		int len = sa.lengthOfLastWord(s);
		
		System.out.println("Length of last word: " + len);

	}
	
	/*
	 * function to compute length of last word
	 * input string -> String s = "Hello World";
	 */
	 public int lengthOfLastWord(String s) {
		 
		 int len = 0;
		 
		 // trim the leading and trailing spaces
		 s = s.trim();
		 
		 /*
		  * Iterate the array from last char until a space is encountered
		  */
		 for(int i= s.length()-1; i>=0; i--){
			 
			 // increment counter if char is encountered
			 if(s.charAt(i) != ' ') {
				 
				 len = len+1;
				 
			 }
			 // break out of loop when space is encountered
			 else {
				 break;
			 }
		 }
		 
		 // return counter
		 return len;
	 }

}
