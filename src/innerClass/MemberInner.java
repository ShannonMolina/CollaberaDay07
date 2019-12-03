package innerClass;

public class MemberInner {
	private int data = 30;
	
	class Inner{
		void msg() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		MemberInner obj = new MemberInner();
		MemberInner.Inner in = obj.new Inner();
		
		//MemberInner.Inner in = new MemberInner.Inner(); // cannot initialize like this
		
		in.msg();

	}

}
