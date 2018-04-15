package pl.edu.agh.mwo;

import java.util.ArrayList;

public class TripManager {
	
	private ArrayList<Trip> trips = new ArrayList<Trip>();
	private ArrayList<Trip> searchedTrips = new ArrayList<Trip>();

	public void addTrip(Trip t) {
		trips.add(t);
	}

	public ArrayList<Trip> getTrips() {
		return trips;
	}

	public void removeTrip(int i) {
		trips.remove(i);		
	}

	public ArrayList<Trip> findTrip(String string) {
		searchedTrips.clear();
		for (int i=0; i<trips.size(); i++){
			if (((trips.get(i).getName()).contains(string)) || ((trips.get(i).getDescription()).contains(string))){
				searchedTrips.add(trips.get(i));
			}
		}
		return searchedTrips;
	}


}
