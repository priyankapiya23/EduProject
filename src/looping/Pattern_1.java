package looping;
import java.util.Scanner;
public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int rows=s.nextInt();
		int i,j;
		for(i=1;i<=rows-1;i++)
		{
			for(j=1;j<=1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		for(i=rows-1;i>=0;i--)
		{
			for(j=0;j<=i-1;j++)
			{
				System.out.print("*"+" ");
			}System.out.println("");
		}
		

	}

}
