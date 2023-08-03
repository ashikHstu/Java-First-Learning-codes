
public class SecondTaskEmployee {

	public static void main(String[] args) {
		BasePlusComissionEmployee employee = new BasePlusComissionEmployee("Ripvan ","Winkle","1802071",71,.71,15000);
	       System.out.println(employee);
	       double earn=employee.earning();
	       System.out.println("The total selary with base plus comission is : "+earn);

	}

}
