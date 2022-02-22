package polymorphism;

public class Poly2 extends Poly1 {
	int i=200;
	 void display(double x)
	   {
		   System.out.println(x);
	   }
  void show(String s)
  {
	  super.show(s);
	  System.out.println("Running from poly2"+super.i);
  }
}
