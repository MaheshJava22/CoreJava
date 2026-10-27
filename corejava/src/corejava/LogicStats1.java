package corejava;

import java.util.Scanner;

public class LogicStats1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks...");
		int Marks=sc.nextInt();
		if(Marks>100 && Marks<0) {
			System.out.println("Your marks are Invalid ");
		}else if (Marks>=90) {
			System.out.println("Grade A ");
		}else if (Marks>=80) {
			System.out.println("Grade B ");
		}else if (Marks>=70) {
			System.out.println("Grade C ");
		}else if (Marks>69) {
			System.out.println("Grade D ");
		}else if (Marks<60) {
			System.out.println("Fail ");
		}
			sc.close();
	}

}
