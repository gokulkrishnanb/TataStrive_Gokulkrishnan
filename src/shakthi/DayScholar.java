package shakthi;

public class DayScholar extends Student{
	private int busNumber;
	private float distance;
	private double busFee;

	
	public DayScholar() {
		super();
	}
	/**
	 * @return the busNumber
	 */
	public int getBusNumber() {
		return busNumber;
	}
	/**
	 * @param busNumber the busNumber to set
	 */
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	/**
	 * @return the distance
	 */
	public float getDistance() {
		
		return distance;
	}
	/**
	 * @param distance the distance to set
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}
	@Override
	public double calculateTotalFee() {
		if(distance>30&&distance<=40) {
			busFee=28000;
			
		}
		else if(distance>20&&distance<=30) {
			busFee=20000;
		}
		else if(distance>10&&distance<=20) {
			busFee=12000;
		}
		double totalAmount=collegeFee+busFee;
		return totalAmount;
	}
	

}
