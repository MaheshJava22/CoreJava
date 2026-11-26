package corejava.loops.Patterns;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Arow:");
		int Arow=sc.nextInt();
		for (int i=1;i<=Arow;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();	
		

		}
	}
}

