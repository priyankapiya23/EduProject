package looping;
import java.util.Scanner;
public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int n=s.nextInt();

	    int t=1;
	 
	    for(int i=0; i<n; i++){
	      //Output the blank space
	      for(int k=0; k<n-i; k++){
	        System.out.print(" ");
	      }
	      for(int j=0; j<=i; j++){
	        if(j==0 || i==j)
	          t = 1;
	        else
	          t=t*(i-j +1)/j;
	        
	        System.out.print(t+" ");
	      }
	      System.out.println();

	}

}}
