package string_logical_questions;

import java.util.Scanner;

public class F {
//	public static void main(String[] args) {
//		int count1 = 0;
//		int count2 = 0;
//		String str = "(())))";
//		for (int i = 0; i < str.length(); i++) {
//			System.out.print(str.charAt(i));
//
//			if (str.charAt(i) == '(') {
//				count1++;
//			} else if (str.charAt(i) == ')') {
//				count2++;
//
//			}
//
//		}
//		
//		if(count1==count2) {
//			System.out.println("No Error");
//		}else {
//			System.out.println("Error");
//		}
//		System.out.println(str.length());
//	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter opening and cosing paranthesis-():");
		
		String str = scan.next();
		
		int count1=0;
		int count2=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}else if(str.charAt(i)==')') {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("No Error");
		}else {
			System.out.println("Error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
