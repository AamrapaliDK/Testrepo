package assignmentPractice;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		if(a%2==0)
		{
			System.out.println( a+ " number is even");
		}
		else
		{
			System.out.println(a+ " number is odd");
		}
		//Take input from user to find even or odd number
		System.out.println("Enter any number= ");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println("you have entered value="+b);
		 
		if(b%2==0)
		{
			System.out.println( b+ " number is even");
		}
		else
		{
			System.out.println(b+ " number is odd");
		}
	}
	 

}
