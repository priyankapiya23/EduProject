package nestedclass;

public class AccessModifiersMain  extends  inheritance.AccessModifiersExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// only access public outside the package
		AccessModifiersMain obj= new AccessModifiersMain();
	
	    	obj.show();     //public accessible
			//obj.show1();    // private can't access outside the class   
			//obj.show2();    //default can't accessible
			//obj.show3();    //protected  can't accessible without inheritance
	    	obj.show3();  //protected accessible with inheritance
		
	}

}
