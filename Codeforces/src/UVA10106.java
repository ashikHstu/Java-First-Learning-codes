import java.util.Scanner;
import java.math.BigInteger;
public class UVA10106 {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger a,b,r;
		while(sc.hasNext())
		{
			a=sc.nextBigInteger();
			b=sc.nextBigInteger();
			r=a.multiply(b);
			System.out.println(r);
		}

	}

}
