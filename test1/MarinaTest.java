package test1;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.ArrayList;

import org.junit.Test;

public class MarinaTest {

	@Test
	public final void testMarina() {
		Marina m = new Marina("The Marina", "1 Marina road", 100);
		assertNotNull(m);
	}

	@Test
	public final void testGetSize() {
		Marina m = new Marina("The Marina", "1 Marina road", 100);
		assertEquals(100, m.getSize(),0.01);
	}

	@Test
	public final void testSetSize() {
		Marina m = new Marina("The Marina", "1 Marina road", 100);
		m.setSize(1000);
		assertEquals(1000,m.getSize(),0.01);
	}

	@Test
	public final void testGetUsedSize() {
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		assertEquals(b.getSize(),m.getUsedSize(),0.01);
	}
	
	@Test
	public final void testGetBoats(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		assertEquals(new ArrayList<Boat>(),m.getBoats());
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		ArrayList<Boat> a = new ArrayList<Boat>();
		a.add(b);
		assertEquals(a,m.getBoats());
	}
	
	@Test
	public final void testAddBoat(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		assertTrue(m.getBoats().contains(b));
	}
	
	@Test
	public final void testRemoveBoat(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		Boat b = new Boat("The QA Schooner","United Kingdom",300,new Person("Horatio","Nelson",new GregorianCalendar(1760,5,3),"British",null));
		m.add(b);
		m.remove(b);
		assertTrue(m.getBoats().size() == 0);
	}
	
	@Test
	public final void testGetName(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		assertEquals("The Marina",m.getName());
	}
	
	@Test
	public final void testSetName(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		m.setName("The Other Marina");
		assertEquals("The Other Marina",m.getName());
	}
	
	@Test
	public final void testGetAddress(){
		Marina m = new Marina("The Marina", "1 Marina road", 1000);
		assertEquals("1 Marina road",m.getAddress());
	}
	
	@Test
	public final void testSetAddress(){
		Marina m = new Marina("The Marina","1 Marina road",1000);
		m.setAddress("2 Marina road");
		assertEquals("2 Marina road",m.getAddress());
	}
	
	@Test
	public final void testEquals(){
		Marina m = new Marina("The Marina","1 Marina road",1000);
		Marina n = new Marina("The Marina","1 Marina road",1000);
		assertEquals(m,n);
		m = new Marina("The Marina","1 Marina road",100);
		assertFalse(m.equals(n));
	}
	
	@Test
	public final void testHashCode(){
		Marina m = new Marina("The Marina","1 Marina road",1000);
		Marina n = new Marina("The Marina","1 Marina road",1000);
		assertEquals(m.hashCode(),n.hashCode());
		m = new Marina("The Marina","1 Marina road",100);
		assertFalse(m.hashCode() == n.hashCode());
	}
}
