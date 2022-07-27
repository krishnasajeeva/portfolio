package oops;
import java.util.*;
public class Main11 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String[] dishes= {"Pizza","Burger","Coke","Brownies"};
		int[] cost= {150,100,50,60};
		
		
		OrderBill order1= new OrderBill();
		System.out.println("Welcome!!");
		System.out.println("-----Menu-----");
		for(int i=0;i<dishes.length;i++) {
			System.out.println(dishes[i]+" Price $"+cost[i]);
		}
		System.out.println("Please enter how many item do you want to order:-");
		int n=scan.nextInt();
		String foodItem;
		for(int i=0;i<=n;i++) {
			System.out.println("Enter the food Item from menu");
			foodItem=scan.nextLine();
			order1.addFoodItems(foodItem, dishes, cost);
		}
	
		System.out.println("Is the Peak hours are between 11am-2pm and 6pm-8pm ");
		boolean peak= scan.nextBoolean();
		order1.setPeakHour(peak);
		System.out.println("Is today 5th Dec, 4th Nov, 9th Dec");
		boolean special= scan.nextBoolean();
		order1.setSpecialDay(special);
		System.out.println("is the order comes after 11pm to 4am.");
		boolean night= scan.nextBoolean();
		order1.setNightCharge(night);
		
		
		order1.getTotalBill(order1.getPeakHour(), order1.getSpecialDay(), order1.getNightCharge());
		
		
		
		

	}

}
