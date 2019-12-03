package optionpane;

import javax.swing.*;
public class CountingVowels {

	public static void main(String[] args) {
		char letter;
		JFrame jf = new JFrame();
		String name = JOptionPane.showInputDialog("Your name: ", "Enter your name here");
		
		int numberOfCharacters = name.length();
		int vowelCount = 0;
		
		for(int i=0; i<numberOfCharacters; i++) {
			letter = name.charAt(i);
			
			if(		letter == 'a' || letter == 'A' ||
					letter == 'e' || letter == 'E' ||
					letter == 'i' || letter == 'I' ||
					letter == 'o' || letter == 'O' ||
					letter == 'u' || letter == 'U' ) {
				vowelCount++;
			}
		}
		JOptionPane.showMessageDialog(jf, name+ ", your name has " +vowelCount+ " vowels.");
		
	}

}
