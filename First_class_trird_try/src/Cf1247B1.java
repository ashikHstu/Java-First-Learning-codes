import java.util.Scanner;

public class Cf1247B1 {
   static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		int tc,n,k,d,dif,lagbena;
		int[] ar=new int[101];
		tc=sc.nextInt();
		while((tc--)>0)
		{
			dif=0;
			n=sc.nextInt();
			k=sc.nextInt();
			d=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				ar[i]=sc.nextInt();
			}
			for(int i=0;i<d;i++)
			{
				lagbena=0;
				for(int j=0;j<i;j++)
				{
					if(ar[j]==ar[i])
					{
						lagbena=1;
						break;
					}
				}
				if(lagbena==0)
				{
					dif++;
				}
			}
		}


	}
}
