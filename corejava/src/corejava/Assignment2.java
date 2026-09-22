package corejava;

public class Assignment2 {
	static Assignment2 obj=new Assignment2();
		
	static void method1() {
		System.out.println("Method1 is called");
	}
	static void method2() {
		System.out.println("Method2 is called");
	}
	static void method3() {
		System.out.println("Method3 is called");
	}
	public void instancemethod1() {
		System.out.println("Instance1 is called");
	}
	public void instancemethod2() {
		System.out.println("Instance2 is called");
	}
	
	static {
		Assignment2.method1();
		Assignment2.method2();
		Assignment2.method3();
		obj.instancemethod1();
		obj.instancemethod2();
	}
	public static void main(String[] args) {
		

	}

}
