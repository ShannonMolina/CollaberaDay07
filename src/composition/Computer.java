package composition;

public class Computer {
	private Memory memory;
	private Processor processor;
	private SoundCard soundCard;
	
	public Computer(Processor processor, Memory memory) {
		this.processor = processor;
		this.memory = memory;
	}
	
	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	public Processor getProcessor() {
		return processor;
	}
	
	public Memory getMemory() {
		return memory;
	}
	
	public SoundCard getSoundCard() {
		return soundCard;
	}
	
	@Override
	public String toString() {
		return "Computer{processor=" +processor+ ", memory=" +memory+ ", soundCard=" +soundCard+ "}";
	}
}
