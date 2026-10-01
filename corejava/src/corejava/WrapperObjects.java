//1. Create a Java program to store the following student details using Wrapper Classes only:
//* Student ID → Integer
//* Student Name → String
//* Age → Integer
//* Marks → Double
//* Grade → Character
//* Passed → Boolean
//Display all student details.
package corejava;

public class WrapperObjects {
 public static void main(String args[]) {
	 Integer Studentid = 8366;
	 String Studentname = "P.Mahesh";
	 Integer Age= 22;
	 Double Marks=160d;
	 Character Grade = 'A';
	 Boolean Passed= true;
	 System.out.println("Studentid : "+ Studentid);
	 System.out.println("Studentname : "+ Studentname);
	 System.out.println("Age : "+ Age);
	 System.out.println("Marks : "+ Marks);
	 System.out.println("Grade : "+ Grade);
	 System.out.println("Is Student Passed : "+ Passed);
 }
}
