package activity3;



public class pointClass {
	
		private double x, y;
		
		public pointClass() {
			this.x = 0.0;
			this.y = 0.0;
		}
		
		public pointClass(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double getx() {
			return x;
		}
		
		public double gety() {
			return y;
		}
		
	//	public double distance(Point p) {
	//		return Math.sqrt((x-p.x)
	//	}
		
		@Override
		public String toString() {
			return "(" + x + "," + y +")";
		}
}
