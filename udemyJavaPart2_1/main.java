package udemyJavaPart2_1;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
//		Person I = new Person("Name","Japanese","10/21/1982",3);
//
//		if(I.applyPassport() == true)
//		{
//			I.setPassport();
//		}
		
//		I.name = "Jason Strange";
//		I.nationality = "Japanese";
//		I.dateOfBirth = "10/21/1982";
//		I.passport = new String[]{I.name, I.nationality, I.dateOfBirth};
//		I.seatNumber = 3;

//		System.out.println(I.getName());
//		System.out.println(I.getNationality());
//		System.out.println(I.getDateOfBirth());
//		System.out.println(I.getSeatNumber());
//		System.out.println(Arrays.toString(I.getPassport()));

		//System.out.println(I);
		
		
		//Person U = new Person(I);
		//U.setSeatNumber(4);
//		if(I.applyPassport() == true)
//		{
//			System.out.println("Congrats " + I.getName() + " Your Passport was approved " );
//		}
//		else
//		{
//			System.out.println("Sorry " + I.getName() + " we cant process the application " );
//		}
		
		//System.out.println(U.getName());
		//System.out.println(U.getNationality());
		//System.out.println(U.getDateOfBirth());
		//System.out.println(Arrays.toString(I.passport));
		//System.out.println(U.getSeatNumber());
		
		  Person[] people = new Person[] {
		            new Person("Cleopatra", "Egypt", "69 BC", 1),
		            new Person("Alexander the Great", "Macedon", "356 BC", 2),
		            new Person("Julius Caesar", "Rome", "100 BC", 3),
		            new Person("Hannibal", "Carthage", "247 BC", 4),
		            new Person("Confucius", "China", "551 BC", 5),
		            new Person("Pericles", "Greece", "429 BC", 6),
		            new Person("Spartacus", "Thrace", "111 BC", 7),
		            new Person("Marcus Aurelius", "Rome", "121 AD", 8),
		            new Person("Leonidas", "Greece", "540 BC", 9),
		            new Person("Sun Tzu", "China", "544 BC", 10),
		            new Person("Hammurabi", "Babylon", "1750 BC", 11),
		        };
		 
		        Airline airline = new Airline();
		 
		        for (int i = 0; i < people.length; i++) {
		            airline.setPerson(people[i]);
		        }
		 
//		        System.out.println(airline.getPerson(1));
//		        System.out.println(airline.getPerson(5));
//		        System.out.println(airline.getPerson(10));
		 
		    
		
		
		
	}

}
