package fileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
	 Writer fw= new FileWriter("E:\\testout.txt");
	 fw.write("i love my country");
	 fw.close();
	 Reader fr=new FileReader("E:\\testout.txt");
	 int size = fr.read();
	 while(size!=-1) {
		 System.out.print((char)size);
		 size=fr.read();
	 }
	 fr.close();
 }
 catch(Exception e ) {System.out.println(e);}
 {System.out.println("sucess");
 }
	}
}


