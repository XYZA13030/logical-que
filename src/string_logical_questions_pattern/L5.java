package string_logical_questions_pattern;

//square
public class L5 {
	public static void main(String[] args) {
		int n = 5;
		int x = 2;
		for (int i = 1; i <=n; i++) {

			for (int j = 1; j <=n; j++) {
				System.out.printf("%3d",x);
				x+=2;
			}
			System.out.print("\n");


		}
	}

}
