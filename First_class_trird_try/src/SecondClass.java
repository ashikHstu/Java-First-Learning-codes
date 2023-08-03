
import java.util.Scanner;
public class SecondClass {
     static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int a,b;
		a=sc.nextInt();
	b=sc.nextInt();
	res(a,b);

	}
	static public void res(int a,int b)
	{
		if(a+1==b)
		{
		   System.out.println(a+" "+b);
		}
		else if(a==b)
		{
			a=a*10+1;
			b=b*10+2;
			System.out.println(a+" "+b);
		}
		else if(a==9 && b==1)
		{
			b=b*10;
			System.out.println(a+" "+b);
		}
		else 
		{
			System.out.println("-1");
		}
	}

}
