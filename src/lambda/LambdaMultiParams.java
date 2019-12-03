package lambda;

public class LambdaMultiParams {

	public static void main(String[] args) {
		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> (a+b);
		System.out.println("a+b=" + ad1.add(5,7));
		
		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a+b);
		System.out.println("a+b=" + ad2.add(5,7));

	}

}
