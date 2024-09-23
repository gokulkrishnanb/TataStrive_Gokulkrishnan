package shakthi;

public class  Hosteller extends Student{


private int roomNumber;
private char blockName;
private String roomType;
private double hostelFee;





public Hosteller() {
	super();
}




public Hosteller(int studentId, String studentName, String department, String gender, String category,
		double collegeFee, int roomNumber, char blockName, String roomType, double hostelFee) {
	super(studentId, studentName, department, gender, category, collegeFee);
	this.roomNumber = roomNumber;
	this.blockName = blockName;
	this.roomType = roomType;
	this.hostelFee = hostelFee;
	
}




/**
 * @return the roomNumber
 */
public int getRoomNumber() {
	return roomNumber;
}


/**
 * @param roomNumber the roomNumber to set
 */
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}

/**
 * @return the blockName
 */
public  char getBlockName() {
	
return blockName;	
}

/**
 * @param blockName the blockName to set
 */
public void setBlockName(char blockName) {
	this.blockName = blockName;
}

/**
 * @return the roomType
 */
public String getRoomType() {
	return roomType;
}

/**
 * @param roomType the roomType to set
 */
public void setRoomType(String roomType) {
	this.roomType = roomType;
}

@Override
public  double calculateTotalFee() {
	if(blockName=='A') {
		 hostelFee=60000;
		if(roomType=="AC") {
			hostelFee+=8000;
			
		}
		
		
	}else if(blockName=='B') {
		  hostelFee=50000;
		if(roomType=="AC") {
			hostelFee+=5000;
			
		}
		
		
	}
	else if(blockName=='C') {
		hostelFee=40000;
		if(roomType=="AC") {
			hostelFee+=2500;
			
		}
		
	}
	double totalAmount=collegeFee+hostelFee;
return totalAmount;
}



}
