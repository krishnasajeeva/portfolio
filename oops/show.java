package oops;
import java.util.*;

public class show {
		private final String Name;
		private final List<String> available_seat;
		private final List<String> booked_seat;
		
		public String getName() {
			return Name;
		}
		
		public show(String name) {
			this.Name=name;
			this.available_seat= new ArrayList<>();
			this.booked_seat=new ArrayList<>();
		}
		
		public void addAvailableSeat(String seat)
		{
			this.available_seat.add(seat);
		}
		
		public void addBookedSeat(String seat) {
			this.booked_seat.add(seat);
		}
		
		public void showAvalaibleSeats() {
			System.out.println();
			System.out.print("Available seats:- ");
			for(String s: available_seat) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
		
		public void showBookedSeats() {
			System.out.println();
			System.out.print("Booked seats:- ");
			for(String s: booked_seat) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
}
