package udemyJava4;

public class Weather {

	public static void main(String[] args) {
		
		double noon = 77;
		double evening = 61;
		double midnight = 55;
    
		double cnoon = fahrenheitToCelsius(noon);
		double cevening = fahrenheitToCelsius(evening);
		double cmidnight = fahrenheitToCelsius(midnight);
		
		System.out.println(cnoon);
		System.out.println(cevening);
		System.out.println(cmidnight);
		
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32) * 5/9;
		return celsius;
	}
}
