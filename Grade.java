import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Mark m = new Mark();
    m.getMarks();
    m.getPercentage();
    m.gradeMarking();
  }
}
public class Mark{
  Scanner sc = new Scanner(System.in);
  float Sci,Math,Hist,Geog,Eng,percentage; 
  public void getMarks(){
    System.out.println("Enter Marks out of 100");
    System.out.println("Enter marks of Science : ");
    Sci = sc.nextFloat();
    
    System.out.println("Enter marks of Math :");
    Math = sc.nextFloat();
    
    System.out.println("Enter marks of History :");
    Hist = sc.nextFloat();
    
    System.out.println("Enter marks of Geography :");
    Geog = sc.nextFloat();
    
    System.out.println("Enter marks of English :");
    Eng = sc.nextFloat();
  }
  public void getPercentage(){
    percentage =(Sci+Math+Hist+Geog+Eng)*100/500;
    System.out.println("Your percentage is "+percentage);
  }
  public void gradeMarking(){
 if(percentage<=50)
 {
   System.out.println("You got C grade!!");
 }
 else if(percentage>=50 && percentage<=70)
 {
   System.out.println("You got B grade!!");
 
 }
 else if(percentage>=70 && percentage<=100)
 {
   System.out.println("You got an A grade!!");
 }
 else
 {
   System.out.println("You failed ...");
   System.out.println("Study hard!!!");
 }
 }
}