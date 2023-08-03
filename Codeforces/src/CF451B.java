
import java.util.Scanner;
public class CF451B {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		n=sc.nextInt();
		int ar[]=new int[n+5];
		for(int i=1;i<=n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int mn,mx;
		mn=2000000000;
		mx=-1;
		int revst=0;
		int start,end,k;
		start=end=1;
		for(int j=1;j<n;j++)
		{
			k=j;
			if(ar[j]>ar[j+1] && revst==0)
			{
				revst=1;
				start=j;
				while(ar[j]>ar[j+1] && j<n)
				{
					if(ar[j]>mx)
					{
						mx=ar[j];
					}
					if(ar[j]<mn)
					{
						mn=ar[j];
					}
					
					j++;
					if(ar[j]>mx)
					{
						mx=ar[j];
					}
					if(ar[j]<mn)
					{
						mn=ar[j];
					}
					
				}
				end=j;
				if(ar[j+1]<mx && j<n)
				{
					System.out.println("no");
					return;
				}
				else if(k>1 && ar[k-1]>mn)
				{
					System.out.println("no");
					return;
				}
				
			}
			else if(ar[j]>ar[j+1] && revst==1)
			{
				System.out.println("no");
				return;
			}
			
		}
		System.out.println("yes");
		System.out.println(start+" "+end);

	}

}
