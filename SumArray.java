import java.util.Scanner;

public class Main
 {
   public static void main(String args[])
   { 
    int[] num = new int[5];
    int sum=0;
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter any 5 numbers :");
   for(int i=0;i<5;i++){
    num[i]=sc.nextInt();
    sum =sum+num[i];
    }
     System.out.println("Sum of elements :"+sum);
   }
 }
