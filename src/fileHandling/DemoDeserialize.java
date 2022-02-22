package fileHandling;

import java.io.*;

public class DemoDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e=null;
		try
		{
           FileInputStream fileIn =new FileInputStream("D:/MyEmployee.ser");
           ObjectInputStream in =new ObjectInputStream(fileIn);
           e=(Employee)in.readObject();
           in.close();
           fileIn.close();
		}
		catch(IOException i)
		{
			return ;
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("employee class not found");
			return ;
		}
		System.out.println("Deserialized employee...");
		System.out.println("Name"+e.getName());
		System.out.println("Id"+e.getId());
	}

}
