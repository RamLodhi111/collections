package com.java.main;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int size = 100;
		int arr[] = new int[size];
		int temp =2;
		for(int i=0;i<size;i++)
			arr[i] = i+(temp+1*2)+1;
		for(int i=0;i<size;i++)
			System.out.println(arr[i]);
		
		int number =109;
		int status = binarySearch(arr, 0, size-1, number);
		System.out.println("Status "+status);
		if(status!=-1)
			System.out.println(":::Found at index "+status);
		else
			System.out.println(":::NOT FOUND in array:::");
		
	}
	
	static private int  binarySearch(int[] arr, int min, int max, int number){
System.out.println(max+" "+min);
		if(max>=min){
			
			int mid = min +(max-min)/2;
			
			if(number==arr[mid])
				return mid;
			
			if(number<arr[mid])
				return binarySearch(arr, min, mid-1, number);
			else 
				return binarySearch(arr, mid+1, max, number);
			
		}else 
			return -1;
	}

}
