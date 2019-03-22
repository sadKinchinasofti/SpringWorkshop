package org.Kingsuk.SpringmoduleConstuctorInjection;

public class Traingle {
	private String type;
	private Double side;
	private Double height;
	
	public Traingle(Double side) {
		super();
		this.side = side;
	}


	/*public double getHeight() {
		return height;
	}*/
	
	public Double getSide() {
		return side;
	}


	public Double getHeight() {
		return height;
	}


	public Traingle(String type) {
		this.type=type;
	}
	

	/*public Traingle(double side) {
		super();
		this.side = side;
	}*/

	public Traingle(String type,Double side) {
		this.type=type;
		this.side=side;
	}
	
	/*public double getSide() {
		return side;
	}*/

	/*public void setSide(double side) {
		this.side = side;
	}*/

	public String getType() {
		return type;
	}

	/*public void setType(String type) {
		this.type = type;
	}*/
	
	

	public void draw() {
		System.out.println(getType()+"Traingle is drawn");
		System.out.println("Area of the traingle is:"+(Math.pow(getSide().doubleValue(),2)*Math.sqrt(3))/4);
	}

}
