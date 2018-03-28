
public class Passenger {
	
	private int     passengerAge;
	private long    passengerMobileNum;
	private String  passengerEmailId;
	private String  passengerName;
	
	/* Getters */
	
	public int getPassengerAge() {
		return passengerAge;
	}
		
	public long getpPassengerMobileNum() {
		return passengerMobileNum;
	}
	
	public String getPassengerEmailId() {
		return passengerEmailId;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	/* Setters */	
	
	public void setPassengerAge(int passengerAge) {
		this.passengerAge         = passengerAge;
	}
	public void setPassengerMobileNum(long passengerMobileNum){
		this.passengerMobileNum   = passengerMobileNum;
	}
	public void setPassengerEmailId(String passengerEmailId) {
		this.passengerEmailId     = passengerEmailId;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName        = passengerName;
	}
	
	public Passenger(int passengerAge, long passengerMobileNum, String passengerEmailId, String passengerName){
		this.passengerAge       = passengerAge;
		this.passengerMobileNum = passengerMobileNum;
		this.passengerEmailId   = passengerEmailId;
		this.passengerName     = passengerName;
		
	 }
	void passengerDisplay() {
		System.out.println("The details of Passenger are \n" + " Passenger Name " + passengerName + "\n" + " Passenger Age " + passengerAge + "\n" +" Passenger MobileNumber " + passengerMobileNum + "\n" + " Passenger EmailId " + passengerEmailId);
	}
	

}
