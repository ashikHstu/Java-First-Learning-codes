
public class BasePlusComissionEmployee{
    
    private String firstname;
    private String lastname;
    private String socialSecuritynumber;
    private double grossSales;
    private double commissionRate;
    private double baseSalary;
   
   
    public BasePlusComissionEmployee(String first ,String last,String ssn, double sales,double rate,double salary)
    {
       
        firstname = first;
        lastname = last;
        socialSecuritynumber = ssn;
        setGrossSales( sales);
        setCommissionRate( rate);
        setBaseSalary( salary);
       
    }
   
    public void setFirstName(String first)
    {firstname  = first;       }
   
    public String getFirstname()
    {
        return firstname;
    }
   
    public void setlastName(String last)
    {lastname  = last;       }
   
    public String getlastname()
    {
        return lastname;
    }
   
   
    public void setsocialSecuritynumber(String ssn)
    { socialSecuritynumber  = ssn;       }
   
   
   
   
    public String setSocialSecuritynumber()
    {
        return socialSecuritynumber;
    }
   
     public void setGrossSales( double sales )
     {
             if(sales >= 0.0)
     grossSales = sales;
     
     else
     
     throw new IllegalArgumentException("Gross sales must be >= 0.0");
     
     }
     
     public double getGrossSales()
     {
         return grossSales;
     }
     
     public void setCommissionRate(double rate)
     {
         if(rate> 0.0 && rate <1.0)
             commissionRate = rate ;
         else
             throw new IllegalArgumentException(
             
             "Commission rate must be  > 0.0 and <1.0");
         
     }
     
     public double getCommissionRate()
     {
         return commissionRate;
     }
     
     public void setBaseSalary(double salary)
     {
         if(salary >= 0.0)
             baseSalary = salary;
         else
             throw new IllegalArgumentException(
             
             "Base salary mst be >= 0.0"
             );
         
             
     }
     
     
     public double getBaseSalary()
     {
         return baseSalary;
     }
     
     
     public double earning()
     {
         return baseSalary + (commissionRate * grossSales);
     }
   
   
    @Override
   
    public String toString()
            {
                return String.format(
               
                "%s: %s%s\n %s : %s\n %s : %.2f \n %s : %.2f\n %s : %.2f\n ",
                         "base-salaried commission employee", firstname, lastname,
                          "social security number", socialSecuritynumber,
                          "gross sales", grossSales, "commission rate", commissionRate,
                          "Base Salary",baseSalary
                );
                       
            }
           
}