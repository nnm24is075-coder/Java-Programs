package cars;

public class Showroom {

	public static void main(String[] args)
	{
	        Cars c1 = new Cars("Toyota", "Corolla", 15000, 18.5); 
	        Cars c2 = new Cars("Honda", "Civic", 18000, 16.0,"Jon"); 
	        Cars c3 = new Cars("Hyundai", "i20", 12000, 20.0); 
	      //displaying details 
	        c1.dispayDetails(); 
	        c2.dispayDetails();
	        c3.dispayDetails(); 
	        c1.setownerName("Disha");  // using setter 
	        c1.updatePrice(20000); 
	 
	        System.out.println("After Updates:"); 
	        c1.dispayDetails(); 
	 
	        Cars.showShowroomName(); 
	        Cars.showTotalCars(); 

	}

}
