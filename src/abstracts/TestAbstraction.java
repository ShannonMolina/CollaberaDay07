package abstracts;

public class TestAbstraction {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		//s = new Shape(); //cannot create instance of abstract class
		s.normalMethod();
		s = new Rectangle();
		s.draw();

	}

}
