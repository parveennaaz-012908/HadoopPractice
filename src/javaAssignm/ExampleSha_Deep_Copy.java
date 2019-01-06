package javaAssignm;


class Copy implements Cloneable{
	int i =0;
	public Object clone() throws
    CloneNotSupportedException 
{ 
return super.clone(); 
} 
}
public class ExampleSha_Deep_Copy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Copy c = new Copy();
		Copy c1 = c;
		c.i=10;
	
		System.out.println(c.i);
		System.out.println("C1  :"+c1.i);
		
		Copy c2 = (Copy)c.clone();
		c.i=20;
		System.out.println("C : "+ c.i);
		System.out.println("C2 : "+ c2.i);
		System.out.println("C1 : "+ c1.i);
	}

}
