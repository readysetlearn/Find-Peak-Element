import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.JUnit4TestAdapter;

public class InflectionPointTest {
	
	@Test
	public void basicTest() {
		System.out.println("findIndex");
		int[] sample = {1,2,3,2,1};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(3, result);
		
	}
	
	@Test
	public void oneNegNum() {
		System.out.println("findIndex");
		int[] sample = {0,1,-1};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	@Test
	public void twoNegNum() {
		System.out.println("findIndex");
		int[] sample = {-1,0,-1};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	@Test
	public void atEnd() {
		System.out.println("findIndex");
		int[] sample = {-1,1,2,3,0};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(4, result);
		
	}
	
	@Test
	public void atFront() {
		System.out.println("findIndex");
		int[] sample = {1,2,1,0,-1};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run( new JUnit4TestAdapter(InflectionPointTest.class) );
	}
}