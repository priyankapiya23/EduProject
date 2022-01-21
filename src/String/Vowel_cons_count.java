package String;
import java.util.Scanner;
public class Vowel_cons_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter string");
     String s1=s.nextLine();
     s1=s1.toLowerCase();
     int v=0;
     int c=0;
     for(int i=0;i<s1.length();i++)
     {
    	 if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
    	 {
    		 v++;
    	 }else {
    	 c++;}
     }
	System.out.println("vowels "+v);
	System.out.println("consonants "+c);}

}
