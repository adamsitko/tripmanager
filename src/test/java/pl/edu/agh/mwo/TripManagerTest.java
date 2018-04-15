package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void testIfTripExist() {
	Trip t = new Trip();
	assertNotNull(t);
	}
	
	@Test
	public void testIfTripHasName() {
	String name = "wycieczka";
	Trip tw = new Trip(name);
	assertNotNull(tw);
	}
	
	@Test
	public void testIfTripHasDescription() {
	String description = "opis";
	Trip tw = new Trip(description);
	assertNotNull(tw);
	}
	
	@Test
	public void testIfTripHasNameAndDescription() {
	String name = "wycieczka";
	String description = "opis";
	Trip tw = new Trip(name, description);
	assertNotNull(tw);
	}
	
}
