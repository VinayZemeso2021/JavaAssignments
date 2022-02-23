package com.company.practice.stringPractice;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		String s1="vinayak";
		String s2="ViNaYak";
		
		String s3="";
		String s4="";
		
		for (int i = 0; i < s1.length(); i++) 
		{
			char ch=s1.charAt(i);
			if(ch<'A' || ch>'Z')
				ch=(char)(ch-32);
			
			s3=s3+ch;
		}
		//System.out.println(s3);
		
		for (int i = 0; i < s2.length(); i++) 
		{
			char ch=s2.charAt(i);
			if(ch<'A' || ch>'Z')
				ch=(char)(ch-32);
			
			s4=s4+ch;
		}
		//System.out.println(s4);

		int i = 0;
		for (; i < s3.length() && i<s4.length(); i++) 
		{
			if(s3.charAt(i)!=s4.charAt(i))
			{
				System.out.println(s3.charAt(i)-s4.charAt(i));
				break;
			}
		}
		if(i==s3.length() || i==s4.length())
		{
			System.out.println(s3.length()-s4.length());
		}

	}

}
