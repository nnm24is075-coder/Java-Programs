package cars;

public class Cars {
	//Instance Members 
	//brand
	 private String brand; 
	 //model
	 private String model; 
	 //price
	 private double price; 
	 //mileage
	 private double mileage; 
	 //ownername
	 private String ownerName; 
	 //Static Members 
	//totalCars 
	 private static int totalCars; 
	 private static String showroomName="Mandovi Motors"; 
	 //constructor 1 
	 public Cars(String b,String m,double p,double mil) 
	 { 
	  brand=b; 
	  model=m; 
	  price=p; 
	  mileage=mil; 
	  ownerName="not assigned"; 
	  totalCars++; 
	 } 
	 //constructor 2 
	 public Cars(String b,String m,double p,double mil,String owner) 
	 { 
	  brand=b; 
	  model=m; 
	  price=p; 
	  mileage=mil; 
	  this.ownerName=owner; 
	  totalCars++; 
	 } 
	  //getter and setter for ownerName 
	 public String getownerName() { 
	  return ownerName; 
	 } 
	 public void setownerName(String owner) 
	 { 
	  ownerName=owner; 
	 } 
	 //instance method 
	 public void dispayDetails() 
	 { 
	  System.out.println("The car details are:"); 
	  System.out.println("Brand:"+brand); 
	  System.out.println("Model:"+model); 
	  System.out.println("Price:"+price); 
	  System.out.println("Mileage:"+mileage); 
	  System.out.println("Owner name:"+ownerName); 
	 }
	 public void updatePrice(double newPrice) 
	 { 
	  price=newPrice; 
	 } 
	 //static method 
	 public static void showTotalCars() 
	 { 
	   
	  System.out.println("Total cars:"+totalCars); 
	   
	 } 
	 public static void showShowroomName() 
	 { 
	  System.out.println("Showroom:"+showroomName); 
	 } 
	 
}
