package oops;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner s= new Scanner(System.in);
		List<String> CarDrivers=Arrays.asList("r","f","g","h","k");
		List<Double> Distance = Arrays.asList(1.0,4.0,2.0,3.0,5.0);
		List<Integer> Rating= Arrays.asList(1,4,5,5,2);
		List<String > CarModels=Arrays.asList("A","B","C","D","E");
		
		
		Rider rider1= new Rider("rupa",18);
		
		rider1.Ride(CarDrivers, Distance, Rating, CarModels, rider1.getCarModelPrefernce());
		System.out.println(rider1.Charges(rider1.getDistance(), rider1.getCarNo(), CarDrivers, Rating, CarModels));
		
		

	}

}
