import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.JUnit4TestAdapter;
import java.util.NoSuchElementException;

public class InflectionPointTest {
	
	/*tests for findIndex()*/
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
	
	
	@Test
	public void decreasingShort() {
		System.out.println("findIndex");
		int[] sample = {3,2,3};
		int result = InflectionPoint.findIndex(sample, 'd');
		assertEquals(2, result);
		
	}
	
	@Test
	public void decreasingLong() {
		System.out.println("findIndex");
		int[] sample = {-1, 0, 1, 2, 3};
		int result = InflectionPoint.findIndex(sample, 'd');
		assertEquals(2, result);
		
	}
	
	@Test (expected = NoSuchElementException.class)
	public void noInflectionPoint() {
		System.out.println("findIndex");
		int[] sample = {1,2,3};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	@Test (expected = NoSuchElementException.class)
	public void emptyArray() {
		System.out.println("findIndex");
		int[] sample = {};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	@Test (expected = NoSuchElementException.class)
	public void arrayOfOne() {
		System.out.println("findIndex");
		int[] sample = {5};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	@Test (expected = NoSuchElementException.class)
	public void arrayOfTwo() {
		System.out.println("findIndex");
		int[] sample = {4, 6};
		int result = InflectionPoint.findIndex(sample);
		assertEquals(2, result);
		
	}
	
	/*tests for hasInflectionPoint()*/
	@Test
	public void doesHaveInfPoint_initIncreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {1,2,3,2,1};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(true, result);
	}

	@Test	
	public void doesHaveInfPoint_initDecreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {3,2,1,2,3};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(true, result);
	}
	
	@Test
	public void doesHaveInfPointShort_initIncreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {1,2,1};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(true, result);
	}
	
	@Test
	public void doesHaveInfPointShort_initDecreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {2,1,2};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(true, result);
	}
	
	@Test
	public void doesNotHaveInfPoint() {
		System.out.println("hasInflectionPoint");
		int[] sample = {1,2,0,5,6,1,0};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	@Test
	public void alwaysIncreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {5,10,15,20};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	@Test
	public void alwaysDecreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {10,9,8,7,6};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	@Test
	public void notEnoughElementsIncreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {1,2};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	@Test
	public void notEnoughElementsDecreasing() {
		System.out.println("hasInflectionPoint");
		int[] sample = {2,1};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	@Test
	public void noElements() {
		System.out.println("hasInflectionPoint");
		int[] sample = {};
		boolean result = InflectionPoint.hasInflectionPoint(sample);
		assertEquals(false, result);
	}
	
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run( new JUnit4TestAdapter(InflectionPointTest.class) );
	}
}