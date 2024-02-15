import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * A JUnit test class for the Employee class.
 */
public class EmployeeTest {

	private Employee john;
	private Employee herman;
	private Employee gabriel;
	private Employee tabitha;
	private Employee phil;
	private Employee joanna;

	@Before
	public void setUp() {

		john = new Employee("john", 12.0);
		herman = new Employee("herman", 15.0);
		gabriel = new Employee("gabriel", 20.0);
		tabitha = new Employee("tabitha", 22.0);
		phil = new Employee("phil", 25.0);
		joanna = new Employee("joanna", 26.0);

	}

	@Test
	public void testContructor() {
		Employee e1 = new Employee("john", 12.0);
		assertEquals(e1.getName(), "john");
		assertEquals(e1.getPayRate(), 12.0, .00001);
		assertEquals(e1.getHoursWorked(), 0, .00001);
	}

	@Test
	public void testGetname() {
		assertEquals("john", john.getName());
		assertEquals("herman", herman.getName());
		assertEquals("gabriel", gabriel.getName());
		assertEquals("tabitha", tabitha.getName());
		assertEquals("phil", phil.getName());
		assertEquals("joanna", joanna.getName());

	}

	@Test
	public void testGetID() {
		assertEquals(0, john.getId());
		assertEquals(1, herman.getId());
		assertEquals(2, gabriel.getId());
		assertEquals(3, tabitha.getId());
		assertEquals(4, phil.getId());
		assertEquals(5, joanna.getId());

	}

	@Test
	public void testgetHoursWorked() {
		assertEquals(0.0, john.getHoursWorked(), 0.0);
		assertEquals(0.0, herman.getHoursWorked(), 0.0);
		assertEquals(0.0, gabriel.getHoursWorked(), 0.0);
		assertEquals(0.0, tabitha.getHoursWorked(), 0.0);
		assertEquals(0.0, phil.getHoursWorked(), 0.0);
		assertEquals(0.0, joanna.getHoursWorked(), 0.0);
	}

	@Test
	public void testgetPayRate() {
		assertEquals(12.0, john.getPayRate(), 0.0);
		assertEquals(15.0, herman.getPayRate(), 0.0);
		assertEquals(20.0, gabriel.getPayRate(), 0.0);
		assertEquals(22.0, tabitha.getPayRate(), 0.0);
		assertEquals(25.0, phil.getPayRate(), 0.0);
		assertEquals(26.0, joanna.getPayRate(), 0.0);

	}

	@Test
	public void testaddHours() {
		assertEquals(0, john.getHoursWorked());
		john.addHours(2);
		assertEquals(2, john.getHoursWorked());
		assertEquals(0, herman.getHoursWorked());
		herman.addHours(4);
		assertEquals(4, herman.getHoursWorked());
		assertEquals(0, gabriel.getHoursWorked());
		gabriel.addHours(6);
		assertEquals(6, gabriel.getHoursWorked());
		assertEquals(0, tabitha.getHoursWorked());
		tabitha.addHours(8);
		assertEquals(8, tabitha.getHoursWorked());
		assertEquals(0, phil.getHoursWorked());
		phil.addHours(10);
		assertEquals(10, phil.getHoursWorked());
		assertEquals(0, joanna.getHoursWorked());
		joanna.addHours(12);
		assertEquals(12, joanna.getHoursWorked());

	}

	@Test
	public void testresetHoursWorked() {
		john.addHours(2);
		john.resetHoursWorked();
		assertEquals(0, john.getHoursWorked());
		
	}
	
	 @Test
		public void GetWeeklyPayTest() {
			john.addHours(2);
	        Paycheck paycheck = john.getWeeklyPay();
			assertEquals(24, paycheck.getTotalPay());
	        
	     }

	@Test
	public void testGetWeeklyPay() {
		Paycheck paycheck = new Paycheck(john);
		john.addHours(2);
		john.getWeeklyPay(paycheck);
		assertEquals(0, john.getHoursWorked());
		
	}
	
	@Test
    public void testGetWeeklyPayNull() {
	Paycheck paycheck = new Paycheck(john);
	john.addHours(2);
    assertThrows(IllegalArgumentException.class, () ->{
    	john.getWeeklyPay(null);
    });
	}

	@Test
	public void testPayRaise() {
		john.payRaise(50);
		assertEquals(18.0, john.getPayRate());
		herman.payRaise(50);
		assertEquals(22.5, herman.getPayRate());
		gabriel.payRaise(50);
		assertEquals(30, gabriel.getPayRate());
		tabitha.payRaise(50);
		assertEquals(33, tabitha.getPayRate());
		phil.payRaise(50);
		assertEquals(37.5, phil.getPayRate());
		joanna.payRaise(50);
		assertEquals(39, joanna.getPayRate());
	}

	@Test
	public void testString() {
		assertEquals("Employee Name: john\n" + "Employee ID: 0\n" + "Employee Pay Rate: 12\n"
				+ "Employee's Hours this Week: 0", john.toString());
		assertEquals("Employee Name: herman\n" + "Employee ID: 1\n" + "Employee Pay Rate: 15\n"
				+ "Employee's Hours this Week: 0", herman.toString());
		assertEquals("Employee Name: gabriel\n" + "Employee ID: 2\n" + "Employee Pay Rate: 20\n"
				+ "Employee's Hours this Week: 0", gabriel.toString());
		assertEquals("Employee Name: tabitha\n" + "Employee ID: 3\n" + "Employee Pay Rate: 22\n"
				+ "Employee's Hours this Week: 0", tabitha.toString());
		assertEquals("Employee Name: phil\n" + "Employee ID: 4\n" + "Employee Pay Rate: 25\n"
				+ "Employee's Hours this Week: 0", phil.toString());
		assertEquals("Employee Name: joanna\n" + "Employee ID: 5\n" + "Employee Pay Rate: 26\n"
				+ "Employee's Hours this Week: 0", joanna.toString());

	}

}
