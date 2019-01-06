package javaAssignm;

class Demo1 extends Thread{
	 
//	public void run(){
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
//	}
}

public class Thread1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 obj = new  Demo1();
		Demo1 obj1 = new  Demo1();
		obj.start();
		obj1.start();
	}

}
