class WashingMachineTester{

   public static void main(String a[]){
   System.out.println("main method started");
 
     WashingMachine.brand ="LG";
	 WashingMachine.colour ="White";
	 WashingMachine.price= 24990;
	 WashingMachine.onOrOff();
	 WashingMachine.increaseVolume();
	 WashingMachine.increaseVolume();
	 WashingMachine.increaseVolume();
	 WashingMachine.increaseVolume();
	 WashingMachine.increaseVolume();
	 
	 WashingMachine.decreaseVolume();
	 WashingMachine.decreaseVolume();
	 WashingMachine.decreaseVolume();
	 WashingMachine.decreaseVolume();
	 WashingMachine.decreaseVolume();
	 
	 WashingMachine.onOrOff();
	
	System.out.println("brand is" + WashingMachine.brand);
	System.out.println("colour is" + WashingMachine.colour);
	System.out.println("price is" + WashingMachine.price);
	
	System.out.println("main method ended");
	
  
 
 }





}