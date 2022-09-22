class Cricket{
    
 public static void main(String a[]){
	    int rohitHighestScore = 264;
	    int sachinHighestScore = 200;
	    int mandanaHighestScore = 135;
	    int acKerrHighestScore = 232;
        int biClarkHighestScore =229;
	
	int HighestScore[] = {rohitHighestScore , sachinHighestScore , mandanaHighestScore , acKerrHighestScore , biClarkHighestScore };
 
          int ref4 = HighestScore[4];
          int ref3 = HighestScore[3];
          int ref2 = HighestScore[2];
	      int ref1 = HighestScore[1];
	      int ref0 = HighestScore[0];
	
	 System.out.println("Element at index 4 " + ref4);
	 System.out.println("Element at index 3 " + ref3);
	 System.out.println("Element at index 2 " + ref2);
	 System.out.println("Element at index 1 " + ref1);
	 System.out.println("Element at index 0 " + ref0);
	 
	 //length is a property of array
	 System.out.println("The length of highestscore is" + HighestScore.length);
	 //for loop
	 for(int index = 0; index < HighestScore.length; index++){
		 
		 int ref=HighestScore[index];
		 System.out.println("Element at index"+ index  +" ref "); 
	 } 
}
}