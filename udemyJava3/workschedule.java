package udemyJava3;

public class workschedule {

	public static void main(String[] args) {
		int day = 6;
		boolean holiday = false;

		if(holiday)
		{
			System.out.println("its the holiday time to sleep");
		}
		else if(day == 6 || day == 7)
		{
			System.out.println("its the weekend time to sleep");
		}
		else 
		{
			System.out.println("wake up at 7 for work");
		}
	}

}
