package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//NEXT STEP add sounds to buttons, need to find sounds (ideas: beach? ocean waves, etc)
public class soundEffectsMachine {

	public void showButtons() {
	JFrame frame = new JFrame();
		frame.setVisible(true);
	JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
JButton buttonOne = new JButton();
	buttonOne.setVisible(true);
		buttonOne.setText("Sound 1");
		
JButton buttonTwo = new JButton();
	buttonTwo.setVisible(true);
		buttonTwo.setText("Sound 2");
		
JButton buttonThree = new JButton();
	buttonThree.setVisible(true);
		buttonThree.setText("Sound 3");
	
			panel.add(buttonOne);
			panel.add(buttonTwo);
			panel.add(buttonThree);
			frame.pack();
	}//end show buttons void
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}//end play sound
	
	
}//end class sound effects machine
