package oops;
import java.util.*;
public class Bill {
	private ArrayList<String> orderFood;
	private ArrayList<Integer> orderFoodQuantity ;
	private double totalBill;
	
	
	public Bill() {
		orderFood= new ArrayList<>();
		orderFoodQuantity= new ArrayList<>();
		
	}
	public void displayOrder() {
		for(int i=0;i<orderFood.size();i++) {
			System.out.print(orderFood.get(i)+" Quantity ->"+ orderFoodQuantity+" ");
		}
	}
	
	
	public void addOrder(String food,int quantity,String[] dish, int[] cost) {
		orderFood.add(food);
		orderFoodQuantity.add(quantity);
		for(int i=0;i<dish.length;i++) {
			if(food.equals(dish[i])) {
				totalBill+=quantity*cost[i];
			}
			
		}
	}
	
	
	public double getTotalBill() {
		return totalBill;
	}
}
