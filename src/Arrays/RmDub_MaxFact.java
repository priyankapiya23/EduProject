package Arrays;
import java.util.Scanner;
public class RmDub_MaxFact {
	
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.print("enter length of array");
			int len=s.nextInt();
			int a[] = new int[len];
			System.out.print("enter elements");
			for(int k=0;k<len;k++)
			{
				a[k]=s.nextInt();
			}
            int j=0;
			for (int i = 0; i < len - 1; i++) {
				if (a[i] != a[i + 1]) {
					a[j++] = a[i];
				}
			}

			a[j++] = a[len - 1];

			System.out.println("after removing dublicates length is "+j);
		

			// printing array elements
			for (int i = 0; i < j; i++)
				System.out.print(a[i] + " ");
			System.out.println();
			
			// findig largest element and finding factorial of this
			int max=a[0];
			for (int i = 0; i < j; i++)
			{
				if(a[i]>max)
					max=a[i];
			}
			int fact=1;
			for (int i = 1; i < max; i++)
				fact =fact*i;
				System.out.println("factorial is"+fact);
				
			
		}
	}



