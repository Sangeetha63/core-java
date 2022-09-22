class  Indentity{
  static String name;
  static String email;
  static long mobileNo;
  static int age;
  static String address;
  static String gender;
  static String working;
  static String topSize;
  static String pantSize;
  static double weight;
  static double height;
  
    public static void printName()
	{
		System.out.println((name));
		return;
	}    
    public static void printNameAndEmail(String name,String email)
	{
	System.out.println(name + "" +email);
   return;	
	}
 
  
	public static void printNameAndMobile(String name,long mobileNo)
	{
	System.out.println(name + "" +mobileNo);
   return;	
	}
	public static void printNameAndAge(String name,int age)
	{
	System.out.println(name + "" + age);
   return;	
	}
	public static void printNameAndAddress(String name,String address)
	{
	System.out.println(name + ""+ address);
   return;	
	}
	public static void printNameAndEmailAndAddressAndAge(String name,String email,String address,int age)
	{
	System.out.println(name+""+email+""+address+""+(age));
   return;	
	}
	public static void printNameAndGender(String name,String gender)
	{
	System.out.println((name)+(gender));
   return;	
	}
    public static void printNameAndWorking(String name,String working)
	{
	System.out.println((name)+(working));
   return;	
	}
   public static void printNameAndTopSize(String name,String topSize)
	{
	System.out.println((name)+(topSize));
   return;
	}   
   public static void printNameAndPantSize(String name,String pantSize)
	{
	System.out.println((name)+(pantSize));
   return;
	}   
   public static void printNameAndWeightAndHeight(String name,double Weight,double height )
	{
	System.out.println((name)+(height)+(weight));
   return;	
	}
}







