package javaAssignm;

class A{
	A(){}
	
	static void display()
	{
	System.out.println("A");
	}
}

class B extends A{
	/*static void display()
	{
	System.out.println("B");
	}*/

	
}

public class staticClassMethod {
	
	
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
		B.display();
		A.display();
		B.display();
		System.gc();
	}

}
