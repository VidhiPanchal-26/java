import java.util.Scanner;


public class Main {
   public static void main(String args[]){
     Avenger[] avengers = new Avenger[5];
     for(int i=0;i<5;i++)
     {
       avengers[i] = new Avenger();
     }
     for(int i=0;i<5;i++)
     {
       avengers[i].getDetails();
     }
     for(int i=0;i<5;i++)
     {
       avengers[i].displayDetails();
     }
   }
   
 }
 
 public class Avenger{
   String name, power, weapon, planet;
   int age;
   Scanner sc = new Scanner(System.in);
   
   public void getDetails(){
     System.out.println("Enter name,age,power,weapon & planet of the Avenger respectively :");
     name = sc.nextLine();
     age = sc.nextInt();
     power = sc.nextLine();
     weapon = sc.nextLine();
     sc.nextLine();
     planet = sc.nextLine();
   }
   
   public void displayDetails(){
     System.out.println("Name:"+name+" Age:"+age+" Power:"+power+" Weapon:"+weapon+" Planet:"+planet);
  
   }
 }
