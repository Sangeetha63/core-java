class Speaker{
  static String brand;
  static String colour;
  static double price;
  static int minVolume;
  static int currentVolume ;
  static int  maxVolume;
  static boolean isConnected;
  
  public static boolean onOrOff(){
  System.out.println("inside onOrOff()");
  if(isConnected == false){
     isConnected = true;
	 
  System.out.println("Speaker is turned Onn....");
  }
   else if(isConnected == true){
     isConnected = false;
  System.out.println("Speaker is turned Off....");
  }
  System.out.println("end of onOrOff");
  return isConnected;

}
  
  public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
if(isConnected== true){
if(currentVolume < maxVolume){

	currentVolume = currentVolume + 1;
	System.out.println("the currentVolume is:" + currentVolume);
	

}	
else {
	System.out.println("Max Volume reached()....");
}
  }
 else {
	System.out.println("gube ...speaker on madu");
}

System.out.println("end of onOrOff()");
  return ;

		    	  
  }
  public static void decreaseVolume(){
	System.out.println("inside decreaseVolume()");
if(isConnected== true){
if(currentVolume < maxVolume){

	currentVolume = currentVolume + 1;
	System.out.println("the currentVolume is:" + currentVolume);
	

}	
else {
	System.out.println("Max Volume reached()....");
}
}
else {
	System.out.println("gube ...speaker on madu");
}

System.out.println("end of onOrOff()");
  return ;
  }
  }
