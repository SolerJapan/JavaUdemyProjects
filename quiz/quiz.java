package quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		int score = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Which country held the 2016 olympics");
		System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
		String answer1 = scan.nextLine();
		
		if(answer1.equals("b"))
		{
			score+=5;
		}
		
		System.out.println("2. Which planet is the hottest");
		System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
		String answer2 = scan.nextLine();
		
		if(answer2.equals("c"))
		{
			score+=5;
		}
		
		System.out.println("1. What is the rarest blood type");
		System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB\n");
		String answer3 = scan.nextLine();
		
		if(answer3.equals("a"))
		{
			score+=5;
		}
		
		System.out.println("1. Which is one not Harry Potter's Friends");
		System.out.println("\ta) Ron Weasley\n\tb) Hermoine Granger\n\tc) Draco Malfoy\n");
		String answer4 = scan.nextLine();
		
		if(answer4.equals("c"))
		{
			score+=5;
		}
		
		System.out.println("you have scored " + score + " points");
		
		scan.close();
	}

}
