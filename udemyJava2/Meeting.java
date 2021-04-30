package udemyJava2;

public class Meeting {

	public static void main(String[] args) {
		 double sales = 24309.65; 
	     double profit = 18562.18; 
	     double refunds = 688.78; 
	     double shipping = 1233.57; 

	     int rsales = (int)sales;
	     int rprofit = (int)profit;
	     int Rrefunds = (int)refunds;
	     int rshipping = (int)shipping;
	     
	     System.out.println("This month, we made " + rsales + " in sales");
	     System.out.println("Factoring in costs, we made " +  rprofit + " in profit");
	     System.out.println("The refunds are at a low " + Rrefunds + " This is a good sign!");
	     System.out.println("Shipping costs were high. We paid " + rshipping + " in shipping");

	}

}
