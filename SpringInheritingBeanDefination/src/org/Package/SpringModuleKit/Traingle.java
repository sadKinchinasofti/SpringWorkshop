package org.Package.SpringModuleKit;

import java.util.List;

import org.Package.SpringModuleKit.Point;

public class Traingle {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for(Point point:points) {
			System.out.println("Point :"+point.getX()+","+point.getY());
		}
	}

}
