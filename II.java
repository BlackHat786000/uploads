package project.mission.oca;

import java.util.Scanner;

public class II {
public static void main(String[] args) {
	
	int n,temp,k;
	int p=1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number of elements : ");
	
	n=sc.nextInt();
	
	k=n;
	
	int arr[]=new int[n];
	
	System.out.println("Enter all the elements : ");
	
	for(int i=0;i<n;i++)
	{
		
		arr[i]=sc.nextInt();
		
	}
	while(n!=1) {
		
	
	for(int j=0;j<(n-1);j++)
	{
		
	
			
		
		if(arr[j]>arr[j+1]) {
			
			temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			
			}
	
	
	}
	n=n-1;
	
	}
	
	System.out.println("Sorted elements are : ");
		
	for(int i=0;i<k;i++) {
			
			System.out.println(arr[i]);
			
		}
		
		
}
}