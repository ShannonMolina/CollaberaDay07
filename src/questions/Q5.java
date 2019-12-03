package questions;

//What is the error?

public class Q5 {
	void methodOne() {
		class B{
			void methodTwo() {
				System.out.println("Method Two");
			}
		}
	}
	
	void methodThree() {
		//new B().methodTwo(); //no access to class B because it is within methodOne
	}
}
