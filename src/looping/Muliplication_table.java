package looping;
import java.util.Scanner;
public class Muliplication_table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i=0;
		System.out.println("Enter the number which you want to print the table");
		int n=s.nextInt();
		while(i<10)
		{
			i++;
			System.out.println(n +" * "+ i +" = "+(n*i));
			
		}
	

	}


	}


