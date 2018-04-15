package pl.edu.agh.mwo;

import java.util.ArrayList;

public class Trip {
	private String name;
	private String description;
	
	
	public Trip(String nameIncoming) {
		name = nameIncoming;
	}

	public Trip() {
		// TODO Auto-generated constructor stub
	}

	public Trip(String nameIncoming, String descriptionIncoming) {
		name = nameIncoming;
		description = descriptionIncoming;
	}

	private ArrayList<Object> Photos = new ArrayList<Object>();

	public void addPhoto(Object photo) {
		Photos.add(photo);		
	}
	
	public ArrayList<Object> getPhotos() {
		return Photos;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}

}
