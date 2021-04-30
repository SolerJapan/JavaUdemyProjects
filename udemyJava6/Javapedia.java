package udemyJava6;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
       int num = scan.nextInt();
       scan.nextLine(); 
       
       String[][] array = new String[num][3];
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
         
       
        //Watch out for the nextLine() pitfall. 
        /* Task 3 
         */
       String name;
       String birthday;
       String occupation;
        for (int i = 0; i<num; i++) {
            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t • Name: ");
            array[i][0] = scan.nextLine();
            //pick up and store figure's name.   
            System.out.print("\t • Date of birth: ");
            array[i][1] = scan.nextLine();
            //pick up and store figure's birthday.
            System.out.print("\t • Occupation: ");
            array[i][2] = scan.nextLine();            
            //pick up and store figure's occupation. 
            System.out.print("\n");
        }
        
       
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(array);
        System.out.print("\nWho do you want information on? ");  
        String Search = scan.nextLine();
        for(int s = 0; s < array.length; s++ )
        	if(array[s][0].equals(Search))
        	{
        		System.out.println("item found");
        		System.out.println("Name: " + array[s][0]);
        		System.out.println("Date of birth: " + array[s][1]);
        		System.out.println("Occupation: " + array[s][2]);
        	}
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)
        */        
         		
        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}