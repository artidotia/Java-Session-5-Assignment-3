
public class ShapesCO {
	private double length;
	private double breadth;
	
	ShapesCO(){
		length = 0;
		breadth = 0;
	}
	
	ShapesCO(double len, double br){
		length = len;
		breadth = br;
	}
	
	ShapesCO(double side){
		length = side;
		breadth = side;
		
	}
	
	double getArea(){
		return length * breadth;
	}
	
}
