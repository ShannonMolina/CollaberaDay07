package questions;

//What is the output of this program?

class A1 {
	void methodA1(int i) {
		System.out.println(i+++i);   // i++ + i
	}								 // increment after plus i
	
	void methodA2(int i) {
		System.out.println(--i-i--); // --i - i--
	}								 // decrement before minus decrement after
}

class B1 {
	void methodA1(int i) {
		System.out.println(++i+i++); // ++i + i++
	}								 // increment before plus increment after
	
	void methodA2(int i) {
		System.out.println(i---i);  // i-- - i
	}								 // decrement after minus i
}

public class Q6 {

	public static void main(String[] args) {
		A1 a = new A1();
		a.methodA1(10);	// 10 + 11 = 21
		a.methodA2(10);	// 9 - 9 = 0
		B1 b = new B1();
		b.methodA1(10); // 11 + 11 = 22
		b.methodA2(10); // 10 - 9 = 1

	}

}
