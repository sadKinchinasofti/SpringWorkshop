package org.Kingsuk.SpringmoduleContext;

public class Traingle {
	private String type;
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	public void draw() {
		System.out.println(getType()+"Traingle is drawn");
		System.out.println("Area of the traingle is:"+(Math.pow(side,2)*Math.sqrt(3))/4);
	}

}
