package javaAssignm;

class A1
{
	void display() throws ArithmeticException 
	{
		System.out.println("A");
	}
	
}

//complile time error due to exception hierarchy class B extends A 
class B1{
	void display()  throws RuntimeException
	{
		System.out.println("B");
	}
	
}
class C extends B1
{
	// compile time error due to exception in subclass have super class exception void display() throws Exception 
	//give either same class or subclass exception.
	
	void display()
	{
		System.out.println("A");
	}
	
}

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
