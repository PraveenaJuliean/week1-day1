package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 50036l;
	boolean isPunctured = false;
	String bikeName = "Scooty";
	double runningKM = 20000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TwoWheeler myTwoWheeler = new TwoWheeler();
		System.out.println(myTwoWheeler.noOfWheels);
		System.out.println(myTwoWheeler.noOfMirrors);
		System.out.println(myTwoWheeler.chassisNumber);
		System.out.println(myTwoWheeler.isPunctured);
		System.out.println(myTwoWheeler.bikeName);
		System.out.println(myTwoWheeler.runningKM);
		
	}

}
