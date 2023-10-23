/**
 * @author Anthony Miranda
 */

package assg5_mirandaj20;

import junit.framework.TestCase;

public class TestRationalNum extends TestCase {
	
	RationalNum num1, num2, num3, num4, num5, num6, num7, num8;
	
	protected void setUp(){
		num1 = new RationalNum();
		num2 = new RationalNum(1,3);
		num3 = new RationalNum(1,4);
		num4 = new RationalNum(2,8);
		num5 = new RationalNum(14, 24);
		num6 = new RationalNum(1,2);
		num7 = new RationalNum(2,1);
		num8 = new RationalNum(7);
	}

	public void testDefaultConstructor() {
		assertEquals("num1's Numerator:", 0, num1.getNUM());
		assertEquals("num2's Denominator:", 1, num1.getDEN());
	}
	
	public void testOneParameterConstructor() {
		assertEquals("num1's Numerator:", 0, this.num1.getNUM());
		assertEquals("num1's Denominator:", 1, this.num1.getDEN());
	}
	
	public void testTwoParameterConstructor() {
		assertEquals("num2's Numerator:", 1, num2.getNUM());
		assertEquals("num2's Denominator:", 3, num2.getDEN());
	}
	
	public void testToString() {
		assertEquals("num2's rational number:","1/3", num2.toString());
	}

	//Previously my submission of the equals method did not work, but it is fixed now and junit test works
	public void testEqualsObject() {
		assertEquals("num2's numerator equals num3's numerator", true, num3.equals(num4));
	}

	public void testAdd() {
		assertEquals("num2 + num4:", num5, num2.add(num4));
	}

	public void testSub() {
		assertEquals("num5 - num4:", num2, num5.sub(num4));
	}

	public void testMul() {
		assertEquals("num6 * num6:", num3, num6.mul(num6));
	}

	public void testDiv() {
		assertEquals("num6 / num3:", num7, num6.div(num3));
	}

	public void testNeg() {
		assertEquals("Negation of num8 as a string:", "-7/1", num8.neg().toString());
	}
	
	public void getNUM() {
		assertEquals("Get numerator of num2:", 1, num2.getNUM());
	}
	
	public void getDEN() {
		assertEquals("Get denominator of num2:", 3, num2.getDEN());
	}

}
