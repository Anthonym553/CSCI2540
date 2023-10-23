package activity4;

public class ThreeDimPoint extends Point {
	
	private double z;
	
	/**
	 * default constructor
	 * Attempting to figure out how to use super to set (0,0,0)
	 */
	public ThreeDimPoint() {
		
		z = 0;
		
	}
	
	public ThreeDimPoint(double xCoor, double yCoor, double zCoor) {
	
		z = zCoor;
		
	}
	
	/**
	 * The get method for z coordinate
	 * @return The value of z coordinate
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * The set method for z coordinate
	 * @param newZ The new value for z coordinate
	 */
	public void setZ(double newZ) {
		z = newZ;
	}
	
	@Override
	public String toString() {
		String str = "(" + x + ", " + y + ", " + z + ")";
		return str;
	}
	
	public double distance(Point p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y-p.y) * (y - p.y));
	}
}


}
