package com.mapreduce.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class MyGeneric {

	public <E> void  genFunc(E c){
		
		System.out.println("Hello");
		//System.out.println(c.toString());
		
		//how to iterate the generic received object
		if(c instanceof List)
		{
			System.out.println("Yes, I am List  type");
		}
		 if(c instanceof Set)
		 {
			 System.out.println("Yes, I am Set Type");
		 }
		 
		//Iterator itr = 
	}
	public static void main(String[] args) {
	
		List <Integer> aI = new ArrayList<Integer>();
		List <Float> aF = new ArrayList<Float>();
		List <String> aS = new ArrayList<String>();
		aI.add(10);
		aI.add(20);
		aI.add(30);
		aF.add(10.54f);
		aF.add(15.94f);
		aF.add(65.04f);
		aS.add("Parveen");
		aS.add("Vasant");
		aS.add("Prashant");
		Set <Double> obj = new HashSet<Double>();
		
		obj.add(45.56);
		obj.add(65.78);
		obj.add(78.25);
	
		
		MyGeneric myGen = new MyGeneric();
		myGen.genFunc(aI);
		//myGen.genFunc(aF);
		//myGen.genFunc(aS);
		myGen.genFunc(obj);
		
		
		
		
		
		
	}

}
