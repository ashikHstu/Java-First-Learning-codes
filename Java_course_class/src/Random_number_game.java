import java.util.Scanner;
import java.util.Random;
public class Random_number_game {
   private static final Random RN =new Random();
     public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int dt=roll();
		if(dt==7 || dt==1)
		{
			System.out.println("WON");
		}
		else if(dt==2 || dt==3 || dt==12)
		{
			System.out.println("LOSE");
		}
		else 
		{
			int nr;
			while(true)
			{
				nr=roll();
				if(nr==dt)
				{
					System.out.println("Won");
					break;
				}
				else if(nr==7)
				{
					System.out.println("LOSE");
					break;
				}
			}
		}

	}
	public static int roll()
	{
		int d1=1+ RN.nextInt(6);
		int d2=1+RN.nextInt(6);
	   return d1+d2;	
	}

}
