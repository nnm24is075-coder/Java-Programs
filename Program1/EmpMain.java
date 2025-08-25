package employee;

public class EmpMain {

	public static void main(String[] args) 
	{
		  //creating new employee
		  Employee e1=new Employee("Ravi",101,10000.0d); 
		  Employee e2=new Employee("Ram",102,20000.0d); 
		  System.out.println("initial employee details are:"); 
		    //displaying employee details
		  e1.displayDetails(); 
		  e2.displayDetails(); 
		  //increasing salary 
		  e1.increase_salary(0.1); 
		  e2.increase_salary(0.2); 
		  System.out.println("updated employee details are:"); 
		  //displaying the updated salary 
		  e1.displayDetails(); 
		  e2.displayDetails(); 
		 } 
		
}
