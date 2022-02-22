package String;
import java.io.*;
public class Replace_Occurance_Name {

	public static void main(String[] args) throws IOException {
		        InputStreamReader r=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(r);
				String[] cities= {"Delhi","chandigrah","patna","Bihar"};
				System.out.println("Input your String");
				String str=br.readLine();
				for(int i=0;i<=str.length();i++)
				{
					for(int j=0;j<cities.length;j++)
					{
					
						if(cities[j]==cities[i])
						{
							String s=str.replace(str[i],'*');
							System.out.println(s);
						}
					}
				
					}
	}

}
