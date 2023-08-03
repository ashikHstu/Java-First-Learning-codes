import java.lang.Math;
public class AdvanceMath extends BasicMath{

	public double sqt,lg;
	public void squreroot()
	{
		sqt=Math.sqrt(a);
		
	}
	public void logarithm()
	{
		lg=Math.log(a);
	}
	 public void printsq()
	 {
		 System.out.println("Squreroot of first number is : "+sqt);
	 }
	 
	 public void printl()
	 {
		 System.out.println("Logarithm of first number is : "+lg);
	 }

}
