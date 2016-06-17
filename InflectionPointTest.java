import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.JUnit4TestAdapter;

public class InflectionPointTest {
	
	@Test
	public void findIndex() {
		System.out.println("findIndex");
		int[] sample = {1,2,3,2,1};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(3, result);
		
	}
	
	public static void main(String[] args) {
		//junit.swingui.TestRunner.run( new JUnit4TestAdapter(InflectionPoint.class) );
		junit.textui.TestRunner.run( new JUnit4TestAdapter(InflectionPointTest.class) );
	}
}