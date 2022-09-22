class IndentityTester{
	
      public static void main(String a[]){
   System.out.println("Main Method Started");
       Indentity.name = "Sangeetha H J";
       Indentity.email = "sangeetha6196@gmail.com";
	   Indentity.mobileNo=6362655739L;
	   Indentity.age = 23;
	   Indentity.address = "Mysore";
	   Indentity.gender = "Female";
	   Indentity.working = "Software Developer";
	   Indentity.topSize = "XL";
	   Indentity.pantSize = "XL";
	   Indentity.weight = 54.00;
	   Indentity.height = 4.93;
	   
       Indentity.printName();
	   Indentity.printNameAndEmail("Sangeetha H J", "sangeetha6196@gmail.com");
	   Indentity.printNameAndMobile("Sangeetha H J", 6362655739L);
	   Indentity.printNameAndAge("Sangeetha H J", 23);
	   Indentity.printNameAndAddress("Sangeetha H J","Mysore" );
	   Indentity.printNameAndEmailAndAddressAndAge("Sangeetha H J", "sangeetha6196@gmail.com", "Mysore",23);
	   Indentity.printNameAndGender("Sangeetha H J","Female");
	   Indentity.printNameAndWorking("Sangeetha H J","Software Developer");
	   Indentity.printNameAndTopSize("Sangeetha H J","XL");
       Indentity.printNameAndPantSize("Sangeetha H J","XL");
	   Indentity.printNameAndWeightAndHeight("Sangeetha H J",54.00,4.93);
	   System.out.println("Main Method ended");
   }




}