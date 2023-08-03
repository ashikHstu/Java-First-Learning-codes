import java.math.BigInteger;
import java.util.Scanner;
public class CFgym112Bigint {
   static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger num1,num2,res1,res2,res;
		num1=sc.nextBigInteger();
		num2=sc.nextBigInteger();
		res1=new BigInteger(num1.toString());
		res2=new BigInteger(num2.toString());
		for(BigInteger i=BigInteger.ONE;i.compareTo(num2)<0;i=i.add(BigInteger.ONE))
		{
			res1=res1.multiply(num1);
		}
		for(BigInteger j=BigInteger.ONE;j.compareTo(num1)<0;j=j.add(BigInteger.ONE))
		{
			res2=res2.multiply(num2);
		}
		res=res1.subtract(res2);
		System.out.println(res);
	}

}
