package questions;

//What will be the output of the below program?

	class A{
		static String s = "AAA";
		
		class B{
			String s = "BBB";
			
			void methodB() {
				System.out.println(s);
			}
		}
	}
	
public class Q4 {	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.s); //AAA
		
		A.B b = a.new B();
		System.out.println(b.s); ///BBB
		
		b.methodB(); //BBB

	}

}
