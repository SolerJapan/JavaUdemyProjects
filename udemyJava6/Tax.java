package udemyJava6;
import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */

        double aftertax [] = {0.13,0.13,0.13,0.13};
        
         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */
        for (int i = 0; i<4; i++)
        {
             aftertax[i] = price[i] +(price[i] * aftertax[i]);
        }
         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */
         
        for (int j = 0; j<4; j++)
        {
             System.out.println("The original prices are: " + price[j] );
             System.out.println("The prices after tax are: " + aftertax[j] );
        }

    }
}