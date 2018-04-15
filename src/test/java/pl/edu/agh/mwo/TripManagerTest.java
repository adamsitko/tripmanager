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
	
	@Test
	public void testPhotoWithComment() {
	String comment = "wycieczka";
	Photo photo = new Photo(comment);
	assertNotNull(photo);
	}
	
	@Test
	public void testPhotoWithoutComment() {
	Photo photo = new Photo();
	assertNotNull(photo);
	}
	
	@Test
	public void testAddTripToTripManager() {
	Trip t = new Trip();
	TripManager tm = new TripManager();
	tm.addTrip(t);
	assertNotNull(tm);
	}
	
	@Test
	public void testGetTripsFromTripManager() {
	Trip t = new Trip();
	TripManager tm = new TripManager();
	tm.addTrip(t);
	assertTrue(tm.getTrips().contains(t));
	}
	
	@Test
	public void testRemoveTripFromTripManager() {
	Trip a = new Trip();
	Trip b = new Trip();
	TripManager tm = new TripManager();
	tm.addTrip(a);
	tm.addTrip(b);
	tm.removeTrip(1);
	assertFalse(tm.getTrips().contains(b));
	}
	
	@Test
	public void testFindTripinTripManager() {
	Trip a = new Trip("Wieliczka", "Kopalnia");
	Trip b = new Trip("Zakopane", "Rysy");
	TripManager tm = new TripManager();
	tm.addTrip(a);
	tm.addTrip(b);
	assertEquals(tm.findTrip("Wieliczka").get(0), a);
	}
	
	@Test
	public void testFindTripinTripManagerFailure() {
	Trip a = new Trip("Wieliczka", "Kopalnia");
	Trip b = new Trip("Zakopane", "Rysy");
	TripManager tm = new TripManager();
	tm.addTrip(a);
	tm.addTrip(b);
	assertTrue(tm.findTrip("Bochnia").isEmpty());
	}
	
	@Test
	public void testFindTripinTripManagerByDescription() {
	Trip a = new Trip("Wieliczka", "Kopalnia");
	Trip b = new Trip("Zakopane", "Rysy");
	TripManager tm = new TripManager();
	tm.addTrip(a);
	tm.addTrip(b);
	assertEquals(tm.findTrip("Rysy").get(0), b);
	}
	
}
