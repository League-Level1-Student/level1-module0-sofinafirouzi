package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

Robot rob = new Robot();
Random random = new Random();
Random color = new Random();

void run() {
System.out.println("run" );
rob.setSpeed(5000);
rob.setX(0);
rob.setY(550);
rob.penDown();
rob.setPenWidth(5);
rob.setAngle(90);
for(int i = 0; i<=10; i++) {
int size = random.nextInt(3);
if(size==0) {
	house("small");
}
else if(size==1) {
	house("medium");
}
else if(size==2) {
	house("large");
}

int color = random.nextInt(3);
if(color==0) {
	rob.setPenColor(Color.red);
}
else if(color==1) {
	rob.setPenColor(Color.blue);
}
else if(color==2) {
	rob.setPenColor(Color.yellow);
}
}//end for
}//end run

void house(int height) {
	//grass
	rob.setPenColor(Color.GREEN);
	rob.move(20);
	//house up
	rob.setRandomPenColor();;
	rob.turn(-90);
	rob.move(height);
	//roof
	//need to make it so the large buldigns have flt roofs
	//house down
	rob.move(height);
	rob.turn(-90);
	
}//end house integer

void house(String size) {
if(size.equals("small")) {
	house(60);
}
else if(size.equals("medium")) {
	house(120);
}
else if(size.contentEquals("large")) {
	house(250);
}
	
	
}//end house string


void drawPointyRoof() {
	rob.turn(-45);
	rob.move(15);
	rob.turn(45);
	rob.move(15);
}//end pointy roof

void drawFlatRoof() {
	rob.turn(90);
	rob.move(30);
	rob.turn(90);
}// end flat roof







}//end class


