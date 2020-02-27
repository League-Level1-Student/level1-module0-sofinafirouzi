package _01_houses;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class HousesRunner {

	public static void main(String[] args) {
		System.out.println("main" );
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
	}//main

}//end class
