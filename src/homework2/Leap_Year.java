package homework2;
import java.io.*;
public class Leap_Year {
	public static void main(String[] args)
	{
 int year=2022;
 int n=20;
 int c=0;
 
 
  while(c!= n)
 {
	 year=year+1;
	 if((year%400==0)||(year%4==0 && year %100!=0))
	 {
		 c++;
		 System.out.println(year);
	 }
	 
 }
}}
