package assignmentPractice;

import java.util.Scanner;

public class findvowelOrconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter any character");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch == 'a'|| ch == 'e' || ch== 'i' || ch=='o' || ch=='u')
{
System.out.println("Vowel");
}
else
{
	System.out.println("consonant");	
}
	}

}
