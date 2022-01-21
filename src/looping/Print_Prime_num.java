package looping;
import java.util.Scanner;
public class Print_Prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter limit");
		int n=s.nextInt();
		
		for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 0)
               System.out.println("false");

           int  flag = 1;
 
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
		 
}}
