
public class IndiGo {
	
	public static void main(String[] args) {
		
		Passenger p = new Passenger(10,903878379238l,"Zaidmir@gmail.com"," zaid ");
		Passenger z = new Passenger(23,96222798548l,"Mueed@123","MueedBaba");
		Flight f    = new Flight("10:30","09/18",10,"Srinagar","Banglore");
		Plane e     = new Plane(180,3,2,8,"ItlyDosa , Pizza");
		
		//z.setPassengerName("Zahid ");
		z.getPassengerName();
	//	System.out.println("The Detalis Of Passenger Are \n" + "Passenger Name   " + z.getPassengerName() + "\n" + "Passenger MobileNumber   " + z.getpPassengerMobileNum() + "\n" + "Passenger  EmailId " + z.getPassengerEmailId() + "\n" + "Passenger  Age  " + z.getPassengerAge());
	    p.passengerDisplay();
	    z.passengerDisplay();
	    f.flightDisplay();
	    e.planeDisplay();

	}

}
