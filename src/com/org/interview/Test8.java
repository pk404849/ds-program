package com.org.interview;

public class Test8 {

	public static void main(String[] args) {

		StringBuffer s1= new StringBuffer("abc");
		StringBuffer s2=s1;
		s1.append("d");
		System.out.println(s1+":"+s2+(s1==s2));
	}

}
