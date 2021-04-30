package udemyJavaPart2_1;

import java.util.Arrays;
import java.util.Random;

public class Person {

	private String name;
	private String nationality;
	private String dateOfBirth;
	private String[] passport;
	private int seatNumber;
	//applyPassport;
	//chooseSeat();

	
	public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
		this.name = name;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.seatNumber = seatNumber;
		this.passport = new String[3];
	}
	
	public Person(Person source) {
		this.name = source.name;
		this.nationality = source.nationality;
		this.dateOfBirth = source.dateOfBirth;
		this.seatNumber = source.seatNumber;
		this.passport = Arrays.copyOf(source.passport, source.passport.length);
	}
	
	
	public String[] getPassport() {
		return Arrays.copyOf(this.passport, this.passport.length);
	}

	public void setPassport() {
		this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public static boolean applyPassport() {
		
		Random rd = new Random();
		return rd.nextBoolean();
	}
	
	  public String toString() {
        return "Name: " + this.name + "\n"
        +  "Nationality: " + this.nationality + "\n"
        +  "Date of Birth: " + this.dateOfBirth + "\n"
        +  "Seat Number: " + this.seatNumber + "\n"
        +  "Passport: " + Arrays.toString(this.passport) + "\n";
    }
	
	
public static int chooseSeat() {
		
		double randomNumber = (Math.random()*11)+1;
		return (int)randomNumber;
	}

}
