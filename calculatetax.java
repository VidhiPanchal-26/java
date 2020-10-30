import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Employees e = new Employees();
    e.getDetails();
    e.calculateAge();
    e.getAnnualSal();
    e.calculateTax();
    e.displayDetails();
  }
}
public class Employees{
  Scanner sc = new Scanner(System.in) ;
  String name;
  int dob , birth_month ,birth_year,age;
  float monthly_sal,annual_sal,tax_amount;
 
 public void getDetails(){
   System.out.println("Enter employee name : ");
   name = sc.nextLine();
   System.out.println("Enter your birth date :");
   dob=sc.nextInt();
   System.out.println("Enter yor birthday month : ");
   birth_month = sc.nextInt();
   System.out.println("Enter your birth year : ");
   birth_year = sc.nextInt();
   System.out.println("Enter your monthly salary :");
   monthly_sal = sc.nextFloat();
  }
  public void calculateAge(){
    System.out.println("Enter current year :");
    int cur_year = sc.nextInt();
    age = cur_year-birth_year;
  }
  public void getAnnualSal(){
    annual_sal = monthly_sal*12;
  }
  public void calculateTax(){
   if (annual_sal>=500000)
   tax_amount =(annual_sal*20)/100;
   
   else if(annual_sal<500000 && annual_sal>=400000)
   tax_amount =(annual_sal*15)/100;
   
   else if(annual_sal<400000 && annual_sal>=300000)
   tax_amount =(annual_sal*10)/100 ;
   
   else if(annual_sal<300000 && annual_sal>=200000)
   tax_amount =(annual_sal*5)/100;
   
   else
   System.out.println("No tax....");
  }
  public void displayDetails(){
    System.out.println("Name of the Employee is : "+name);
    System.out.println("His/Her age is : "+age);
    System.out.println("Total annual salary of the employee : "+annual_sal);
    System.out.println("Total tax amount to be paid : "+tax_amount);
  }
 }
 