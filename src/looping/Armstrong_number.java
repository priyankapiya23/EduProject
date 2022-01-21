package looping;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter digit");
		int digit=s.nextInt();
		System.out.println("enter number");
		int num=s.nextInt();
		int temp;
		int r,sum=0;
	
		 for(temp=num;num!=0;num=num/10){
			 	 r=num % 10;
			 	 sum=(int) (sum+(Math.pow(r,digit)));
	}
		 if(temp==sum)
			 System.out.println("number is armstrong number");
		 else
			 System.out.println("number is not armstrong");
	}

}
