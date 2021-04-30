package udemyJava6;
public class HighScore1 {
    public static void main(String[] args) {
        
    	int rnumbers[] = {0,0,0,0,0,0,0,0,0,0};
    	for (int i = 0; i<10; i++)
    	{
    		rnumbers[i] = randomNumber();
    	}
        /** Task 2 
         *
         *    1. Create an array that stores 10 random numbers
         *    2. Using a for loop, print the array elements on the same line.
         *         Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711 32863 23707
         */
        int highScore = 0;

         /** Task 3
          *  
          *   1. Using a for loop, find the highest score in the array and update the highScore.
          *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");
          */
         for (int s = 0; s < rnumbers.length; s++) {
            
          	if(highScore < rnumbers[s])
           	{
          		highScore = rnumbers[s];
           	}
         	
          }
         
         System.out.println("The highest score is " + highScore);
    }
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    public static int randomNumber() {
    	double compplay = (Math.random() * 50000);
		compplay += 1;
		return (int)compplay;
    }

}