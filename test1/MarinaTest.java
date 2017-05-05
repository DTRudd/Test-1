package test1;

import static org.junit.Assert.*;

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

}
