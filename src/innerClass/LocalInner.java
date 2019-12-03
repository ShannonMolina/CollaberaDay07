package innerClass;

public class LocalInner {

	private int data = 40; //instance variable
	
	void display() {
		class Local{ //class inside method
			void msg() {
				System.out.println("data is: "+ data);
			}
		}
		
		Local local = new Local();
		local.msg();
	}
	
	public static void main(String[] args) {
		LocalInner obj = new LocalInner();
		obj.display();

	}

}
