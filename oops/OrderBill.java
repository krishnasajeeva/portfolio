package oops;
import java.util.*;
public class OrderBill {
	private ArrayList<String> orderFood;
	private double totalBill;
	private boolean isPeakHour;
	private boolean isSpecialDay;
	private boolean isNightCharge;
	
	public OrderBill() {
		this.orderFood= new ArrayList<>();
		this.totalBill=0;
		this.isPeakHour=false;
		this.isNightCharge=false;
		this.isSpecialDay=false;
	}
	
	public void setPeakHour(boolean isPeakHour) {
		this.isPeakHour=isPeakHour;
	}
	
	public boolean getPeakHour() {
		return isPeakHour;
	}
	 
	public void setSpecialDay(boolean isSpecialDay) {
		this.isSpecialDay=isSpecialDay;
	}
	
	public boolean getSpecialDay() {
		return isSpecialDay;
	}
	
	
	
	public void setNightCharge(boolean isNightCharge) {
		this.isNightCharge=isNightCharge;
	}
	
	public boolean getNightCharge() {
		return isNightCharge;
	}
	
	
	
	
	public void addFoodItems(String food,String[] dishes,int[] cost) {
		orderFood.add(food);
		for(int i=0;i<dishes.length;i++) {
			if(food.equals(dishes[i])) {
				totalBill+=cost[i];
			}
		}
		
	}
	
	public void getTotalBill(boolean isPeakHour,boolean isSpecialDay, boolean isNightCharge ) {
		totalBill=totalBill+ totalBill*(0.05);
		if(!isNightCharge && !isPeakHour && !isSpecialDay) {
			totalBill+=20;
		}
		if(isNightCharge) {
			totalBill+=20;
		}
		if(isPeakHour) {
			totalBill+=30;
		}
		if(isSpecialDay) {
			totalBill+=50;
		}
		
		System.out.println("Total Bill is:= "+ totalBill);
	}

}
