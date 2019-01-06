package com.mapreduce.practice;

public class NearestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {20,40,10,5,15};
		int input =-123;
		int index= 0;
		int output[] = new int[1];
		int min=0, temp=0;
		for(int i=0;i< arr.length;i++)
		{
			if(arr[i]<input)
				temp= input-arr[i];
			else{
				temp= arr[i]-input;
			}
			if(min==0)
				min=temp;
			if(temp<min )
			{ 
				index=i;
				output[0]=arr[i];
				min=temp;
			}
		}
		System.out.println(index);
		System.out.println(output[0]);
		
	}

}
