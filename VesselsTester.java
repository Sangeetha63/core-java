class VesselsTester{

public static void main(String a[]){

  Vessels.setVesselsId(3425);
  Vessels.setName("Stainless Silver");
  Vessels.setColor("silver");
 Vessels.setPrice(350);
  
  System.out.println(Vessels.getVesselsId()+ " "+Vessels.getName()+ " "+Vessels.getColor()+ " "+Vessels.getPrice());
  
  

}



}