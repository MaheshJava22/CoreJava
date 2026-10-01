//2.Create a Java program to:
//* Convert int → double.
//* Convert double → int.
//* Convert char → int.
//* Convert int → char.
//Display all converted values.
package corejava;

public class TypeCasting {

	public static void main(String[] args) {
		int A=2345; 
		double d= A; // Implicit Typecasting
		int B=(int)d;// Explicit TypeCasting
		int i='B';
		char c=(char)i;
		int I=(char)c;
		System.out.println("Value of A : " + A);
		System.out.println("Value of d : " + d);
		System.out.println("Value of B : " + B);
		System.out.println("Value of c : " + c);
		System.out.println("Value of I : " + I);
	

	}

}
