package looping;
import java.util.Scanner;
public class Factorial_of_num {

	public static void main(String[] args) {
		
     Scanner s=new Scanner(System.in);
     System.out.println("enter any number");
     int n=s.nextInt();
     int fact=1;
     for(int i=1;i<=n;i++)
     {
    	 fact=fact*i;
     }
     System.out.println("Factorial of "+n+" is "+fact);
	}
	

}
