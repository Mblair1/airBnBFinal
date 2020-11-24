package services;

import java.util.ArrayList;

import com.citadel.edu.model.House;

public class HouseService {
	public static ArrayList<House> houses = new ArrayList<House>();
	
	public HouseService() {
		
	}
	public ArrayList<House> getHouses() {
		return houses;
	}
	public void addHouse(House house) {
		houses.add(house);
	}
}
