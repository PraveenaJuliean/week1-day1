package week1.day1;

public class PrimeNumber {

	int input = 30;
	boolean flag = false;
	int x=0;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		PrimeNumber myPrime = new PrimeNumber();
		
		for (int i = 2; i < myPrime.input/2; i++) {
			
			myPrime.x = myPrime.input % i ;
			
			if (myPrime.x == 0) {
				myPrime.flag = true;
				break;
			}
			
		}
			if (!myPrime.flag) 
				System.out.println("This is a Prime Number");
			
			else System.out.println("This is not a Prime Number");
		

	}

}
