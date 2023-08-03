import java.util.Scanner;
public class CF {
static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int tc;
		tc=sc.nextInt();
		for(int i=0;i<tc;i++)
		{
			int a,b,r,d,res;
			res=0;
			b=sc.nextInt();
			a=sc.nextInt();
			r=a%b;
			d=a/b;
			for(int j=0;j<b;j++)
			{
				if(r>0)
				{
					res+=(d+1)*(d+1);
					r--;
				}
				else {
					res+=(d*d);
				}
			}
		   System.out.println(res);
		}

	}

}
