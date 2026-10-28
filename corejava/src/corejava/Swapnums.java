package corejava;

import java.util.Scanner;

public class Swapnums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int A = sc.nextInt();
		System.out.println("Enter B number");
		int B = sc.nextInt();
		int temp = 0;
		temp = A;
		A = B;
		B = temp;
		System.out.println("The Swapped Number A : " + A);
		System.out.println("The Swapped Number B: " + B);

		sc.close();
	}

}
