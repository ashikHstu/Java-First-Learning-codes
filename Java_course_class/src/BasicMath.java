
public class BasicMath {

	public int a;
	public int b;
  public int add,sub,mul;
 public void getdata(int x,int y)
  {
	  a=x;
	  b=y;
  }
 public void addition()
  {
	  add=(a+b);
  }
 public void subtraction()
  {
	  sub=a-b;
  }
 public void multiplication()
 {
	 mul=a*b;
 }
 public void printadd()
 {
	 System.out.println("Addition of given two number is : "+add);
 }
 public void printsub()
 {
	 System.out.println("Subtraction of given two number is : "+sub);
 }
 public void printmul()
 {
	 System.out.println("Multiplication of given two number is : "+mul);
 }
};
