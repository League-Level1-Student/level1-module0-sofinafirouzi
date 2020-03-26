package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTv implements ActionListener{
	JButton buttonOne = new JButton();
	JButton buttonTwo = new JButton();
	JButton buttonThree = new JButton();
	
public void showButton(){
JFrame frame = new JFrame();
	frame.setVisible(true);
	
JPanel panel = new JPanel();
		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		
	buttonOne.setText("Duck Video");
	buttonOne.addActionListener(this);
		
	buttonTwo.setText("Frog Video");
	buttonTwo.addActionListener(this);
		
	buttonThree.setText("Unicorn Video");
	buttonThree.addActionListener(this);
	frame.add(panel);
	frame.pack();
}//end show button

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}//end show ducks

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}//end show frog

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}//end show fluffy unicorns

void playVideo(String urlString) {

        // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't work on some Linux implementations
        try {
			if (Runtime.getRuntime().exec(new String[] { "which", "xdg-open" }).getInputStream().read() != -1) {
			    Runtime.getRuntime().exec(new String[] { "xdg-open", urlString });
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	//System.out.println(videoID);
		/*
		 * try { URI uri = new URI(videoID); java.awt.Desktop.getDesktop().browse(uri);
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
}//end play video

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
		if(buttonOne==buttonPressed) {
			showDucks();
		}
		else if(buttonTwo==buttonPressed) {
			showFrog();
		}
		else if(buttonThree==buttonPressed) {
			showFluffyUnicorns();
		}
	
}

}