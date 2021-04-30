package udemyJava2;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.println("Welcome to JavaGram! Let's sign you up.");
	        

	        //Task 1 - Using Scanner, ask the user questions
	        
	        System.out.println("Whats your first name!");
	        //Ask for their first name.
	        String fname = scan.nextLine();
	        System.out.println("Whats your last name!");
	        //Ask for their last name.
	        String lname = scan.nextLine();
	        System.out.println("Whats your age!");
	        //Ask: how old are you?
	        int age = scan.nextInt();
	        scan.nextLine();
	        System.out.println("Whats your username!");
	        //Ask them to make a username.
	        String uname = scan.nextLine();
	        System.out.println("What city do you live in!");
	        //Ask what city they live in.
	        String city = scan.nextLine();
	        System.out.println("What country do you live in!");
	        //Ask what country that's from.
	        String country = scan.nextLine();
	        

	        //Task 2 - Print their information. 

	        System.out.println("Thank you for joining JavaGram!");

	        //Print their information like so:

	        // Your information:
	        //        First Name: Rayan
	        //        Last Name: Slim
	        //        Age: 27
	        //        Username: monotonic_relu
	        //        City: Ottawa
	        //        Country: Canada
	        //
	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);          
	        System.out.println("Age: " + age);
	        System.out.println("Username: " + uname);
	        System.out.println("City: " + city);
	        System.out.println("Country: " + country);
	        

	        //close scanner. It's good practice :D ! 
	        scan.close();
	}

}
