package corejava.POCs;

import java.util.Scanner;

public class OnlineshoppingPoc {

	public static void main(String[] args) {
		System.out.println("***************ONLINE SHOPPING SYSTEM***************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Available Categories :");
		System.out.println("1.Electronics, 2.Clothes, 3.Groceries,4.Exit");
		System.out.println("Enter your choice....");
		int choic = sc.nextInt(); int repeat;
		do {
			switch (choic) {
		case 1 -> {
			System.out.println("Electronics");
			System.out.println("Available products :");
			System.out.println("1.Mobile ,2.Laptop, 3.Earbuds, 4.Smart Watch");
			int mobile = 30000;
			int Laptop = 60000;
			int Earbuds = 2500;
			int SmartWatch = 1500;
			int afterDis = 0;
			int finalamt = 0;
			System.out.println("Enter the product name");
			int prod = sc.nextInt();
			String yn="";
			switch (prod) {
			case 1 -> {
				System.out.println("Price of the Mobile is " + mobile);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_mobile = mobile * quan;
				System.out.println("The total price of the mobile :" + total_price_of_mobile);
				if (total_price_of_mobile > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_mobile) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_mobile - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}
			case 2 -> {
				System.out.println("Price of the Laptop is " + Laptop);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_laptop = Laptop * quan;
				System.out.println("The total price of the Laptop: " + total_price_of_laptop);
				if (total_price_of_laptop > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_laptop) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_laptop - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}
			case 3 -> {
				System.out.println("Price of the Headphones is " + Earbuds);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_headphones = Earbuds * quan;
				System.out.println("The total price of the Headphones: " + total_price_of_headphones);
				if (total_price_of_headphones > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_headphones) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_headphones - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}
			case 4 -> {
				System.out.println("Price of the Smart Watch is " + SmartWatch);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_smartwatch = SmartWatch * quan;
				System.out.println("Bill Preview");
				System.out.println("The total price of the Smart Watch: " + total_price_of_smartwatch);

				if (total_price_of_smartwatch > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_smartwatch) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_smartwatch - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}
			default -> {
				System.out.println("Invalid Product Choice");
			}
			}

		}
		case 2 -> {
			System.out.println("Clothes");
			System.out.println("Available products :");
			System.out.println("1.Tshirt ,2.Jeans, 3.Shirt, 4.Jacket");
			int Tshirt = 500;
			int Jeans = 1200;
			int Shirt = 800;
			int Jacket = 2500;
			int afterDis = 0;
			int finalamt = 0;
			System.out.println("Enter the product name");
			int prod = sc.nextInt();
			switch (prod) {
			case 1 -> {
				System.out.println("Price of the T-Shirt is " + Tshirt);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_tshirt = Tshirt * quan;
				System.out.println("The total price of the T-Shirt: " + total_price_of_tshirt);
				if (total_price_of_tshirt > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_tshirt) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_tshirt - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 2 -> {
				System.out.println("Price of the Jeans is " + Jeans);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_jeans = Jeans * quan;
				System.out.println("The total price of the Jeans: " + total_price_of_jeans);
				if (total_price_of_jeans > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_jeans) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_jeans - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 3 -> {
				System.out.println("Price of the Shirt is " + Shirt);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_shirt = Shirt * quan;
				System.out.println("The total price of the Shirt: " + total_price_of_shirt);
				if (total_price_of_shirt > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_shirt) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_shirt - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 4 -> {
				System.out.println("Price of the Jacket is " + Jacket);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_jacket = Jacket * quan;
				System.out.println("The total price of the Jacket: " + total_price_of_jacket);
				if (total_price_of_jacket > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_jacket) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_jacket - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			default -> {
				System.out.println("Invalid Clothing Choice");
			}
			}
		}

		case 3 -> {
			System.out.println("Groceries");
			System.out.println("Available products :");
			System.out.println("1.Rice ,2.Sugar, 3.Milk, 4.CookingOil");
			int Rice = 60;
			int Sugar = 45;
			int Milk = 60;
			int CookingOil = 150;
			int afterDis = 0;
			int finalamt = 0;
			System.out.println("Enter the product name");
			int prod = sc.nextInt();
			switch (prod) {
			case 1 -> {
				System.out.println("Price of the Rice is " + Rice);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_rice = Rice * quan;
				System.out.println("The total price of the Rice: " + total_price_of_rice);
				if (total_price_of_rice > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_rice) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_rice - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 2 -> {
				System.out.println("Price of the Sugar is " + Sugar);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_sugar = Sugar * quan;
				System.out.println("The total price of the Sugar: " + total_price_of_sugar);
				if (total_price_of_sugar > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_sugar) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_sugar - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 3 -> {
				System.out.println("Price of the Milk is " + Milk);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_milk = Milk * quan;
				System.out.println("The total price of the Milk: " + total_price_of_milk);
				if (total_price_of_milk > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_milk) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_milk - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			case 4 -> {
				System.out.println("Price of the Cooking Oil is " + CookingOil);
				System.out.println("Enter the product quantity");
				int quan = sc.nextInt();
				int total_price_of_oil = CookingOil * quan;
				System.out.println("The total price of the Cooking Oil: " + total_price_of_oil);
				if (total_price_of_oil > 10000) {
					System.out.println("Discount will apply at 5% for above 10,000");
					afterDis = (total_price_of_oil) * 5 / 100;
					System.out.println("The discount applied  the amount will be: " + afterDis);
					finalamt = total_price_of_oil - afterDis;
					System.out.println("The final Amount of the Product :" + finalamt);
				} else {
					System.out.println("Your are not eligible for discount");
				}
				break;
			}

			default -> {
				System.out.println("Invalid Grocery Choice");
			}
			}
		}
		case 4-> {
			System.out.println("Thanks for your Shopping!!!!");
			break;
		}
		default -> {
			System.out.println("Invalid Product Choice");
		}
		}
		System.out.println("Do you want to continue the Shopping");
        System.out.println("1. Yes");
        System.out.println("2. No");
        repeat = sc.nextInt();
		
		} while(repeat==1);
		
		System.out.println("Shopping Completed!!!!!!");
		
		sc.close();
	}
}
		
	


