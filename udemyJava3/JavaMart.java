package udemyJava3;

public class JavaMart {
	public static void main(String[] args) {
    
		double wallet = 100;
		double toyCar = 5.99;
		
		System.out.println("\n can i get a  toycar ");
		
		if(wallet>toyCar)
		{
			System.out.println("sure i got enough");
			wallet -= toyCar;        	
		}
		else 
		{
			System.out.println("sorry i got only" + wallet);
		}	
	}
}
