package Arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter values of rows ");
        int r=s.nextInt();
        System.out.println("enter values of columns");
        int c=s.nextInt();
        int a[][]=new int[r][c];
        int sum=0;
        if(r==c)
        {
		
		System.out.println("enter values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		
	}	System.out.println("sum is "+sum);

	System.out.println("rows and columns is not equals you can not perform this operation");}
    }
}