package udemyJava3;




public class AskJava {
public static void main(String[] args) {
		
		double change = 3.50;
		double chips = 2.50;
		
		System.out.println("\nMe: Hi Java do I have enough to buy chips ");
		
		System.out.println("\nJava: " + (change > chips));
		
		int elevator = 15;
		int people = 12;
		
		System.out.println("\nMe: Hi Java can the elevator handle the people ");
		
		System.out.println("\nJava: " + (elevator > people));
		
		String gift = "toy";
		String wanted = "PS5";
		
		System.out.println("\nMe: Hi Java is my friend happy with my gift ");
		
		System.out.println("\nJava: " + (gift.equals(wanted)));
		
		int apart = 20;
		int guests = 40;
		
		System.out.println("\nMe: Hi Java can everyone attend my dinner party? ");
		
		System.out.println("\nJava: " + (apart > guests));
		
		int votes = 3000;
		int opponent = 5000;
		
		System.out.println("\nMe: Hi Java cwill I win the election? ");
		
		System.out.println("\nJava: " + (votes > opponent));
		
//		Scanner scan = new Scanner(System.in);	
//	    scan.close();
	}
}
