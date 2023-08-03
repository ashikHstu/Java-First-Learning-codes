import java.util.Scanner;
public class CF485A {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int m,a;
		a=sc.nextInt();
		m=sc.nextInt();
		
		for(int i=0;i<=25;i++)
		{
			if(a%m==0)
			{
				System.out.println("Yes");
				return;
			}
			a*=2;
		}
		System.out.println("No");
		

	}

}
