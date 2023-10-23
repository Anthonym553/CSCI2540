/*
Anthony Miranda
Program Test all of the methods within RationalNum.java through calls
*/

package assg2_mirandaj20;

import assg5_mirandaj20.RationalNum;

public class RationalNumDemo {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Testing of each method within RationalNum
		 * Testing of various mathematical operations on rational numbers
		 */
		RationalNum rationalNum1 = new RationalNum();
		System.out.println("Rational number 1:" + rationalNum1.toString());
		
		RationalNum rationalNum2 = new RationalNum(7);
		System.out.println("Rational number 2:" + rationalNum2.toString());
		
		RationalNum rationalNum3 = new RationalNum(7,8);
		System.out.println("Rational number 3:" + rationalNum3.toString());
		
		System.out.println("Addition test:" + rationalNum1.add(rationalNum2).toString());
		System.out.println("Subtraction test:" + rationalNum1.sub(rationalNum2).toString());
		System.out.println("Multiplication test:" + rationalNum1.mul(rationalNum2).toString());
		System.out.println("Division test:" + rationalNum1.div(rationalNum2).toString());
		System.out.println("Testing Negation of first number:" + rationalNum1.neg().toString());
		System.out.println("Testing Negate of second number:" + rationalNum2.neg().toString());
	}

}
