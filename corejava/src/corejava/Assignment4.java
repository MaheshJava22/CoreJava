
//* Instance Method – Display student details.
//* Static Method – Display college details.
//* Create 2 Student objects in main() and call all methods.
//* Student fields: rollNo, name, marks.
package corejava;

public class Assignment4 {
	int rollno ;
	String name;
	int marks;
	static String Collegename;
	static int Collegecode;
	static String Collegeloc;
	{
		System.out.println("Student object created");
	}
	void displaystudentdetails() {
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Marks :"+marks);
	}
	static  void displaycollegedetails() {
		System.out.println("Collegename :"+Collegename);
		System.out.println("Collegecode :"+Collegecode);
		System.out.println("Collegeloc:"+Collegeloc);
	}
	public static void main(String[] args) {
		
		Assignment4 s=new Assignment4();
		s.rollno=453;
		s.name="Mahesh";
		s.marks=78;
		s.displaystudentdetails();
		Collegename="Vaagdevi College of Engineering";
		Collegecode=4523;
		Collegeloc="Warangal";
		Assignment4.displaycollegedetails();
		
	}

}
