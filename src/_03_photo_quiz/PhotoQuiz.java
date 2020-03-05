package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String url = "https://i.pinimg.com/originals/ba/7c/6b/ba7c6bb1e7e75fcd700184b478ebcbd3.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component photo;
		// 3. use the "createImage()" method below to initialize your Component
photo = createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(photo); 
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question1 = JOptionPane.showInputDialog("What kind of dog is this?");

		// 7. print "CORRECT" if the user gave the right answer
if(question1.equalsIgnoreCase("Labrador Retriever")) {
	JOptionPane.showMessageDialog(null, "you're correct!");
}//end if
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "you're incorrect!");
}//end else
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(photo);
		// 10. find another image and create it (might take more than one line
		// of code)
String secondurl = "https://www.teacupspuppies.com/wp-content/uploads/2017/08/blue-french-bulldog-puppy-for-sale-184-b-teacup-puppies.jpg";
Component pic;
pic = createImage(secondurl);
		// 11. add the second image to the quiz window
quizWindow.add(pic);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String question2 = JOptionPane.showInputDialog("What breed of puppy is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if(question2.equalsIgnoreCase("French Bulldog")) {
	JOptionPane.showMessageDialog(null, "you're correct!");
}//end if
else {
	JOptionPane.showMessageDialog(null, "you're incorrect!");
}//end else

}//end run method

	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
	
}//end photo quiz
