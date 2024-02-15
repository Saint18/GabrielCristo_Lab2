import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * A JUnit test class for the Paycheck class.
 */
public class PaycheckTest {

	private Paycheck p1;
	private Paycheck p2;
	private Paycheck p3;

	@Before
	public void setUp() {
		p1 = new Paycheck(0, "john", 12.0, 10);
		p2 = new Paycheck(1, "herman", 15.0, 12);
		p3 = new Paycheck(2, "gabriel", 20, 14);
	}

	@Test
	public void allArgumentConstructorTest() {
		Paycheck paycheck = new Paycheck(0, "john", 12.0, 10);
		assertEquals(paycheck.getTotalPay(), 120.0);
	}

	@Test
	public void employeeArgumentConstructorTest() {
		Employee employee = new Employee("john", 12.0);
		Paycheck paycheck = new Paycheck(employee);
		assertEquals(paycheck.getTotalPay(), 120.0);
	}

	@Test
	public void defaultConstructorTest() {
		Paycheck paycheck = new Paycheck();
		assertEquals(paycheck.getTotalPay(), 0.0);
//    	assertEquals(paycheck.getName(), ""); //these might be null
//        assertEquals(paycheck.getEmployeeRate(), 0);
//        assertEquals(paycheck.getEmployeeHoursWorked(), 0);
//        assertEquals(paycheck.getEmployeeId(), 0);
	}

	@Test
	public void loadCheckTest() {
		Employee employee = new Employee("john", 12.0);
		Paycheck paycheck = new Paycheck();
		paycheck.loadCheck(employee);
		assertThrows(IllegalArgumentException.class, () -> {
			paycheck.loadCheck(null);
		});

	}

	@Test
	public void getTotalPayTest() {
		Paycheck paycheck = new Paycheck(0, "john", 12.0, 10);
		assertEquals(paycheck.getTotalPay(), 120.0);

	}

		@Test
		public void toStringTest() {
			Paycheck paycheck = new Paycheck(0, "john", 12.0, 10);
	        assertEquals(paycheck.toString(),"$120.00");

	}
		
		

}