class TorchTester{

   public static void main(String a[]){
   System.out.println("main method started");
 
    Torch.material ="plastic";
	 Torch.colour =" yellow";
	 Torch.price= 325;
	 Torch.onOrOff();
	 Torch.increaseVolume();
	 Torch.increaseVolume();
	 Torch.increaseVolume();
	 Torch.increaseVolume();
	 Torch.increaseVolume();
	 
	 Torch.decreaseVolume();
	 Torch.decreaseVolume();
	 Torch.decreaseVolume();
	 Torch.decreaseVolume();
	 Torch.decreaseVolume();
	
	 Torch.onOrOff();
	
	System.out.println("material is" + Torch.material);
	System.out.println("colour is" + Torch.colour);
	System.out.println("price is" + Torch.price);
	
	System.out.println("main method ended");
	
  
 
 }





}