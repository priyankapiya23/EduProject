package String;
import java.io.*;
public class StringBuffer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader brr=new BufferedReader(r);            
		System.out.println("Enter your name");    
		String name=brr.readLine();    
		System.out.println("Enter your age");   
		int x = Integer.parseInt(brr.readLine());

		System.out.println("Welcome "+name);    
	


	}
	
}



