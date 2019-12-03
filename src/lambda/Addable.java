package lambda;
@FunctionalInterface
public interface Addable {
	int add(int a, int b);
	
	
	//int add2(int a, int b) {	//generates error because functional interface
	//	return a + b;			// can only have 1 method
	//}
	
	
	// exception is default/static method
	default int add2(int a, int b) {  
		return a + b;
	}
	
	static int add3(int a, int b) {  
		return a + b;
	}
}
