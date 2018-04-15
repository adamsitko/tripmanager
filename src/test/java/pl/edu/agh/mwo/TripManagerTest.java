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
	Trip to = new Trip(description);
	assertNotNull(to);
	}
	
	@Test
	public void testIfTripHasNameAndDescription() {
	String name = "wycieczka";
	String description = "opis";
	Trip tow = new Trip(name, description);
	assertNotNull(tow);
	}
	
	@Test
	public void testTripAddPhotos() {
	String name = "wycieczka";
	String description = "opis";
	Trip t = new Trip(name, description);
	Photo photo = new Photo();
	t.addPhoto(photo);	
	assertNotNull(t);
	}
	
	@Test
	public void testTripGetPhotos() {
	String name = "wycieczka";
	String description = "opis";
	Trip t = new Trip(name, description);
	Photo photo = new Photo();
	t.addPhoto(photo);		
	assertTrue(t.getPhotos().contains(photo));
	}
	
}
