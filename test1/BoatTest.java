package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoatTest {

	@Test
	public final void testBoatStringStringInt() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		assertNotNull(b);
	}

	@Test
	public final void testGetName() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		assertEquals("The Red Pig",b.getName());
	}

	@Test
	public final void testSetName() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		b.setName("Sea Trekker");
		assertEquals("Sea Trekker",b.getName());
	}

	@Test
	public final void testGetCountry() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		assertEquals("Portugal",b.getCountry());
	}

	@Test
	public final void testSetCountry() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		b.setCountry("Paraguay");
		assertEquals("Paraguay",b.getCountry());
	}

	@Test
	public final void testGetSize() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		assertEquals(200.0, b.getSize());
	}

	@Test
	public final void testSetSize() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		b.setSize(75);
		assertEquals(75, b.getSize());
	}

	@Test
	public final void testGetSpeed() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		assertEquals(0,b.getSpeed());
	}

	@Test
	public final void testAccelerate() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		int initSpeed = b.getSpeed();
		b.accelerate();
		assertEquals(initSpeed+1,b.getSpeed());
	}

	@Test
	public final void testDecelerate() {
		Boat b = new Boat("The Red Pig","Portugal",200);
		int initSpeed = b.getSpeed();
		b.decelerate();
		assertEquals(initSpeed-1,b.getSpeed());
	}

}
