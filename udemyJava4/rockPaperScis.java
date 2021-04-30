package udemyJava4;

import java.util.Scanner;

public class rockPaperScis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lets play rps");
		System.out.println("are you ready");
		String response = scan.nextLine();
		
		int play = 0;
		
		
		if(response.equals("yes")) {
			System.out.println("ok lets get started");
			System.out.println("choose rock, paper, scissor");
			String choice = scan.nextLine();
			
			if(choice.equals("rock")) {
				play = 1;
			}
			else if(choice.equals("paper")){
				play = 2;
			}
			else if(choice.equals("scissor")){
				play = 3;
			}
			else {
				System.out.println("were not getting anywhere if not rps");
				System.exit(0);
			}
			
			System.out.println("now ill pick");
			String compChoice = "";
			
			int number = rvp(); 
			if(number == 0) {
				compChoice = "rock";
			}
			else if(number == 1) {
				compChoice = "paper";
			}
			else if(number == 2) {
				compChoice = "scissor";
			}
			
			System.out.println("your choice " + choice);
			System.out.println("computer choice " + compChoice);
			
		}
		else
		{
			System.out.println("oh well");
		}
		scan.close();
	}
	
	public static int rvp() {
		double compplay = (Math.random() * 2);
		compplay += 1;
		return (int)compplay;
	}
	
	

}
