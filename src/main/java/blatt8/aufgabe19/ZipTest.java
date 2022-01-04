package blatt8.aufgabe19;

import org.junit.*;
import org.junit.Assert;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class ZipTest extends TestCase{

	public int[] a = {1,2,3,4,5};
	public int[] b = {2,3,4,5,6};
	public int[] c = {1,2,3};
	public int[] d = {2,3,4,5,6,7};
	public int[] e = {};
	public int[] f = {1,2,3,4,5};
	
	public static TestSuite suite(){
		return new TestSuite(ZipTest.class);
	}
	
	public static void main(String[] args){
		TestRunner.run(suite());
	}
	
	
	@Test
	public void testEqualLengthAddition(){
		int[] result = Zip.zip(a, b, (x, y)-> x+y);
		int[] expected = {3, 5, 7, 9, 11};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void testEqualLengthConcat(){
		int[] result = Zip.zip(a, b, (x, y)-> x*10+y);
		int[] expected = {12, 23, 34, 45, 56};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void testDifferentLengthAddition(){
		int[] result = Zip.zip(c, d, (x, y)-> x+y);
		int[] expected = {3, 5, 7};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void testDifferentLengthConcat(){
		int[] result = Zip.zip(c, d, (x, y)-> x*10+y);
		int[] expected = {12, 23, 34};
		Assert.assertArrayEquals(expected, result);
	}

	@Test
	public void testEmptyArrayMultiplikation(){
		int[] result = Zip.zip(e, f, (x, y)-> x*y);
		int[] expected = {};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void testEmptyArrayConcat(){
		int[] result = Zip.zip(f, e, (x, y)-> x*10+y);
		int[] expected = {};
		Assert.assertArrayEquals(expected, result);
	}
	
}
