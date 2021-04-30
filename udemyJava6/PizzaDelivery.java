package udemyJava6;
import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
        System.out.println("How many pizza toppings do you want? " );
        int tnum = scan.nextInt();
        scan.nextLine();
        
        // Task 2 – Create the array here

        String toppings[] = new String[tnum];
        
        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */
        System.out.println("great " );
        
        for (int i=0; i<toppings.length; i++)
        {
        	System.out.println("give me topping " + i );
        	toppings[i] = scan.nextLine();
        }
        
        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        for (int j=0; j<toppings.length; j++)
        {
        	System.out.println( j + ":" + toppings[j]);
        	
        }
        
        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}