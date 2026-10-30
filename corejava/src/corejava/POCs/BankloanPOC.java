//Check whether the customer is eligible for the loan.
//If eligible, ask for the loan amount and duration.
//Calculate the total interest and repayment amount.
//Display an error for an invalid loan type.

package corejava.POCs;

import java.util.Scanner;

public class BankloanPOC {

	public static void main(String[] args) {
		System.out.println("**************BANK LOAN MANAGEMENT**************");
		System.out.println("Available Bank Loans : ");
		System.out.println("1.Home Loan");
		System.out.println("2.Personal Loan");
		System.out.println("3.Vecihle Loan");
		System.out.println("4.Education Loan");
		System.out.println("5.Business Loan");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a Loan type");
		int loantype = sc.nextInt();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your monthly salary");
		long salary = sc.nextLong();
		if (age > 18) {
			System.out.println("You are eligible to take a loan");
		} else {
			System.out.println("You are not eligible to take a loan");
		}

		switch (loantype) {
		case 1 -> {
			System.out.println("Home Loan");
			System.out.println("Enter Your loan amount");
			long Amnt = sc.nextLong();
			System.out.println("Enter Your loan Duration");
			int time = sc.nextInt();
			double rate = 8;
			double SI = (Amnt * time * rate) / 100;
			double monthlyemi = SI / 12;
			System.out.println("Monthly EMI : " + monthlyemi);
			System.out.println("Simple Interest :" + SI);
			System.out.println("Total Amount :" + (Amnt + SI));
			break;
		}
		case 2 -> {
			System.out.println("Personal Loan");
			System.out.println("Enter Your loan amount");
			long Amnt = sc.nextLong();
			System.out.println("Enter Your loan Duration");
			int time = sc.nextInt();
			double rate = 12;
			double SI = (Amnt * time * rate) / 100;
			double monthlyemi = SI / 12;
			System.out.println("Monthly EMI : " + monthlyemi);
			System.out.println("Interest: " + SI);
			System.out.println("Total Amount: " + (Amnt + SI));
			break;
		}

		case 3 -> {
			System.out.println("Vechile Loan");
			System.out.println("Enter Your loan amount");
			long Amnt = sc.nextLong();
			System.out.println("Enter Your loan Duration");
			int time = sc.nextInt();
			double rate = 9;
			double SI = (Amnt * time * rate) / 100;
			double monthlyemi = SI / 12;
			System.out.println("Monthly EMI : " + monthlyemi);
			System.out.println("Interest: " + SI);
			System.out.println("Total Amount: " + (Amnt + SI));
			break;
		}

		case 4 -> {
			System.out.println("Education Loan");
			System.out.println("Enter Your loan amount");
			long Amnt = sc.nextLong();
			System.out.println("Enter Your loan Duration");
			int time = sc.nextInt();
			double rate = 6;
			double SI = (Amnt * time * rate) / 100;
			double monthlyemi = SI / 12;
			System.out.println("Monthly EMI : " + monthlyemi);
			System.out.println("Total Interest Amount: " + SI);
			System.out.println("Total Amount: " + (Amnt + SI));
			break;
		}
		case 5 -> {
		    System.out.println("Business Loan");
		    System.out.println("Enter Your loan amount");
		    long Amnt = sc.nextLong();
		    System.out.println("Enter Your loan Duration (Years)");
		    int time = sc.nextInt();
		    double rate = 11;
		    double SI = (Amnt * time * rate) / 100;
		    double monthlyemi = SI / 12;
			System.out.println("Monthly EMI : " + monthlyemi);
		    System.out.println("Simple Interest: " + SI);
		    System.out.println("Total Amount: " + (Amnt + SI));
		}

		default -> {
			System.out.println("Invalid Loan Type");
			sc.close();
		}

		}

	}

}
