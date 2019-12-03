package innerClass;

interface Eatable{
	void eat();
}

public class AnonymousInnerWithInterface {

	public static void main(String[] args) {
		Eatable e = new Eatable() { 
			@Override
			public void eat() { //must be public
				System.out.println("Nice fruits");
			}
		};
		
		e.eat();
	}

}
