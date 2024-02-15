// Employee.java
public class Employee {
	private static int nextEmployeeId = 0;
	// Private components
	private String name;
	private int id;
	private double hoursWorked;
	private double payRate;

	// Constructors:
	public Employee(String name, double payRate) {
		this.name = name;
		this.payRate = payRate;
		this.hoursWorked = 0.0;
		this.id = nextEmployeeId++;
	}

	
	//getters for private components. 
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public double getPayRate() {
		return payRate;
	}

	//public method that adds hours for employee object. 
	
	public void addHours(double workedHours) {
		this.hoursWorked = workedHours + this.hoursWorked;
	}

	//public method that resets hours to 0 for employee object. 
	
	public void resetHoursWorked() {
		this.hoursWorked = 0;
	}
	
	
	// get weekly pay creates payceck object and accepts employee object. 
	 public Paycheck getWeeklyPay() {
	     Paycheck paycheck = new Paycheck(this);
       	 resetHoursWorked();
         return paycheck;   
	     
	 }
	  
	 //get weekly pay medthod accepts a paycheck, checks if null and returns paycheck. 
	 public Paycheck getWeeklyPay(Paycheck paycheck){ if (paycheck == null) { throw new
	 IllegalArgumentException("Paycheck is null."); }
	 resetHoursWorked(); 
	 return paycheck;
	 
	 }
	 
	 //method that that increases pay of employee object by multiplying payrate and percent increase. 

	public void payRaise(double risePay) {

		double percentIncrease = this.payRate * risePay / 100;
		this.payRate = percentIncrease + this.payRate;
	}

	//method that keeps count of amount of employee objects being instantiated. 
	
	public int getNumEmployees() {
		return nextEmployeeId;

	}

	//method that turns employee object into string of private variables. 
	
	public String toString() {
		return "Employee Name: " + this.name + "\nEmployee ID: " + this.id + "\nEmployee Pay Rate: " + this.payRate
				+ "\nEmployee's Hours this Week: " + this.hoursWorked;
	}

}
