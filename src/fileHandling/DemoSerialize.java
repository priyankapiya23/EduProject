package fileHandling;
import java.io.*;
public class DemoSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee e=new Employee(23,"Sarabjit");
try
{
	FileOutputStream fileout=new FileOutputStream("D/MyEmployee.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileout);
	out.writeObject(e);
	out.close();
	fileout.close();
	System.out.println("Serialized is saved in /tmp/employee.ser");
}
catch(IOException i)
{
	i.printStackTrace();
}
	}

}
