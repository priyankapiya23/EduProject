package FirstPackage;

public class Second_TernaryOperator {
	public static void main(String[] args)
	{
		int a=2;
		int b=20;
		int c=1;
		int max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("largest number is " + max);
		
		
		//to check even or add
		String result=a%2==0 ?"even":"odd";
					System.out.printf("number is "+result);
					
		     
	}
}
