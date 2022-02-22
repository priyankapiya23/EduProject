package Arrays;
import java.util.Scanner;
public class FindMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);
int[] arr=new int[5];
System.out.println("enter the array elements");
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
int min=arr[0];
for(int j=0;j<arr.length;j++)
{
	if(arr[j]<min)
	{
		min=arr[j];
	}
	
}System.out.println("smallest elements is "+min);
	}

}
