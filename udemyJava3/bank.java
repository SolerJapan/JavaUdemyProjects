package udemyJava3;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n****Royal Bank of Genso****");
		System.out.println("are you here for a morgage? yes / no");
		
		String answer = scan.nextLine();
		
		if(answer.equals("yes"))
		{
			System.out.println("\n Good then in one line " +
		    "\nHow much money do you have in your savings" +
			"\nAnd, how much do you owe in credit card debt?");
			int savings = scan.nextInt();
			int debt = scan.nextInt();	
			scan.nextLine();
			
			System.out.println("\n how many years have you worked");
			int experience = scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("\n whats your name");
			String name = scan.nextLine();
			
			if(savings > 10000 && debt < 5000 && experience > 2)
			{
				System.out.println("\n congrats approved");
			}
			else
			{
				System.out.println("\n sorry not eligible");
			}
		}
		else 
		{
			System.out.println("\n ok have a nice day");
		}
		scan.close();
	}

}
