package udemyJava5;
import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
    	
    	
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);

       double compplay = (Math.random() * 5);
	   compplay += 1;
	   int num = (int)compplay;
       
	   int guess = 0;
	   guess = scan.nextInt();
	   
	   while(guess != num)
	   {
		   System.out.println("wrong number try again");
		   guess = scan.nextInt();
	   }
	   System.out.println("you guess right");

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '
            2. Once they guess it, print: You got it!
        */        
        scan.close();
    }

}