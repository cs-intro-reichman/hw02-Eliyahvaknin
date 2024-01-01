public class DamkaBoard {
	public static void main(String[] args) {
		int nam = Integer.parseInt(args[0]);

		for (int i = 0; i < nam; i++) {
			for (int j = 0; j < nam; j++) {

				if ((i + j) % 2 == 0) {
					System.out.print("*");

				}
				else {
					System.out.print(" ");
					System.out.print("* ");
					System.out.print(" ");


				}
			}
			System.out.println();
		}
	}
}
