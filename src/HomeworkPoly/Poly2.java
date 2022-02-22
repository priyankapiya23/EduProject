package HomeworkPoly;

public class Poly2 extends Poly1{
	String contact;

	Poly2(String name, String course,String contact) {
		super(name,course);
		this.contact=contact;
		
	}
 double getdata(int marks1,int marks2)
 {
	   return super.getdata(marks1, marks2);
 }
 void display(int roll)
 {
	   super.display(roll);
	   System.out.println("contact: "+contact);
	   
 }
	
	public static void main(String[] args) {	
     Poly2 ob=new Poly2("piya","java","90998890");
     ob.display(34);
     ob.getdata(10,20);
     
	}

}
