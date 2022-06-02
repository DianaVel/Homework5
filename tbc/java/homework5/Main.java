package tbc.java.homework5;

public class Main {

	public static void main(String[] args) {
		Figure fig = new Figure("Figure is created");
		System.out.println("Figure: area- "+ fig.getArea()+"; perimeter - "+fig.getPerimeter());
		
		Rectangle rec = new Rectangle (2,3);
		System.out.println("Rectangle: area- "+ rec.getArea()+"; perimeter - "+rec.getPerimeter());
		
		System.out.println("Is rec an instance of Rectangle -"+(rec instanceof Rectangle));
		System.out.println("Is rec an instance of Figure -"+(rec instanceof Figure));
		System.out.println("Is fig an instance of Rectangle -"+(fig instanceof Rectangle));
		
		System.out.println("Rectangle parameters : width 6; height 7. Area - "+Rectangle.getArea(6,7)+"; Perimeter - "+Rectangle.getPerimeter(6, 7));
	

	}

}
