package corejava;

import java.util.Scanner;

public class AtmWithdrawal {

	public static void main(String[] args) {
		int Correctpin = 7386;
		int AccBal = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pin...");
		int Pin = sc.nextInt();
		if (Pin == Correctpin) {
			System.out.println("Your pin is Correct");
			System.out.println("Enter your Requried Amount...");
			int Amount = sc.nextInt();
			if (Amount > 0) {
				if (Amount % 100 == 0) {
					if (Amount <= AccBal) {
						AccBal = AccBal - Amount;
						System.out.println(" Transaction is done...Withdrawl is Successful");
						System.out.println("The remaining amount in the AccBal is: " + AccBal);
					} else {
						System.out.println(" Withdrawl is Unsuccessful ");
					}
				} else {
					System.out.println(" Please enter amount as  multiples of  100 ");
				}
			} else {
				System.out.println(" Entered Amount is invaild... please enter correct Amount");
			}
		} else {
			System.out.println("Your pin is incorrect.....Please enter correct pin");
		}
		sc.close();
	}

}
