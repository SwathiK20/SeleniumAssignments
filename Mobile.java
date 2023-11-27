package week1.day1;

public class Mobile {

			public void makecall() {
				System.out.println("Make Call");
				
				}
			public void sendMsg() {
				System.out.println("Send Msg");
			
			}
			public void mobileModel() {
				String mobileModel = "Vivo";
					System.out.println("MOBILE MODEL="+mobileModel);         
				
			}
			public void mobileWeight() {
				float mobileWeight =80.05f;
					System.out.println("MOBILE WEIGHT="+mobileWeight);
			
			}
			public void fullyCharged() {
				boolean isFullyCharged = true;
				System.out.println("Fully Charged ="+isFullyCharged);
				
			}
			public void mobileCost() {
				int mobileCost = 25000;
				System.out.println("Mobile Cost ="+mobileCost);
			}
			public static void main(String[] args) {
				Mobile obj = new Mobile();
				obj.makecall();
				obj.sendMsg();
				obj.mobileModel();
				obj.mobileWeight();
				obj.fullyCharged();
				obj.mobileCost();
				
				System.out.println("This is my Mobile");
			}

}
