package lambda;

public class AnotherLambda {

	public static void main(String[] args) {
		MyInterface myInterface;
		myInterface = () -> 3.1415;
		
		System.out.println("Value of PI: " + myInterface.getPiValue());

	}

}
