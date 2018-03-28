
public class Plane {
	private int planeSeats;
	private int planePilots;
	private int planeToilets;
	private int planeCabinCrews;
	private String planeFood;
	
	/*Getters */
	
	public int getPlaneSeates() {
		return planeSeats;
	}
	public int getPlanePilots() {
		return planePilots;
	}
	public int getPlaneToilets() {
		return planeToilets;
	}
	public int getPlaneCabinCrews() {
		return planeCabinCrews;
	}
	public String getPlaneFood() {
		return planeFood;
	}
	
	/*setters */
	
	public void setPlaneseats(int planeSeats) {
		this.planeSeats    = planeSeats;
	}
	public void setPlanePilots(int planePilots) {
		this.planePilots   = planePilots;
	}
	public void setPlaneToilets(int planeToilets) {
		this.planeToilets  = planeToilets;
	}
	public void setPlaneCabinCrews(int planeCabinCrews) {
		this.planeCabinCrews = planeCabinCrews;
	}
	public void setPlaneFood(String planeFood) {
		this.planeFood = planeFood;
	}
	public Plane(int planeSeats, int planePilots, int planeToilets ,int planeCabinCrews ,String planeFood ) {
		this.planeSeats = planeSeats;
		this.planePilots = planePilots;
		this.planeToilets = planeToilets;
		this.planeCabinCrews = planeCabinCrews;
		this.planeFood = planeFood;
	}
	
	void planeDisplay() {
		System.out.println("The Details of Plane Are \n" + "Plane Seats  " + planeSeats + "\n" + "Plane Pilots " + planePilots + "\n" + "Plane Toilets " + planeToilets + "\n" + "Plane CabinCrews " + planeCabinCrews + "\n" + "Plane Food " + planeFood);
	}
	

}
