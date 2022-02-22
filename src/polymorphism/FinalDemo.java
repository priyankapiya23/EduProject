package polymorphism;
//final class can not inherit
public final class FinalDemo {
    final int x=100; //final variable can not change the values 
    public FinalDemo()
    {
    	
    }
    //final method :: can't override
    final void show()
    {
    	System.out.println(x);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo obj=new FinalDemo();
		obj.show();
  
	}

}
