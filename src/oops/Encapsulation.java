package oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Getter_Setter obj= new Getter_Setter();
        obj.setX(10);
        obj.setN("ABC");                                 //loose coupling
        System.out.println(obj.getN());
        System.out.println(obj.getX());
        
        Getter_Setter obj1= new Getter_Setter();
        obj1.setX(20);
        obj1.setN("xyz");
        System.out.println(obj1.getX());
        System.out.println(obj1.getN());
        

        Getter_Setter obj2= new Getter_Setter(40,"piya");//tight coupling
        System.out.println(obj2.getX());
        System.out.println(obj2.getN());
        
	}

}
