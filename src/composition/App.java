package composition;

public class App {

	public static void main(String[] args) {
		Computer computer = new Computer(new Processor("Intel I3"), new Memory("Kingston", "1TB"));
		computer.setSoundCard(new SoundCard("Generic Sound Card"));
		System.out.println(computer);
	}

}
