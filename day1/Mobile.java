package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel= "Appple";
		float mobileWeight= 194F;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
			
	}
	
	public void sendMsg() {
		
		boolean fullyCharged=true;
		int mobileCost= 19000;
		System.out.println(fullyCharged);
		System.out.println(mobileCost);
		
	}
	
	public static void main(String[] args) {
		
	Mobile mob1=new Mobile();
	mob1.makeCall();
	mob1.sendMsg();
		}

}
