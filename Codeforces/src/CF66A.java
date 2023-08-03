import java.util.Scanner;
import java.math.BigInteger;
public class CF66A {
static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger num;
		num = sc.nextBigInteger();
		if(num.compareTo(new BigInteger("-9223372036854775808"))<0 )
		{
			System.out.println("BigInteger");
		}
		else if(num.compareTo(new BigInteger("-2147483648"))<0)
		{
			System.out.println("long");
		}
		else if(num.compareTo(new BigInteger("-32768"))<0)
		{
			System.out.println("int");
		}
		else if(num.compareTo(new BigInteger("-128"))<0)
		{
			System.out.println("short");
		}
		else if(num.compareTo(new BigInteger("127"))<=0)
		{
			System.out.println("byte");
		}
		else if(num.compareTo(new BigInteger("32767"))<=0)
		{
			System.out.println("short");
		}
		else if(num.compareTo(new BigInteger("2147483647"))<=0)
		{
			System.out.println("int");
		}
		else if(num.compareTo(new BigInteger("9223372036854775807"))<=0)
		{
			System.out.println("long");
		}
		else 
		{
			System.out.println("BigInteger");
		}
		

	}

}
