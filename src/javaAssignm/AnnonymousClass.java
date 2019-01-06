package javaAssignm;


class A2{
	
	void print()
	{
		System.out.println("fail");
	}
}
public class AnnonymousClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A2 obj = new A2();
		obj.print();
		A2 obj2 = new A2(){
			
			@Override
			void print() {
				// TODO Auto-generated method stub
				super.print();
				System.out.println("Anninnerclass");
				display();
				
						}
			void display(){
				System.out.println("Vasant chor.....");
			}
		};
		obj2.print();
		
		
	}

}
