package Arrays;
import java.util.Scanner;
public class InsertElementAtProvidedPos {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
		int n = 10;
		int i;
		int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("initial array");
		for(int j=0;j<arr.length;j++)
		{
	
				System.out.print(arr[j]);
		}

		System.out.println("eneter the elements you want to insert");
		
		int x =s.nextInt();
		System.out.println("eneter the position you want to insert");
		
		int pos =s.nextInt();
				int newarr[] = new int[n + 1];
				for (i = 0; i < n + 1; i++) {
					if (i < pos - 1)
						newarr[i] = arr[i];
					else if (i == pos - 1)
						newarr[i] = x;
					else
						newarr[i] = arr[i - 1];
				}

			
				System.out.println("new array");
				for(int j=0;j<newarr.length;j++)
				{
			
						System.out.print(arr[j]);
					
				}
			}
		}

	


