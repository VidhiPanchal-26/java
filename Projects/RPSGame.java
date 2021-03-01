package Projects;
import java.util.Random;
import java.util.Scanner;
public class RPSGame {
    public static void main(String[] args) {
        int round=1;
        int score =0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (round<= 5) {
        System.out.println("Enter your choice:");
        System.out.println("Rock - 0");
        System.out.println("Paper - 1");
        System.out.println("Scissor - 2");
        int ch = sc.nextInt();
        int num = random.nextInt(3);
        System.out.println("Computer entered: " + num);
        System.out.println("Your choice is: " + ch);
        
        if((ch==0&&num==1) || (ch==1&&num==2) || (ch==2&&num==0)){
                System.out.println("You Lose!!\n");
        }
        else if((ch==0&&num==2) || (ch==1&&num==0) || (ch==2&& num==1)){
                System.out.println("Congratulations, You win!!\n");
                score += 5;
        }
        else{
                System.out.println("It's a tie!!\n");
        }
       round++;
        }
        System.out.println();
        System.out.println("Your Total score is: "+score);
    }
}
