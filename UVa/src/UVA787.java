import java.util.Scanner;

import java.math.BigInteger;
public class UVA787 {
   static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		while(scanner.hasNext())
		{
			solveProblem();
		}

	}
    
	public static void solveProblem()
	{
		int ar[]=new int[101];
		BigInteger maxSoFar,maxTotal;
	   int totalValue=0;
		while(true)
		{
			int v=scanner.nextInt();
			if(v== -999999)break;
			ar[totalValue]=v;
			totalValue++;
		}
		
		System.out.println("total Value : "+totalValue);
	
	
	}
}
