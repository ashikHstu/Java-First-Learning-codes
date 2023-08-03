import java.util.Scanner;

public class CF327A {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n;
          n=sc.nextInt();
          int ar[]=new int[n+2];
          int res=0;
          for(int i=0;i<n;i++)
          {
        	  ar[i]=sc.nextInt();
        	  if(ar[i]==1)
        		  res++;
          }
          int noz,noo;
          int mx=0;
          int dif=0;
          for(int i=0;i<n;i++)
          {
        	  noz=noo=0;
        	  for(int j=i;j<n;j++)
        	  {
        		  if(ar[j]==0)
        		      noz++;
        		  if(ar[j]==1)
        			  noo++;
        		  
        		  dif=noz-noo;
        		  if(dif>mx)
        		  {
        			  mx=dif;
        		  }
        	  }
          }
          res+=mx;
          if(mx==0)res--;
          System.out.println(res);
	}

}
