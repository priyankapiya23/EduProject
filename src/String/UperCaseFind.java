package String;
import java.util.Scanner;
public class UperCaseFind {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("enter String");
	        String str=sc.nextLine();
	        String isup="";
	            for(int i = 0; i < str.length(); i++){
	                if(Character.isUpperCase(str.charAt(i))){
	                   char w = str.charAt(i);
	                   isup = isup + w + " ";
	                }
	             }
	             System.out.println("The uppercase characters are " + isup);
	        }
	        

	}

