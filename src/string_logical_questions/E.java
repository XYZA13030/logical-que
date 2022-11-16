package string_logical_questions;

public class E {
public static void main(String[] args) {
	
	String str= "   pankaj sir academy   is     ";
	
	String[] s = str.trim().split(" ");
	System.out.println(s.length);
	
	for(String x: s) {
		System.out.print(x);
		
	}
}
}
