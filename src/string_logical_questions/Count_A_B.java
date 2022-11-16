package string_logical_questions;

import java.util.Scanner;

public class Count_A_B {
	public static void main(String[] args) {
		//String str="aaabbbaaaabbbbaabbb";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the a and b:");
		String str = scan.next();
		int count1=0; 
		int count2=0;
		
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)=='a')){
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("Number of a in given string:"+count1);
		System.out.println("Number of b in given string:"+count2);
	}

}
