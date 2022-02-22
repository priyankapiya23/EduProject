package String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string1");
		String str1=s.nextLine();
		System.out.println("enter string2");
		String str2=s.nextLine();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(ch1);
		System.out.println(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("anagram");
		}
		else {
		System.out.println("not anagram");}

}}
