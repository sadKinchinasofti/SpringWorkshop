package org.Package.SpringLifeCycle;

import org.springframework.beans.factory.InitializingBean;

public class Traingle implements InitializingBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Point 1: ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point 1: ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point 1: ("+getPointC().getX()+","+getPointC().getY()+")");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Traingle bean is getting initialized");
		
	}
	
	

}
