
public class Flight {
	
	private String flightTime;
	private String flightDate;
	private int flightNumber;
	private String flightOrigin;
	private String flightDestination;
	
	/* Getters */
	
	public String getFlightTime() {
		return flightTime;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public String getFlightOrigin() {
		return flightOrigin;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	/* Setters */
	
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber; 
	}
	public void setFlightOrigin(String flightOrigin ) {
		this.flightOrigin = flightOrigin;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	
	public Flight(String flightTime, String flightDate,int flightNumber,String flightOrigin,String flightDestination) {
	this.flightTime = flightTime;
	this.flightDate = flightDate;
	this.flightNumber = flightNumber;
	this.flightOrigin = flightOrigin;
	this.flightDestination = flightDestination;
	}	
	void flightDisplay() {
		System.out.println("The Details of Flight are \n" + "Flight Time " + flightTime + "\n" + "Flight Date " +  flightDate +  "\n" + "Flight Origin " + flightOrigin + "\n" + "Flight Destination " + flightDestination);
		
	}
		
		
	}
	
	


