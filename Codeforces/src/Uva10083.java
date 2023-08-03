import java.util.Scanner;
import java.math.BigInteger;;
public class Uva10083 {
    static Scanner sc=new Scanner(System.in);
    public static int Digitcount(BigInteger number)
    {
    	double fact=Math.log(2)/Math.log(10);
    	int digit=(int)(fact*number.bitLength()+1);
    	if(BigInteger.TEN.pow(digit-1).compareTo(number)>0)
    		return digit-1;
    	else {
			return digit;
		}
    }
	public static void main(String[] args) {
		BigInteger t;
		int a,b;
		BigInteger n,m,div,mod;
		while(sc.hasNext())
		{
			t=sc.nextBigInteger();
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.print("("+t+"^"+a+"-1)/("+t+"^"+b+"-1) ");
			n=t.pow(a);
			n=n.subtract(BigInteger.ONE);
			m=t.pow(b);
			m=m.subtract(BigInteger.ONE);
			mod=n.mod(m);
			if(mod.compareTo(BigInteger.ZERO)==0)
			{
				div=n.divide(m);
				int d=Digitcount(div);
				if(d>=100)
					System.out.println("is not an integer with less than 100 digits.");
				else
				System.out.println(div);
			}
			else {
				System.out.println("is not an integer with less than 100 digits.");
			}
			
		}

	}

}
