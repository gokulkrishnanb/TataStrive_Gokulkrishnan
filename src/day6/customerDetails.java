package day6;

public class customerDetails implements BonusPoints, DoorDelivery {
	private String customerName;
	private long phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public customerDetails(String customerName, long phoneNumber, String streetName, double billAmount, int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	public customerDetails() {
		super();
	}

	@Override
	public double deliveryCharge() {
		if (distance >= 25) {
			return distance * 8;
		} else if (distance >= 15 && distance < 25) {
			return distance * 5;
		} else if (distance < 15) {
			return distance * 2;
		}

		// TODO Auto-generated method stub
		return distance;
	}

	@Override
	public double calculateBonusPoints() {
		if (billAmount >= 250) {
			double amount = billAmount / 10;
			return amount;
		} else if (billAmount < 250) {
			return 0;
		}
		// TODO Auto-generated method stub
		return billAmount;

	}

	@Override
	public String toString() {
		return "Customer Name:" + customerName + "\nPhone Number :" + phoneNumber + "\nStreet Name :" + streetName
				+ "\nBonus Points : " + calculateBonusPoints() + "\nDelivery Charge : " + deliveryCharge();
	}

}
