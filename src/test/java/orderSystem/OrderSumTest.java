package orderSystem;

import junit.framework.TestCase;
import static org.junit.Assert.*;
public class OrderSumTest extends TestCase {

	OrderSum obj;
	int numDonut, numPie, numCoke;
	
	protected void setUp() throws Exception {
		numDonut = 1;
		numPie = 1;
		numCoke = 1;
		obj = new OrderSum();
	}

	public void testDonutSum() {
		assertEquals(0.99, obj.donutSum(numDonut));
	}

	public void testPieSum() {
		assertEquals(3.49, obj.pieSum(numPie));
	}

	public void testCokeSum() {
		assertEquals(1.99, obj.cokeSum(numCoke));
	}

	public void testOrderSum() {
		assertEquals((double)6.47, obj.donutSum(numDonut) + obj.pieSum(numDonut) + obj.cokeSum(numDonut), 0.01);
	}
	
	protected void tearDown() throws Exception {
		numDonut = 0;
		numPie = 0;
		numCoke = 0;
		obj = null;
	}

}