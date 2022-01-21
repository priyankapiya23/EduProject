package looping;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		int rev=0;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			rev=n%10;
		    sum=(sum*10)+rev;
		    n=n/10;
		}
		if(sum==temp)
		{
			System.out.println(temp +" is a palindrom number");
		}
		else
		    System.out.println(temp+" is not a palindrom number");

	}

}
