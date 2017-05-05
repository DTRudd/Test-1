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
	 * 
	 * @param firstName first name of person.
	 * @param secondName surname of person.
	 * @param dateOfBirth date of birth of person.
	 * @param nationality nationality of person.
	 * @param visaInformation information of person's visa.
	 */
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
	
	/**
	 * Person's first name.
	 */
	protected String firstName;
	/**
	 * Person's surname.
	 */
	protected String secondName;
	/**
	 * Person's dob.
	 */
	protected GregorianCalendar dateOfBirth;
	/**
	 * Person's nationality.
	 */
	protected String nationality;
	/**
	 * Person's visa information.  Null if nationality is British.
	 */
	protected String visaInformation;
	
	/**
	 * @return the person's first name.
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @param firstName the person's new first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return the person's surname.
	 */
	public String getSecondName() {
		return secondName;
	}

	/**
	 * 
	 * @param secondName the person's new surname.
	 */
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	/**
	 * 
	 * @return the person's date of birth
	 */
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth the person's new date of birth.
	 */
	public void setDateOfBirth(GregorianCalendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * 
	 * @return the person's nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * 
	 * If moving from non-British to British nationality, removes visa information.
	 * If moving from British to non-British nationality, adds visa information.
	 * @param nationality the new nationality.
	 * @param visaInformation visa information (if moving to British, may be null).
	 */
	public void setNationality(String nationality, String visaInformation) {
		this.nationality = nationality;
		if (!this.nationality.equals("British")){
			this.visaInformation = visaInformation;
		} else {
			this.visaInformation = null;
		}
	}

	/**
	 * 
	 * @return the person's visa information.
	 */
	public String getVisaInformation() {
		return visaInformation;
	}

	/**
	 * 
	 * @param visaInformation the person's visa string.
	 */
	public void setVisaInformation(String visaInformation) {
		this.visaInformation = visaInformation;
	}

}
