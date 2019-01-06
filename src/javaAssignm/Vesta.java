package javaAssignm;

public class Vesta {

	public static void speak()
	{
		System.out.println("Hello Vesta");
	}
	
	}

class VestaDemo1{
	
	Vesta obj = new Vesta();
	//Vesta.speak();
	
	void speak2()
	{
		Vesta.speak();
		Vesta obj = new Vesta();
		obj.speak();
		
		
	}
}




