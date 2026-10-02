//Create a Java program using void methods to perform the following operations:
//* Create a method displayStudentDetails() to display student name, roll number, and course.
//* Create a method calculateTotal() to calculate and display the total of 3 subject marks.
//* Create a method calculateAverage() to calculate and display the average marks.
//* Display student details, Call all methods.

package corejava;

public class Assignment6 {
	String Studentname;
	int Rollnumber;
	String Course;
	int Java,SQL,DSA;
	int Total;
	void displayStudentDetails() {
		
		System.out.println("Studentname : " + Studentname);
		System.out.println("Rollnumber : " + Rollnumber);
		System.out.println("Course : " + Course);
	}
	double calculateTotal() {
		
		System.out.println("Java : "+ Java);
		System.out.println("SQL : "+ SQL);
		System.out.println("DSA : "+ DSA);
		double Total= Java+SQL+DSA;
		System.out.println("Total : "+ Total);
		return Total;
	
	}
	double calculateAverage(double Total) {
		double avg=(Total)/3;
		System.out.println("Average : "+ avg);
		return avg;
	}
	public static void main(String[] args) {
		Assignment6 st=new Assignment6();
		 st.Studentname= "K.Chandu";
		 st.Rollnumber=8406;
		 st.Course="Java Full Stack";
		 st.displayStudentDetails();
		 st.Java=80;
		 st.SQL=85;
		 st.DSA=70;
		  double Total = st.calculateTotal();
		 st.calculateAverage(Total);
		 
		
		

	}

}
