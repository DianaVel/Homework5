package tbc.java.homework5.part2;

import tbc.java.homework5.Rectangle;

public final class Square extends Rectangle{
	private double side;
	public Square (double side) {		
		super(side,side);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	protected double getPerimeter() {
//Option 1		
		return super.getPerimeter();
// Option 2:
//		return super.getPerimeter(side, side);
	}
	
	protected double getArea() {
//Option1		
	return super.getArea();
//Option 2:		
//		return super.getArea(side,side);
	}
}
