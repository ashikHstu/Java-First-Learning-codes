import java.util.Scanner;

public class CF190A {
        static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m,n;
		int mx,mn;
		n=sc.nextInt();
		m=sc.nextInt();
		mn=mx=0;
		if(m==0 && n==0)
		{
			System.out.println("0 0");
			return;
		}
		else if(n==0)
		{
			System.out.println("Impossible");
			return;
		}
		else {
			if(m<=n)
			{
				mn=n;
			    if(m>0)
			    	mx=n+(m-1);
			    else {
					mx=n;
				}
			}
			else {
				mn=n+(m-n);
				mx=n+(m-1);
			}
		}
		System.out.println(mn+" "+mx);

	}

}
