package inheritance;

public class AccessModifiersMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersExample obj=new AccessModifiersExample();
		obj.show();     //public accessible
	//	obj.show1();    // private can't access outside the class   
		obj.show2();    //default accessible
		obj.show3();    //protected accessible
	}
}