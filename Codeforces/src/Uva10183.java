import java.math.BigInteger;
import java.util.Scanner;
public class Uva10183 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
             BigInteger fib[]=new BigInteger[50005];
            fib[1]=BigInteger.ONE;
            fib[2]=BigInteger.valueOf(2);
            for(int i=3;i<=50000;i++)
            {
            	fib[i]=fib[i-1].add(fib[i-2]);
            }
            
           while(true)
           {
        	   BigInteger num1,num2;
        	   num1=sc.nextBigInteger();
        	   num2=sc.nextBigInteger();
        	   if(num1.compareTo(BigInteger.ZERO)==0 && num2.compareTo(BigInteger.ZERO)==0)
        	   {
        		   break;
        	   }
        	   int count=0;
        	  for(int i=1;i<=50000;i++)
        	  {
        		  if(fib[i].compareTo(num1)>=0 && fib[i].compareTo(num2)<=0)
        		  {
        			  count++;
        		  }
        		  if(fib[i].compareTo(num2)>0)
        		  {
        			  break;
        		  }
        	  }
        	  System.out.println(count);
           }
	}

}
