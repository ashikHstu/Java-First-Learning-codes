import java.util.Scanner;

public class First_task_advance_math {
    public static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
		 
		 AdvanceMath obj1=new AdvanceMath();
		 int data1,data2;
		 System.out.println("Enter two data : ");
		 data1= input.nextInt();
		 data2=input.nextInt();
		 obj1.getdata(data1, data2);
		 obj1.addition();
		 obj1.printadd();
		 obj1.subtraction();
		 obj1.printsub();
		 obj1.multiplication();
		 obj1.printmul();
		 
		 obj1.squreroot();
		 obj1.printsq();
		 obj1.logarithm();
		 obj1.printl();
		 
		 

	}

}
