package week1.day1;

public class Mobile {
	
	String mobileModel = "One Plus";
	int mobileWeight = 250;
	Boolean isFullCharge = true;
	double mobileCost = 2864.9274724872;
	
	public void makeCall() {
		System.out.println("make a call to mentor");
	}
	
	public void sendMsg() {
		System.out.println("sent a message to montor");

	}

	public static void main(String[] args) {
		Mobile android = new Mobile();
		
		android.makeCall();
		android.sendMsg();
		
		System.out.println(android.mobileModel);
		System.out.println(android.mobileWeight);
		System.out.println(android.isFullCharge);
		System.out.println(android.mobileCost);
	}
}
