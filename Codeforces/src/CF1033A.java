import java.util.Scanner;
public class CF1033A {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		int x1,x2,x3,y1,y2,y3;
		n=sc.nextInt();
		x1=sc.nextInt();
		y1=sc.nextInt();
		
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		x3=sc.nextInt();
		y3=sc.nextInt();
		
		if(x2<x3)
		{
			int t=x2;
			x2=x3;
			x3=t;
		}
		if(y2<y3)
		{
			int t=y2;
		      y2=y3;
		      y3=t;
		}
		if(x2>x1&& x1>x3)
		{
			System.out.println("NO");
		}
		else if(y2>y1 && y1>y3)
		{
			System.out.println("NO");
		
		}
		else 
		{
			System.out.println("YES");
		}

	}

}
