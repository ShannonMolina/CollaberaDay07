package questions;

//Is this code written correctly?

public class Q3 {
	String s = "AAA";
	
	void methodA() {
		System.out.println(s);
	}
	
	static class B{
		void methodB() {
			//methodA(); //cannot make static reference to non-static method
		}
	}
}
