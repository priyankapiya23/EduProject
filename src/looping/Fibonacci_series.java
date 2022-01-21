package looping;
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the terms");
		int n=s.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=1;i<n;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
		}

	}

}
