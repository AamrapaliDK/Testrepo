 package assignmentPractice;

public class swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//swpping with third variable
		int a=10;
		int b=20;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("a"+a);
		System.out.println("b"+b);
	
		//swapping of 2 numbers without 3rd variable
		int p=10,q=20;
		p=p+q; //p=30,q=20
		q=p-q; //p=30,q=10
		p=p-q;//p=20, q=10
		System.out.println("p "+p);
		System.out.println("q "+q);
	}

}
