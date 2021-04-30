package udemyJava3;

public class Weather {

	public static void main(String[] args) {
		int temp = 25;
		String forecast = "";
		
		if(temp<0 && temp>-15)
		{
			forecast = "Freezing stay home";
		}
		else if(temp>0 && temp<10)
		{
			forecast = "chilly wear a coat";
		}
		else 
		{
			forecast = "it's warm";
		}
		System.out.println(forecast);

	}

}
