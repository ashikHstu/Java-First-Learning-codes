import java.util.Scanner;

public class CF9A {
       static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int a,b,c;
		int tp,pp;
		tp=6;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			c=a;
		}
		else {
			c=b;
		}
       pp=7-c;
       if(tp%pp==0)
       {
    	   tp=tp/pp;
    	   System.out.print("1/"+tp);
       }
       else if(tp%2==0 && pp%2==0)
       {
    	   tp=tp/2;
    	   pp=pp/2;
    	   System.out.print(pp+"/"+tp);
       }
       else if(tp%3==0 && pp%3==0)
       {
    	   tp=tp/3;
    	   pp=pp/3;
    	   System.out.print(pp+"/"+tp);
       }
       else 
       {
    	   System.out.print(pp+"/"+tp);
       }
	}

}
