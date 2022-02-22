package Arrays;

public class NotPresentItem {

	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5};
		 int b[]= {2,3,1,0,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{ 
					break;
				
				}
				if(j==b.length)
				{
					System.out.println(a[i]+" ");
				}
				
			}
		}

	}

}
