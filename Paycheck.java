// Paycheck.java
public class Paycheck {
	// Private components:
	private double totalpay;

	// Constructors:
	public Paycheck(int employeeId, String employeeName, double employeeRate, double employeeHoursWorked) {
		this.totalpay = employeeHoursWorked * employeeRate;
	}

	public Paycheck(Employee employee) {
		this(employee.getId(), employee.getName(), employee.getPayRate(), employee.getHoursWorked());
	}

	public Paycheck() {
		totalpay = 0;
	}

//throw new IllegalArgumentException;
	public void loadCheck(Employee employee) {
		if (employee == null) {
			throw new IllegalArgumentException("Employee is null");
		}
		double employeeRate = employee.getPayRate(); // set total pay based on employee
		double employeeHoursWorked = employee.getHoursWorked();
		this.totalpay = employeeRate * employeeHoursWorked;
	}

	public double getTotalPay() {
		return totalpay; // returns total pay for week.
	}

	public String toString() {
		return "$" + String.format("%.2f", this.totalpay);

	}

}