package string_logical_questions;
//print the given string
public class C {
	public static void main(String[] args) {
		String str="   pankaj sir academy    ";

	for(int i=0;i <= str.length()-1;i++) {
	System.out.print(str.charAt(i));
	
	}
	//no of words in string it counts on basis of splitter that white space
	//but it take into  account string left side spaces in count
	
	String[] s = str.split(" ");
	System.out.println(s.length);
	}
	

}