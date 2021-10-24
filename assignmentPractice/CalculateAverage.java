package assignmentPractice;

import java.util.Scanner;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter First number");
Integer a=sc.nextInt();
System.out.println("Enter second number");
Integer b=sc.nextInt();
int sum=a+b;
int Average=sum/2;
System.out.println("The Average of a and b =" +Average);


	}

}
