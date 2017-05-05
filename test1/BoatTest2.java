package test1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.HashSet;

public class BoatTest2 {

	static Person horatio;
	static Person crusoe;
	static Person fletcher;
	static Person cook;
	@BeforeClass
	public static final void setUpBeforeClass(){
		horatio = new Person("Horatio","Nelson",
				new GregorianCalendar(1760,5,3),"British",null);
		crusoe = new Person("Robinson","Crusoe",
				new GregorianCalendar(1610,4,4),"English",null);
		fletcher = new Person("Fletcher","Christian",
				new GregorianCalendar(1740,3,2),"British",null);
		cook = new Person("James","Cook",
				new GregorianCalendar(1732,12,7),"British",null);
	}
	
	@Test
	public final void testBoatStringStringIntPerson() {
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio);
		assertNotNull(b);
	}

	@Test
	public final void testBoatStringStringIntPersonPerson() {
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crusoe);
		assertNotNull(b);
	}

	@Test
	public final void testBoatStringStringIntPersonPersonHashSetOfPerson() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crusoe,crew);
		assertNotNull(b);
	}

	@Test
	public final void testBoatStringStringIntPersonHashSetOfPerson() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crew);
		assertNotNull(b);
	}

	@Test
	public final void testBoatStringStringIntHashSetOfPerson() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,crew);
		assertNotNull(b);
	}

	@Test
	public final void testGetOwner() {
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio);
		assertEquals(horatio,b.getOwner());
	}

	@Test
	public final void testSetOwner() {
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio);
		b.setOwner(cook);
		assertEquals(cook,b.getOwner());
	}

	@Test
	public final void testGetCaptain() {
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crusoe);
		assertEquals(crusoe,b.getCaptain());
	}

	@Test
	public final void testSetCaptain() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crew);
		b.setCaptain(cook);
		assertNull(b.getCaptain());
		b.setCaptain(crusoe);
		assertEquals(crusoe,b.getCaptain());
	}

	@Test
	public final void testGetCrew() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,crew);
		assertEquals(crew,b.getCrew());
	}

	@Test
	public final void testSetCrew() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		crew.add(cook);
		crew.add(crusoe);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crusoe);
		b.setCrew(crew);
		assertEquals(0,b.getCrew().size());
		crew.remove(crusoe);
		b.setCrew(crew);
		assertEquals(crew,b.getCrew());
	}

	@Test
	public final void testAddCrewMember() {
		HashSet<Person> crew = new HashSet<Person>();
		crew.add(fletcher);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio,crusoe,crew);
		b.addCrewMember(crusoe);
		assertFalse(b.getCrew().contains(crusoe));
		b.addCrewMember(cook);
		assertTrue(b.getCrew().contains(cook));
	}
	
	@Test
	public final void testGetCurrentMarina(){
		Boat b = new Boat("The QA Schooner","United Kingdom",300,horatio);
		Marina m = new Marina(1000);
		m.add(b);
		assertEquals(m,b.getCurrentMarina());		
	}
	
	@Test
	public final void testSetCurrentMarina(){
		Boat b = new Boat("The QA Schooner","United Kingdom",300);
		Marina m = new Marina(1000);
		b.setCurrentMarina(m);
		assertEquals(m,b.getCurrentMarina());	
	}
}
