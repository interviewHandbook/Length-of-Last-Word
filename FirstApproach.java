package com.interviewPrep.leetcode.easy.lengthoflastword;

public class FirstApproach {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		FirstApproach fa = new FirstApproach();
		int len = fa.lengthOfLastWord(s);
		
		
		System.out.println("Length of last word: " + len);
	}
	
	/*
	 * function to compute length of last word
	 * input string -> String s = "Hello World";
	 */
	 public int lengthOfLastWord(String s) {
		 
		 int len = 0;
		 
		 // split on " " to extract individual words out in an array
		 String[] inputArr = s.split(" ");
		 
		 // store the length of the last word 
		 len = inputArr[inputArr.length-1].length();
		 
		 // return this length
		 return len;
	 }

}
