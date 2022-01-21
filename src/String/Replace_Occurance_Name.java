package String;
import java.io.*;
public class Replace_Occurance_Name {

	public static void main(String[] args) throws IOException {
		        InputStreamReader r=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(r);
				String[] cities= {"Delhi","chandigrah","patna","Bihar"};
				System.out.println("Input your String");
				String str=br.readLine();
				char[] ch =str.toCharArray();
				for(int i=0;i<=ch.length;i++)
				{
					for(int j=0;j<cities.length;j++)
					{
					
						if(cities.equals(str))
						{
							String s=str.replace(ch[i], '*');
							System.out.println(s);
						}
					}
				
					}
	}

}
