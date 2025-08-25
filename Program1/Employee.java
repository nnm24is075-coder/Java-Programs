package employee;

public class Employee 
{
	//details of the data members
	String name; 
	int id; 
	double salary;
	//Constructors
	public Employee(String n, int i,double sal)
	{ 
	 //assigning 
	 this.name=n; 
	 this.id=i; 
	 this.salary=sal; 
	} 
	 //displaying employee details 
	void displayDetails() 
	{ 
	 System.out.println("employee details are:"); 
	 System.out.println("employee id:"+id); 
	 System.out.println("employee name:"+this.name); 
	 System.out.println("employee salary:"+salary); 
	} 
	 //incrementation of salary 
	void increase_salary(double per) 
	{ 
	 double increment=(salary*per)/100; 
	 salary=salary+increment; 
	 System.out.println("employee salary increased by:"+salary); 
	} 
	
	
}
