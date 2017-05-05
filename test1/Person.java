/**
 * This is my code for stage 1 of the Java test.
 */
package test1;

import java.util.GregorianCalendar;

/**
 * @author Sophie Rudd
 * 
 */
public class Person {

	/**
	 * Fields :
	 * firstName - first name of person
	 * secondName - surname of person
	 * dateOfBirth - birthday of person
	 * nationality - nationality of person
	 * visaInformation - information about visa of person.  null if nationality is British.
	 */
	
	String firstName;
	String secondName;
	GregorianCalendar dateOfBirth;
	String nationality;
	String visaInformation;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVisaInformation() {
		return visaInformation;
	}

	public void setVisaInformation(String visaInformation) {
		this.visaInformation = visaInformation;
	}

	public Person(String firstName, String secondName, GregorianCalendar dateOfBirth, String nationality,
			String visaInformation) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		if (!this.nationality.equals("British")){
			this.visaInformation = visaInformation;
		} else {
			this.visaInformation = null;
		}
	}

}
