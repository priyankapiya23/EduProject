package homework2;
import java.io.*;
import java.util.Scanner;
public class Mul_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter upto terms");
		int terms=s.nextInt();
		int sum=0;
	
		for(int i=1;i<=terms;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum=sum+i;
			}
			
		}
	
		System.out.println(sum);

	}

}
