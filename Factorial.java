package week1.day1;

public class Factorial {
	
	int input = 5;
	int fact = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial myFact = new Factorial();
		
		for (int i = 1; i <= myFact.input; i++) {
			
			myFact.fact = myFact.fact * i ;
						
		}
		
		System.out.println(myFact.fact);

	}

}
