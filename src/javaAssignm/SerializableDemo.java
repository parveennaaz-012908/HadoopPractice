package javaAssignm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerDemo implements Serializable
{
	transient int a; 
    static int b; 
    String name; 
    int age; 

	
	public SerDemo(String name, int age, int a, int b)
	{ 
		this.name = name; 
		this.age = age; 
		this.a = a; 
		this.b = b;
	}
	
}



public class SerializableDemo {
	public static void printdata(SerDemo object1) 
	{ 

	    System.out.println("name = " + object1.name); 
	    System.out.println("age = " + object1.age); 
	    System.out.println("a = " + object1.a); 
	    System.out.println("b = " + object1.b); 
	} 

	public static void main(String[] args) throws IOException, NotSerializableException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		SerDemo obj = new SerDemo("ab", 20, 2, 1000);
		
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		fos.close();
		
		System.out.println("object has been serialized");
		
		printdata(obj);
		obj.a=100;
		obj=null;
		/*obj.age=30;
		obj.name="Dhokli";*/
		
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerDemo obj1 = (SerDemo) ois.readObject();
		
		printdata(obj1);
		//System.out.println(obj1.a);
		//System.out.println(obj1.name);
	}

}
