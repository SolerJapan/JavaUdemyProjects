package udemyJava5;
import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println(" � If you roll a 6 the game stops.");
        System.out.println(" � If you roll a 4 nothing happens.");
        System.out.println(" � Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        int score = 0;

        
      
        while (true) {
            scan.nextLine();
            int diceRoll = rollDice();
            System.out.print("You rolled a "+diceRoll+". ");
            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
            } else {
                score++;
                System.out.println("One point. Keep rolling.");    
            }
        }
        
        System.out.println("\nYour score is: " + score);

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :( ");
        }
        scan.close();

      
      /* Task 7
      
           1.  After the game ends, check the user's points.
       
                 System.out.println("\nYour score is: " + score);
           2. If the score is greater than or equal to 3, print:
                  Wow, that's lucky. You win!
              Otherwise, print:
                  Tough luck, you lose :( 
      */

    }
  
  
    /** Task 4
     * Function name: rollDice � rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */ 
    public static int rollDice()
    {
       double num = (Math.random() * 6);
       num += 1;
 	   return (int)num;
    }
  
}