package tbc.java.homework5;

public class Rectangle extends Figure {
	private double length;
	private double width;
	
	private static double defaultWidth=4;
	private static double defaultLength=3;
	
	
	private static final double MAX_LENGTH ;
	private static final double MAX_WIDTH ;
	
	
	static {
		MAX_LENGTH =20;
		MAX_WIDTH =10;
	}
	
	public Rectangle () {
		this(defaultWidth,defaultLength);
	}
	
	public Rectangle(double width, double length) {
		super("Second Figure is created");
		this.setLength(length);
		this.setWidth(width);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		if(length>MAX_LENGTH) {
			this.length = MAX_LENGTH;
		}else {
			this.length=length;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		if(width>MAX_WIDTH) {
			this.width=MAX_WIDTH;
		}else {
			this.width = width;
		}
	}
	
	protected double getArea() {
		return length*width;
	}
	
	protected static double getArea(double width, double length) {
		return length*width;
	}
	
	protected double getPerimeter() {
		return 2*(length+width);
	}
	
	protected static double getPerimeter(double width, double length) {
		return 2*(length+width);
	}
	
	

}
