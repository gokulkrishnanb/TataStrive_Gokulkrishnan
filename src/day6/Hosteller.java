package day6;

public class Hosteller extends Student {
	private int roomNumber;
	private char blockName;
	private String roomType;

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Hosteller() {
		super();
	}

	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}

	@Override
	public double calculateTotalFee() {

		double totalFee = getCollegeFee();

		if (blockName=='A') {
			totalFee += 60000;
			if (roomType.equals("AC")) {
				totalFee += 8000;
			}
		}

		else if (blockName=='B') {
			totalFee += 50000;
			if (roomType.equals("AC")) {
				totalFee += 5000;
			} else if (blockName=='C') {
				totalFee += 40000;
				if (roomType.equals("AC")) {
					totalFee += 2500;
				}
			}
		}

		return totalFee;
	}

	@Override
	public String toString() {
		return "student id :" + studentId + "\nstudentName :" + studentName + "\ndepartment :" + department
				+ "\ngender :" + gender + "\ncategory :" + category + "\ncollegeFees :" + collegeFee + "\nRoom number :"
				+ roomNumber + "\nblock name :" + blockName + "\nroom type :" + roomType + "\nTotal fees :"
				+ calculateTotalFee();
	}

}
