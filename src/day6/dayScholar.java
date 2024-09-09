package day6;

public class dayScholar extends Student {
	private int busNumber;
	private int distance;
	
	
	

	public int getBusNumber() {
		return busNumber;
	}




	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}




	public double getDistance() {
		return distance;
	}




	public void setDistance(int distance) {
		this.distance = distance;
	}

	



	public dayScholar(int studentId, String studentName, String department, String gender, String category,double collegeFee,int busNumber, int distance) {
		super(studentId,studentName,department,gender,category,collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}




	@Override
	public double calculateTotalFee() {
		double totalFee = 0;
		if(distance >30&&distance <=40) {
			totalFee=totalFee+28000;	
		}
		else if(distance >20&&distance <=30) {
			totalFee=totalFee+20000;
		}
		else if(distance >10&&distance <=20){
			totalFee=totalFee+12000;
			
		}
		else if(distance<=10) {
		totalFee=totalFee+6000;
			
		}
		return totalFee+collegeFee;
	}




	


}
