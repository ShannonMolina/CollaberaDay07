package finalMethod;

public class Main {

	public static void main(String[] args) {
		Derived b = new Derived();
		//b.foo(); // doesn't work because Derived could not
				   // override foo method

	}

}
