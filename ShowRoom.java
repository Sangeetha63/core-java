class ShowRoom{

  static void getCars(String[] cars){
    System.out.println("inside getcars");
    System.out.println("cars Size is " + cars.length);
	System.out.println("list of cars ");
	for(int index = 0; index < cars.length; index++){
	System.out.println( cars[index] );
	}
	System.out.println("end of getCars()");
}
static void getBikes(String[] bikes){
    System.out.println("inside getbikes");
    System.out.println("bikes Size is " + bikes.length);
	System.out.println("list of bikes ");
	for(int index = 0; index < bikes.length; index++){
	System.out.println( bikes[index] );
	}
	System.out.println("end of getBikes()");
}
}