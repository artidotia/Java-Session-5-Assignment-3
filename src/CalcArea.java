
public class CalcArea {
	public static void main(String[] args) {
		Rectangle rct1 = new Rectangle(); //initialize with default constructor
		Rectangle rct2 = new Rectangle(10, 20); //initialize with values constructor
		
		System.out.println("Area of Rectangle with default values of length and breadth!");
		System.out.println(rct1.getArea());
		
		System.out.println();
		
		System.out.println("Area of Rectangle with length and breadth as 10 and 20!");
		System.out.println(rct2.getArea()); 
		
		System.out.println();
		
		Square sq1 = new Square(); //initialize with default constructor
		Square sq2 = new Square(20); //initialize with values constructor
		
		System.out.println("Area of Square with default value of side!");
		System.out.println(sq1.getArea());
		
		System.out.println();
		
		System.out.println("Area of Square with side as 20!");
		System.out.println(sq2.getArea());
	}

}
