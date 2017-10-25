package orderSystem;

public class OrderSum {
    static final double UNIT_PRICE_DONUT = 0.99;
    static final double UNIT_PRICE_PIE = 3.49;
    static final double UNIT_PRICE_COKE = 1.99;
    

	public static void main( String[] args )    {
    	  int numDonut = 1;
    	  int numPie = 1;
    	  int numCoke = 1;
    }
    
    public static double donutSum(int numDonut) {
    	return UNIT_PRICE_DONUT * numDonut;
    }
    
    public static double pieSum(int numPie) {
    	return UNIT_PRICE_PIE * numPie;
    }
    
    public static double cokeSum(int numCoke) {
    	return UNIT_PRICE_COKE * numCoke;
    }
    
    public static double orderSum(int numDonut, int numPie, int numCoke) {
    	return donutSum(numDonut) + pieSum(numPie) + cokeSum(numCoke);   	
    }
}
