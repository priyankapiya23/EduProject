package homework2;

public abstract class Shapes {
	
   abstract double area(int r); 
   abstract double volume(int r);
   abstract void show(String message);
   void print()
   {
	   System.out.println("shapes is");
   }
}
