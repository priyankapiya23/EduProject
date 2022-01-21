package oops;

public class ConstructorExample {

	
		public ConstructorExample()// Default
		{
			System.out.println("Default constructor-1");
		}
		public ConstructorExample(int x)// single parameter
		{
			this();
			System.out.println("constructor-2");
		}
		public ConstructorExample(int x,int y)// single parameter
		{
			this(y);
			System.out.println("constructor-3");
		
		}
	
	
public static void main(String[] args) {
	
	new ConstructorExample(20,30); // invoke constructor
}
}