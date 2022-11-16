package string_logical_questions_pattern;

//square
public class J {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("*" + "   ");
			}
			System.out.println("\n");

		}
		System.out.println("\n");

		for (int i1 = 0; i1 < 5; i1++) {

			for (int j1 = 0; j1 < 5; j1++) {

				if (i1 == 1 && j1 == 1

						|| i1 == 1 && j1 == 2

						|| i1 == 1 && j1 == 3

						|| i1 == 2 && j1 == 1

						|| i1 == 2 && j1 == 3

						|| i1 == 3 && j1 == 1

						|| i1 == 3 && j1 == 1

						|| i1 == 3 && j1 == 2

						|| i1 == 3 && j1 == 3

				) {
					System.out.print("  " + " ");
				} else {
					System.out.print("*" + "  ");
				}

			}
			System.out.println("\n");

		}

	}

}
