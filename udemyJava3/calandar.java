package udemyJava3;

public class calandar {

	public static void main(String[] args) {
		String day = "friday";
		System.out.println("are you free on " + day + "? \n");
		
		System.out.println("let me check");
		
		switch(day)
		{
			case "monday":
			{
				System.out.println("sorry i have work");
				break;
			}
			case "tuesday":
			{
				System.out.println("i have meetings");
				break;
			}
			case "wednesday":
			{
				System.out.println("i have a dentist");
				break;
			}
			case "thursday":
			{
				System.out.println("date night");
				break;
			}
			case "friday":
			{
				System.out.println("im free");
				break;
			}
			case "saturday":
			{
				System.out.println("im free");
				break;
			}
			case "sunday":
			{
				System.out.println("im free");
				break;
			}
			case "default": 
			{
				System.out.println("not a day");
				break;
			}
		
		}
	}

}
