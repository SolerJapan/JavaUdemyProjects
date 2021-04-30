package chatbot;

import java.util.Scanner;

public class chatbot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nYo, Whats your name!");
	        //Ask for their first name.
	    String name = scan.nextLine();
	      
	    System.out.println("\nWhats up " + name + " im the bot. Where are you from!");
	    
	    String location = scan.nextLine();
	    
	    System.out.println("\n Nice. I hear it's great at " + location + " im from philly ");
	
	    System.out.println("\nSo, how old are you");
	    
	    int age = scan.nextInt();
	    scan.nextLine();
	    
	    System.out.println("\n Wow " + age + " I'm only " + (age*3) + " 3 times older...");
	    
	    System.out.println("\nAnyways whats your best language ");
	    
	    String language = scan.nextLine();
	    
	    System.out.println("\n" + language + ", Sweet. Been nice chatting gotta go. Have a good one");
	
	    scan.close();
	}

}
