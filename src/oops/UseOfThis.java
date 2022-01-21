package oops;

public class UseOfThis {
   
	String name;
	public UseOfThis(String name)
	{
		this.name=name;//if this line will not write then output is null
	}
	public UseOfThis()
	{
      System.out.println("deafult running");
	}
	
	public void show()
	{
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseOfThis obj =new UseOfThis("sayali");
		obj.show();
		UseOfThis obj1 =new UseOfThis("manali");
		obj1.show();
		UseOfThis obj2 =new UseOfThis();
		obj2.show();
		
	}

}
