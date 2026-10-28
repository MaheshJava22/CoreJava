package corejava;

import java.util.Scanner;

public class Switchcase {

	void addition(int A, int B) {
		System.out.println("Sum of two numbers A+B :" + (A + B));
	}

	void subtraction(int A, int B) {

		System.out.println("Subtraction of two numbers A-B :" + (A - B));
	}

	void multiplication(int A, int B) {

		System.out.println("Product of two numbers A*B :" + (A * B));
	}

	void Division(int A, int B) {

		System.out.println("Division of two numbers A/B :" + (A / B));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int A = sc.nextInt();
		System.out.println("Enter B Number");
		int B = sc.nextInt();
		System.out.println("Enter a sym");
		int sym = sc.next().charAt(0);
		Switchcase op = new Switchcase();
		switch (sym) {
		case '+':
			op.addition(A, B);
			break;
		case '-':
			op.subtraction(A, B);
			break;
		case '*':
			op.multiplication(A, B);
			break;
		case '/':
			op.Division(A, B);
			break;
		default:
			System.out.println("Entered symbol is invaild");
		}
		sc.close();
	}

}
