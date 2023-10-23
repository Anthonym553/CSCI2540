/**
 * @author Qin Ding
 * This is the JUnit test class for the Point class. 
 */

package activity6;

import activity7.Point;
import junit.framework.TestCase;

public class TestPoint1 extends TestCase {
	
	Point p1, p2;

	protected void setUp() {
		p1 = new Point();
		p2 = new Point(2.5, 3.5);
	}
	
	public void testDefaultConstructor() {
		assertEquals("p1's x-coordinate:", 0.0, p1.getX());
		assertEquals("p1's y-coordinate:", 0.0, p1.getY());
	}
	
	public void testTwoParameterConstructor() {
		assertEquals("p2's x-coordinate:", 2.5, p2.getX());
		assertEquals("p2's y-coordinate:", 3.5, p2.getY());
	}
	
	public void testSetX() {
		p1.setX(1.2);
		assertEquals("p1's new x-coordinate:", 1.2, p1.getX());
	}
	
	public void testSetY() {
		p1.setY(1.5);
		assertEquals("p1's new y-coordinate:", 1.5, p1.getY());
	}
	
	public void testToString() {
		assertEquals("p2's coordinates:", "(2.5, 3.5)", p2.toString());
	}
	
	public void testDistance() {
		Point p3 = new Point(1.0, 2.0);
		assertEquals("Distance between p2 and p3", Math.sqrt(4.5), p2.distance(p3), 0.01);
	}
	
}
