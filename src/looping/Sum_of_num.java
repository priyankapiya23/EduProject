package looping;
import java.util.Scanner;

public class Sum_of_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0;
		int sum=0;
		System.out.println("Enter the nth terms");
		int n=s.nextInt();
		while(i<n)
		{
			i++;
			sum=sum+i;
		}
		System.out.println("sum of the " +n+"th terms is : "+sum);
		

	}

}
