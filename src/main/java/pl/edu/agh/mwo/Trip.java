package pl.edu.agh.mwo;

import java.util.ArrayList;

public class Trip {
	
	
	public Trip(String name) {
		// TODO Auto-generated constructor stub
	}

	public Trip() {
		// TODO Auto-generated constructor stub
	}

	public Trip(String name, String description) {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Object> Photos = new ArrayList<Object>();

	public void addPhoto(Object photo) {
		Photos.add(photo);		
	}
	
	public ArrayList<Object> getPhotos() {
		return Photos;
	}

}
