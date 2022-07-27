package oops;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		show s1= new show("Show 1");
		show s2= new show("Show 2");
		s1.addAvailableSeat("A1");
		s1.addAvailableSeat("A2");
		s1.addAvailableSeat("A3");
		s1.addAvailableSeat("A4");
		s1.addAvailableSeat("A5");
		s1.addAvailableSeat("A6");
		s1.addAvailableSeat("A9");
		
		s2.addAvailableSeat("A1");
		s2.addAvailableSeat("A2");
		s2.addAvailableSeat("A4");
		s2.addAvailableSeat("A5");
		s2.addAvailableSeat("A6");
		s2.addAvailableSeat("B1");
		s2.addAvailableSeat("B3");
		s2.addAvailableSeat("B4");
		s2.addAvailableSeat("B5");
		s2.addAvailableSeat("B6");
		s2.addAvailableSeat("B7");
		
		s1.showAvalaibleSeats();
		s2.showAvalaibleSeats();
		int n=2;
		for(int i=1;i<=n;i++) {
			System.out.println("Group "+i+":-");
			System.out.println("Enter show no:-");
			int c=scan.nextInt();
			System.out.println("Enter sea no:-");
			switch(c) {
			case 1:
			{
				
			}
			break;
			case 2:
			{
				
			}
			break;
			    
			}
			
			
		}
		
	}

}
