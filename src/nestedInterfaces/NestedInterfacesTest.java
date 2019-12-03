package nestedInterfaces;

interface Showable{
	void show();
	
	interface Message{ //nested interface
		void msg();
	}
}

public class NestedInterfacesTest implements Showable.Message{
	@Override
	public void msg() {
		System.out.println("Hello nested inteface");
	}
	
	public static void main(String[] args) {
		Showable.Message message = new NestedInterfacesTest(); //upcasting here
		message.msg();

	}

}
