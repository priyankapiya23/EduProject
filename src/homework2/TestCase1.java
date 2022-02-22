package homework2;
import java.util.Scanner;
public class TestCase1 {

	public static void main(String[] args) {
	int t;
	int a;int b;int result;
	Scanner s=new Scanner(System.in);
	System.out.println("enter test cases");
	t=s.nextInt();
	for(int i=0;i<t;i++)
	{
		System.out.println("enter the values of a ");
		a=s.nextInt();
		System.out.println("enter the values of b ");
		b=s.nextInt();
		result=a%b;
		System.out.println("Result is: " +result);
		
	}
	

	}

}
