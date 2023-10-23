/**
 * @author Qin Ding
 * This program reads a list of points and stores to an ArrayList. It then calculates the mean point and the distance from each point to the mean point.
 */

package activity7;

import java.util.*;
import java.io.*;

//Class name was updated to match current .java name
public class PointArrayList {

	public static void main(String[] args) {
		
		String filename = "pointList.txt";
		Scanner inStream = null;
		double x, y, meanX=0, meanY=0;
		int count =0;
		Point p, meanPoint;
		ArrayList<Point> pointList = new ArrayList<Point>();
		Iterator<Point> iter;
		
		try {
			inStream = new Scanner(new File(filename));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: input file not found.");
			System.exit(1);
		}
		
		while (inStream.hasNextDouble()) {
			x = inStream.nextDouble();
			y = inStream.nextDouble();
			p = new Point(x,y);
			pointList.add(p);
			count++;
		}
		
		iter = pointList.iterator();
		
		System.out.println("There are a total of " + count + " points");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (int i =0; i<count; i++) {
			meanX += pointList.get(i).getX();
			meanY += pointList.get(i).getY();
		}
		
		meanPoint = new Point(meanX/count, meanY/count);
		
		System.out.println();
		System.out.println("The mean point of all the points is: " + meanPoint);
		System.out.println();
		
		for (int i=0; i<count; i++) {
			System.out.println("Distance between point " + pointList.get(i).toString() + " and the mean point is: " + meanPoint.distance(pointList.get(i)));
		}
		
		inStream.close();

	}

}
