package week1.day1;

public class FibonacciSeries {
	
	int range = 8;
	int firstNum = 0;
	int secNum = 1;
	int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries myFib = new FibonacciSeries();
				
		System.out.println(myFib.firstNum);
		System.out.println(myFib.secNum);
		
		for (int i = 0; i <= myFib.range; ++i) {
			
			myFib.sum = myFib.firstNum + myFib.secNum ;
			System.out.println(myFib.sum);
			myFib.firstNum = myFib.secNum;
			myFib.secNum = myFib.sum;
												
		}
		
		

	}

}
