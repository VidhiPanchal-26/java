import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int[] numbers = new int[5];
    int odd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers :");
    for(int i=0;i<5;i++){
      numbers[i]=sc.nextInt();
      }
     System.out.println("******Odd numbers******");
      for(int i=0;i<5;i++){
      if(numbers[i]%2==1){
        System.out.println(numbers[i]);
      }
    }
    
  }
}