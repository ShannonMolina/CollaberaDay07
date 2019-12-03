package interfaces1;

// Multiple Inheritance in Java:
// A class may only extend one superclass, but a class can implement many interfaces
// such as the interfaces shown here: Printable and Showable
public class TestInterface implements Printable, Showable {
	@Override
	public void print() { System.out.println("Hello"); }
	
	@Override
	public void show() { System.out.println("Welcome"); }

	public static void main(String[] args) {
		TestInterface obj = new TestInterface();
		
		obj.print();
		obj.show();
		
	}

}
