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
	    frame.add(button);
	    frame.pack();
	    button.addActionListener(this);
	}

	
public static void main(String[] args) {
}//end main


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo");
	int rand = new Random().nextInt(5);
if(rand==0) {
		JOptionPane.showMessageDialog(null, "");
	}
if(rand==1) {
	JOptionPane.showMessageDialog(null, "");
	}
if(rand==2) {
	JOptionPane.showMessageDialog(null, "");
}
if(rand==3) {
	JOptionPane.showMessageDialog(null, "");
}
if(rand==4) {
	JOptionPane.showMessageDialog(null, "");
}

}//end action





}//end fortune cookie class
