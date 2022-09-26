class GalaxyTester{

public static void main(String a[]){

  Galaxy.setGalaxyId(3425);
  Galaxy.setName("Milky Galaxy");
  Galaxy.setColor("white");
 Galaxy.setMagnitude(21);
  
  System.out.println(Galaxy.getGalaxyId()+ " "+Galaxy.getColor()+ " "+Galaxy.getName()+ " "+Galaxy.getMagnitude());
  
  

}



}