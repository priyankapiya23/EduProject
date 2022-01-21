package oops;

import java.util.Scanner;

public class DemoOfMethods {
	  
	Scanner sc=new Scanner(System.in);
	String email = "xyz";
	
	//taking something, returning something
	
	public String display1(String fname, String lname)
	{
		String s = "My name is "+fname+" "+lname;
		
		return s;
		
	}
	
	public int display5(int Id)
	{
      return Id;
	}
	//taking something, returning nothing
	
	public void display2(long contact)
	{
		System.out.println("My Contact number is ::"+contact);
	}
    public void display6(double weight)
    {
    	System.out.println("My weight number is ::"+weight);
    }

	//taking nothing, returning something
	
	public String display3()
	{
		String em = email+"@gmail.com";
		return em;
	}
	public float display7()
	{
		float h=40f;
		return h;
	}
	
	//taking nothing, returning nothing
	
	public void display4() {
		System.out.println("this is");
		
	}
	 public void display8()
	 {
		 System.out.println("my all details");
	 }
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOfMethods obj = new DemoOfMethods();
		obj.display4();
		obj.display8();
		String s = obj.display1("Priyanka","kumari");
		System.out.println(s);
		float h1=obj.display7();
		System.out.println("height is "+h1);
		obj.display2(8796543);
		String e = obj.display3();
		System.out.println(e);
	}

}
