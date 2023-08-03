import java.awt.print.Printable;

import java.sql.Date;
import java.util.Scanner;

public class Output_formatting {
   static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int i=sc.nextInt();
		//System.out.printf("Integer data is : %04d, \nIts next line.\n",i);
		Print(i);
        
        
	}
	
	static void Print(int a)
	{
		System.out.println("a = "+a);
	}

}
