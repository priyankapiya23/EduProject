package String;
import java.util.Scanner;
public class StringOccurancecount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String str=s.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0,char2=0;
			for(int j=0;j<i;j++)
			{
				if(ch[j]==ch[i])
				{
					char2++;
				}
			}
				if(char2==0)
				{
					for(int k=i;k<ch.length;k++)
					{
						if(ch[k]==ch[i])
						{
							count++;
						}
					}
					
					System.out.println(ch[i]+" occurs: "+count+ " times");
				}
				
			
				}
			
		

	}

}
