package innerClass;

abstract class Person {
	abstract void eat();
}

public class AnonymousInner{
	public static void main(String[] args) {
		Person p = new Person() { // Even though Person is abstract, we are defining 
								 // its method below, so we are able to instantiate it
			@Override
			void eat() {
				System.out.println("Nice fruits");
			}
		};
		
		p.eat();
	}
}
