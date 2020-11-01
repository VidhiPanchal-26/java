import java.util.Scanner;
public class Main{  
    public static void main(String args[]){  
    Game game = new Game();
    game.initGame();
    game.play();
    }  
}  

public class Question{
  Scanner sc = new Scanner(System.in);
  String question,op1,op2,op3,op4;
  int correct_ans,user_ans;
  
  public boolean askQuestion(){
    System.out.println ("A) "+question);
    System.out.println("1. "+op1);
    System.out.println("2. "+op2);
    System.out.println("3. "+op3);
    System.out.println("4. "+op4);
    System.out.println("Choose correct option");
    user_ans = sc.nextInt();
    if(user_ans==correct_ans){
      return true;
    }
    return false;
  }
}

public class Player{
  Scanner sc = new Scanner(System.in);
  
  String name;
  int score=0;
  public void getDetails(){
    System.out.println("Enter the player name :");
    name=sc.next();
  }
}
public class Game{
  Question[] questions = new Question[5];
  Player player = new Player();
  public void initGame(){
    for(int i=0;i<5;i++){
      questions[i] = new Question();
    }
    questions[0].question="Which of the following is not a Java features?";
    questions[0].op1="Dynamic";
    questions[0].op2="Architectural Neutral";
    questions[0].op3="Use of pointers";
    questions[0].op4="Object-oriented";
    questions[0].correct_ans=3;
    
    questions[1].question="What is the initial quantity of the ArrayList list?";
    questions[1].op1="5";
    questions[1].op2="10";
    questions[1].op3="0";
    questions[1].op4="100";
    questions[1].correct_ans=2;
    
    questions[2].question="_____ is used to find and fix bugs in the Java programs.";
    questions[2].op1="JVM";
    questions[2].op2="JRE";
    questions[2].op3="JDK";
    questions[2].op4="JDB";
    questions[2].correct_ans=4;
    
    questions[3].question="Which package contains the Random class?";
    questions[3].op1="java.util package";
    questions[3].op2="java.lang package";
    questions[3].op3="java.awt package";
    questions[3].op4="java.io package";
    questions[3].correct_ans=1;
    
    questions[4].question="In java, jar stands for_____.";
    questions[4].op1="Java Archive Runner";
    questions[4].op2="Java Application Resource";
    questions[4].op3="Java Application Runner";
    questions[4].op4="None of the above";
    questions[4].correct_ans=4;
  }
  public void play(){
    player.getDetails();
    for(int i=0;i<5;i++){
      boolean status = questions[i].askQuestion();
      if(status==true){
        System.out.println("Your answer is correct!!");
        player.score = player.score+2;
      }
      else{
        System.out.println("Your answer is wrong.");
      }
    }
    System.out.println(player.name+" Your score is: "+player.score);
  }
}