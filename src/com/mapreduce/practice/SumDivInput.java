package com.mapreduce.practice;

public class SumDivInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,40,56,76};
		int input =40;
		int sum1= 0, sum2=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<=input){
				sum1 = sum1+arr[i];
			}else
			{
				sum2=sum2+arr[i];
			}
		}
		System.out.println( "Sum1::"+sum1 + "\n"+ "Sum2::"+ sum2);
	}

}
