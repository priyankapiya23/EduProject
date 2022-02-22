package fileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class FileTest {

	public static void main(String[] args) {
		int j;
		try {
			int bWrite[]= {11,21,3,40,5};
			OutputStream os= new FileOutputStream("E:/MyFile.txt");
			for(j=0;j < bWrite.length;j++);
			{
			   os.write(bWrite[j]); //writes the bytes
		    }
		    os.close();
		    InputStream is = new FileInputStream("E:/File23.txt");
      		int size =is.available();
		for(int i=0;i<size;i++)
		{
			System.out.println((char)is.read()+ " ");
		}
     is.close();
	}catch(IOException e)
	{
		System.out.println("Exception"+e);
	}
}

}
