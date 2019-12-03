package lambda;

interface Drawable{
	public void draw();
}

public class BeforeLambda {

	public static void main(String[] args) {
		int width = 10;
		Drawable d = new Drawable(){
		
			@Override
			public void draw() {
				System.out.println("Drawing width: " + width);
			}
		};
		d.draw();
	}

}

