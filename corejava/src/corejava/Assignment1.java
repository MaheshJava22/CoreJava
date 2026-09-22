package corejava;

public class Assignment1 {
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
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		Assignment1 obj=new Assignment1();
		obj.instancemethod1();
		obj.instancemethod2();

	}

}
