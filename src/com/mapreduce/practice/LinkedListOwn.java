package com.mapreduce.practice;

 class Node{

	Node next ;
	Object data;
	}
 class Node1{

		Node1 next ;
		Object data;
		}
public class LinkedListOwn {
	
	public static void main(String[] args) {
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 =new Node();
		Node n4 = new Node();
		Node n5 =new Node();
		n1.data=10;
		n2.data=20;
		n3.data=30;
		n4.data=40;
		n5.data=50;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		Node n11 = new Node();
		Node n12 =new Node();
		n11.data=5;
		n12.data=6;
		
		n11.next=n12;
		n12.next=n3;
		
		Object merge = 0;
		
		Node temp1 = n1,temp= n11; ;
		
		//System.out.println(n1.node + " :: " +n1.data);
	
		while(temp1!=null)
		{
			System.out.println("Next Node Data ::" +temp1.data);
			temp1=temp1.next;
		}
		temp1=n1;
		
		while(temp!=null){
			System.out.println("Next 2nd  Data ::" +temp.data + "::"+ temp.next + ":: Temp::"+ temp1.next);
			if(temp.next.equals(temp1.next)  && temp1!=null){
			merge=temp.next.data;
			temp1=null;}
			//System.out.println(merge);}
			temp=temp.next;
			
			
		}
		System.out.println(" Merge Data in 2nd Linked List :: "+ merge);
	}
}
