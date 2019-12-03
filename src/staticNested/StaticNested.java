package staticNested;

public class StaticNested {
	//static (class) member
	static int data = 50;
	public int x =10;
	
	// nested static class
	static class Inner{
		//static method
		static void msg() {
			System.out.println("data is: " +data);
		}
	}
	public static void main(String[] args) {
		Inner.msg();


	}

}
