package assignmentPractice;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=7;
int temp=0;
for(int i=2;i<=num-1;i++)
{
if(num%i==0)
{
temp=temp+1;	
}
if(temp==0)
{	
System.out.println(num+ " is prime number");
}
else
{
	System.out.println(num+ " is not prime number");
}
}
//input take from user
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("you have entered nmuber is "+a);
int temp1=0;
for(int i=2;i<=a-1;i++)
{
if(a%i==0)
{
temp1=temp1+1;	
}
if(temp1==0)
{	
System.out.println(a+ " is prime number");
}
else
{
	System.out.println(a+ " is not prime number");
}
}
 

	}

}
