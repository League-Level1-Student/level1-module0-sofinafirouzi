package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class fortuneCOOKIE implements ActionListener{
	
	public void showButton() {
	    System.out.println("Button clicked");
	    JFrame frame = new JFrame();
	    frame.setVisible(true);
	    JButton button = new JButton();
	    button.setVisible(true);
	    button.setText("Click me!");
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
	}

	
public static void main(String[] args) {
}//end main


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
if(rand==0) {
		JOptionPane.showMessageDialog(null, "A lifetime of happiness lies ahead of you.");
	}
if(rand==1) {
	JOptionPane.showMessageDialog(null, "A light heart carries you through all the hard times.");
	}
if(rand==2) {
	JOptionPane.showMessageDialog(null, "A pleasant surprise is waiting for you.");
}
if(rand==3) {
	JOptionPane.showMessageDialog(null, "Accept something that you cannot change, and you will feel better.");
}
if(rand==4) {
	JOptionPane.showMessageDialog(null, "Believe in yourself and others will too.");
}

}//end action





}//end fortune cookie class
