
package corejava.loops.Patterns;

public class Butterflypatt {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			// Left side stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// Spaces in middle
			for (int j = 1; j <= 2 * (5 - i); j++) {
				System.out.print("  ");
			}

			// Right side stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 4; i >= 1; i--) {

			// Left side stars
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			// Spaces in middle
			for (int j = 1; j <= 2 * (5 - i); j++) {
				System.out.print("  ");
			}

			// Right side stars
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
