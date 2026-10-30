package corejava;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		System.out.println("++++++++++++++++FOOD ORDERING SYSTEM++++++++++++++++");
		System.out.println("Available Menu:");
		System.out.println("1.Pizza -> 200rs");
		System.out.println("2.Burger -> 120rs");
		System.out.println("3.Biryani -> 180rs");
		System.out.println("4.Noodles -> 100rs");
		int Pizza=200; int Burger=120; int Biryani=180; int Noodles=100;
		int total_bill=0; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your desired Item");
		String choic=sc.next();
		switch (choic) {
		case "Pizza" ->{
			System.out.println("Your selected item is Pizza at cost of 200rs");
			System.out.println("Enter the requried quantity");
			int quan1=sc.nextInt();
			total_bill= Pizza*quan1;
			System.out.println("The total bill of the Pizza : "+total_bill);
			break;
		}
		case "Burger" ->{
			System.out.println("Your selected item is Burger at cost of 200rs");
			System.out.println("Enter the requried quantity");
			int quan1=sc.nextInt();
			total_bill= Burger*quan1;
			System.out.println("The total bill of the Pizza : "+total_bill);
			break;
		}
		case "Biryani" ->{
			System.out.println("Your selected item is Biryani at cost of 180rs");
			System.out.println("Enter the requried quantity");
			int quan1=sc.nextInt();
			total_bill= Biryani*quan1;
			System.out.println("The total bill of the Biryani : "+total_bill);
			break;
		}
		case "Noodles" ->{
			System.out.println("Your selected item is Noodles at cost of 200rs");
			System.out.println("Enter the requried quantity");
			int quan1=sc.nextInt();
			total_bill= Noodles*quan1;
			System.out.println("The total bill of the Noodles : "+total_bill);
			break;
		}
		default ->{
			System.out.println("Invaild choice ");
		}
		}
		sc.close();

	}

}



//Display the selected item, price, quantity, and total bill.