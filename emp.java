public class Emp{
  public static void main(String args[]){
    Employee e = new Employee();
   e.name ="ABC";
   e.age = 20;
   e.city ="Pune" ;
   e.display();
   
   Employee e1 = new Employee() ;
   e1.name ="XYZ" ;
   e1.age =35 ;
   e1.city ="Mumbai" ;
   e1.display();
  }
  }
  
class Employee{
  String name;
  int age;
  String city;
  void display(){
    System.out.println("The name is "+name+ " " + "and lives in the city "+city+". " + "His/Her age is "+age);
  }
}