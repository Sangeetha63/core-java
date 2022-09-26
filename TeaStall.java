class TeaStall{

 static int teaStallId;
 static String name;
 static String address;
 static long ContactNo;
 
 //Setter and getter
  public static void setTeaStallId(int id){
 
 teaStallId = id;
 
 }
  public static int getTeaStallId(){
 
  return teaStallId;

}
 public static void setContactNo(long cNo){
 
 ContactNo  = cNo;
 }
 public static long getContactNo(){
 
  return ContactNo;
}
public static void setName(String nm){
 
 name = nm;
}
public static String getName(){
	
   return name;
  
} 
  
public static void setAddress(String ad){
 
 address = ad;
}
public static String getAddress(){
	
   return address;
  
   
  
}
}