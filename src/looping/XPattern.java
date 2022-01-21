package looping;
import java.util.Scanner;
public class XPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter Rows");
		int rows=s.nextInt();
		
        int k = rows * 2 - 1;	
		
		for (int i = 1 ; i <= k; i++ ) 
		{
			for (int j = 1 ; j <= k; j++ ) 
			{
				if(j == i || j == k - i + 1) 
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
			}
		}

	}


