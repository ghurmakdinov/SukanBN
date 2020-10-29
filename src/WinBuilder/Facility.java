package WinBuilder;


public class Facility {
	
	public enum facilityType {
		badmintonCourt, tennisCourt, swimmingPool, futsalCourt
	}
	
	private boolean available;
	private Guest occupant;
	private int facilityNum;
	private double price;
	private facilityType type;
	
	public Facility(int facilityNum, double price, facilityType type) {
		this.facilityNum = facilityNum;
		this.price = price;
		this.type = type;
	}
	
	public boolean isAvailable() {
		return this.available;
	}

	public boolean getAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public facilityType getFacilityType() {
		return type;
	}
	
	public void setFacilityType(facilityType type) {
		this.type = type;
	}

	public int getFacilityNumber() {
		return facilityNum;
	}

	public void setFacilityNumber(int facilityNum) {
		this.facilityNum = facilityNum;
	}
	
	public Guest getGuest() {
		return occupant;
	}

	public void setGuest(Guest occupant) {
		this.occupant = occupant;
	}

}
