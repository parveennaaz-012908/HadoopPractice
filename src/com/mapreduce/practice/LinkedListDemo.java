package com.mapreduce.practice;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		Integer value =10;
		for(int i=0;i<5;i++)
			{
			linkList.add(value);
			value=value+10;
			}
			System.out.println(linkList.toString());
			
		
		
	}

}
