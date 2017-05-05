package test1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Test;

public class AppTest {

	@Test
	public final void testParseMarinas() {
		ArrayList<String> mTs = new ArrayList<String>();
		mTs.add("Marinas");
		mTs.add("");
		mTs.add("First Marina");
		mTs.add("1 Marina road");
		mTs.add("1000");
		mTs.add("|");
		mTs.add("Second Marina");
		mTs.add("2 Marina road");
		mTs.add("1000");
		mTs.add("|");
		mTs.add("");
		ArrayList<Marina> ms = new ArrayList<Marina>();
		ms.add(new Marina("First Marina", "1 Marina road", 1000));
		ms.add(new Marina("Second Marina", "2 Marina road",1000));
		assertEquals(ms.get(0),App.parseMarinas(mTs).get(0));
		assertEquals(ms.get(1),App.parseMarinas(mTs).get(1));
	}

	@Test
	public final void testParseBoats() {
		ArrayList<String> bTs = new ArrayList<String>();
		bTs.add("Boats");
		bTs.add("");
		bTs.add("First Boat");
		bTs.add("Portugal");
		bTs.add("1.0");
		bTs.add("|");
		bTs.add("Second Boat");
		bTs.add("Spain");
		bTs.add("100.0");
		bTs.add("|");
		bTs.add("");
		ArrayList<Boat> bs = new ArrayList<Boat>();
		bs.add(new Boat("First Boat", "Portugal", 1.0));
		bs.add(new Boat("Second Boat", "Spain",100.0));
		assertEquals(bs.get(0),App.parseBoats(bTs).get(0));
		assertEquals(bs.get(1),App.parseBoats(bTs).get(1));
	}

	@Test
	public final void testParsePeople() {
		ArrayList<String> pTs = new ArrayList<String>();
		pTs.add("People");
		pTs.add("");
		pTs.add("John Smith");
		pTs.add("11/12/1966");
		pTs.add("British");
		pTs.add("|");
		pTs.add("Jane Doe");
		pTs.add("12/9/1969");
		pTs.add("American");
		pTs.add("9876541/Y");
		pTs.add("|");
		ArrayList<Person> ps = new ArrayList<Person>();
		ps.add(new Person("John","Smith",new GregorianCalendar(1966,12,11),"British",null));
		ps.add(new Person("Jane","Doe",new GregorianCalendar(1969,9,12),"American","9876541/Y"));
		assertEquals(ps.get(0),App.parsePeople(pTs).get(0));
		assertEquals(ps.get(1),App.parsePeople(pTs).get(1));
	}

}
