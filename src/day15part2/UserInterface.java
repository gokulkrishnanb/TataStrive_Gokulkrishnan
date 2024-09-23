package day15part2;

public class UserInterface {
	public static void main(String[] args) {
		Resource res = new Resource();
		Driver dr1 = new Driver(res, "gokul");
		Passenger pan1 = new Passenger(res, "gilbert");
		Driver dr2 = new Driver(res, "kamalesh");
		Passenger pan2 = new Passenger(res, "kalaimamani");
		Driver dr3 = new Driver(res, "abishek");
		Passenger pan3 = new Passenger(res, "yashwanth");
		Driver dr4 = new Driver(res, "shakthi");
		Passenger pan4 = new Passenger(res, "shadrack");
		Driver dr5 = new Driver(res, "peter");
		Passenger pan5 = new Passenger(res, "hari");
		Driver dr6 = new Driver(res, "kamaraj");
		Passenger pan6 = new Passenger(res, "anbu");
		Driver dr7 = new Driver(res, "prathap");
		Passenger pan7 = new Passenger(res, "syeed");
	}

}
