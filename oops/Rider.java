package oops;
import java.util.*;
public class Rider {
	private final String name;
	private final int distance;
	private String carModelPreference;
	private int CarNo;
	public Rider(String name,int distance) {
		this.name=name;
		this.distance=distance;
		this.carModelPreference=null;
		
	}
	public void setCarNo(int No) {
		this.CarNo=No;
		
	}
	
	public int getCarNo() {
		return CarNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDistance() {
		return distance;
		
	}
	
	public void setCarModelPreference(String carModel) {
		this.carModelPreference=carModel;
	}
	
	public String getCarModelPrefernce(){
		return carModelPreference;
	}
	
	public void Ride(List<String> CarDrivers, List<Double> Distance,List<Integer> Rating,List<String > CarModels, String carModelPreference) {
		double minDistance=100000000;
		if(carModelPreference==null || !(CarModels.contains(carModelPreference))) {
			for(int i=0;i<Distance.size();i++) {
				if(Distance.get(i)<minDistance && Rating.get(i)>4) {
					minDistance=Distance.get(i);
				}
			}
			if(minDistance==100000000) {
				System.out.println("No Car found try after some time");
			}
			else {
				setCarNo(Distance.indexOf(minDistance));
			}
			
			
		}
		else {
			setCarNo(CarModels.indexOf(carModelPreference));
			
		}
	}
	
	public String Charges(int distance,int CarNo,List<String> CarDrivers,List<Integer> Rating,List<String > CarModels) {
		return "The Driver: "+CarDrivers.get(CarNo)+"with car model: "+CarModels.get(CarNo)+"and a rating of: "+Rating.get(CarNo)+"chargers amount:-"+distance*8+" ";
	}
	
	
	
	

}