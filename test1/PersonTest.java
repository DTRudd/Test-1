/**
 * 
 */
package test1;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.GregorianCalendar;

/**
 * @author Administrator
 *
 */
public class PersonTest {

	/**
	 * Test method for {@link test1.Person#getFirstName()}.
	 */
	@Test
	public final void testGetFirstName() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertEquals("John",p.getFirstName());
	}

	/**
	 * Test method for {@link test1.Person#setFirstName(java.lang.String)}.
	 */
	@Test
	public final void testSetFirstName() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		p.setFirstName("Winston");
		assertEquals("Winston",p.getFirstName());
	}

	/**
	 * Test method for {@link test1.Person#getSecondName()}.
	 */
	@Test
	public final void testGetSecondName() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertEquals("Smith",p.getSecondName());
	}

	/**
	 * Test method for {@link test1.Person#setSecondName(java.lang.String)}.
	 */
	@Test
	public final void testSetSecondName() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		p.setSecondName("Adams");
		assertEquals("Adams",p.getSecondName());
	}

	/**
	 * Test method for {@link test1.Person#getDateOfBirth()}.
	 */
	@Test
	public final void testGetDateOfBirth() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertEquals(new GregorianCalendar(1976,11,12), p.getDateOfBirth());
	}

	/**
	 * Test method for {@link test1.Person#setDateOfBirth(java.util.GregorianCalendar)}.
	 */
	@Test
	public final void testSetDateOfBirth() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		p.setDateOfBirth(new GregorianCalendar(1990,4,30));
		assertEquals(new GregorianCalendar(1990,4,30),p.getDateOfBirth());
	}

	/**
	 * Test method for {@link test1.Person#getNationality()}.
	 */
	@Test
	public final void testGetNationality() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertEquals("British",p.getNationality());
	}

	/**
	 * Test method for {@link test1.Person#setNationality(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testSetNationality() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		p.setNationality("Australian","2468357/D");
		assertEquals("Australian", p.getNationality());
		assertEquals("2468357/D",p.getVisaInformation());
		Person q = new Person("Ned","Kelly",new GregorianCalendar(1846,10,5),"Australian","7119443/A");
		q.setNationality("British", null);
		assertNull(q.getVisaInformation());
	}

	/**
	 * Test method for {@link test1.Person#getVisaInformation()}.
	 */
	@Test
	public final void testGetVisaInformation() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertNull(p.getVisaInformation());
		Person q = new Person("Ned","Kelly",new GregorianCalendar(1846,10,5),"Australian","7119443/A");
		assertEquals("7119443/A",q.getVisaInformation());
	}

	/**
	 * Test method for {@link test1.Person#setVisaInformation(java.lang.String)}.
	 */
	@Test
	public final void testSetVisaInformation() {
		Person q = new Person("Ned","Kelly",new GregorianCalendar(1846,10,5),"Australian","7119443/A");
		q.setVisaInformation("1234567/Z");
		assertEquals("1234567/Z",q.getVisaInformation());
	}

	/**
	 * Test method for {@link test1.Person#Person(java.lang.String, java.lang.String, java.util.GregorianCalendar, java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testPerson() {
		Person p = new Person("John","Smith",new GregorianCalendar(1976,11,12),"British",null);
		assertNotNull(p);
	}

}
