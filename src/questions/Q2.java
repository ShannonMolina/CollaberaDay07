package questions;

// What will the main method print? Why?

class X{
	static int x = 3131;
	
	static class Y{
		static int y = x++;
		static class Z{
			static int z = y++;
		}
	}
}

public class Q2 {

	public static void main(String[] args) {
		System.out.println(X.x);     //3131
		System.out.println(X.Y.y);   //3131 x increments AFTER y=x++
		System.out.println(X.Y.Z.z); //3131 y increments AFTER z=y++

	}

}
