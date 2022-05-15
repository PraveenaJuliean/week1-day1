package week1.day1;

public class Mobile {
	
	public void sendSms()
	{
		System.out.println("Sending SMS");
		
	}
	
	public void makeCall()
	{
		System.out.println("Making call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Mobile");
		
		Mobile myMobile = new Mobile();
		
		myMobile.sendSms();
		myMobile.makeCall();
		
	}

}
