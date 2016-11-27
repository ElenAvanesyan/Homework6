import shapes.Square; 
import shapes.Rectangle;
import utils.Math;
public class Driver {
	public static void main(String[] args) {
		Square s = new Square(100);
		System.out.println(s.getArea());
		Rectangle r = new Rectangle(80,50);
		System.out.println(r.getArea());
		Math math = new Math();
		double q = 15.6;
		System.out.println(math.factorial((int)q));
		System.out.println(math.factorialLoop((int)q));
	}

}
