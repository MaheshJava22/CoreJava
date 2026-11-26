package corejava.loops;

import java.util.Scanner;

public class HeartPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Arow num :");
		int Arow = sc.nextInt();
		System.out.print("Enter a Bcol num :");
		int Bcol = sc.nextInt();
		for (int i=0;i<=Arow;i++) {
			for (int j=0;j<=Bcol;j++) {
				if(i==0&&(j==2||j==3||j==7||j==8)||
						(i==1&&(j==1||j==4||j==6||j==9))||
						(i==2&&(j==1||j==5||j==9))||
						(i==3&&(j==1||j==9))||
						(i==4&&(j==2||j==8))||
						(i==5&&(j==3||j==7))||
						(i==6&&(j==4||j==6))||
						(i==7&&(j==5))) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
				}
				}
			System.out.println();
			}
		
			
		}

	}


