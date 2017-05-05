package test1;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.ArrayList;

import org.junit.Test;

public class MarinaTest {

	@Test
	public final void testMarina() {
		Marina m = new Marina(100);
		assertNotNull(m);
	}

	@Test
	public final void testGetSize() {
		Marina m = new Marina(100);
		assertEquals(100, m.getSize());
	}

	@Test
	public final void testSetSize() {
		Marina m = new Marina(100);
		m.setSize(1000);
		assertEquals(1000,m.getSize());
	}

	@Test
	public final void testGetUsedSize() {
		Marina m = new Marina(1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		assertEquals(b.getSize(),m.getUsedSize());
	}
	
	@Test
	public final void testGetBoats(){
		Marina m = new Marina(1000);
		assertEquals(new ArrayList<Boat>(),m.getBoats());
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		ArrayList<Boat> a = new ArrayList<Boat>();
		a.add(b);
		assertEquals(a,m.getBoats());
	}
	
	@Test
	public final void testAddBoat(){
		Marina m = new Marina(1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		assertTrue(m.getBoats().contains(b));
	}
	
	@Test
	public final void testRemoveBoat(){
		Marina m = new Marina(1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		m.remove(b);
		assertTrue(m.getBoats().size() == 0);
	}
}
