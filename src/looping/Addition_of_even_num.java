package looping;
import java.util.Scanner;
public class Addition_of_even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter limit");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<=n;i++)
    {
    	if(i%2==0)
    	{
    		sum=sum+i;
    	}
    }
    System.out.println(sum);
    
	}

}
