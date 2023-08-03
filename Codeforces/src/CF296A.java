import java.util.Scanner;
public class CF296A {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    int n;
	    n=sc.nextInt();
	    int ar[]=new int[1005];
	    for(int i=0;i<1005;i++)
	    {
	    	ar[i]=0;
	    }
        int v,mx;
        mx=0;
        for(int i=0;i<n;i++)
        {
        	v=sc.nextInt();
        	ar[v]++;
        	if(ar[v]>mx)
        	{
        		mx=ar[v];
        	}
        	
        }
        int other=n-mx;
        if(mx<=other+1)
        {
        	System.out.println("YES");
        }
        else 
        {
        	System.out.println("NO");
        }
	}

}
