package udemyJava4;

public class CalculateTip {
	public static void main(String[] args) {
		
		double bill = 53.23; 
		double tip = tipTheWaiter(bill);
		
		System.out.println("the final tip is " + tip);
	}
	
	public static double tipTheWaiter(double cost) {
		
		double tcost = cost * .15; 
		return tcost;
	}
}
