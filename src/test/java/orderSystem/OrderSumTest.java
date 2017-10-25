package orderSystem;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OrderSumTest extends TestCase {
    public OrderSumTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( OrderSumTest.class );
    }

    public void testApp()    {
        assertTrue( true );
    }
}
