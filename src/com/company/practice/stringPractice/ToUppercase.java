package com.company.practice.stringPractice;

public class ToUppercase {

	public static void main(String[] args) {
		String s1="vinayak";
		
		String s3="";
		
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch<'A'&& ch>'Z')
				ch=(char)(ch-32);
			
			s3=s3+ch;
		}
		System.out.println(s3);
	}

}
