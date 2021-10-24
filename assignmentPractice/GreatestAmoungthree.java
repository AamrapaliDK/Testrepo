package assignmentPractice;

public class GreatestAmoungthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30;
		if(a>b)//10>20(false)
		{
			if(a>c)
			{
				System.out.println("Greatest number is "+a);
			}
			else
			{
				System.out.println("Greatest number is "+c);
			}
		}
		else
		{
			if(a>c)//10>30(false)
			{
				System.out.println("Greatest number is "+b);
			}
			else
			{
				System.out.println("Greatest number is " +c);
			}
		}
	}

}
