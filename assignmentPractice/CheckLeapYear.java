package assignmentPractice;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter any year");
Integer year = s.nextInt();
boolean flag=false;
if(year %400==0)
{
flag=true;
}
else if(year%4==0)
{
flag = true;
}
else if(year%100==0)
{
flag=false;	
}
else
{
flag=false;	
}
if(flag)
{
System.out.println(year+" year is leap year");	
}
else
{
	System.out.println(year+" year is not leap year");		
}
	
	}

}
